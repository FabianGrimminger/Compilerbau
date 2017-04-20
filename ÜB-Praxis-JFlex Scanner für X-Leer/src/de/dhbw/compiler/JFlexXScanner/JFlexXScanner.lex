/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Scanner-Definition
 * 
 * **********************************************
 */


package de.dhbw.compiler.JFlexXScanner;

%%

%class JFlexXScanner
%type Token
%function nextToken


%unicode
%line
%column

%public
%final

%xstate STCONST, NUM, FRAC, EXP, AFTEREXP

%{
StringBuffer mybuffer;
int intval;
double frac = 0;
double teiler=1;
double exponent;
double vorzeichen = 1;
%}

%%

program {return new Token(Token.PROGRAM, yytext(), yyline+1, yycolumn+1);}
begin	{return new Token(Token.BEGIN, yytext(), yyline+1, yycolumn+1);}
end		{return new Token(Token.END, yytext(), yyline+1, yycolumn+1);}
if		{return new Token(Token.IF, yytext(), yyline+1, yycolumn+1);}
then 	{return new Token(Token.THEN, yytext(), yyline+1, yycolumn+1);}
else	{return new Token(Token.ELSE, yytext(), yyline+1, yycolumn+1);}
for		{return new Token(Token.FOR, yytext(), yyline+1, yycolumn+1);}
while	{return new Token(Token.WHILE, yytext(), yyline+1, yycolumn+1);}
print	{return new Token(Token.PRINT, yytext(), yyline+1, yycolumn+1);}
read	{return new Token(Token.READ,yytext(), yyline+1, yycolumn+1);}
\:\=	{return new Token(Token.ASSIGN,yytext(), yyline+1, yycolumn+1);}
\(		{return new Token(Token.LBR, yytext(), yyline+1, yycolumn+1);}
\)		{return new Token(Token.RBR,yytext(), yyline+1, yycolumn+1);}
\+		{return new Token(Token.PLUS,yytext(), yyline+1, yycolumn+1);}
\-		{return new Token(Token.MINUS,yytext(), yyline+1, yycolumn+1);}
\*		{return new Token(Token.MULT, yytext(), yyline+1, yycolumn+1);}
\/		{return new Token(Token.DIV,yytext(), yyline+1, yycolumn+1);}
\<		{return new Token(Token.LESS, yytext(), yyline+1, yycolumn+1);}
\>		{return new Token(Token.MORE,yytext(), yyline+1, yycolumn+1);}
\=		{return new Token(Token.EQUALS,yytext(), yyline+1, yycolumn+1);}
float 	{return new Token(Token.FLOAT, yytext(), yyline+1, yycolumn+1);}
int		{return new Token(Token.INT,yytext(), yyline+1, yycolumn+1);}
string	{return new Token(Token.STRING,yytext(), yyline+1, yycolumn+1);}
\;		{return new Token(Token.SEMICOLON, yytext(), yyline+1, yycolumn+1);}
\:		{return new Token(Token.COLON,yytext(), yyline+1, yycolumn+1);}
\.		{return new Token(Token.DOT,yytext(), yyline+1, yycolumn+1);}

[a-zA-Z][a-zA-Z0-9]* {return new Token(Token.ID,yytext(), yyline+1, yycolumn+1);}

[\"]				{ 
						yybegin(STCONST); 
					  	mybuffer = new StringBuffer();
					  	mybuffer.append(yytext());
					}
<STCONST> [\"]		{
						yybegin(YYINITIAL);
						mybuffer.append(yytext()); 
					 	return new StringConstToken(Token.STRINGCONST, mybuffer.toString(), yyline+1, yycolumn+2-mybuffer.length());
					 }
<STCONST> [0-9a-zA-Z\ .:]* {mybuffer.append(yytext());}
<STCONST> (\\\")+	{mybuffer.append(yytext());}
<STCONST> [^]		{
						yybegin(YYINITIAL); 
						mybuffer.append(yytext());
					 	//System.out.println("fehler - "+yytext()+";"+mybuffer.toString()); 
					 	return new Token(Token.INVALID, mybuffer.toString(), yyline+1, yycolumn+2-mybuffer.length());
					 }
<STCONST> <<EOF>> 	{
						yybegin(YYINITIAL); 
					 	return new Token(Token.INVALID, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length());
					 }
0\.				{
					yybegin(FRAC);
					mybuffer = new StringBuffer();
					mybuffer.append(yytext()); 
					intval = 0;
					frac = 0; 
					teiler = 1;
				}					 
[0]				{	return new IntConstToken(Token.INTCONST,yytext(), yyline+1, yycolumn+1,0);}
[1-9]			{
					 yybegin(NUM);
					 mybuffer = new StringBuffer();
					 intval = 0;
					 mybuffer.append(yytext());
					 intval = intval*10 + yytext().charAt(0)-'0';
				}

<NUM> [0-9]		{ 
					mybuffer.append(yytext()); 
					intval = intval*10 + yytext().charAt(0)-'0';
				}
<NUM> \. 		{
					yybegin(FRAC);
					mybuffer.append(yytext()); 
					frac = 0; 
					teiler = 1;
				}
<NUM> [eE][-]?[0-9] { 
						yybegin(EXP); 
						yypushback(yytext().length()-1);
						mybuffer.append(yytext().charAt(0)); 
						exponent = 0;
						vorzeichen = 1;
					}

<NUM> [^]   	{ 
					yybegin(YYINITIAL);
					yypushback(1);
					return new IntConstToken(Token.INTCONST, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval);
				}
<NUM> <<EOF>>	{ 
					yybegin(YYINITIAL);
					return new IntConstToken(Token.INTCONST, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval);
				}

<FRAC> [0-9]		{
						mybuffer.append(yytext()); 
						frac = frac*10+yytext().charAt(0)-'0'; 
						teiler*=10;
					}
<FRAC> [eE][-]?[0-9] { 
						yybegin(EXP); 
						yypushback(yytext().length()-1);
						mybuffer.append(yytext().charAt(0)); 
						exponent = 0;
						vorzeichen = 1;
					}
<FRAC> [^]			{ 
						yybegin(YYINITIAL);  
						yypushback(1); 
						return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval+(frac/teiler));
					}
<FRAC> <<EOF>> 		{ 
						yybegin(YYINITIAL); 
						return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval+(frac/teiler));
					}
<EXP> [-]		{
					mybuffer.append("-");
					vorzeichen = -1;
				}
<EXP> [0]		{
					yybegin(YYINITIAL);
					mybuffer.append(yytext());
					exponent = 0;
					return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn+2-mybuffer.length(), intval+(frac/teiler));
				}
<EXP> [1-9]		{
					yybegin(AFTEREXP); 
					mybuffer.append(yytext()); 
					exponent = yytext().charAt(0)-'0';
				}
<EXP> [^]		{
					yybegin(YYINITIAL); 
					yypushback(1); 
					return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn-mybuffer.length(), intval+(frac/teiler));
				}
<EXP> <<EOF>>	{
					yybegin(YYINITIAL); 
					return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn-mybuffer.length(), intval+(frac/teiler));
				}

<AFTEREXP> [0-9] 	{
						exponent = exponent*10+yytext().charAt(0)-'0';
						mybuffer.append(yytext());
					}
<AFTEREXP> [^]		{
						yybegin(YYINITIAL); 
						yypushback(1); 
						return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), (intval+(frac/teiler))*Math.pow(10,vorzeichen*exponent));
					}
<AFTEREXP> <<EOF>> 	{
						yybegin(YYINITIAL); 
						yypushback(1); 
						return new FloatConstToken(Token.FLOATCONST, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), (intval+(frac/teiler))*Math.pow(10,exponent));
					}
[\ \n\t\s]			{/*whitespace*/}
<<EOF>> {return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1);}
[^]						{ return new Token(Token.INVALID,  yytext(), yyline+1, yycolumn+1); }


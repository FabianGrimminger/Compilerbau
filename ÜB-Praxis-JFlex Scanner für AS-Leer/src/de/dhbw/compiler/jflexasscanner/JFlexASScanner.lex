/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis AS-Scanner mit JFlex
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

%%

%class JFlexASScanner
%function nextToken
%type  Token

%unicode
%line
%column
%public
%final 
%char

%xstate NUM, FRAC, EXP, AFTEREXP

%{
StringBuffer mybuffer;
int intval;
double frac = 0;
double teiler=1;
double exponent;
%}

%eofval{ 
%eofval}


%%
\s				{ }
[\,]			{ return new Token(Token.COMMA, yytext(), yyline+1, yycolumn+1);}
[\[]			{ return new Token(Token.LSBR, yytext(), yyline+1, yycolumn+1);}
[\]]			{ return new Token(Token.RSBR, yytext(), yyline+1, yycolumn+1);}
null			{ return new Token(Token.NULL, yytext(), yyline+1, yycolumn+1);}
[0-9]			{
					yybegin(NUM);
					mybuffer = new StringBuffer();
					intval = 0;
					mybuffer.append(yytext());
					intval = intval*10 + yytext().charAt(0)-'0';
					
				}
(\.\.)			{ return new Token(Token.TO, yytext(), yyline+1, yycolumn+1);}
<NUM> [0-9]		{ mybuffer.append(yytext()); intval = intval*10 + yytext().charAt(0)-'0';}
<NUM> \. / \.(\.\.)* {yypushback(1); yybegin(YYINITIAL); return new NumToken(Token.NUM, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval);}
<NUM> \. / (\.\.)* {yybegin(FRAC);mybuffer.append(yytext()); frac = 0; teiler = 1;}

<NUM> [a-zA-Z][0-9a-zA-Z]*	{ yybegin(YYINITIAL); return new Token(Token.ID, mybuffer.toString()+yytext(), yyline+1, yycolumn+1-mybuffer.length());}
<NUM> [^]   	{ 
					yybegin(YYINITIAL);
					yypushback(1);
					return new NumToken(Token.NUM, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval);
				}
<NUM> <<EOF>>	{ yybegin(YYINITIAL);return new NumToken(Token.NUM, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval);}

<FRAC> [0-9]	{mybuffer.append(yytext()); frac = frac*10+yytext().charAt(0)-'0'; teiler*=10;}
<FRAC> [\^][0-9] { yybegin(EXP); yypushback(1); exponent = 0;}
<FRAC> [^]		{ yybegin(YYINITIAL);  yypushback(1); return new FracToken(Token.FRAC, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval+(frac/teiler));}
<FRAC> <<EOF>> 	{ yybegin(YYINITIAL); return new FracToken(Token.FRAC, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), intval+(frac/teiler));}

<EXP> [0-9]		{yybegin(AFTEREXP); mybuffer.append("^"+yytext()); exponent = yytext().charAt(0)-'0';}
<EXP> [^]		{yybegin(YYINITIAL); yypushback(1); return new FracToken(Token.FRAC, mybuffer.toString(), yyline+1, yycolumn-mybuffer.length(), intval+(frac/teiler));}
<EXP> <<EOF>>	{yybegin(YYINITIAL); return new FracToken(Token.FRAC, mybuffer.toString(), yyline+1, yycolumn-mybuffer.length(), intval+(frac/teiler));}

<AFTEREXP> [0-9] {exponent = exponent*10+yytext().charAt(0)-'0';mybuffer.append(yytext());}
<AFTEREXP> [^]	{yybegin(YYINITIAL); yypushback(1); return new FracToken(Token.FRAC, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), (intval+(frac/teiler))*Math.pow(10,exponent));}
<AFTEREXP> <<EOF>> {yybegin(YYINITIAL); yypushback(1); return new FracToken(Token.FRAC, mybuffer.toString(), yyline+1, yycolumn+1-mybuffer.length(), (intval+(frac/teiler))*Math.pow(10,exponent));}

[a-zA-Z][0-9a-zA-Z]*	{ return new Token(Token.ID, yytext(), yyline+1, yycolumn+1);}
[^]				{ return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }
<<EOF>>			{ return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1);}

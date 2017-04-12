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

%xstate NUM, FRAC, EXP

%{
NumToken numtoken;
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
					numtoken = new NumToken(Token.NUM,yytext(),yyline+1,yycolumn+1);
					numtoken.addValue(yychar);
					//return new NumToken(Token.NUM, yytext(), yyline+1, yycolumn+1);
				}
<NUM> [0-9]		{ numtoken.addValue(yychar);}
<NUM> \.		{ numtoken.setPoint();}
<NUM> [^]   	{ 
					yybegin(YYINITIAL);
					yypushback(1);
					return numtoken;
				}
[0-9a-zA-Z]+	{ return new Token(Token.ID, yytext(), yyline+1, yycolumn+1);}
[0-9]+[\.][0-9]*([\^][0-9]+)? { return new FracToken(Token.FRAC, yytext(), yyline+1, yycolumn+1);}
[^]				{ return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }
<<EOF>>			{ return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1);}

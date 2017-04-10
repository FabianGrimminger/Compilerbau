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

%xstate NUM, FRAC, EXP

%{
%}

%eofval{ 
%eofval}


%%
\s				{ }
[\,]			{ return new Token(Token.COMMA, yytext(), yyline+1, yycolumn+1);}
[\[]			{ return new Token(Token.LSBR, yytext(), yyline+1, yycolumn+1);}
[\]]			{ return new Token(Token.RSBR, yytext(), yyline+1, yycolumn+1);}
null			{ return new Token(Token.NULL, yytext(), yyline+1, yycolumn+1);}
[0-9]+			{ return new Token(Token.NUM, yytext(), yyline+1, yycolumn+1);}
[a-zA-Z0-9]+	{ return new Token(Token.ID, yytext(), yyline+1, yycolumn+1);}
[0-9]+[\.][0-9]*([\^][0-9]+)? { return new Token(Token.FRAC, yytext(), yyline+1, yycolumn+1);}
[^]				{ return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }
<<EOF>>			{ return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1);}

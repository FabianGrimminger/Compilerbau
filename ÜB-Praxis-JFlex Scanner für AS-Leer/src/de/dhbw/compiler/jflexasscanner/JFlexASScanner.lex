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

[^]			{ return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }

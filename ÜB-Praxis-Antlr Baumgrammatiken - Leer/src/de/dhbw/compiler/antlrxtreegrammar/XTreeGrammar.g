/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis ANTLR-Parser f�r X
 * - Grammatik f�r Scanner und Parser
 * 
 * **********************************************
 */

tree grammar XTreeGrammar;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
}

@header {package de.dhbw.compiler.antlrxtreegrammar;}


program:     ^('program' ID decllist statlist);

decl:        ^(DECL ID type)
           | ^(DECL ID type 'read')
           | ^(DECL ID type 'print')
           | ^(DECL ID type 'read' 'print');

type: 'int'|'float'|'string';

decllist:     ^(DECLLIST decl*);

// Ausdrücke
//expr:         multexpr (('+'^ | '-'^) multexpr)*;
expr:         ^(('+'|'-'|'*'|'/')expr expr) | simpleexpr;
//multexpr:    simpleexpr (('*'^ | '/'^) simpleexpr)*;
simpleexpr:   '('! expr ')'! 
            | INTCONST |  ^(UMINUS INTCONST)
            | FLOATCONST | ^(UMINUS FLOATCONST)
            | ID | STRINGCONST;

// Zuweisung
assignstat:   ^(':=' ID expr);

// Bedingungen
cond:         ^(('<'|'>'|'=') expr expr);

// Bedingte Zuweisung
condstat:     ^('if' cond stat (stat)?);

// Schleifen
whilestat:    ^('while' cond stat);
forstat:      ^('for' assignstat cond assignstat stat);

// Anweisungen
stat:         assignstat | condstat | whilestat | forstat | statlist;

statlist:      ^(STATLIST stat*);



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

grammar X;

options {
  language = Java;
  output = AST;
}

// AST-Tokens
tokens { 
  DECL;
  STATLIST;
  DECLLIST;
  UMINUS;
}

@parser::header {package de.dhbw.compiler.antlrxparser;}
@lexer::header  {package de.dhbw.compiler.antlrxparser;}

WS: ( '\t' | ' ' | '\r' | '\n' )+ { skip(); };
//PROGRAM: 'program';
//READ: 'read';
//PRINT: 'print';
//INT: 'int';
//FLOAT: 'float';
//STRING: 'string';
//BEGIN: 'begin';
//END: 'end';
//SEMICOLON: ';';
//WHILE: 'while';
//IF: 'if';
//THEN: 'then';
//ELSE: 'else';
//FOR: 'for';
//LBR: '(';
//RBR: '(';
//ASSIGN: ':=';
//PLUS: '+';
//MINUS: '-';
//MULT: '*';
//DIV: '/';
//EQUAL

fragment LETTER: ('a'..'z'|'A'..'Z'|'ä'|'Ä'|'ö'|'Ö'|'ü'|'Ü'|'ß');
fragment DIGIT: ('0'..'9');
ID: LETTER(LETTER|DIGIT)*;
INTCONST: '-'?DIGIT+;
FLOATCONST: (INTCONST ('.' DIGIT*)? ('e'|'E')('+' |'-' )? INTCONST) =>
 INTCONST ('.' DIGIT*)? ('e'|'E')('+' |'-' )? INTCONST |
 INTCONST ('.' DIGIT*)?;
STRINGCONST: '"'(LETTER|DIGIT)*'"';



INVALID:  .;

program: 'program'ID';'declist BLOCK'.';

decl: modifier ID ':' type ';';
declist: decl*;
modifier: 'read print'|'read'|'print'|{skip();};
type: 'int' | 'float'|'string';
block: 'begin' statlist 'end';
statlist: statwithsemi*;
statwithsemi: stat';';
stat: assignstat|condstat|whilestat|forstat|block;
whilestat: 'while''('cond')'stat;
forstat: 'for''('assignstat';'cond';'assignstat')';
assignstat: ID':='expr';';
condstat: 'if' cond 'then' stat 'else' stat; | 'if' cond 'then' stat;





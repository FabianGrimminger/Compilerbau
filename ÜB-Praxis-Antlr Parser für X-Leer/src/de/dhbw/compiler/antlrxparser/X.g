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
  backtrack = false;
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
fragment LETTER: ('a'..'z'|'A'..'Z'|'ä'|'Ä'|'ö'|'Ö'|'ü'|'Ü'|'ß');
fragment DIGIT: ('0'..'9');
ID: LETTER(LETTER|DIGIT)*;
INTCONST: '-'?DIGIT+;
FLOATCONST: (INTCONST ('.' DIGIT*)? ('e'|'E')('+' |'-' )? INTCONST) =>
 INTCONST ('.' DIGIT*)? ('e'|'E')('+' |'-' )? INTCONST |
 INTCONST ('.' DIGIT*)?;
STRINGCONST: '"'(LETTER|DIGIT)*'"';

INVALID:  .;

program: 'program'ID';'declist block'.';

decl: modifier ID ':' type ';';
declist: decl*;
modifier: 'read print'|'read'|'print'|{};
type: 'int' | 'float'|'string';
block: 'begin' statlist 'end';
statlist: statwithsemi*;
statwithsemi: stat';';
stat: assignstat|condstat|whilestat|forstat|block;
whilestat: 'while''('cond')'stat;
forstat: 'for''('assignstat';'cond';'assignstat')';
assignstat: ID':='expr';';
condstat: 'if' cond 'then' stat condstat2;
condstat2: 'else' stat | {};
expr: expr2 expr1a;
expr1a: '+'expr | '-'expr|{};
expr2: expr3 expr2a;
expr2a: '*'expr2 | '/'expr2 | {};
expr3: '-'expr3a | INTCONST | FLOATCONST | STRINGCONST | ID | '(' expr ')';
expr3a: INTCONST | FLOATCONST;
cond: expr cond2;
cond2: '<' expr | '>' expr | '=' expr;






tree grammar XtoJava;

options {
  language = Java;
  output = template;
  tokenVocab = XOptimizer;
  ASTLabelType = XTree;
  backtrack = true;
}

@header {
    package de.dhbw.compiler.antlrxcompiler;
}

@members {

  private SymbolTable  symbols = SymbolTable.getInstance();  
     
}

//program:      'todo' -> template() "Hello World!";

// Bedingte Zuweisung
condstat:    ^('if' cond  s=stat e=stat) -> template(c={$cond.st}, so={$s.st}, sz={$e.st}) 
<<if(<c>)
{
  <so>
}else
{
  <sz>
}>>
| ^('if' cond  s=stat) -> template(c={$cond.st}, s1={$s.st}) 
<<if(<c>)
{
  <s1>
}>>;

// Zuweisungen
assignstat:  ^(op=':=' ID  expr) -> template(id={$ID.text}, e={$expr.st}) "<id>=<e>";

whilestat: ^('while' cond stat) -> template(c={$cond.st}, s={$stat.st}) 
<<while(<c>)
{
  <s>
}>>;

forstat:   ^('for' a=assignstat cond c=assignstat stat) -> template(a={$a.st}, b={$cond.st}, c={$c.st}, d={$stat.st}) 
<<for(<a>;<b>;<c>)
{
  <d>
}>>;

// Anweisungen->
stat:         st=assignstat -> template(s={$st.st}) "<s>;"  | (st=condstat | st=whilestat | st=forstat | st=statlist) -> template(s={$st.st}) "<s>" ;

statlist:        ^(STATLIST (s+=stat)*) -> template(list={$s}) "<list; separator=\"\n\">";
               

// Deklarationen
decl:       
  ^(DECL ID 'int' r='read'? p='print'?) -> template(i={$ID.text}, re={$r.text}, pr={$p.text}) "int <i> = <re>;"   
| ^(DECL ID 'float' r='read'? p='print'?) -> template(i={$ID.text}, re={$r.text}, pr={$p.text}) "double <i> = <re>;"     
| ^(DECL ID 'string' r='read'? p='print'?) -> template(i={$ID.text}, re={$r.text}, pr={$p.text}) "String <i> = \"\";"   ;

decllist:    ^(DECLLIST (d+=decl)*) -> template(dd={$d}) "<dd; separator=\"\n\">";

// Expr und Cond!!
expr:       

  ^(op=('+' | '-' | '/' | '*') l=expr r=expr) -> template(o={$op.text}, el={$l.st}, er={$r.st}) "<el><o><er>"
| ^(op=UMINUS e=expr)  -> template(o={$op.text}, ex={$e.st}) "<o><ex>"
         
| INTCONST     -> template(i={$INTCONST.text}) "<i>"
| FLOATCONST -> template(f={$FLOATCONST.text}) "<f>"
| STRINGCONST -> template(s={$STRINGCONST.text}) "<s>"
| ID -> template(i={$ID.text}) "<i>";          


// Bedingungen
cond:   ^(op=('<' |'>' |'=') el=expr er=expr) -> template(o={$op.text}, ll={$el.st}, rr={$er.st}) "<ll> <o>= <rr>";

// Programme
program:      { symbols.clear(); } ^('program' ID dd=decllist ss=statlist) ->template(id={$ID.text}, d={$dd.st}, s={$ss.st}) 
<<public class <id>
  {
    public static void main(String args[])
    {
      <d>
      
      <s>
    }
   }>>;



tree grammar XOptimizer;

options {
  language = Java;
  output = AST;
  tokenVocab = XTypeCheck;
  ASTLabelType = XTree;
  filter=true;
}



@header {
    package de.dhbw.compiler.antlrxcompiler;
}

@members {
    private String addString(String first, String last) {
      return first.substring(0, first.length()-1)+last.substring(1);
    }
    
    private String opInt(String first, String last, char op) {
      int firstValue = 0;
      int lastValue = 0;
      try {
        firstValue = Integer.parseInt(first);
        lastValue = Integer.parseInt(last);
      } catch (Exception e) {
        e.printStackTrace();
      }
      switch (op) {
        case '+': return Integer.toString(firstValue+lastValue);
        case '-': return Integer.toString(firstValue-lastValue);
        case '*': return Integer.toString(firstValue*lastValue);
        case '/': return Integer.toString(firstValue/lastValue);
        default: return "";
      }
     }
      
    private String opFloat(String first, String last, char op) {
      double firstValue = 0.0;
      double lastValue = 0.0;
      try {
	      firstValue = Double.parseDouble(first);
	      lastValue = Double.parseDouble(last);
      } catch (Exception e) {
        e.printStackTrace();
      }
      switch (op) {
        case '+': return Double.toString(firstValue+lastValue);
        case '-': return Double.toString(firstValue-lastValue);
        case '*': return Double.toString(firstValue*lastValue);
        case '/': return Double.toString(firstValue/lastValue);
        default: return "";
      }
     }
      
 }


bottomup: uminus|add_const|sub_const|mult_const|div_const|mult_zero_one;


uminus:
 ^(UMINUS x=INTCONST) -> INTCONST[ "-"+$x.text ]
| ^(UMINUS x=FLOATCONST) -> FLOATCONST["-"+$x.text ];


mult_zero_one:
 ^('*' x=INTCONST y=.) { $x.text.equals("0") || $x.text.equals("1") }?
-> {$x.text.equals("0") }? INTCONST["0"]
-> $y
| ^('*' a=. b=INTCONST) { $b.text.equals("0") || $b.text.equals("1") }?
-> { $b.text.equals("0") }? INTCONST["0"]
-> $a;

add_zero:
^('+' x=INTCONST y=.) {$x.text.equals("0")}? 
-> $y
| ^('+' a=. b=INTCONST) {$b.text.equals("0")}?
-> $a
| ^('+' x=FLOATCONST y=.) {$x.text.equals("0")}? 
-> $y
| ^('+' a=. b=FLOATCONST) {$b.text.equals("0")}?
-> $x;

sub_zero:
^('-' x=INTCONST y=.) {$x.text.equals("0")}? 
-> $y
| ^('-' a=. b=INTCONST) {$b.text.equals("0")}?
-> $a
| ^('-' x=FLOATCONST y=.) {$x.text.equals("0")}? 
-> $y
| ^('-' a=. b=FLOATCONST) {$b.text.equals("0")}?
-> $a;

add_const:
^('+' x=INTCONST y=INTCONST) 
-> INTCONST[opInt($x.text,$y.text,'+')]
| ^('+' a=FLOATCONST b=FLOATCONST)
-> FLOATCONST[opFloat($a.text,$b.text,'+')]
| ^('+' c=INTCONST d=FLOATCONST)
-> FLOATCONST[opFloat($c.text, $d.text,'+')]
| ^('+' e=FLOATCONST f=INTCONST)
-> FLOATCONST[opFloat($e.text, $f.text,'+')];

sub_const:
^('-' x=INTCONST y=INTCONST) 
-> INTCONST[opInt($x.text,$y.text,'-')]
| ^('-' a=FLOATCONST b=FLOATCONST)
-> FLOATCONST[opFloat($a.text,$b.text,'-')]
| ^('-' c=INTCONST d=FLOATCONST)
-> FLOATCONST[opFloat($c.text, $d.text,'-')]
|^('-' e=FLOATCONST f=INTCONST)
-> FLOATCONST[opFloat($e.text, $f.text,'-')];

mult_const:
^('*' x=INTCONST y=INTCONST) 
-> INTCONST[opInt($x.text,$y.text,'*')]
| ^('*' a=FLOATCONST b=FLOATCONST)
-> FLOATCONST[opFloat($a.text,$b.text,'*')]
| ^('*' c=INTCONST d=FLOATCONST)
-> FLOATCONST[opFloat($c.text, $d.text,'*')]
|^('*' e=FLOATCONST f=INTCONST)
-> FLOATCONST[opFloat($e.text, $f.text,'*')];

div_const:
^('/' x=INTCONST y=INTCONST) 
-> INTCONST[opInt($x.text,$y.text,'/')]
| ^('/' a=FLOATCONST b=FLOATCONST)
-> FLOATCONST[opFloat($a.text,$b.text,'/')]
| ^('/' c=INTCONST d=FLOATCONST)
-> FLOATCONST[opFloat($c.text, $d.text,'/')]
|^('/' e=FLOATCONST f=INTCONST)
-> FLOATCONST[opFloat($e.text, $f.text,'/')];



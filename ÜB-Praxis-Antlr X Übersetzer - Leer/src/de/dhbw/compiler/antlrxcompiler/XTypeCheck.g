tree grammar XTypeCheck;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = XTree;
}

tokens{
  PLUS='+';
}

@header {
package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;
}

@members {

   private SymbolTable  symbols = SymbolTable.getInstance();  
   
   private void error(XTree tree, String message) {
     System.err.println("Error at "+tree.getLine()+","+tree.getCharPositionInLine()+": "+message);
   }
}

// Deklarationen
decl:       
  ^(DECL ID 'int' r='read'? p='print'?)     
  { symbols.put($ID.text, new Symbol($ID.text, XType.IntType, $r!=null, $p!=null)); } 
| ^(DECL ID 'float' r='read'? p='print'?)   
  { symbols.put($ID.text, new Symbol($ID.text, XType.FloatType, $r!=null, $p!=null)); } 
| ^(DECL ID 'string' r='read'? p='print'?)  
  { symbols.put($ID.text, new Symbol($ID.text, XType.StringType, $r!=null, $p!=null)); } ;

decllist:    ^(DECLLIST decl*);

// Expr und Cond!!
expr:       

  ^(op=('+' | '-' | '/' | '*') l=expr r=expr) 
//   -> { $l.tree.exprType==XType.intType && $r.tree.exprType==XType.intType }?
//      ^($op $l $r)
//      { $op.tree.exprType=XType.intType; }
//   -> { ($l.tree.exprType==XType.intType || $l.tree.exprType==XType.floatType) && 
//        ($r.tree.exprType==XType.intType || $l.tree.exprType==XType.floatType)    }?
//      ^($op $l $r)
//      { $op.tree.exprType=XType.floatType; }
//   -> { $l.tree.exprType==XType.stringType && $r.tree.exprType==XType.stringType && $op.type==PLUS }?
//      ^($op $l $r)
//      { $op.tree.exprType=XType.stringType; }
//   -> ^($op $l $r)
//      { $op.tree.exprType=XTree.INVALIDTYPE;
//        error($op,$op.text+" ("+$op.token.getType()+") is not valid for operands "+$l.tree.type+" and "+$r.tree.type+"."); }
  {
    if ($l.tree.exprType==XType.IntType && $r.tree.exprType==XType.IntType) {
      $op.tree.exprType=XType.IntType;
    } else if (($l.tree.exprType==XType.IntType || $l.tree.exprType==XType.FloatType) && 
               ($r.tree.exprType==XType.IntType || $r.tree.exprType==XType.FloatType))   {
      $op.tree.exprType=XType.FloatType;
    } else if ($l.tree.exprType==XType.StringType && $r.tree.exprType==XType.StringType && $op.type==PLUS) {
      $op.tree.exprType=XType.StringType;
    } else {
      $op.tree.exprType=XType.InvalidType;
      error($op,$op.text+" is not valid for operands "+$l.tree.exprType+" and "+$r.tree.exprType+".");
    }
  }
              
| ^(op=UMINUS e=expr)  // expr nicht FLOATCONST|INTCONST wegen Rekursion!
  { 
      $op.tree.exprType=$e.tree.exprType;
  }    
         
| INTCONST    { $INTCONST.tree.exprType=XType.IntType; }    
| FLOATCONST  { $FLOATCONST.tree.exprType=XType.FloatType; }
| STRINGCONST { $STRINGCONST.tree.exprType=XType.StringType; }
| ID          { if (!symbols.containsKey($ID.text)) { 
                  $ID.tree.exprType=XType.InvalidType;
                  error($ID,"Variable "+$ID.text+" is not defined.");
                } else {
                  $ID.tree.exprType=symbols.get($ID.text).type;
                }
              };  

// Zuweisungen
assignstat:  ^(op=':=' ID  expr)
  { if (!symbols.containsKey($ID.text)) { 
      $ID.tree.exprType=XType.InvalidType;
      $op.tree.exprType=XType.InvalidType;
      error($ID,"Variable "+$ID.text+" is not defined.");
    } else {
      $ID.tree.exprType=symbols.get($ID.text).type;
      if ($ID.tree.exprType==XType.FloatType && $expr.tree.exprType==XType.IntType) {
        $op.tree.exprType=XType.FloatType;  
      } else if ($ID.tree.exprType!=$expr.tree.exprType) {
        $op.tree.exprType=XType.InvalidType;
        error($op,"An expression of type "+$expr.tree.exprType+
                  " cannot be assigned to a variable of type "+$ID.tree.exprType+".");                    
      } else { 
        $op.tree.exprType=$ID.tree.exprType;
      }
    }
  };

// Bedingungen
cond:   ^(op=('<' |'>' |'=') l=expr r=expr) 
  { if ($l.tree.exprType==XType.StringType || $r.tree.exprType==XType.StringType) {
      error($op,$op.text+" is not valid for string operands.");
    } else if ($l.tree.exprType==XType.IntType && $r.tree.exprType==XType.IntType) {
      $op.tree.exprType=XType.IntType;
    } else {
      $op.tree.exprType=XType.FloatType;
    }
  };

// Bedingte Zuweisung
condstat:   ^('if' cond  stat stat?);

// Schleifen
whilestat:    ^('while' cond stat);
forstat:      ^('for' assignstat cond assignstat stat);

// Anweisungen
stat:         assignstat | condstat | whilestat | forstat | statlist;

statlist:        ^(STATLIST stat*);

// Programme
program:      { symbols.clear(); } ^('program' ID decllist statlist);




/*
old stuff
tree grammar XTypeCheck;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = XTree;
}

tokens{
  PLUS='+';
}

@header {
package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;
}

@members {

   private SymbolTable  symbols = SymbolTable.getInstance();  
   
   private XType getValue(String type){
      if(type.equals("int")){
        return XType.IntType;
      }
      else if(type.equals("float")){
        return XType.FloatType;
      }
      else if(type.equals("string")){
        return XType.StringType;
       }
       else {return XType.InvalidType;}
       }
   
}


program:     ^('program' ID decllist statlist);

//decl:        ^(DECL ID type) {symbols.put($ID.text, new Symbol($ID.text, getValue($type.text)));}
//           | ^(DECL ID type 'read') {symbols.put($ID.text, new Symbol($ID.text, getValue($type.text), true, false));}
//           | ^(DECL ID type 'print') {symbols.put($ID.text, new Symbol($ID.text, getValue($type.text), false, true));}
//           | ^(DECL ID type 'read' 'print'){symbols.put($ID.text, new Symbol($ID.text, getValue($type.text), true, true));};

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
assignstat:   ^(':=' t=ID s=expr);

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
*/


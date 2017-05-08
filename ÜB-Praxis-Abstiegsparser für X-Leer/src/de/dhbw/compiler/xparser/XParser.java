/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis X Abstiegsparser
 * - Abstiegsparser
 * 
 * **********************************************
 */

package de.dhbw.compiler.xparser;

import org.junit.experimental.theories.ParametersSuppliedBy;

public class XParser {

	TokenReader in;
	int counter = 0;
	int match = 0;
	
	public XParser(TokenReader in) {
		//TODO Initialization
		this.in = in;
	}

	public Tree parseProgram() {
		//TODO Parser
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		Tree d = null;
		Tree e = null;
		Tree f = null;
		Tree g = null;
		
		if((a=parseToken(Token.PROGRAM))!=null && (b=parseToken(Token.ID))!=null && (c=parseToken(Token.SEMICOLON))!=null &&(g=parseDecList())!=null && (d=parseBlock())!=null && (e=parseToken(Token.DOT))!=null && (f=parseToken(Token.EOF))!=null){
			//Tree t = new Tree(new Token(Token.APROGRAM));
			//t.addLastChild(a);
			a.addLastChild(b);
			//t.addLastChild(c);
			a.addLastChild(g);
			a.addLastChild(d);
			//a.addLastChild(e);
			//t.addLastChild(f);
			//System.out.println(""+counter+" parseToken |"+match+" passend |"+in.getTokenCount()+" Token");
			return a;
		}
		in.setPosition(pos);
		return null;
	}
	public Tree parseToken(int token){
		counter++;
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==token){
			match++;
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}

	public Tree parseNumExp3(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;		
		
		if( (a=parseToken(Token.LBR))!=null && (b=parseNumExp())!=null && (c=parseToken(Token.RBR))!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			//t.addLastChild(a);
			t.addLastChild(b);
			//t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseToken(Token.MINUS))!=null && (b=parseToken(Token.INTCONST))!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			t.addLastChild(b);
			return t;
		}
		in.setPosition(pos);
		
		if((a=parseToken(Token.INTCONST))!=null){
			//Tree t = new Tree(new Token(Token.EXPR3));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if( (a=parseToken(Token.MINUS))!=null && (b=parseToken(Token.FLOATCONST))!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			t.addLastChild(b);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseToken(Token.FLOATCONST))!=null){
			//Tree t = new Tree(new Token(Token.EXPR3));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if( (a=parseToken(Token.ID))!=null){
			//Tree t = new Tree(new Token(Token.EXPR3));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
//gefällt mir gar ned!!!!!		
		if( (a=parseToken(Token.STRINGCONST))!=null){
			//Tree t = new Tree(new Token(Token.EXPR3));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseNumExp2(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if((a=parseNumExp3())!=null && (b=parseToken(Token.MULT))!=null && (c=parseNumExp2())!=null){
			Tree t = new Tree(new Token(Token.EXPR2));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseNumExp3())!=null && (b=parseToken(Token.DIV))!=null && (c=parseNumExp2())!=null){
			Tree t = new Tree(new Token(Token.EXPR2));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}		
		in.setPosition(pos);
		
		if( (a=parseNumExp3())!=null){
			//Tree t = new Tree(new Token(Token.EXPR2));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		return null;
	}
		
	public Tree parseNumExp(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;		
		
		if( (a=parseNumExp2())!=null && (b=parseToken(Token.PLUS))!=null && (c=parseNumExp())!=null){
			//Tree t = new Tree(new Token(Token.EXPR));
			//t.addLastChild(a);
			b.addLastChild(a);
			b.addLastChild(c);
			return b;
		}
		in.setPosition(pos);		
		if( (a=parseNumExp2())!=null && (b=parseToken(Token.MINUS))!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.EXPR));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		if( (a=parseNumExp2())!=null){
			//Tree t = new Tree(new Token(Token.EXPR));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);		
		return null;
	}
	
	public Tree parseStrExp(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if( (a=parseStrExp2())!=null && (b=parseToken(Token.PLUS))!=null && (c=parseStrExp())!=null){
			Tree t = new Tree(new Token(Token.EXPR));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		if( (a=parseStrExp2())!=null){
			Tree t = new Tree(new Token(Token.EXPR));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStrExp2(){
		int pos = in.getPosition();
		Tree a = null;
		
		if((a=parseStrExp3())!=null){
			Tree t = new Tree(new Token(Token.EXPR2));
			t.addLastChild(a);
			return t;
		}
		
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStrExp3(){
		int pos = in.getPosition();
		Tree a = null;
		
		if( (a=parseToken(Token.STRINGCONST))!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		if( (a=parseToken(Token.ID))!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseNumAss(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if((a=parseToken(Token.ID))!=null && (b=parseToken(Token.ASSIGN))!=null && (c=parseNumExp())!=null){
			//Tree t = new Tree(new Token(Token.ASSIGNSTAT));
			b.addLastChild(a);
			//t.addLastChild(b);
			b.addLastChild(c);
			return b;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStrAss(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if((a=parseToken(Token.ID))!=null && (b=parseToken(Token.ASSIGN))!=null && (c=parseStrExp())!=null){
			Tree t = new Tree(new Token(Token.ASSIGNSTAT));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		return null;
	}

	public Tree parseCondIFStat(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		Tree d = null;
		Tree e = null;
		Tree f = null;
		
		if( (a=parseToken(Token.IF))!=null && (b=parseCond())!=null && (c=parseToken(Token.THEN))!=null && (d=parseStat())!=null){
			Tree t = new Tree(new Token(Token.CONDSTAT));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			t.addLastChild(d);
			
			int tpos = in.getPosition();
			if((e=parseToken(Token.ELSE))!=null && (f=parseStat())!=null){
				t.addLastChild(e);
				t.addLastChild(f);
				return t;
			}
			in.setPosition(tpos);
			return t;
		}
		
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseWhileStat(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		Tree d = null;
		Tree e = null;
		
		if( (a=parseToken(Token.WHILE))!=null && (b=parseToken(Token.LBR))!=null &&
			(c=parseCond())!=null && (d=parseToken(Token.RBR))!=null && 
			(e=parseStat())!=null){
			Tree t = new Tree(new Token(Token.WHILESTAT));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			t.addLastChild(d);
			t.addLastChild(e);
			return t;
		}
		in.setPosition(pos);
		return null;
	}

	public Tree parseForStat(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		Tree d = null;
		Tree e = null;
		Tree f = null;
		Tree g = null;
		Tree h = null;
		Tree i = null;
		
		if( (a=parseToken(Token.FOR))!=null && (b=parseToken(Token.LBR))!=null && 
			(c=parseNumAss())!=null && (d=parseToken(Token.SEMICOLON))!=null && 
			(e=parseCond())!=null && (f=parseToken(Token.SEMICOLON))!=null &&
			(g=parseNumAss())!=null && (h=parseToken(Token.RBR))!=null &&
			(i=parseStat())!=null){
			Tree t = new Tree(new Token(Token.FORSTAT));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			t.addLastChild(d);
			t.addLastChild(e);
			t.addLastChild(f);
			t.addLastChild(g);
			t.addLastChild(h);
			t.addLastChild(i);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseCond(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if( (a=parseNumExp())!=null && (b=parseToken(Token.LESS))!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.COND));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseNumExp())!=null && (b=parseToken(Token.EQUALS))!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.COND));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseNumExp())!=null && (b=parseToken(Token.MORE))!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.COND));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		return null;
	}

	public Tree parseStat(){
		int pos = in.getPosition();
		Tree a = null;		
		if((a=parseCondIFStat())!=null){
			//Tree t = new Tree(new Token(Token.STAT));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);

		if((a=parseWhileStat())!=null){
			//Tree t = new Tree(new Token(Token.STAT));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if((a=parseForStat())!=null){
			//Tree t = new Tree(new Token(Token.STAT));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if((a=parseNumAss())!=null){
			//Tree t = new Tree(new Token(Token.STAT));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if((a=parseStrAss())!=null){
			//Tree t = new Tree(new Token(Token.STAT));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if((a=parseBlock())!=null){
			//Tree t = new Tree(new Token(Token.STAT));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStatSemi(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		
		if((a=parseStat())!=null && (b=parseToken(Token.SEMICOLON))!=null){
			//Tree t = new Tree(new Token(Token.STATWITHSEMI));
			//t.addLastChild(a);
			//t.addLastChild(b);
			return a;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStatList(){
		Tree a = null;
		
		Tree t = new Tree(new Token(Token.STATLIST));
		while((a=parseStatSemi())!=null){
			t.addLastChild(a);
		}
		
		return t;		
	}
	
	public Tree parseBlock(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if((a=parseToken(Token.BEGIN))!=null && (b=parseStatList())!=null && (c=parseToken(Token.END))!=null){
			//Tree t = new Tree(new Token(Token.BLOCK));
			//t.addLastChild(a);
			//t.addLastChild(b);
			//t.addLastChild(c);
			return b;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseDecList(){
		Tree t = new Tree(new Token(Token.DECLLIST));
		Tree a = null;
		while((a=parseDec())!=null){
			t.addLastChild(a);
		}
		return t;
	}
	
	public Tree parseDec(){
		int pos = in.getPosition();
		Tree b = null;
		Tree c = null;
		Tree d = null;
		Tree e = null;
		Tree f = null;
		
		Tree t = new Tree(new Token(Token.DECL));
		
		
		if( (b=parseModifier())!=null && (c=parseToken(Token.ID))!=null && (d=parseToken(Token.COLON))!=null){
			if( (e=parseType())!=null && (f=parseToken(Token.SEMICOLON))!=null){
				//t.addLastChild(b);
				t.addLastChild(c);
				//t.addLastChild(d);
				t.addLastChild(e);
				//t.addLastChild(f);
				return t;
			}
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseModifier(){
		int rpos = in.getPosition();
		Tree a = null;
		Tree b = null;		
		Tree t = new Tree(new Token(Token.MODIFIER));
		if((a=parseToken(Token.READ))!=null){
			t.addLastChild(a);
			
		}else{
			in.setPosition(rpos);
		}
		int ppos = in.getPosition();
		if((b=parseToken(Token.PRINT))!=null){
			t.addLastChild(b);
		}else{
			in.setPosition(ppos);
		}
		
		return  t;
	}
	
	public Tree parseType(){
		int pos = in.getPosition();
		Tree a = null;
		
		if( (a=parseToken(Token.INT))!=null){
			//Tree t = new Tree(new Token(Token.TYPE));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if( (a=parseToken(Token.FLOAT))!=null){
			//Tree t = new Tree(new Token(Token.TYPE));
			//t.addLastChild(a);
			return a;
		}
		in.setPosition(pos);
		
		if( (a=parseToken(Token.STRING))!=null){
			//Tree t = new Tree(new Token(Token.TYPE));
			//t.addLastChild(a);
			return a;
		}
		
		in.setPosition(pos);
		return null;
	}
}
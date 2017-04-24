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
		
		if((a=parsePROGRAM())!=null && (b=parseID())!=null && (c=parseSEMI())!=null && (d=parseBlock())!=null && (e=parseDOT())!=null && (f=parseEOF())!=null){
			Tree t = new Tree(new Token(Token.APROGRAM));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			t.addLastChild(d);
			t.addLastChild(e);
			t.addLastChild(f);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseEOF(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.EOF){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseEND(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.END){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseSEMI(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.SEMICOLON){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseBEGIN(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.BEGIN){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseDOT(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.DOT){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parsePROGRAM(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.PROGRAM){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseLBR(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.LBR){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseRBR(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.RBR){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseASS(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.ASSIGN){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parsePlus(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.PLUS){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseMinus(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.MINUS){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseMult(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.MULT){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseDiv(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.DIV){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseID(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.ID){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseIF(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if( next.getType() == Token.IF){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseTHEN(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if( next.getType() == Token.THEN){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseELSE(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if( next.getType() == Token.ELSE){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseLESS(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if( next.getType() == Token.LESS){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseEQUAL(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if( next.getType() == Token.EQUALS){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseMORE(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if( next.getType() == Token.MORE){
			return new Tree(next);
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseIntNumber(){
		int pos = in.getPosition();
		Token next = in.nextToken();
		if(next.getType()==Token.INTCONST){
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
		
		if( (a=parseLBR())!=null && (b=parseNumExp())!=null && (c=parseRBR())!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseMinus())!=null && (b=parseIntNumber())!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			t.addLastChild(b);
			return t;
		}
		in.setPosition(pos);
		
		if((a=parseIntNumber())!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseID())!=null){
			Tree t = new Tree(new Token(Token.EXPR3));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseNumExp2(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if((a=parseNumExp3())!=null && (b=parseMult())!=null && (c=parseNumExp2())!=null){
			Tree t = new Tree(new Token(Token.EXPR2));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseNumExp3())!=null && (b=parseDiv())!=null && (c=parseNumExp2())!=null){
			Tree t = new Tree(new Token(Token.EXPR2));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		
		in.setPosition(pos);
		if( (a=parseNumExp3())!=null){
			Tree t = new Tree(new Token(Token.EXPR2));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
		
	public Tree parseNumExp(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;		
		
		if( (a=parseNumExp2())!=null && (b=parsePlus())!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.EXPR));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);		
		if( (a=parseNumExp2())!=null && (b=parseMinus())!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.EXPR));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		if( (a=parseNumExp2())!=null){
			Tree t = new Tree(new Token(Token.EXPR));
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
		
		if((a=parseID())!=null && (b=parseASS())!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.ASSIGNSTAT));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		return null;
	}

	public Tree parseCondStat(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		Tree d = null;
		Tree e = null;
		Tree f = null;
		
		if( (a=parseIF())!=null && (b=parseCond())!=null && (c=parseTHEN())!=null && (d=parseStat())!=null){
			Tree t = new Tree(new Token(Token.CONDSTAT));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			t.addLastChild(d);
			
			int tpos = in.getPosition();
			if((e=parseELSE())!=null && (f=parseStat())!=null){
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

	public Tree parseCond(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		Tree c = null;
		
		if( (a=parseNumExp())!=null && (b=parseLESS())!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.COND));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseNumExp())!=null && (b=parseEQUAL())!=null && (c=parseNumExp())!=null){
			Tree t = new Tree(new Token(Token.COND));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		
		if( (a=parseNumExp())!=null && (b=parseMORE())!=null && (c=parseNumExp())!=null){
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
		if((a=parseCondStat())!=null){
			Tree t = new Tree(new Token(Token.STAT));
			t.addLastChild(a);
			return t;
		}
		if((a=parseNumAss())!=null){
			Tree t = new Tree(new Token(Token.STAT));
			t.addLastChild(a);
			return t;
		}
		if((a=parseBlock())!=null){
			Tree t = new Tree(new Token(Token.STAT));
			t.addLastChild(a);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStatSemi(){
		int pos = in.getPosition();
		Tree a = null;
		Tree b = null;
		
		if((a=parseStat())!=null && (b=parseSEMI())!=null){
			Tree t = new Tree(new Token(Token.STATWITHSEMI));
			t.addLastChild(a);
			t.addLastChild(b);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
	
	public Tree parseStatList(){
		int pos = in.getPosition();
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
		
		if((a=parseBEGIN())!=null && (b=parseStatList())!=null && (c=parseEND())!=null){
			Tree t = new Tree(new Token(Token.BLOCK));
			t.addLastChild(a);
			t.addLastChild(b);
			t.addLastChild(c);
			return t;
		}
		in.setPosition(pos);
		return null;
	}
}

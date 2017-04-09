/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert
 * - Scanner-Klasse
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscanner;

import java.io.Reader;

public class ASScanner {
		
	private Reader in = null;
	int zustand  = 0;
	String s ="";
	public ASScanner(Reader input) {
		this.in = input;
	}
	
	public Token nextToken() throws Exception {
		
		//TODO implement Scanner here ...
		while(zustand!=-10){		
			int i = in.read();
			char c = (char) i;
			Token token = null;
			switch(zustand){
			case 0: //startzustand und whitespace
				s+=c;
				switch(c){
				case '[':
					//s+=c;
					zustand = 1;
					break;
				case ']':
					//s+=c;
					zustand = 2;
					break;
				case ',':
					//s+=c;
					zustand = 3;
					break;
				case 'n':
					//s+=c;
					zustand = 5;
					break;
				case ' ':
					s="";
					zustand = 0;
					break;
				case '\n':
					s="";
					zustand = 0;
					break;
				case '\r':
					s="";
					zustand = 0;
					break;
				case '.':
					zustand = 10;
				case '^':
					zustand = 10;
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						//s+=c;
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						//s+=c;
						zustand = 6;
					}else if(i==-1){
						return new Token(Token.EOF,"");
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 1: //[	
				token = new Token(Token.LSBR,s);
				s=""+c;
				switch(c){
				case '[':
					zustand = 1;
					break;
				case ']':
					zustand = 2;
					break;
				case ',':
					zustand = 3;
					break;
				case 'n':
					zustand = 5;
					break;
				case ' ':
					s="";
					zustand = 0;
					break;
				case '\n':
					s="";
					zustand = 0;
					break;
				case '\r':
					s="";
					zustand = 0;
					break;
				case '.':
					zustand = 10;
					break;
				case '^':
					zustand = 10;
					break;
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
					}else{
						zustand = -10;
					}
					break;
				}
				return token;
				//break;
			case 2: //]
				token = new Token(Token.RSBR,s);
				s=""+c;
				switch(c){
				case '[':
					zustand = 1;
					break;
				case ']':
					zustand = 2;
					break;
				case ',':
					zustand = 3;
					break;
				case 'n':
					zustand = 5;
					break;
				case ' ':
					s="";
					zustand = 0;
					break;
				case '\n':
					s="";
					zustand = 0;
					break;
				case '\r':
					s="";
					zustand = 0;
					break;
				case '.':
					zustand = 10;
					break;
				case '^':
					zustand = 10;
					break;
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
					}else{
						zustand = -10;
					}
					break;
				}
				return token;
				//break;
			case 3: //,
				token = new Token(Token.COMMA,s);
				s=""+c;
				switch(c){
				case '[':
					zustand = 1;
					break;
				case ']':
					zustand = 2;
					break;
				case ',':
					zustand = 3;
					break;
				case 'n':
					zustand = 5;
					break;
				case ' ':
					s="";
					zustand = 0;
					break;
				case '\n':
					s="";
					zustand = 0;
					break;
				case '\r':
					s="";
					zustand = 0;
					break;
				case '.':
					zustand = 10;
					break;
				case '^':
					zustand = 10;
					break;
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
					}else{
						zustand = -10;
					}
					break;
				}
				return token;
				//break;
			case 4: //zahlen
				
				switch(c){
				case '[':
					token = new Token(Token.NUM,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.NUM,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.NUM,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.NUM,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.NUM,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.NUM,s);
					s="";
					zustand = 0;
					return token;
				case '.':
					s+=c;
					zustand = 11;
					break;
				case '^':
					zustand = 10;
					s+=c;
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 4;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.NUM,s);						
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 5: //n
				switch(c){
				case '[':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case 'u':
					s+=c;
					zustand = 8;
					break;
				case '.':
					s+=c;
					zustand = 10;
					break;
				case '^':
					s+=c;
					zustand = 10;
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 6;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.ID,s);
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 6: //buchstaben
				switch(c){
				case '[':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '.':
					s+=c;
					zustand = 10;
					break;
				case '^':
					s+=c;
					zustand = 10;
					break;
				default:
					if(i>=48 && i<=57){
						s+=c;
						zustand = 6;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.ID,s);
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 8: //nu
				switch(c){
				case '[':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case 'l':
					s+=c;
					zustand = 9;
					break;
				case '.':
					s+=c;
					zustand = 10;
					break;
				case '^':
					s+=c;
					zustand = 10;
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 6;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.ID,s);
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 9: //nul
				switch(c){
				case '[':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.ID,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.ID,s);
					s="";
					zustand = 0;
					return token;
				case 'l':
					s+=c;
					token = new Token(Token.NULL,s);
					s="";
					zustand = 0;
					return token;
				case '.':
					s+=c;
					zustand = 10;
					break;
				case '^':
					s+=c;
					zustand = 10;
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 6;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.ID,s);
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			//really neccessary
			case 10: //.^ are here invalid
				return new Token(Token.INVALID,s);
			case 11: //number.
				switch(c){
				case '[':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.FRAC,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.FRAC,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.FRAC,s);
					s="";
					zustand = 0;
					return token;
				case '.':
					s+=c;
					s+=" - invalid Token charakter: '.'";
					zustand = 10;
					break;
				case '^':
					zustand = 12;
					s+=c;
					break;
				case 'n':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 5;
					return token;
				default:
					if(i>=48 && i<=57){
						zustand = 11;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						token = new Token(Token.FRAC,s);
						s=""+c;						
						zustand = 6;
						return token;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.FRAC,s);						
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 12: //number.{number}^
				switch(c){
				case '[':
					token = new Token(Token.INVALID,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.INVALID,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.INVALID,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.INVALID,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.INVALID,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.INVALID,s);
					s="";
					zustand = 0;
					return token;
				case '.':
					s+=c;
					s+=" - invalid Token charakter: '.'";
					zustand = 10;
					break;
				case '^':
					zustand = 1;
					s+=c;
					s+=" - invalid Token charakter: '^'";
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 13;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						s+=" -invalid Token";
						zustand = 10;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.INVALID,s);						
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case 13://number.{number}^number
				switch(c){
				case '[':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 1;
					return token;
				case ']':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 2;
					return token;
				case ',':
					token = new Token(Token.FRAC,s);
					s=""+c;
					zustand = 3;
					return token;
				case ' ':
					token = new Token(Token.FRAC,s);
					s="";
					zustand = 0;
					return token;
				case '\n':
					token = new Token(Token.FRAC,s);
					s="";
					zustand = 0;
					return token;
				case '\r':
					token = new Token(Token.FRAC,s);
					s="";
					zustand = 0;
					return token;
				case '.':
					s+=c;
					s+=" - invalid Token charakter: '.'";
					zustand = 10;
					break;
				case '^':
					zustand = 10;
					s+=c;
					s+=" - invalid Token charakter: '^'";
					break;
				case 'n':
					zustand = 5;
					token = new Token(Token.FRAC,s);
					s=""+c;
					return token;
				default:
					if(i>=48 && i<=57){
						zustand = 13;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						zustand = 6;
						token = new Token(Token.FRAC,s);
						s=""+c;
						return token;
					}else if(i==-1){
						zustand = 0;
						return new Token(Token.FRAC,s);						
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			default: //fehler, zeichen nicht bekannt
				zustand = -10;
				break;
			}
		}
		throw new Exception();
		//return new Token(Token.INVALID, "");
	}

}

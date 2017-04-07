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
		
		
		int i = in.read();
		char c = (char) i;
		
		while(zustand!=-1){		
			
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
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						//s+=c;
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						//s+=c;
						zustand = 6;
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
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				default: //hier zahlen und buchstaben abfangen, da anders in switch-case nicht möglich
					if(i>=48 && i<=57){ //zahlen in ASCII
						zustand = 4;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				default:
					if(i>=48 && i<=57){
						zustand = 4;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				case 'u':
					s+=c;
					zustand = 8;
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 6;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				default:
					if(i>=48 && i<=57){
						s+=c;
						zustand = 6;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				case 'l':
					s+=c;
					zustand = 9;
					break;
				default:
					if(i>=48 && i<=57){
						zustand = 6;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
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
				case 'l':
					s+=c;
					token = new Token(Token.NULL,s);
					zustand = 0;
					return token;
				default:
					if(i>=48 && i<=57){
						zustand = 6;
						s+=c;
					}
					else if((i>=65 && i<=90) /*GROß*/ || (i>=97 && i<=122) /*klein*/){
						s+=c;
						zustand = 6;
					}else{
						zustand = -10;
					}
					break;
				}
				break;
			case -1:
				return new Token(Token.EOF,"");
			default: //fehler, zeichen nicht bekannt
				zustand = -10;
				break;
			}
		}
		
		return new Token(Token.INVALID, "");
	}

}

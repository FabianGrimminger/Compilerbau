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
	
	public ASScanner(Reader input) {
		this.in = input;
	}
	
	public Token nextToken() throws Exception {
		
		//TODO implement Scanner here ...
		
		return new Token(Token.INVALID, "");
	}

}

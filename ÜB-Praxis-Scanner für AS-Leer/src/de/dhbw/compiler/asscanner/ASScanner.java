/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
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
		//GEHT DAS JETZT SO WIE ICH IWLL????
		return new Token(Token.INVALID, "");
	}

}

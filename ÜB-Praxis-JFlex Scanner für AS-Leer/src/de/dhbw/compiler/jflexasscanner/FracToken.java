/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Token-Definition frac
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

public class FracToken extends Token {
	
	public FracToken(int type, String text, int line, int column) {
		super(type, text, line, column);
	}

	double getValue() {
		return 0.0;
	}


}

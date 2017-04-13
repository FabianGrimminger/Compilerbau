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
	
	double value = 0.0;
	
	public FracToken(int type, String text, int line, int column, double value) {
		super(type, text, line, column);
		this.value = value;
		System.out.println(text+" "+value);
	}

	double getValue() {
		return value;
	}


}

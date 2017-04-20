/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition floatConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.JFlexXScanner;

public class FloatConstToken extends Token {
	private double value = 0;
	public FloatConstToken(int type, String text, int line, int column, double value) {
		super(type, text, line, column);
		this.value = value;
	}

	public double getValue() {
		return value;
	}


}

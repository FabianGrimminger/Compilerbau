/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition stringConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.JFlexXScanner;

public class StringConstToken extends Token {
	
	public StringConstToken(int type, String text, int line, int column) {
		super(type, text, line, column);
	}

	public String getValue() {
		return "";
	}


}

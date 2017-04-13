/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Token-Definition num
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

public class NumToken extends Token {
	
	private int value = 0;
	
	public NumToken(int type, String text, int line, int column, int value) {
		super(type,text,line,column);
		this.value = value;
	}
	
	int getValue() {
		return value;
	}
	
	void setValue(int v){
		value = v;
	}
}

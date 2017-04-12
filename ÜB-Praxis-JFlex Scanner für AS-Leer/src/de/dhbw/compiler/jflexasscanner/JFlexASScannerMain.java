/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis AS-Scanner mit JFlex
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

import java.io.StringReader;


public class JFlexASScannerMain {
	
	private static final String TEST = "[34.0^2, x,peter,  34kurt, g56, null,null, 8] ";
	
	public static void main(String[] args) throws Exception {
		
		JFlexASScanner scanner = new JFlexASScanner(new StringReader(TEST));
		Token token = scanner.nextToken();
		while(token.getType()!=Token.EOF){
			System.out.println(token);
			token = scanner.nextToken();
		}
		System.out.println(token);
		/* 
		 * Lesen Sie hier die einzelnen Token des oben angebenen String mit Hilfe des 
		 * Scanners ein und geben Sie sie auf die Konsole aus. 
		 */		
	}

}

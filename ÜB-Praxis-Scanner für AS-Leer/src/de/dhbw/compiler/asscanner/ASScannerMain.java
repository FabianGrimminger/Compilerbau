/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscanner;

import java.io.StringReader;


public class ASScannerMain {
	
	private static final String TEST = "[34, x,peter,  34kurt, g56, null,null, 8]";
	
	public static void main(String[] args) throws Exception {
		
		ASScanner scanner = new ASScanner(new StringReader(TEST));
		
		/* 
		 * Lesen Sie hier die einzelnen Token des oben angebenen String mit Hilfe des 
		 * Scanners ein und geben Sie sie auf die Konsole aus. 
		 */
		
		Token token = scanner.nextToken();
		while(token.getType()!=Token.EOF){
			System.out.println(token);
			if(token.getType()==Token.INVALID){
				return;
			}
			token = scanner.nextToken();
		}
		System.out.println(token);

	}

}

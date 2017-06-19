/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis ANTLR-Parser f�r X
 * - Main-Klasse
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxcompiler;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;

public class AntlrXCompiler {

	public static void saveToGrapvizDOT(Tree tree, String name) throws FileNotFoundException {
		StringTemplate dot = (new DOTTreeGenerator()).toDOT(tree);
		PrintWriter out = new PrintWriter(name);
		out.println(dot.toString());
		out.close();
	}
	
	public static void saveToJavaFile(StringTemplate template, String name) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(name);
		out.println(template.toString());
		out.close();
	}
	
	private static final String TEST = 
			"program test2;\n"+
			"	x : int;\n"+
			"	y : float;\n"+
			"	z : string;\n"+
			"begin\n"+
			"	x := 4+5+6.2;\n"+
			"	y := 3.56+1.2e3+45.e-67+4e34+3E-1;\n"+
			"	z := \"Hello \\\"World\\\"\" + \":\";\n"+
			"	z := \"Peter\" + 4;\n"+
			"   if 2<3 then abc := 5 else abc := 7;\n"+
			"   while (x>y) y := y+1;\n"+
			"   begin\n"+
			"      for (x:=1; x<6; x:=x+1) y:=y+2;\n"+
			"   end;\n"+
			"end.";
	
	private static final String TEST2 = 
			"program test2;\n"+
				"x: int;"+
			"begin\n"+
			"	x := 1+1;\n"+
			"end.";

	private static final String BEISPIELFOLIEN = 
			"program test5;\n"+
			"	read  x : int;\n"+
			"	print y : float;\n"+
			"	z : int;\n"+
			"begin\n"+
			"	while (x<4) begin\n"+
			"		for (z:=0; z<4; z:=z+1) x:=x+2;\n"+
			"		if x=4 then begin\n"+
			"			x:=z*(x+2);\n"+
			"			x:=x+10;\n"+
			"		end else y:=100.e-3;\n"+
			"	end;\n"+
			"end.\n";
	
	public static void main(String[] args) throws Exception {
		
		XTreeAdaptor xTreeAdaptor = new XTreeAdaptor(); 
		
		ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(BEISPIELFOLIEN.getBytes())); 
		XLexer lexer = new XLexer(input);
		
		XParser parser = new XParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(xTreeAdaptor);
		XTree tree = parser.program().getTree();
		//System.out.println(tree);
		
		XTypeCheck typecheck = new XTypeCheck(new CommonTreeNodeStream(xTreeAdaptor, tree));
		typecheck.setTreeAdaptor(xTreeAdaptor);
		XTree out = (XTree) typecheck.program().getTree();
		
		if(out==null){
			System.out.println("Tree is null");
		}else{
			XtoJava tojava = new XtoJava(new CommonTreeNodeStream(xTreeAdaptor, tree));
			StringTemplate temp = (StringTemplate)tojava.program().getTemplate();
			System.out.println(temp.toString());
		}
		
		
		//TODO Weitere Stufen Aufrufen
		//XTreeGrammar treeGrammar = new XTreeAdaptor(new CommonTreeNodeStream(tree));
		//tree = treeGrammar.program().getTree();
	}
}

/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis X Abstiegsparser
 * - Syntaxbaum
 * 
 * **********************************************
 */

package de.dhbw.compiler.xparser;

import java.util.LinkedList;
import java.util.List;

public class Tree {
	
	private Token token = null;
	private LinkedList<Tree> children = null;
	
	public Tree(Token token) {
		this.token=token;
		this.children= new LinkedList<Tree>();
	}
	
	public Token getToken() {
		return token;
	}
	
	public void addLastChild(Tree child) {
		this.children.addLast(child);
	}
	
	public void addFirstChild(Tree child) {
		this.children.addFirst(child);
	}
	
	public Tree removeChild(int n) {
		return this.children.remove(n);
	}
	
	public Tree getChild(int n) {
		return this.children.get(n);
	}
	
	public int getChildCount() {
		return this.children.size();
	}
	
	public List<Tree> getChildren() {
		return children;
	}
	
	public Tree getLeftChild(){
		if(this.children.size()>0){
			return this.children.get(0).getLeftChild();
		}else{
			return this;
		}
	}
	
	public Tree setLeftChild(Tree t){
		if(this.children.size()==1 && this.token.getType()==Token.MINUS){
			return t;
		}		
		if(this.children.size()>1){
			Tree temp = this.children.get(0).setLeftChild(t);	
			this.children.removeFirst();
			this.children.addFirst(temp);
			return this;
		}else{
			return t;
		}
	}
	
	public String toGraphvizDot() {
		StringBuffer dot = new StringBuffer();
		dot.append("digraph{ \n");
		this.appendNode(dot);
		this.appendEdges(dot);
		dot.append("}");
		return dot.toString();
	}
	
	private void appendNode(StringBuffer dot) {
		dot.append("n"+this.hashCode());
		dot.append(" [label=\""+token.getText().replace("\\", "\\\\").replace("\"","\\\"")+"\"]\n");
		for (Tree c: children) {
			c.appendNode(dot);
		}
	}
	
	private void appendEdges(StringBuffer dot) {
		for (Tree c: children) {
			dot.append("n"+this.hashCode()+" -> n"+c.hashCode()+"\n");
		}
		for (Tree c: children) {
			c.appendEdges(dot);
		}
		
	}
	
	public String toString() {
		StringBuffer res = new StringBuffer(); 
		if (children.isEmpty()) {
			res.append(token.getText());
			//System.out.println("empty: "+res.toString());
		} else {
			res.append("("+this.token.getText());
			for (Tree c: children) {
				res.append(" "+c.toString());
				//System.out.println("append: "+res.toString());
			}
			res.append(")");
		}
		//System.out.println(res.toString());
		return res.toString();
		
	}

}

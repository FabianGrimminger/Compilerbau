// $ANTLR 3.5.2 /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g 2017-06-19 14:18:53

    package de.dhbw.compiler.antlrxcompiler;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class XtoJava extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DECL", "DECLLIST", 
		"DIGIT", "FLOATCONST", "ID", "INTCONST", "INVALID", "LETTER", "OTHER", 
		"POSDIGIT", "STATLIST", "STRINGCONST", "UMINUS", "WS", "ZERO", "'('", 
		"')'", "'*'", "'+'", "'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", 
		"'='", "'>'", "'begin'", "'else'", "'end'", "'float'", "'for'", "'if'", 
		"'int'", "'print'", "'program'", "'read'", "'string'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int COMMENT=4;
	public static final int DECL=5;
	public static final int DECLLIST=6;
	public static final int DIGIT=7;
	public static final int FLOATCONST=8;
	public static final int ID=9;
	public static final int INTCONST=10;
	public static final int INVALID=11;
	public static final int LETTER=12;
	public static final int OTHER=13;
	public static final int POSDIGIT=14;
	public static final int STATLIST=15;
	public static final int STRINGCONST=16;
	public static final int UMINUS=17;
	public static final int WS=18;
	public static final int ZERO=19;
	public static final int PLUS=23;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XtoJava(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XtoJava(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("XtoJavaTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return XtoJava.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g"; }



	  private SymbolTable  symbols = SymbolTable.getInstance();  
	     


	public static class condstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "condstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:24:1: condstat : ( ^( 'if' cond s= stat e= stat ) -> template(c=$cond.stso=$s.stsz=$e.st) <<if(<c>)\r\n{\r\n <so>\r\n}else\r\n{\r\n <sz>\r\n}>>| ^( 'if' cond s= stat ) -> template(c=$cond.sts1=$s.st) <<if(<c>)\r\n{\r\n <s1>\r\n}>>);
	public final XtoJava.condstat_return condstat() throws RecognitionException {
		XtoJava.condstat_return retval = new XtoJava.condstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope cond1 =null;
		TreeRuleReturnScope cond2 =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:24:9: ( ^( 'if' cond s= stat e= stat ) -> template(c=$cond.stso=$s.stsz=$e.st) <<if(<c>)\r\n{\r\n <so>\r\n}else\r\n{\r\n <sz>\r\n}>>| ^( 'if' cond s= stat ) -> template(c=$cond.sts1=$s.st) <<if(<c>)\r\n{\r\n <s1>\r\n}>>)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==38) ) {
				int LA1_1 = input.LA(2);
				if ( (synpred1_XtoJava()) ) {
					alt1=1;
				}
				else if ( (true) ) {
					alt1=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:24:14: ^( 'if' cond s= stat e= stat )
					{
					match(input,38,FOLLOW_38_in_condstat80); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_cond_in_condstat82);
					cond1=cond();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_stat_in_condstat87);
					s=stat();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_stat_in_condstat91);
					e=stat();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 24:42: -> template(c=$cond.stso=$s.stsz=$e.st) <<if(<c>)\r\n{\r\n <so>\r\n}else\r\n{\r\n <sz>\r\n}>>
					  {
					  	retval.st = new StringTemplate(templateLib, "if(<c>)\r\n{\r\n  <so>\r\n}else\r\n{\r\n  <sz>\r\n}",new STAttrMap().put("c", (cond1!=null?((StringTemplate)cond1.getTemplate()):null)).put("so", (s!=null?((StringTemplate)s.getTemplate()):null)).put("sz", (e!=null?((StringTemplate)e.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:32:3: ^( 'if' cond s= stat )
					{
					match(input,38,FOLLOW_38_in_condstat119); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_cond_in_condstat121);
					cond2=cond();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_stat_in_condstat126);
					s=stat();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 32:24: -> template(c=$cond.sts1=$s.st) <<if(<c>)\r\n{\r\n <s1>\r\n}>>
					  {
					  	retval.st = new StringTemplate(templateLib, "if(<c>)\r\n{\r\n  <s1>\r\n}",new STAttrMap().put("c", (cond2!=null?((StringTemplate)cond2.getTemplate()):null)).put("s1", (s!=null?((StringTemplate)s.getTemplate()):null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condstat"


	public static class assignstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:39:1: assignstat : ^(op= ':=' ID expr ) -> template(id=$ID.texte=$expr.st) \"<id>=<e>\";
	public final XtoJava.assignstat_return assignstat() throws RecognitionException {
		XtoJava.assignstat_return retval = new XtoJava.assignstat_return();
		retval.start = input.LT(1);

		XTree op=null;
		XTree ID3=null;
		TreeRuleReturnScope expr4 =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:39:11: ( ^(op= ':=' ID expr ) -> template(id=$ID.texte=$expr.st) \"<id>=<e>\")
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:39:14: ^(op= ':=' ID expr )
			{
			op=(XTree)match(input,28,FOLLOW_28_in_assignstat156); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			ID3=(XTree)match(input,ID,FOLLOW_ID_in_assignstat158); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_assignstat161);
			expr4=expr();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 39:34: -> template(id=$ID.texte=$expr.st) \"<id>=<e>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<id>=<e>",new STAttrMap().put("id", (ID3!=null?ID3.getText():null)).put("e", (expr4!=null?((StringTemplate)expr4.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignstat"


	public static class whilestat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whilestat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:41:1: whilestat : ^( 'while' cond stat ) -> template(c=$cond.sts=$stat.st) <<while(<c>)\r\n{\r\n <s>\r\n}>>;
	public final XtoJava.whilestat_return whilestat() throws RecognitionException {
		XtoJava.whilestat_return retval = new XtoJava.whilestat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope cond5 =null;
		TreeRuleReturnScope stat6 =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:41:10: ( ^( 'while' cond stat ) -> template(c=$cond.sts=$stat.st) <<while(<c>)\r\n{\r\n <s>\r\n}>>)
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:41:12: ^( 'while' cond stat )
			{
			match(input,45,FOLLOW_45_in_whilestat186); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_cond_in_whilestat188);
			cond5=cond();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_whilestat190);
			stat6=stat();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 41:33: -> template(c=$cond.sts=$stat.st) <<while(<c>)\r\n{\r\n <s>\r\n}>>
			  {
			  	retval.st = new StringTemplate(templateLib, "while(<c>)\r\n{\r\n  <s>\r\n}",new STAttrMap().put("c", (cond5!=null?((StringTemplate)cond5.getTemplate()):null)).put("s", (stat6!=null?((StringTemplate)stat6.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:47:1: forstat : ^( 'for' a= assignstat cond c= assignstat stat ) -> template(a=$a.stb=$cond.stc=$c.std=$stat.st) <<for(<a>;<b>;<c>)\r\n{\r\n <d>\r\n}>>;
	public final XtoJava.forstat_return forstat() throws RecognitionException {
		XtoJava.forstat_return retval = new XtoJava.forstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope cond7 =null;
		TreeRuleReturnScope stat8 =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:47:8: ( ^( 'for' a= assignstat cond c= assignstat stat ) -> template(a=$a.stb=$cond.stc=$c.std=$stat.st) <<for(<a>;<b>;<c>)\r\n{\r\n <d>\r\n}>>)
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:47:12: ^( 'for' a= assignstat cond c= assignstat stat )
			{
			match(input,37,FOLLOW_37_in_forstat218); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_assignstat_in_forstat222);
			a=assignstat();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_cond_in_forstat224);
			cond7=cond();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_assignstat_in_forstat228);
			c=assignstat();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_stat_in_forstat230);
			stat8=stat();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 47:57: -> template(a=$a.stb=$cond.stc=$c.std=$stat.st) <<for(<a>;<b>;<c>)\r\n{\r\n <d>\r\n}>>
			  {
			  	retval.st = new StringTemplate(templateLib, "for(<a>;<b>;<c>)\r\n{\r\n  <d>\r\n}",new STAttrMap().put("a", (a!=null?((StringTemplate)a.getTemplate()):null)).put("b", (cond7!=null?((StringTemplate)cond7.getTemplate()):null)).put("c", (c!=null?((StringTemplate)c.getTemplate()):null)).put("d", (stat8!=null?((StringTemplate)stat8.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:1: stat : (st= assignstat -> template(s=$st.st) \"<s>;\"| (st= condstat |st= whilestat |st= forstat |st= statlist ) -> template(s=$st.st) \"<s>\");
	public final XtoJava.stat_return stat() throws RecognitionException {
		XtoJava.stat_return retval = new XtoJava.stat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope st =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:5: (st= assignstat -> template(s=$st.st) \"<s>;\"| (st= condstat |st= whilestat |st= forstat |st= statlist ) -> template(s=$st.st) \"<s>\")
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==28) ) {
				alt3=1;
			}
			else if ( (LA3_0==STATLIST||(LA3_0 >= 37 && LA3_0 <= 38)||LA3_0==45) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:15: st= assignstat
					{
					pushFollow(FOLLOW_assignstat_in_stat276);
					st=assignstat();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 54:29: -> template(s=$st.st) \"<s>;\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<s>;",new STAttrMap().put("s", (st!=null?((StringTemplate)st.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:63: (st= condstat |st= whilestat |st= forstat |st= statlist )
					{
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:63: (st= condstat |st= whilestat |st= forstat |st= statlist )
					int alt2=4;
					switch ( input.LA(1) ) {
					case 38:
						{
						alt2=1;
						}
						break;
					case 45:
						{
						alt2=2;
						}
						break;
					case 37:
						{
						alt2=3;
						}
						break;
					case STATLIST:
						{
						alt2=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:64: st= condstat
							{
							pushFollow(FOLLOW_condstat_in_stat295);
							st=condstat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:78: st= whilestat
							{
							pushFollow(FOLLOW_whilestat_in_stat301);
							st=whilestat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 3 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:93: st= forstat
							{
							pushFollow(FOLLOW_forstat_in_stat307);
							st=forstat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 4 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:54:106: st= statlist
							{
							pushFollow(FOLLOW_statlist_in_stat313);
							st=statlist();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 54:119: -> template(s=$st.st) \"<s>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<s>",new STAttrMap().put("s", (st!=null?((StringTemplate)st.getTemplate()):null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class statlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statlist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:56:1: statlist : ^( STATLIST (s+= stat )* ) -> template(list=$s) \"<list; separator=\"\\n\">\";
	public final XtoJava.statlist_return statlist() throws RecognitionException {
		XtoJava.statlist_return retval = new XtoJava.statlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:56:9: ( ^( STATLIST (s+= stat )* ) -> template(list=$s) \"<list; separator=\"\\n\">\")
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:56:18: ^( STATLIST (s+= stat )* )
			{
			match(input,STATLIST,FOLLOW_STATLIST_in_statlist341); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:56:29: (s+= stat )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==STATLIST||LA4_0==28||(LA4_0 >= 37 && LA4_0 <= 38)||LA4_0==45) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:56:30: s+= stat
						{
						pushFollow(FOLLOW_stat_in_statlist346);
						s=stat();
						state._fsp--;
						if (state.failed) return retval;
						if (list_s==null) list_s=new ArrayList<Object>();
						list_s.add(s.getTemplate());
						}
						break;

					default :
						break loop4;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 56:41: -> template(list=$s) \"<list; separator=\"\\n\">\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<list; separator=\"\\n\">",new STAttrMap().put("list", list_s));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statlist"


	public static class decl_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decl"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:60:1: decl : ( ^( DECL ID 'int' (r= 'read' )? (p= 'print' )? ) -> template(i=$ID.textre=$r.textpr=$p.text) \"int <i> = <re>;\"| ^( DECL ID 'float' (r= 'read' )? (p= 'print' )? ) -> template(i=$ID.textre=$r.textpr=$p.text) \"double <i> = <re>;\"| ^( DECL ID 'string' (r= 'read' )? (p= 'print' )? ) -> template(i=$ID.textre=$r.textpr=$p.text) \"String <i> = \"\";\");
	public final XtoJava.decl_return decl() throws RecognitionException {
		XtoJava.decl_return retval = new XtoJava.decl_return();
		retval.start = input.LT(1);

		XTree r=null;
		XTree p=null;
		XTree ID9=null;
		XTree ID10=null;
		XTree ID11=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:60:5: ( ^( DECL ID 'int' (r= 'read' )? (p= 'print' )? ) -> template(i=$ID.textre=$r.textpr=$p.text) \"int <i> = <re>;\"| ^( DECL ID 'float' (r= 'read' )? (p= 'print' )? ) -> template(i=$ID.textre=$r.textpr=$p.text) \"double <i> = <re>;\"| ^( DECL ID 'string' (r= 'read' )? (p= 'print' )? ) -> template(i=$ID.textre=$r.textpr=$p.text) \"String <i> = \"\";\")
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DECL) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==DOWN) ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2==ID) ) {
						switch ( input.LA(4) ) {
						case 39:
							{
							alt11=1;
							}
							break;
						case 36:
							{
							alt11=2;
							}
							break;
						case 43:
							{
							alt11=3;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:61:3: ^( DECL ID 'int' (r= 'read' )? (p= 'print' )? )
					{
					match(input,DECL,FOLLOW_DECL_in_decl394); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID9=(XTree)match(input,ID,FOLLOW_ID_in_decl396); if (state.failed) return retval;
					match(input,39,FOLLOW_39_in_decl398); if (state.failed) return retval;
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:61:20: (r= 'read' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==42) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:61:20: r= 'read'
							{
							r=(XTree)match(input,42,FOLLOW_42_in_decl402); if (state.failed) return retval;
							}
							break;

					}

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:61:30: (p= 'print' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==40) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:61:30: p= 'print'
							{
							p=(XTree)match(input,40,FOLLOW_40_in_decl407); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 61:41: -> template(i=$ID.textre=$r.textpr=$p.text) \"int <i> = <re>;\"
					  {
					  	retval.st = new StringTemplate(templateLib, "int <i> = <re>;",new STAttrMap().put("i", (ID9!=null?ID9.getText():null)).put("re", (r!=null?r.getText():null)).put("pr", (p!=null?p.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:62:3: ^( DECL ID 'float' (r= 'read' )? (p= 'print' )? )
					{
					match(input,DECL,FOLLOW_DECL_in_decl438); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID10=(XTree)match(input,ID,FOLLOW_ID_in_decl440); if (state.failed) return retval;
					match(input,36,FOLLOW_36_in_decl442); if (state.failed) return retval;
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:62:22: (r= 'read' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==42) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:62:22: r= 'read'
							{
							r=(XTree)match(input,42,FOLLOW_42_in_decl446); if (state.failed) return retval;
							}
							break;

					}

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:62:32: (p= 'print' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==40) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:62:32: p= 'print'
							{
							p=(XTree)match(input,40,FOLLOW_40_in_decl451); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 62:43: -> template(i=$ID.textre=$r.textpr=$p.text) \"double <i> = <re>;\"
					  {
					  	retval.st = new StringTemplate(templateLib, "double <i> = <re>;",new STAttrMap().put("i", (ID10!=null?ID10.getText():null)).put("re", (r!=null?r.getText():null)).put("pr", (p!=null?p.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:63:3: ^( DECL ID 'string' (r= 'read' )? (p= 'print' )? )
					{
					match(input,DECL,FOLLOW_DECL_in_decl484); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID11=(XTree)match(input,ID,FOLLOW_ID_in_decl486); if (state.failed) return retval;
					match(input,43,FOLLOW_43_in_decl488); if (state.failed) return retval;
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:63:23: (r= 'read' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==42) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:63:23: r= 'read'
							{
							r=(XTree)match(input,42,FOLLOW_42_in_decl492); if (state.failed) return retval;
							}
							break;

					}

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:63:33: (p= 'print' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==40) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:63:33: p= 'print'
							{
							p=(XTree)match(input,40,FOLLOW_40_in_decl497); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 63:44: -> template(i=$ID.textre=$r.textpr=$p.text) \"String <i> = \"\";\"
					  {
					  	retval.st = new StringTemplate(templateLib, "String <i> = \"\";",new STAttrMap().put("i", (ID11!=null?ID11.getText():null)).put("re", (r!=null?r.getText():null)).put("pr", (p!=null?p.getText():null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class decllist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decllist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:65:1: decllist : ^( DECLLIST (d+= decl )* ) -> template(dd=$d) \"<dd; separator=\"\\n\">\";
	public final XtoJava.decllist_return decllist() throws RecognitionException {
		XtoJava.decllist_return retval = new XtoJava.decllist_return();
		retval.start = input.LT(1);

		List<Object> list_d=null;
		RuleReturnScope d = null;
		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:65:9: ( ^( DECLLIST (d+= decl )* ) -> template(dd=$d) \"<dd; separator=\"\\n\">\")
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:65:14: ^( DECLLIST (d+= decl )* )
			{
			match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist534); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:65:25: (d+= decl )*
				loop12:
				while (true) {
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==DECL) ) {
						alt12=1;
					}

					switch (alt12) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:65:26: d+= decl
						{
						pushFollow(FOLLOW_decl_in_decllist539);
						d=decl();
						state._fsp--;
						if (state.failed) return retval;
						if (list_d==null) list_d=new ArrayList<Object>();
						list_d.add(d.getTemplate());
						}
						break;

					default :
						break loop12;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 65:37: -> template(dd=$d) \"<dd; separator=\"\\n\">\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<dd; separator=\"\\n\">",new STAttrMap().put("dd", list_d));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decllist"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:68:1: expr : ( ^(op= ( '+' | '-' | '/' | '*' ) l= expr r= expr ) -> template(o=$op.textel=$l.ster=$r.st) \"<el><o><er>\"| ^(op= UMINUS e= expr ) -> template(o=$op.textex=$e.st) \"<o><ex>\"| INTCONST -> template(i=$INTCONST.text) \"<i>\"| FLOATCONST -> template(f=$FLOATCONST.text) \"<f>\"| STRINGCONST -> template(s=$STRINGCONST.text) \"<s>\"| ID -> template(i=$ID.text) \"<i>\");
	public final XtoJava.expr_return expr() throws RecognitionException {
		XtoJava.expr_return retval = new XtoJava.expr_return();
		retval.start = input.LT(1);

		XTree op=null;
		XTree INTCONST12=null;
		XTree FLOATCONST13=null;
		XTree STRINGCONST14=null;
		XTree ID15=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:68:5: ( ^(op= ( '+' | '-' | '/' | '*' ) l= expr r= expr ) -> template(o=$op.textel=$l.ster=$r.st) \"<el><o><er>\"| ^(op= UMINUS e= expr ) -> template(o=$op.textex=$e.st) \"<o><ex>\"| INTCONST -> template(i=$INTCONST.text) \"<i>\"| FLOATCONST -> template(f=$FLOATCONST.text) \"<f>\"| STRINGCONST -> template(s=$STRINGCONST.text) \"<s>\"| ID -> template(i=$ID.text) \"<i>\")
			int alt14=6;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt14=1;
				}
				break;
			case UMINUS:
				{
				alt14=2;
				}
				break;
			case INTCONST:
				{
				alt14=3;
				}
				break;
			case FLOATCONST:
				{
				alt14=4;
				}
				break;
			case STRINGCONST:
				{
				alt14=5;
				}
				break;
			case ID:
				{
				alt14=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:70:3: ^(op= ( '+' | '-' | '/' | '*' ) l= expr r= expr )
					{
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:70:8: ( '+' | '-' | '/' | '*' )
					int alt13=4;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt13=1;
						}
						break;
					case 24:
						{
						alt13=2;
						}
						break;
					case 26:
						{
						alt13=3;
						}
						break;
					case 22:
						{
						alt13=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:70:9: '+'
							{
							op=(XTree)match(input,23,FOLLOW_23_in_expr575); if (state.failed) return retval;
							}
							break;
						case 2 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:70:15: '-'
							{
							op=(XTree)match(input,24,FOLLOW_24_in_expr579); if (state.failed) return retval;
							}
							break;
						case 3 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:70:21: '/'
							{
							op=(XTree)match(input,26,FOLLOW_26_in_expr583); if (state.failed) return retval;
							}
							break;
						case 4 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:70:27: '*'
							{
							op=(XTree)match(input,22,FOLLOW_22_in_expr587); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr592);
					l=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr596);
					r=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 70:47: -> template(o=$op.textel=$l.ster=$r.st) \"<el><o><er>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<el><o><er>",new STAttrMap().put("o", (op!=null?op.getText():null)).put("el", (l!=null?((StringTemplate)l.getTemplate()):null)).put("er", (r!=null?((StringTemplate)r.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:71:3: ^(op= UMINUS e= expr )
					{
					op=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr625); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr629);
					e=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 71:24: -> template(o=$op.textex=$e.st) \"<o><ex>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<o><ex>",new STAttrMap().put("o", (op!=null?op.getText():null)).put("ex", (e!=null?((StringTemplate)e.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:73:3: INTCONST
					{
					INTCONST12=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr661); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 73:16: -> template(i=$INTCONST.text) \"<i>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<i>",new STAttrMap().put("i", (INTCONST12!=null?INTCONST12.getText():null)));
					  }


					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:74:3: FLOATCONST
					{
					FLOATCONST13=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr680); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 74:14: -> template(f=$FLOATCONST.text) \"<f>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<f>",new STAttrMap().put("f", (FLOATCONST13!=null?FLOATCONST13.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:75:3: STRINGCONST
					{
					STRINGCONST14=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr695); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 75:15: -> template(s=$STRINGCONST.text) \"<s>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<s>",new STAttrMap().put("s", (STRINGCONST14!=null?STRINGCONST14.getText():null)));
					  }


					}

					}
					break;
				case 6 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:76:3: ID
					{
					ID15=(XTree)match(input,ID,FOLLOW_ID_in_expr710); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 76:6: -> template(i=$ID.text) \"<i>\"
					  {
					  	retval.st = new StringTemplate(templateLib, "<i>",new STAttrMap().put("i", (ID15!=null?ID15.getText():null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class cond_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "cond"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:1: cond : ^(op= ( '<' | '>' | '=' ) el= expr er= expr ) -> template(o=$op.textll=$el.strr=$er.st) \"<ll> <o>= <rr>\";
	public final XtoJava.cond_return cond() throws RecognitionException {
		XtoJava.cond_return retval = new XtoJava.cond_return();
		retval.start = input.LT(1);

		XTree op=null;
		TreeRuleReturnScope el =null;
		TreeRuleReturnScope er =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:5: ( ^(op= ( '<' | '>' | '=' ) el= expr er= expr ) -> template(o=$op.textll=$el.strr=$er.st) \"<ll> <o>= <rr>\")
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:9: ^(op= ( '<' | '>' | '=' ) el= expr er= expr )
			{
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:14: ( '<' | '>' | '=' )
			int alt15=3;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt15=1;
				}
				break;
			case 32:
				{
				alt15=2;
				}
				break;
			case 31:
				{
				alt15=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:15: '<'
					{
					op=(XTree)match(input,30,FOLLOW_30_in_cond746); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:20: '>'
					{
					op=(XTree)match(input,32,FOLLOW_32_in_cond749); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:80:25: '='
					{
					op=(XTree)match(input,31,FOLLOW_31_in_cond752); if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_cond757);
			el=expr();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_cond761);
			er=expr();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 80:47: -> template(o=$op.textll=$el.strr=$er.st) \"<ll> <o>= <rr>\"
			  {
			  	retval.st = new StringTemplate(templateLib, "<ll> <o>= <rr>",new STAttrMap().put("o", (op!=null?op.getText():null)).put("ll", (el!=null?((StringTemplate)el.getTemplate()):null)).put("rr", (er!=null?((StringTemplate)er.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:83:1: program : ^( 'program' ID dd= decllist ss= statlist ) -> template(id=$ID.textd=$dd.sts=$ss.st) <<public class <id>\r\n {\r\n public static void main(String args[])\r\n {\r\n <d>\r\n \r\n <s>\r\n }\r\n }>>;
	public final XtoJava.program_return program() throws RecognitionException {
		XtoJava.program_return retval = new XtoJava.program_return();
		retval.start = input.LT(1);

		XTree ID16=null;
		TreeRuleReturnScope dd =null;
		TreeRuleReturnScope ss =null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:83:8: ( ^( 'program' ID dd= decllist ss= statlist ) -> template(id=$ID.textd=$dd.sts=$ss.st) <<public class <id>\r\n {\r\n public static void main(String args[])\r\n {\r\n <d>\r\n \r\n <s>\r\n }\r\n }>>)
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:83:15: ^( 'program' ID dd= decllist ss= statlist )
			{
			if ( state.backtracking==0 ) { symbols.clear(); }
			match(input,41,FOLLOW_41_in_program799); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			ID16=(XTree)match(input,ID,FOLLOW_ID_in_program801); if (state.failed) return retval;
			pushFollow(FOLLOW_decllist_in_program805);
			dd=decllist();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_statlist_in_program809);
			ss=statlist();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 83:76: -> template(id=$ID.textd=$dd.sts=$ss.st) <<public class <id>\r\n {\r\n public static void main(String args[])\r\n {\r\n <d>\r\n \r\n <s>\r\n }\r\n }>>
			  {
			  	retval.st = new StringTemplate(templateLib, "public class <id>\r\n  {\r\n    public static void main(String args[])\r\n    {\r\n      <d>\r\n      \r\n      <s>\r\n    }\r\n   }",new STAttrMap().put("id", (ID16!=null?ID16.getText():null)).put("d", (dd!=null?((StringTemplate)dd.getTemplate()):null)).put("s", (ss!=null?((StringTemplate)ss.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"

	// $ANTLR start synpred1_XtoJava
	public final void synpred1_XtoJava_fragment() throws RecognitionException {
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope e =null;

		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:24:14: ( ^( 'if' cond s= stat e= stat ) )
		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XtoJava.g:24:14: ^( 'if' cond s= stat e= stat )
		{
		match(input,38,FOLLOW_38_in_synpred1_XtoJava80); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		pushFollow(FOLLOW_cond_in_synpred1_XtoJava82);
		cond();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_stat_in_synpred1_XtoJava87);
		s=stat();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_stat_in_synpred1_XtoJava91);
		e=stat();
		state._fsp--;
		if (state.failed) return;
		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_XtoJava

	// Delegated rules

	public final boolean synpred1_XtoJava() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_XtoJava_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_38_in_condstat80 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat82 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat87 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat91 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat121 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_assignstat156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat158 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat161 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat188 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat222 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat224 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat228 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist346 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_DECL_in_decl394 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl396 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_decl398 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl402 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl407 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl440 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_decl442 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl446 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl486 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_decl488 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl492 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist539 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_23_in_expr575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_expr579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_expr583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_expr587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr592 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr596 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_expr625 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_cond746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_32_in_cond749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_31_in_cond752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond757 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_41_in_program799 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program801 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program805 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_synpred1_XtoJava80 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_synpred1_XtoJava82 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_synpred1_XtoJava87 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_synpred1_XtoJava91 = new BitSet(new long[]{0x0000000000000008L});
}

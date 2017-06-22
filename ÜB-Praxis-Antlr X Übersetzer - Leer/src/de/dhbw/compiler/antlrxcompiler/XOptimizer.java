// $ANTLR 3.5.2 /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g 2017-06-22 14:04:22

    package de.dhbw.compiler.antlrxcompiler;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class XOptimizer extends TreeRewriter {
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
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public XOptimizer(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XOptimizer(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XOptimizer.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g"; }


	    private String addString(String first, String last) {
	      return first.substring(0, first.length()-1)+last.substring(1);
	    }
	    
	    private String opInt(String first, String last, char op) {
	      int firstValue = 0;
	      int lastValue = 0;
	      try {
	        firstValue = Integer.parseInt(first);
	        lastValue = Integer.parseInt(last);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      switch (op) {
	        case '+': return Integer.toString(firstValue+lastValue);
	        case '-': return Integer.toString(firstValue-lastValue);
	        case '*': return Integer.toString(firstValue*lastValue);
	        case '/': return Integer.toString(firstValue/lastValue);
	        default: return "";
	      }
	     }
	      
	    private String opFloat(String first, String last, char op) {
	      double firstValue = 0.0;
	      double lastValue = 0.0;
	      try {
		      firstValue = Double.parseDouble(first);
		      lastValue = Double.parseDouble(last);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      switch (op) {
	        case '+': return Double.toString(firstValue+lastValue);
	        case '-': return Double.toString(firstValue-lastValue);
	        case '*': return Double.toString(firstValue*lastValue);
	        case '/': return Double.toString(firstValue/lastValue);
	        default: return "";
	      }
	     }
	      
	 

	public static class bottomup_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:1: bottomup : ( uminus | add_const | sub_const | mult_const | div_const | mult_zero_one );
	@Override
	public final XOptimizer.bottomup_return bottomup() throws RecognitionException {
		XOptimizer.bottomup_return retval = new XOptimizer.bottomup_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope uminus1 =null;
		TreeRuleReturnScope add_const2 =null;
		TreeRuleReturnScope sub_const3 =null;
		TreeRuleReturnScope mult_const4 =null;
		TreeRuleReturnScope div_const5 =null;
		TreeRuleReturnScope mult_zero_one6 =null;


		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:9: ( uminus | add_const | sub_const | mult_const | div_const | mult_zero_one )
			int alt1=6;
			switch ( input.LA(1) ) {
			case UMINUS:
				{
				alt1=1;
				}
				break;
			case 23:
				{
				alt1=2;
				}
				break;
			case 24:
				{
				alt1=3;
				}
				break;
			case 22:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==DOWN) ) {
					switch ( input.LA(3) ) {
					case INTCONST:
						{
						switch ( input.LA(4) ) {
						case INTCONST:
							{
							int LA1_10 = input.LA(5);
							if ( (LA1_10==UP) ) {
								alt1=4;
							}
							else if ( (LA1_10==DOWN) ) {
								alt1=6;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case FLOATCONST:
							{
							int LA1_11 = input.LA(5);
							if ( (LA1_11==UP) ) {
								alt1=4;
							}
							else if ( (LA1_11==DOWN) ) {
								alt1=6;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case DOWN:
						case COMMENT:
						case DECL:
						case DECLLIST:
						case DIGIT:
						case ID:
						case INVALID:
						case LETTER:
						case OTHER:
						case POSDIGIT:
						case STATLIST:
						case STRINGCONST:
						case UMINUS:
						case WS:
						case ZERO:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 26:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
							{
							alt1=6;
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
									new NoViableAltException("", 1, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case FLOATCONST:
						{
						switch ( input.LA(4) ) {
						case FLOATCONST:
							{
							alt1=4;
							}
							break;
						case INTCONST:
							{
							int LA1_13 = input.LA(5);
							if ( (LA1_13==UP) ) {
								alt1=4;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case DOWN:
							{
							alt1=6;
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
									new NoViableAltException("", 1, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case COMMENT:
					case DECL:
					case DECLLIST:
					case DIGIT:
					case ID:
					case INVALID:
					case LETTER:
					case OTHER:
					case POSDIGIT:
					case STATLIST:
					case STRINGCONST:
					case UMINUS:
					case WS:
					case ZERO:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 26:
					case 27:
					case 28:
					case 29:
					case 30:
					case 31:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 39:
					case 40:
					case 41:
					case 42:
					case 43:
					case 44:
					case 45:
						{
						alt1=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 6, input);
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
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 26:
				{
				alt1=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:11: uminus
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_uminus_in_bottomup74);
					uminus1=uminus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)uminus1.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:18: add_const
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_add_const_in_bottomup76);
					add_const2=add_const();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)add_const2.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:28: sub_const
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_sub_const_in_bottomup78);
					sub_const3=sub_const();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)sub_const3.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:38: mult_const
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_mult_const_in_bottomup80);
					mult_const4=mult_const();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)mult_const4.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 5 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:49: div_const
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_div_const_in_bottomup82);
					div_const5=div_const();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)div_const5.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 6 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:61:59: mult_zero_one
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_mult_zero_one_in_bottomup84);
					mult_zero_one6=mult_zero_one();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)mult_zero_one6.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
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
	// $ANTLR end "bottomup"


	public static class uminus_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "uminus"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:64:1: uminus : ( ^( UMINUS x= INTCONST ) -> INTCONST[ \"-\"+$x.text ] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text ] );
	public final XOptimizer.uminus_return uminus() throws RecognitionException {
		XOptimizer.uminus_return retval = new XOptimizer.uminus_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree UMINUS7=null;
		XTree UMINUS8=null;

		XTree x_tree=null;
		XTree UMINUS7_tree=null;
		XTree UMINUS8_tree=null;
		RewriteRuleNodeStream stream_UMINUS=new RewriteRuleNodeStream(adaptor,"token UMINUS");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:64:7: ( ^( UMINUS x= INTCONST ) -> INTCONST[ \"-\"+$x.text ] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text ] )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==UMINUS) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2==INTCONST) ) {
						alt2=1;
					}
					else if ( (LA2_2==FLOATCONST) ) {
						alt2=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
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
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:65:2: ^( UMINUS x= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS7=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_uminus94); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS7);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS7;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_uminus98); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 65:23: -> INTCONST[ \"-\"+$x.text ]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, "-"+(x!=null?x.getText():null)));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:66:3: ^( UMINUS x= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS8=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_uminus109); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS8);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS8;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_uminus113); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 66:26: -> FLOATCONST[\"-\"+$x.text ]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, "-"+(x!=null?x.getText():null)));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "uminus"


	public static class mult_zero_one_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "mult_zero_one"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:69:1: mult_zero_one : ( ^( '*' x= INTCONST y= . ) {...}? -> {$x.text.equals(\"0\") }? INTCONST[\"0\"] -> $y| ^( '*' a= . b= INTCONST ) {...}? -> { $b.text.equals(\"0\") }? INTCONST[\"0\"] -> $a);
	public final XOptimizer.mult_zero_one_return mult_zero_one() throws RecognitionException {
		XOptimizer.mult_zero_one_return retval = new XOptimizer.mult_zero_one_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree b=null;
		XTree char_literal9=null;
		XTree char_literal10=null;
		XTree y=null;
		XTree a=null;

		XTree x_tree=null;
		XTree b_tree=null;
		XTree char_literal9_tree=null;
		XTree char_literal10_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:69:14: ( ^( '*' x= INTCONST y= . ) {...}? -> {$x.text.equals(\"0\") }? INTCONST[\"0\"] -> $y| ^( '*' a= . b= INTCONST ) {...}? -> { $b.text.equals(\"0\") }? INTCONST[\"0\"] -> $a)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==22) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOWN) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==INTCONST) ) {
						switch ( input.LA(4) ) {
						case INTCONST:
							{
							int LA3_5 = input.LA(5);
							if ( ((LA3_5 >= DOWN && LA3_5 <= UP)) ) {
								alt3=1;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case DOWN:
							{
							alt3=2;
							}
							break;
						case COMMENT:
						case DECL:
						case DECLLIST:
						case DIGIT:
						case FLOATCONST:
						case ID:
						case INVALID:
						case LETTER:
						case OTHER:
						case POSDIGIT:
						case STATLIST:
						case STRINGCONST:
						case UMINUS:
						case WS:
						case ZERO:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 26:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 42:
						case 43:
						case 44:
						case 45:
							{
							alt3=1;
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
									new NoViableAltException("", 3, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( ((LA3_2 >= COMMENT && LA3_2 <= ID)||(LA3_2 >= INVALID && LA3_2 <= 45)) ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
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
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:70:2: ^( '*' x= INTCONST y= . ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal9=(XTree)match(input,22,FOLLOW_22_in_mult_zero_one129); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal9);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal9;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_mult_zero_one133); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = y;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(( (x!=null?x.getText():null).equals("0") || (x!=null?x.getText():null).equals("1") )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "mult_zero_one", " $x.text.equals(\"0\") || $x.text.equals(\"1\") ");
					}
					// AST REWRITE
					// elements: y, INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 71:4: -> {$x.text.equals(\"0\") }? INTCONST[\"0\"]
					if ((x!=null?x.getText():null).equals("0") ) {
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, "0"));
					}

					else // 72:5: -> $y
					{
						adaptor.addChild(root_0, stream_y.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:73:3: ^( '*' a= . b= INTCONST ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal10=(XTree)match(input,22,FOLLOW_22_in_mult_zero_one157); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal10);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal10;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = a;

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_mult_zero_one165); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(( (b!=null?b.getText():null).equals("0") || (b!=null?b.getText():null).equals("1") )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "mult_zero_one", " $b.text.equals(\"0\") || $b.text.equals(\"1\") ");
					}
					// AST REWRITE
					// elements: a, INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: a
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"wildcard a",a);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 74:4: -> { $b.text.equals(\"0\") }? INTCONST[\"0\"]
					if ( (b!=null?b.getText():null).equals("0") ) {
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, "0"));
					}

					else // 75:6: -> $a
					{
						adaptor.addChild(root_0, stream_a.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "mult_zero_one"


	public static class add_zero_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "add_zero"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:77:1: add_zero : ( ^( '+' x= INTCONST y= . ) {...}? -> $y| ^( '+' a= . b= INTCONST ) {...}? -> $a| ^( '+' x= FLOATCONST y= . ) {...}? -> $y| ^( '+' a= . b= FLOATCONST ) {...}? -> $x);
	public final XOptimizer.add_zero_return add_zero() throws RecognitionException {
		XOptimizer.add_zero_return retval = new XOptimizer.add_zero_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree b=null;
		XTree char_literal11=null;
		XTree char_literal12=null;
		XTree char_literal13=null;
		XTree char_literal14=null;
		XTree y=null;
		XTree a=null;

		XTree x_tree=null;
		XTree b_tree=null;
		XTree char_literal11_tree=null;
		XTree char_literal12_tree=null;
		XTree char_literal13_tree=null;
		XTree char_literal14_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:77:9: ( ^( '+' x= INTCONST y= . ) {...}? -> $y| ^( '+' a= . b= INTCONST ) {...}? -> $a| ^( '+' x= FLOATCONST y= . ) {...}? -> $y| ^( '+' a= . b= FLOATCONST ) {...}? -> $x)
			int alt4=4;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:78:3: ^( '+' x= INTCONST y= . ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal11=(XTree)match(input,23,FOLLOW_23_in_add_zero188); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal11);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal11;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_add_zero192); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = y;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "add_zero", "$x.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: y
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 79:5: -> $y
					{
						adaptor.addChild(root_0, stream_y.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:80:3: ^( '+' a= . b= INTCONST ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal12=(XTree)match(input,23,FOLLOW_23_in_add_zero210); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal12);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal12;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = a;

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_add_zero218); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((b!=null?b.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "add_zero", "$b.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: a
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: a
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"wildcard a",a);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 81:5: -> $a
					{
						adaptor.addChild(root_0, stream_a.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:82:3: ^( '+' x= FLOATCONST y= . ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal13=(XTree)match(input,23,FOLLOW_23_in_add_zero231); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal13);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal13;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_add_zero235); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = y;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "add_zero", "$x.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: y
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 83:5: -> $y
					{
						adaptor.addChild(root_0, stream_y.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:84:3: ^( '+' a= . b= FLOATCONST ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal14=(XTree)match(input,23,FOLLOW_23_in_add_zero253); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal14);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal14;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = a;

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_add_zero261); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((b!=null?b.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "add_zero", "$b.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: x
					// token labels: x
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_x=new RewriteRuleNodeStream(adaptor,"token x",x);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 85:6: -> $x
					{
						adaptor.addChild(root_0, stream_x.nextNode());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "add_zero"


	public static class sub_zero_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "sub_zero"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:87:1: sub_zero : ( ^( '-' x= INTCONST y= . ) {...}? -> $y| ^( '-' a= . b= INTCONST ) {...}? -> $a| ^( '-' x= FLOATCONST y= . ) {...}? -> $y| ^( '-' a= . b= FLOATCONST ) {...}? -> $a);
	public final XOptimizer.sub_zero_return sub_zero() throws RecognitionException {
		XOptimizer.sub_zero_return retval = new XOptimizer.sub_zero_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree b=null;
		XTree char_literal15=null;
		XTree char_literal16=null;
		XTree char_literal17=null;
		XTree char_literal18=null;
		XTree y=null;
		XTree a=null;

		XTree x_tree=null;
		XTree b_tree=null;
		XTree char_literal15_tree=null;
		XTree char_literal16_tree=null;
		XTree char_literal17_tree=null;
		XTree char_literal18_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:87:9: ( ^( '-' x= INTCONST y= . ) {...}? -> $y| ^( '-' a= . b= INTCONST ) {...}? -> $a| ^( '-' x= FLOATCONST y= . ) {...}? -> $y| ^( '-' a= . b= FLOATCONST ) {...}? -> $a)
			int alt5=4;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:88:3: ^( '-' x= INTCONST y= . ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal15=(XTree)match(input,24,FOLLOW_24_in_sub_zero277); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal15);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal15;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_sub_zero281); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = y;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "sub_zero", "$x.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: y
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 89:5: -> $y
					{
						adaptor.addChild(root_0, stream_y.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:90:3: ^( '-' a= . b= INTCONST ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal16=(XTree)match(input,24,FOLLOW_24_in_sub_zero299); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal16);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal16;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = a;

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_sub_zero307); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((b!=null?b.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "sub_zero", "$b.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: a
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: a
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"wildcard a",a);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 91:5: -> $a
					{
						adaptor.addChild(root_0, stream_a.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:92:3: ^( '-' x= FLOATCONST y= . ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal17=(XTree)match(input,24,FOLLOW_24_in_sub_zero320); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal17);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal17;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_sub_zero324); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = y;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "sub_zero", "$x.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: y
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 93:5: -> $y
					{
						adaptor.addChild(root_0, stream_y.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:94:3: ^( '-' a= . b= FLOATCONST ) {...}?
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal18=(XTree)match(input,24,FOLLOW_24_in_sub_zero342); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal18);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal18;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = a;

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_sub_zero350); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					if ( !(((b!=null?b.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "sub_zero", "$b.text.equals(\"0\")");
					}
					// AST REWRITE
					// elements: a
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: a
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"wildcard a",a);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 95:6: -> $a
					{
						adaptor.addChild(root_0, stream_a.nextTree());
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "sub_zero"


	public static class add_const_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "add_const"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:97:1: add_const : ( ^( '+' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'+')] | ^( '+' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'+')] | ^( '+' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'+')] | ^( '+' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'+')] );
	public final XOptimizer.add_const_return add_const() throws RecognitionException {
		XOptimizer.add_const_return retval = new XOptimizer.add_const_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree y=null;
		XTree a=null;
		XTree b=null;
		XTree c=null;
		XTree d=null;
		XTree e=null;
		XTree f=null;
		XTree char_literal19=null;
		XTree char_literal20=null;
		XTree char_literal21=null;
		XTree char_literal22=null;

		XTree x_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		XTree b_tree=null;
		XTree c_tree=null;
		XTree d_tree=null;
		XTree e_tree=null;
		XTree f_tree=null;
		XTree char_literal19_tree=null;
		XTree char_literal20_tree=null;
		XTree char_literal21_tree=null;
		XTree char_literal22_tree=null;
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:97:10: ( ^( '+' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'+')] | ^( '+' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'+')] | ^( '+' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'+')] | ^( '+' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'+')] )
			int alt6=4;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==23) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==DOWN) ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2==INTCONST) ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3==INTCONST) ) {
							alt6=1;
						}
						else if ( (LA6_3==FLOATCONST) ) {
							alt6=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA6_2==FLOATCONST) ) {
						int LA6_4 = input.LA(4);
						if ( (LA6_4==FLOATCONST) ) {
							alt6=2;
						}
						else if ( (LA6_4==INTCONST) ) {
							alt6=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 4, input);
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
								new NoViableAltException("", 6, 2, input);
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
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:98:3: ^( '+' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal19=(XTree)match(input,23,FOLLOW_23_in_add_const366); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal19);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal19;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_add_const370); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_add_const374); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 99:4: -> INTCONST[opInt($x.text,$y.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:100:3: ^( '+' a= FLOATCONST b= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal20=(XTree)match(input,23,FOLLOW_23_in_add_const386); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal20);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal20;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_add_const390); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(a);

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_add_const394); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 101:4: -> FLOATCONST[opFloat($a.text,$b.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((a!=null?a.getText():null),(b!=null?b.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:102:3: ^( '+' c= INTCONST d= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal21=(XTree)match(input,23,FOLLOW_23_in_add_const405); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal21);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal21;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					c=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_add_const409); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(c);

					_last = (XTree)input.LT(1);
					d=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_add_const413); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(d);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 103:4: -> FLOATCONST[opFloat($c.text, $d.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((c!=null?c.getText():null), (d!=null?d.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:104:3: ^( '+' e= FLOATCONST f= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal22=(XTree)match(input,23,FOLLOW_23_in_add_const424); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal22);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal22;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					e=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_add_const428); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(e);

					_last = (XTree)input.LT(1);
					f=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_add_const432); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(f);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 105:45: -> FLOATCONST[opFloat($e.text, $f.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((e!=null?e.getText():null), (f!=null?f.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "add_const"


	public static class sub_const_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "sub_const"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:107:1: sub_const : ( ^( '-' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'-')] | ^( '-' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'-')] | ^( '-' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'-')] | ^( '-' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'-')] );
	public final XOptimizer.sub_const_return sub_const() throws RecognitionException {
		XOptimizer.sub_const_return retval = new XOptimizer.sub_const_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree y=null;
		XTree a=null;
		XTree b=null;
		XTree c=null;
		XTree d=null;
		XTree e=null;
		XTree f=null;
		XTree char_literal23=null;
		XTree char_literal24=null;
		XTree char_literal25=null;
		XTree char_literal26=null;

		XTree x_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		XTree b_tree=null;
		XTree c_tree=null;
		XTree d_tree=null;
		XTree e_tree=null;
		XTree f_tree=null;
		XTree char_literal23_tree=null;
		XTree char_literal24_tree=null;
		XTree char_literal25_tree=null;
		XTree char_literal26_tree=null;
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:107:10: ( ^( '-' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'-')] | ^( '-' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'-')] | ^( '-' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'-')] | ^( '-' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'-')] )
			int alt7=4;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==24) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==INTCONST) ) {
						int LA7_3 = input.LA(4);
						if ( (LA7_3==INTCONST) ) {
							alt7=1;
						}
						else if ( (LA7_3==FLOATCONST) ) {
							alt7=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA7_2==FLOATCONST) ) {
						int LA7_4 = input.LA(4);
						if ( (LA7_4==FLOATCONST) ) {
							alt7=2;
						}
						else if ( (LA7_4==INTCONST) ) {
							alt7=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 4, input);
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
								new NoViableAltException("", 7, 2, input);
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
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:108:3: ^( '-' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal23=(XTree)match(input,24,FOLLOW_24_in_sub_const446); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal23);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal23;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_sub_const450); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_sub_const454); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 109:4: -> INTCONST[opInt($x.text,$y.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:110:3: ^( '-' a= FLOATCONST b= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal24=(XTree)match(input,24,FOLLOW_24_in_sub_const466); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal24);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal24;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_sub_const470); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(a);

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_sub_const474); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 111:4: -> FLOATCONST[opFloat($a.text,$b.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((a!=null?a.getText():null),(b!=null?b.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:112:3: ^( '-' c= INTCONST d= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal25=(XTree)match(input,24,FOLLOW_24_in_sub_const485); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal25);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal25;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					c=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_sub_const489); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(c);

					_last = (XTree)input.LT(1);
					d=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_sub_const493); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(d);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 113:4: -> FLOATCONST[opFloat($c.text, $d.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((c!=null?c.getText():null), (d!=null?d.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:114:2: ^( '-' e= FLOATCONST f= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal26=(XTree)match(input,24,FOLLOW_24_in_sub_const503); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal26);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal26;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					e=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_sub_const507); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(e);

					_last = (XTree)input.LT(1);
					f=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_sub_const511); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(f);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 115:45: -> FLOATCONST[opFloat($e.text, $f.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((e!=null?e.getText():null), (f!=null?f.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "sub_const"


	public static class mult_const_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "mult_const"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:117:1: mult_const : ( ^( '*' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'*')] | ^( '*' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'*')] | ^( '*' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'*')] | ^( '*' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'*')] );
	public final XOptimizer.mult_const_return mult_const() throws RecognitionException {
		XOptimizer.mult_const_return retval = new XOptimizer.mult_const_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree y=null;
		XTree a=null;
		XTree b=null;
		XTree c=null;
		XTree d=null;
		XTree e=null;
		XTree f=null;
		XTree char_literal27=null;
		XTree char_literal28=null;
		XTree char_literal29=null;
		XTree char_literal30=null;

		XTree x_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		XTree b_tree=null;
		XTree c_tree=null;
		XTree d_tree=null;
		XTree e_tree=null;
		XTree f_tree=null;
		XTree char_literal27_tree=null;
		XTree char_literal28_tree=null;
		XTree char_literal29_tree=null;
		XTree char_literal30_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:117:11: ( ^( '*' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'*')] | ^( '*' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'*')] | ^( '*' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'*')] | ^( '*' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'*')] )
			int alt8=4;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==22) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==DOWN) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==INTCONST) ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3==INTCONST) ) {
							alt8=1;
						}
						else if ( (LA8_3==FLOATCONST) ) {
							alt8=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA8_2==FLOATCONST) ) {
						int LA8_4 = input.LA(4);
						if ( (LA8_4==FLOATCONST) ) {
							alt8=2;
						}
						else if ( (LA8_4==INTCONST) ) {
							alt8=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 4, input);
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
								new NoViableAltException("", 8, 2, input);
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
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:118:3: ^( '*' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal27=(XTree)match(input,22,FOLLOW_22_in_mult_const525); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal27);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal27;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_mult_const529); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_mult_const533); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 119:4: -> INTCONST[opInt($x.text,$y.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:120:3: ^( '*' a= FLOATCONST b= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal28=(XTree)match(input,22,FOLLOW_22_in_mult_const545); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal28);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal28;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_mult_const549); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(a);

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_mult_const553); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 121:4: -> FLOATCONST[opFloat($a.text,$b.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((a!=null?a.getText():null),(b!=null?b.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:122:3: ^( '*' c= INTCONST d= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal29=(XTree)match(input,22,FOLLOW_22_in_mult_const564); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal29);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal29;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					c=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_mult_const568); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(c);

					_last = (XTree)input.LT(1);
					d=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_mult_const572); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(d);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 123:4: -> FLOATCONST[opFloat($c.text, $d.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((c!=null?c.getText():null), (d!=null?d.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:124:2: ^( '*' e= FLOATCONST f= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal30=(XTree)match(input,22,FOLLOW_22_in_mult_const582); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal30);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal30;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					e=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_mult_const586); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(e);

					_last = (XTree)input.LT(1);
					f=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_mult_const590); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(f);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 125:45: -> FLOATCONST[opFloat($e.text, $f.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((e!=null?e.getText():null), (f!=null?f.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "mult_const"


	public static class div_const_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "div_const"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:127:1: div_const : ( ^( '/' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'/')] | ^( '/' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'/')] | ^( '/' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'/')] | ^( '/' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'/')] );
	public final XOptimizer.div_const_return div_const() throws RecognitionException {
		XOptimizer.div_const_return retval = new XOptimizer.div_const_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree y=null;
		XTree a=null;
		XTree b=null;
		XTree c=null;
		XTree d=null;
		XTree e=null;
		XTree f=null;
		XTree char_literal31=null;
		XTree char_literal32=null;
		XTree char_literal33=null;
		XTree char_literal34=null;

		XTree x_tree=null;
		XTree y_tree=null;
		XTree a_tree=null;
		XTree b_tree=null;
		XTree c_tree=null;
		XTree d_tree=null;
		XTree e_tree=null;
		XTree f_tree=null;
		XTree char_literal31_tree=null;
		XTree char_literal32_tree=null;
		XTree char_literal33_tree=null;
		XTree char_literal34_tree=null;
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:127:10: ( ^( '/' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'/')] | ^( '/' a= FLOATCONST b= FLOATCONST ) -> FLOATCONST[opFloat($a.text,$b.text,'/')] | ^( '/' c= INTCONST d= FLOATCONST ) -> FLOATCONST[opFloat($c.text, $d.text,'/')] | ^( '/' e= FLOATCONST f= INTCONST ) -> FLOATCONST[opFloat($e.text, $f.text,'/')] )
			int alt9=4;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==26) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==INTCONST) ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3==INTCONST) ) {
							alt9=1;
						}
						else if ( (LA9_3==FLOATCONST) ) {
							alt9=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA9_2==FLOATCONST) ) {
						int LA9_4 = input.LA(4);
						if ( (LA9_4==FLOATCONST) ) {
							alt9=2;
						}
						else if ( (LA9_4==INTCONST) ) {
							alt9=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 4, input);
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
								new NoViableAltException("", 9, 2, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:128:3: ^( '/' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal31=(XTree)match(input,26,FOLLOW_26_in_div_const604); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal31);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal31;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_div_const608); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_div_const612); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 129:4: -> INTCONST[opInt($x.text,$y.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:130:3: ^( '/' a= FLOATCONST b= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal32=(XTree)match(input,26,FOLLOW_26_in_div_const624); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal32);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal32;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					a=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_div_const628); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(a);

					_last = (XTree)input.LT(1);
					b=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_div_const632); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(b);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 131:4: -> FLOATCONST[opFloat($a.text,$b.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((a!=null?a.getText():null),(b!=null?b.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:132:3: ^( '/' c= INTCONST d= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal33=(XTree)match(input,26,FOLLOW_26_in_div_const643); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal33);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal33;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					c=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_div_const647); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(c);

					_last = (XTree)input.LT(1);
					d=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_div_const651); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(d);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 133:4: -> FLOATCONST[opFloat($c.text, $d.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((c!=null?c.getText():null), (d!=null?d.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XOptimizer.g:134:2: ^( '/' e= FLOATCONST f= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal34=(XTree)match(input,26,FOLLOW_26_in_div_const661); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal34);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal34;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					e=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_div_const665); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(e);

					_last = (XTree)input.LT(1);
					f=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_div_const669); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(f);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 135:45: -> FLOATCONST[opFloat($e.text, $f.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((e!=null?e.getText():null), (f!=null?f.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "div_const"

	// Delegated rules


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA4_eotS =
		"\25\uffff";
	static final String DFA4_eofS =
		"\25\uffff";
	static final String DFA4_minS =
		"\1\27\1\2\1\4\4\2\1\4\1\2\1\uffff\2\2\4\uffff\1\3\3\uffff\1\10";
	static final String DFA4_maxS =
		"\1\27\1\2\3\55\1\12\1\3\1\55\1\3\1\uffff\2\3\4\uffff\1\55\3\uffff\1\12";
	static final String DFA4_acceptS =
		"\11\uffff\1\1\2\uffff\1\3\1\2\1\4\1\1\1\uffff\1\1\1\2\1\3\1\uffff";
	static final String DFA4_specialS =
		"\25\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\1",
			"\1\2",
			"\4\5\1\4\1\5\1\3\43\5",
			"\1\7\1\uffff\4\11\1\10\1\11\1\6\43\11",
			"\1\7\1\uffff\4\14\1\13\1\14\1\12\43\14",
			"\1\7\5\uffff\1\16\1\uffff\1\15",
			"\2\17",
			"\52\20",
			"\2\21",
			"",
			"\1\14\1\22",
			"\2\23",
			"",
			"",
			"",
			"",
			"\1\24\52\20",
			"",
			"",
			"",
			"\1\16\1\uffff\1\15"
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "77:1: add_zero : ( ^( '+' x= INTCONST y= . ) {...}? -> $y| ^( '+' a= . b= INTCONST ) {...}? -> $a| ^( '+' x= FLOATCONST y= . ) {...}? -> $y| ^( '+' a= . b= FLOATCONST ) {...}? -> $x);";
		}
	}

	static final String DFA5_eotS =
		"\25\uffff";
	static final String DFA5_eofS =
		"\25\uffff";
	static final String DFA5_minS =
		"\1\30\1\2\1\4\4\2\1\4\1\2\1\uffff\2\2\4\uffff\1\3\3\uffff\1\10";
	static final String DFA5_maxS =
		"\1\30\1\2\3\55\1\12\1\3\1\55\1\3\1\uffff\2\3\4\uffff\1\55\3\uffff\1\12";
	static final String DFA5_acceptS =
		"\11\uffff\1\1\2\uffff\1\3\1\2\1\4\1\1\1\uffff\1\1\1\2\1\3\1\uffff";
	static final String DFA5_specialS =
		"\25\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1",
			"\1\2",
			"\4\5\1\4\1\5\1\3\43\5",
			"\1\7\1\uffff\4\11\1\10\1\11\1\6\43\11",
			"\1\7\1\uffff\4\14\1\13\1\14\1\12\43\14",
			"\1\7\5\uffff\1\16\1\uffff\1\15",
			"\2\17",
			"\52\20",
			"\2\21",
			"",
			"\1\14\1\22",
			"\2\23",
			"",
			"",
			"",
			"",
			"\1\24\52\20",
			"",
			"",
			"",
			"\1\16\1\uffff\1\15"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "87:1: sub_zero : ( ^( '-' x= INTCONST y= . ) {...}? -> $y| ^( '-' a= . b= INTCONST ) {...}? -> $a| ^( '-' x= FLOATCONST y= . ) {...}? -> $y| ^( '-' a= . b= FLOATCONST ) {...}? -> $a);";
		}
	}

	public static final BitSet FOLLOW_uminus_in_bottomup74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_const_in_bottomup76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sub_const_in_bottomup78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_const_in_bottomup80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_div_const_in_bottomup82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_zero_one_in_bottomup84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_uminus94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_uminus98 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_uminus109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_uminus113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_mult_zero_one129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_mult_zero_one133 = new BitSet(new long[]{0x00003FFFFFFFFFF0L});
	public static final BitSet FOLLOW_22_in_mult_zero_one157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_mult_zero_one165 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_add_zero188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_add_zero192 = new BitSet(new long[]{0x00003FFFFFFFFFF0L});
	public static final BitSet FOLLOW_23_in_add_zero210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_add_zero218 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_add_zero231 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_add_zero235 = new BitSet(new long[]{0x00003FFFFFFFFFF0L});
	public static final BitSet FOLLOW_23_in_add_zero253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_add_zero261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_sub_zero277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_sub_zero281 = new BitSet(new long[]{0x00003FFFFFFFFFF0L});
	public static final BitSet FOLLOW_24_in_sub_zero299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_sub_zero307 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_sub_zero320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_sub_zero324 = new BitSet(new long[]{0x00003FFFFFFFFFF0L});
	public static final BitSet FOLLOW_24_in_sub_zero342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_sub_zero350 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_add_const366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_add_const370 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_add_const374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_add_const386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_add_const390 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_add_const394 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_add_const405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_add_const409 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_add_const413 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_add_const424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_add_const428 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_add_const432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_sub_const446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_sub_const450 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_sub_const454 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_sub_const466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_sub_const470 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_sub_const474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_sub_const485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_sub_const489 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_sub_const493 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_sub_const503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_sub_const507 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_sub_const511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_mult_const525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_mult_const529 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_mult_const533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_mult_const545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_mult_const549 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_mult_const553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_mult_const564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_mult_const568 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_mult_const572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_mult_const582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_mult_const586 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_mult_const590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_div_const604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_div_const608 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_div_const612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_div_const624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_div_const628 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_div_const632 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_div_const643 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_div_const647 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_div_const651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_div_const661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_div_const665 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_div_const669 = new BitSet(new long[]{0x0000000000000008L});
}

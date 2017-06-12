// $ANTLR 3.5.2 /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g 2017-06-12 11:19:08
package de.dhbw.compiler.antlrxtreegrammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class AssignCount extends TreeParser {
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

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public AssignCount(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public AssignCount(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AssignCount.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g"; }



	  private int count =0;
	  
	  public int getCount() { return count; }
	  


	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:20:1: program : ^( 'program' ID decllist statlist ) ;
	public final AssignCount.program_return program() throws RecognitionException {
		AssignCount.program_return retval = new AssignCount.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal1=null;
		CommonTree ID2=null;
		TreeRuleReturnScope decllist3 =null;
		TreeRuleReturnScope statlist4 =null;

		CommonTree string_literal1_tree=null;
		CommonTree ID2_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:20:8: ( ^( 'program' ID decllist statlist ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:20:14: ^( 'program' ID decllist statlist )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal1=(CommonTree)match(input,41,FOLLOW_41_in_program69); 
			string_literal1_tree = (CommonTree)adaptor.dupNode(string_literal1);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_program71); 
			ID2_tree = (CommonTree)adaptor.dupNode(ID2);


			adaptor.addChild(root_1, ID2_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program73);
			decllist3=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist3.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program75);
			statlist4=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist4.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


	public static class decl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:22:1: decl : ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) );
	public final AssignCount.decl_return decl() throws RecognitionException {
		AssignCount.decl_return retval = new AssignCount.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECL5=null;
		CommonTree ID6=null;
		CommonTree DECL8=null;
		CommonTree ID9=null;
		CommonTree string_literal11=null;
		CommonTree DECL12=null;
		CommonTree ID13=null;
		CommonTree string_literal15=null;
		CommonTree DECL16=null;
		CommonTree ID17=null;
		CommonTree string_literal19=null;
		CommonTree string_literal20=null;
		TreeRuleReturnScope type7 =null;
		TreeRuleReturnScope type10 =null;
		TreeRuleReturnScope type14 =null;
		TreeRuleReturnScope type18 =null;

		CommonTree DECL5_tree=null;
		CommonTree ID6_tree=null;
		CommonTree DECL8_tree=null;
		CommonTree ID9_tree=null;
		CommonTree string_literal11_tree=null;
		CommonTree DECL12_tree=null;
		CommonTree ID13_tree=null;
		CommonTree string_literal15_tree=null;
		CommonTree DECL16_tree=null;
		CommonTree ID17_tree=null;
		CommonTree string_literal19_tree=null;
		CommonTree string_literal20_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:22:5: ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) )
			int alt1=4;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DECL) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==ID) ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3==36||LA1_3==39||LA1_3==43) ) {
							switch ( input.LA(5) ) {
							case UP:
								{
								alt1=1;
								}
								break;
							case 42:
								{
								int LA1_6 = input.LA(6);
								if ( (LA1_6==UP) ) {
									alt1=2;
								}
								else if ( (LA1_6==40) ) {
									alt1=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
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
								break;
							case 40:
								{
								alt1=3;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:22:14: ^( DECL ID type )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL5=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl91); 
					DECL5_tree = (CommonTree)adaptor.dupNode(DECL5);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL5_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_decl93); 
					ID6_tree = (CommonTree)adaptor.dupNode(ID6);


					adaptor.addChild(root_1, ID6_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl95);
					type7=type();
					state._fsp--;

					adaptor.addChild(root_1, type7.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:23:14: ^( DECL ID type 'read' )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL8=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl112); 
					DECL8_tree = (CommonTree)adaptor.dupNode(DECL8);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL8_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_decl114); 
					ID9_tree = (CommonTree)adaptor.dupNode(ID9);


					adaptor.addChild(root_1, ID9_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl116);
					type10=type();
					state._fsp--;

					adaptor.addChild(root_1, type10.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal11=(CommonTree)match(input,42,FOLLOW_42_in_decl118); 
					string_literal11_tree = (CommonTree)adaptor.dupNode(string_literal11);


					adaptor.addChild(root_1, string_literal11_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:24:14: ^( DECL ID type 'print' )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL12=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl135); 
					DECL12_tree = (CommonTree)adaptor.dupNode(DECL12);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL12_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_decl137); 
					ID13_tree = (CommonTree)adaptor.dupNode(ID13);


					adaptor.addChild(root_1, ID13_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl139);
					type14=type();
					state._fsp--;

					adaptor.addChild(root_1, type14.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal15=(CommonTree)match(input,40,FOLLOW_40_in_decl141); 
					string_literal15_tree = (CommonTree)adaptor.dupNode(string_literal15);


					adaptor.addChild(root_1, string_literal15_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:25:14: ^( DECL ID type 'read' 'print' )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL16=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl158); 
					DECL16_tree = (CommonTree)adaptor.dupNode(DECL16);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL16_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_decl160); 
					ID17_tree = (CommonTree)adaptor.dupNode(ID17);


					adaptor.addChild(root_1, ID17_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl162);
					type18=type();
					state._fsp--;

					adaptor.addChild(root_1, type18.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal19=(CommonTree)match(input,42,FOLLOW_42_in_decl164); 
					string_literal19_tree = (CommonTree)adaptor.dupNode(string_literal19);


					adaptor.addChild(root_1, string_literal19_tree);

					_last = (CommonTree)input.LT(1);
					string_literal20=(CommonTree)match(input,40,FOLLOW_40_in_decl166); 
					string_literal20_tree = (CommonTree)adaptor.dupNode(string_literal20);


					adaptor.addChild(root_1, string_literal20_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


	public static class type_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:27:1: type : ( 'int' | 'float' | 'string' );
	public final AssignCount.type_return type() throws RecognitionException {
		AssignCount.type_return retval = new AssignCount.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set21=null;

		CommonTree set21_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:27:5: ( 'int' | 'float' | 'string' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set21=(CommonTree)input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43 ) {
				input.consume();
				set21_tree = (CommonTree)adaptor.dupNode(set21);


				adaptor.addChild(root_0, set21_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "type"


	public static class decllist_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:29:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final AssignCount.decllist_return decllist() throws RecognitionException {
		AssignCount.decllist_return retval = new AssignCount.decllist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLLIST22=null;
		TreeRuleReturnScope decl23 =null;

		CommonTree DECLLIST22_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:29:9: ( ^( DECLLIST ( decl )* ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:29:15: ^( DECLLIST ( decl )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLLIST22=(CommonTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist190); 
			DECLLIST22_tree = (CommonTree)adaptor.dupNode(DECLLIST22);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLLIST22_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:29:26: ( decl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==DECL) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:29:26: decl
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist192);
						decl23=decl();
						state._fsp--;

						adaptor.addChild(root_1, decl23.getTree());

						}
						break;

					default :
						break loop2;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:33:1: expr : ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | simpleexpr );
	public final AssignCount.expr_return expr() throws RecognitionException {
		AssignCount.expr_return retval = new AssignCount.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set24=null;
		TreeRuleReturnScope expr25 =null;
		TreeRuleReturnScope expr26 =null;
		TreeRuleReturnScope simpleexpr27 =null;

		CommonTree set24_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:33:5: ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | simpleexpr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 22 && LA3_0 <= 24)||LA3_0==26) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= FLOATCONST && LA3_0 <= INTCONST)||(LA3_0 >= STRINGCONST && LA3_0 <= UMINUS)||LA3_0==20) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:33:15: ^( ( '+' | '-' | '*' | '/' ) expr expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set24=(CommonTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						set24_tree = (CommonTree)adaptor.dupNode(set24);


						root_1 = (CommonTree)adaptor.becomeRoot(set24_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr221);
					expr25=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr25.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr223);
					expr26=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr26.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:33:47: simpleexpr
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_simpleexpr_in_expr228);
					simpleexpr27=simpleexpr();
					state._fsp--;

					adaptor.addChild(root_0, simpleexpr27.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


	public static class simpleexpr_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleexpr"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:35:1: simpleexpr : ( '(' ! expr ')' !| INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST );
	public final AssignCount.simpleexpr_return simpleexpr() throws RecognitionException {
		AssignCount.simpleexpr_return retval = new AssignCount.simpleexpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree char_literal28=null;
		CommonTree char_literal30=null;
		CommonTree INTCONST31=null;
		CommonTree UMINUS32=null;
		CommonTree INTCONST33=null;
		CommonTree FLOATCONST34=null;
		CommonTree UMINUS35=null;
		CommonTree FLOATCONST36=null;
		CommonTree ID37=null;
		CommonTree STRINGCONST38=null;
		TreeRuleReturnScope expr29 =null;

		CommonTree char_literal28_tree=null;
		CommonTree char_literal30_tree=null;
		CommonTree INTCONST31_tree=null;
		CommonTree UMINUS32_tree=null;
		CommonTree INTCONST33_tree=null;
		CommonTree FLOATCONST34_tree=null;
		CommonTree UMINUS35_tree=null;
		CommonTree FLOATCONST36_tree=null;
		CommonTree ID37_tree=null;
		CommonTree STRINGCONST38_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:35:11: ( '(' ! expr ')' !| INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST )
			int alt4=7;
			switch ( input.LA(1) ) {
			case 20:
				{
				alt4=1;
				}
				break;
			case INTCONST:
				{
				alt4=2;
				}
				break;
			case UMINUS:
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3==DOWN) ) {
					int LA4_7 = input.LA(3);
					if ( (LA4_7==INTCONST) ) {
						alt4=3;
					}
					else if ( (LA4_7==FLOATCONST) ) {
						alt4=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOATCONST:
				{
				alt4=4;
				}
				break;
			case ID:
				{
				alt4=6;
				}
				break;
			case STRINGCONST:
				{
				alt4=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:35:15: '(' ! expr ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					char_literal28=(CommonTree)match(input,20,FOLLOW_20_in_simpleexpr237); 

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_simpleexpr240);
					expr29=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr29.getTree());

					_last = (CommonTree)input.LT(1);
					char_literal30=(CommonTree)match(input,21,FOLLOW_21_in_simpleexpr242); 

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:36:15: INTCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTCONST31=(CommonTree)match(input,INTCONST,FOLLOW_INTCONST_in_simpleexpr260); 
					INTCONST31_tree = (CommonTree)adaptor.dupNode(INTCONST31);


					adaptor.addChild(root_0, INTCONST31_tree);

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:36:27: ^( UMINUS INTCONST )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					UMINUS32=(CommonTree)match(input,UMINUS,FOLLOW_UMINUS_in_simpleexpr266); 
					UMINUS32_tree = (CommonTree)adaptor.dupNode(UMINUS32);


					root_1 = (CommonTree)adaptor.becomeRoot(UMINUS32_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INTCONST33=(CommonTree)match(input,INTCONST,FOLLOW_INTCONST_in_simpleexpr268); 
					INTCONST33_tree = (CommonTree)adaptor.dupNode(INTCONST33);


					adaptor.addChild(root_1, INTCONST33_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:37:15: FLOATCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FLOATCONST34=(CommonTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_simpleexpr285); 
					FLOATCONST34_tree = (CommonTree)adaptor.dupNode(FLOATCONST34);


					adaptor.addChild(root_0, FLOATCONST34_tree);

					}
					break;
				case 5 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:37:28: ^( UMINUS FLOATCONST )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					UMINUS35=(CommonTree)match(input,UMINUS,FOLLOW_UMINUS_in_simpleexpr290); 
					UMINUS35_tree = (CommonTree)adaptor.dupNode(UMINUS35);


					root_1 = (CommonTree)adaptor.becomeRoot(UMINUS35_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					FLOATCONST36=(CommonTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_simpleexpr292); 
					FLOATCONST36_tree = (CommonTree)adaptor.dupNode(FLOATCONST36);


					adaptor.addChild(root_1, FLOATCONST36_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:38:15: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID37=(CommonTree)match(input,ID,FOLLOW_ID_in_simpleexpr309); 
					ID37_tree = (CommonTree)adaptor.dupNode(ID37);


					adaptor.addChild(root_0, ID37_tree);

					}
					break;
				case 7 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:38:20: STRINGCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRINGCONST38=(CommonTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_simpleexpr313); 
					STRINGCONST38_tree = (CommonTree)adaptor.dupNode(STRINGCONST38);


					adaptor.addChild(root_0, STRINGCONST38_tree);

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "simpleexpr"


	public static class assignstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:41:1: assignstat : ^( ':=' ID expr ) ;
	public final AssignCount.assignstat_return assignstat() throws RecognitionException {
		AssignCount.assignstat_return retval = new AssignCount.assignstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal39=null;
		CommonTree ID40=null;
		TreeRuleReturnScope expr41 =null;

		CommonTree string_literal39_tree=null;
		CommonTree ID40_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:41:11: ( ^( ':=' ID expr ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:41:15: ^( ':=' ID expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal39=(CommonTree)match(input,28,FOLLOW_28_in_assignstat324); 
			string_literal39_tree = (CommonTree)adaptor.dupNode(string_literal39);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID40=(CommonTree)match(input,ID,FOLLOW_ID_in_assignstat326); 
			ID40_tree = (CommonTree)adaptor.dupNode(ID40);


			adaptor.addChild(root_1, ID40_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat328);
			expr41=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr41.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			count++;
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


	public static class cond_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:44:1: cond : ^( ( '<' | '>' | '=' ) expr expr ) ;
	public final AssignCount.cond_return cond() throws RecognitionException {
		AssignCount.cond_return retval = new AssignCount.cond_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set42=null;
		TreeRuleReturnScope expr43 =null;
		TreeRuleReturnScope expr44 =null;

		CommonTree set42_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:44:5: ( ^( ( '<' | '>' | '=' ) expr expr ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:44:15: ^( ( '<' | '>' | '=' ) expr expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			set42=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set42_tree = (CommonTree)adaptor.dupNode(set42);


				root_1 = (CommonTree)adaptor.becomeRoot(set42_tree, root_1);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond356);
			expr43=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr43.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond358);
			expr44=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr44.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


	public static class condstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:47:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final AssignCount.condstat_return condstat() throws RecognitionException {
		AssignCount.condstat_return retval = new AssignCount.condstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal45=null;
		TreeRuleReturnScope cond46 =null;
		TreeRuleReturnScope stat47 =null;
		TreeRuleReturnScope stat48 =null;

		CommonTree string_literal45_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:47:9: ( ^( 'if' cond stat ( stat )? ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:47:15: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal45=(CommonTree)match(input,38,FOLLOW_38_in_condstat372); 
			string_literal45_tree = (CommonTree)adaptor.dupNode(string_literal45);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat374);
			cond46=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond46.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat376);
			stat47=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat47.getTree());

			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:47:32: ( stat )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==STATLIST||LA5_0==28||(LA5_0 >= 37 && LA5_0 <= 38)||LA5_0==45) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:47:33: stat
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat379);
					stat48=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat48.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


	public static class whilestat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:50:1: whilestat : ^( 'while' cond stat ) ;
	public final AssignCount.whilestat_return whilestat() throws RecognitionException {
		AssignCount.whilestat_return retval = new AssignCount.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal49=null;
		TreeRuleReturnScope cond50 =null;
		TreeRuleReturnScope stat51 =null;

		CommonTree string_literal49_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:50:10: ( ^( 'while' cond stat ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:50:15: ^( 'while' cond stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal49=(CommonTree)match(input,45,FOLLOW_45_in_whilestat394); 
			string_literal49_tree = (CommonTree)adaptor.dupNode(string_literal49);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal49_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat396);
			cond50=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond50.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat398);
			stat51=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat51.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:51:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final AssignCount.forstat_return forstat() throws RecognitionException {
		AssignCount.forstat_return retval = new AssignCount.forstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal52=null;
		TreeRuleReturnScope assignstat53 =null;
		TreeRuleReturnScope cond54 =null;
		TreeRuleReturnScope assignstat55 =null;
		TreeRuleReturnScope stat56 =null;

		CommonTree string_literal52_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:51:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:51:15: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal52=(CommonTree)match(input,37,FOLLOW_37_in_forstat411); 
			string_literal52_tree = (CommonTree)adaptor.dupNode(string_literal52);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal52_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat413);
			assignstat53=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat53.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat415);
			cond54=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond54.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat417);
			assignstat55=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat55.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat419);
			stat56=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat56.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final AssignCount.stat_return stat() throws RecognitionException {
		AssignCount.stat_return retval = new AssignCount.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope assignstat57 =null;
		TreeRuleReturnScope condstat58 =null;
		TreeRuleReturnScope whilestat59 =null;
		TreeRuleReturnScope forstat60 =null;
		TreeRuleReturnScope statlist61 =null;


		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:5: ( assignstat | condstat | whilestat | forstat | statlist )
			int alt6=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt6=1;
				}
				break;
			case 38:
				{
				alt6=2;
				}
				break;
			case 45:
				{
				alt6=3;
				}
				break;
			case 37:
				{
				alt6=4;
				}
				break;
			case STATLIST:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:15: assignstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat436);
					assignstat57=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat57.getTree());

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:28: condstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat440);
					condstat58=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat58.getTree());

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:39: whilestat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat444);
					whilestat59=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat59.getTree());

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:51: forstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat448);
					forstat60=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat60.getTree());

					}
					break;
				case 5 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:54:61: statlist
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat452);
					statlist61=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist61.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:56:1: statlist : ^( STATLIST ( stat )* ) ;
	public final AssignCount.statlist_return statlist() throws RecognitionException {
		AssignCount.statlist_return retval = new AssignCount.statlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STATLIST62=null;
		TreeRuleReturnScope stat63 =null;

		CommonTree STATLIST62_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:56:9: ( ^( STATLIST ( stat )* ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:56:16: ^( STATLIST ( stat )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			STATLIST62=(CommonTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist465); 
			STATLIST62_tree = (CommonTree)adaptor.dupNode(STATLIST62);


			root_1 = (CommonTree)adaptor.becomeRoot(STATLIST62_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:56:27: ( stat )*
				loop7:
				while (true) {
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==STATLIST||LA7_0==28||(LA7_0 >= 37 && LA7_0 <= 38)||LA7_0==45) ) {
						alt7=1;
					}

					switch (alt7) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Baumgrammatiken - Leer/src/de/dhbw/compiler/antlrxtreegrammar/AssignCount.g:56:27: stat
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist467);
						stat63=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat63.getTree());

						}
						break;

					default :
						break loop7;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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

	// Delegated rules



	public static final BitSet FOLLOW_41_in_program69 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program71 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program73 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program75 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl91 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl93 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl95 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl114 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl116 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl118 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl137 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl139 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl160 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl162 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl164 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl166 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist192 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr221 = new BitSet(new long[]{0x0000000005D30700L});
	public static final BitSet FOLLOW_expr_in_expr223 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_simpleexpr_in_expr228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_simpleexpr237 = new BitSet(new long[]{0x0000000005D30700L});
	public static final BitSet FOLLOW_expr_in_simpleexpr240 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_simpleexpr242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTCONST_in_simpleexpr260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_simpleexpr266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_simpleexpr268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_simpleexpr285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_simpleexpr290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_simpleexpr292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_simpleexpr309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_simpleexpr313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat326 = new BitSet(new long[]{0x0000000005D30700L});
	public static final BitSet FOLLOW_expr_in_assignstat328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_cond348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond356 = new BitSet(new long[]{0x0000000005D30700L});
	public static final BitSet FOLLOW_expr_in_cond358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat374 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat376 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat379 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat394 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat396 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat411 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat413 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat415 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat417 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat419 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist467 = new BitSet(new long[]{0x0000206010008008L});
}

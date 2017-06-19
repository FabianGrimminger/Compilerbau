// $ANTLR 3.5.2 /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g 2017-06-19 14:18:51

package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class XTypeCheck extends TreeParser {
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


	public XTypeCheck(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XTypeCheck(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XTypeCheck.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g"; }



	   private SymbolTable  symbols = SymbolTable.getInstance();  
	   
	   private void error(XTree tree, String message) {
	     System.err.println("Error at "+tree.getLine()+","+tree.getCharPositionInLine()+": "+message);
	   }


	public static class decl_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:30:1: decl : ( ^( DECL ID 'int' (r= 'read' )? (p= 'print' )? ) | ^( DECL ID 'float' (r= 'read' )? (p= 'print' )? ) | ^( DECL ID 'string' (r= 'read' )? (p= 'print' )? ) );
	public final XTypeCheck.decl_return decl() throws RecognitionException {
		XTypeCheck.decl_return retval = new XTypeCheck.decl_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree r=null;
		XTree p=null;
		XTree DECL1=null;
		XTree ID2=null;
		XTree string_literal3=null;
		XTree DECL4=null;
		XTree ID5=null;
		XTree string_literal6=null;
		XTree DECL7=null;
		XTree ID8=null;
		XTree string_literal9=null;

		XTree r_tree=null;
		XTree p_tree=null;
		XTree DECL1_tree=null;
		XTree ID2_tree=null;
		XTree string_literal3_tree=null;
		XTree DECL4_tree=null;
		XTree ID5_tree=null;
		XTree string_literal6_tree=null;
		XTree DECL7_tree=null;
		XTree ID8_tree=null;
		XTree string_literal9_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:30:5: ( ^( DECL ID 'int' (r= 'read' )? (p= 'print' )? ) | ^( DECL ID 'float' (r= 'read' )? (p= 'print' )? ) | ^( DECL ID 'string' (r= 'read' )? (p= 'print' )? ) )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==DECL) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==ID) ) {
						switch ( input.LA(4) ) {
						case 39:
							{
							alt7=1;
							}
							break;
						case 36:
							{
							alt7=2;
							}
							break;
						case 43:
							{
							alt7=3;
							}
							break;
						default:
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

					else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:31:3: ^( DECL ID 'int' (r= 'read' )? (p= 'print' )? )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL1=(XTree)match(input,DECL,FOLLOW_DECL_in_decl87); 
					DECL1_tree = (XTree)adaptor.dupNode(DECL1);


					root_1 = (XTree)adaptor.becomeRoot(DECL1_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID2=(XTree)match(input,ID,FOLLOW_ID_in_decl89); 
					ID2_tree = (XTree)adaptor.dupNode(ID2);


					adaptor.addChild(root_1, ID2_tree);

					_last = (XTree)input.LT(1);
					string_literal3=(XTree)match(input,39,FOLLOW_39_in_decl91); 
					string_literal3_tree = (XTree)adaptor.dupNode(string_literal3);


					adaptor.addChild(root_1, string_literal3_tree);

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:31:20: (r= 'read' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==42) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:31:20: r= 'read'
							{
							_last = (XTree)input.LT(1);
							r=(XTree)match(input,42,FOLLOW_42_in_decl95); 
							r_tree = (XTree)adaptor.dupNode(r);


							adaptor.addChild(root_1, r_tree);

							}
							break;

					}

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:31:30: (p= 'print' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==40) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:31:30: p= 'print'
							{
							_last = (XTree)input.LT(1);
							p=(XTree)match(input,40,FOLLOW_40_in_decl100); 
							p_tree = (XTree)adaptor.dupNode(p);


							adaptor.addChild(root_1, p_tree);

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 symbols.put((ID2!=null?ID2.getText():null), new Symbol((ID2!=null?ID2.getText():null), XType.IntType, r!=null, p!=null)); 
					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:33:3: ^( DECL ID 'float' (r= 'read' )? (p= 'print' )? )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL4=(XTree)match(input,DECL,FOLLOW_DECL_in_decl117); 
					DECL4_tree = (XTree)adaptor.dupNode(DECL4);


					root_1 = (XTree)adaptor.becomeRoot(DECL4_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID5=(XTree)match(input,ID,FOLLOW_ID_in_decl119); 
					ID5_tree = (XTree)adaptor.dupNode(ID5);


					adaptor.addChild(root_1, ID5_tree);

					_last = (XTree)input.LT(1);
					string_literal6=(XTree)match(input,36,FOLLOW_36_in_decl121); 
					string_literal6_tree = (XTree)adaptor.dupNode(string_literal6);


					adaptor.addChild(root_1, string_literal6_tree);

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:33:22: (r= 'read' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==42) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:33:22: r= 'read'
							{
							_last = (XTree)input.LT(1);
							r=(XTree)match(input,42,FOLLOW_42_in_decl125); 
							r_tree = (XTree)adaptor.dupNode(r);


							adaptor.addChild(root_1, r_tree);

							}
							break;

					}

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:33:32: (p= 'print' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==40) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:33:32: p= 'print'
							{
							_last = (XTree)input.LT(1);
							p=(XTree)match(input,40,FOLLOW_40_in_decl130); 
							p_tree = (XTree)adaptor.dupNode(p);


							adaptor.addChild(root_1, p_tree);

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 symbols.put((ID5!=null?ID5.getText():null), new Symbol((ID5!=null?ID5.getText():null), XType.FloatType, r!=null, p!=null)); 
					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:35:3: ^( DECL ID 'string' (r= 'read' )? (p= 'print' )? )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL7=(XTree)match(input,DECL,FOLLOW_DECL_in_decl145); 
					DECL7_tree = (XTree)adaptor.dupNode(DECL7);


					root_1 = (XTree)adaptor.becomeRoot(DECL7_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID8=(XTree)match(input,ID,FOLLOW_ID_in_decl147); 
					ID8_tree = (XTree)adaptor.dupNode(ID8);


					adaptor.addChild(root_1, ID8_tree);

					_last = (XTree)input.LT(1);
					string_literal9=(XTree)match(input,43,FOLLOW_43_in_decl149); 
					string_literal9_tree = (XTree)adaptor.dupNode(string_literal9);


					adaptor.addChild(root_1, string_literal9_tree);

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:35:23: (r= 'read' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==42) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:35:23: r= 'read'
							{
							_last = (XTree)input.LT(1);
							r=(XTree)match(input,42,FOLLOW_42_in_decl153); 
							r_tree = (XTree)adaptor.dupNode(r);


							adaptor.addChild(root_1, r_tree);

							}
							break;

					}

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:35:33: (p= 'print' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==40) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:35:33: p= 'print'
							{
							_last = (XTree)input.LT(1);
							p=(XTree)match(input,40,FOLLOW_40_in_decl158); 
							p_tree = (XTree)adaptor.dupNode(p);


							adaptor.addChild(root_1, p_tree);

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 symbols.put((ID8!=null?ID8.getText():null), new Symbol((ID8!=null?ID8.getText():null), XType.StringType, r!=null, p!=null)); 
					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:38:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final XTypeCheck.decllist_return decllist() throws RecognitionException {
		XTypeCheck.decllist_return retval = new XTypeCheck.decllist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree DECLLIST10=null;
		TreeRuleReturnScope decl11 =null;

		XTree DECLLIST10_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:38:9: ( ^( DECLLIST ( decl )* ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:38:14: ^( DECLLIST ( decl )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			DECLLIST10=(XTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist178); 
			DECLLIST10_tree = (XTree)adaptor.dupNode(DECLLIST10);


			root_1 = (XTree)adaptor.becomeRoot(DECLLIST10_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:38:25: ( decl )*
				loop8:
				while (true) {
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==DECL) ) {
						alt8=1;
					}

					switch (alt8) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:38:25: decl
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist180);
						decl11=decl();
						state._fsp--;

						adaptor.addChild(root_1, decl11.getTree());

						}
						break;

					default :
						break loop8;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:41:1: expr : ( ^(op= ( '+' | '-' | '/' | '*' ) l= expr r= expr ) | ^(op= UMINUS e= expr ) | INTCONST | FLOATCONST | STRINGCONST | ID );
	public final XTypeCheck.expr_return expr() throws RecognitionException {
		XTypeCheck.expr_return retval = new XTypeCheck.expr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree op=null;
		XTree INTCONST12=null;
		XTree FLOATCONST13=null;
		XTree STRINGCONST14=null;
		XTree ID15=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;

		XTree op_tree=null;
		XTree INTCONST12_tree=null;
		XTree FLOATCONST13_tree=null;
		XTree STRINGCONST14_tree=null;
		XTree ID15_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:41:5: ( ^(op= ( '+' | '-' | '/' | '*' ) l= expr r= expr ) | ^(op= UMINUS e= expr ) | INTCONST | FLOATCONST | STRINGCONST | ID )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt9=1;
				}
				break;
			case UMINUS:
				{
				alt9=2;
				}
				break;
			case INTCONST:
				{
				alt9=3;
				}
				break;
			case FLOATCONST:
				{
				alt9=4;
				}
				break;
			case STRINGCONST:
				{
				alt9=5;
				}
				break;
			case ID:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:43:3: ^(op= ( '+' | '-' | '/' | '*' ) l= expr r= expr )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					op=(XTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						op_tree = (XTree)adaptor.dupNode(op);


						root_1 = (XTree)adaptor.becomeRoot(op_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr221);
					l=expr();
					state._fsp--;

					adaptor.addChild(root_1, l.getTree());

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr225);
					r=expr();
					state._fsp--;

					adaptor.addChild(root_1, r.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    if ((l!=null?((XTree)l.getTree()):null).exprType==XType.IntType && (r!=null?((XTree)r.getTree()):null).exprType==XType.IntType) {
					      op_tree.exprType=XType.IntType;
					    } else if (((l!=null?((XTree)l.getTree()):null).exprType==XType.IntType || (l!=null?((XTree)l.getTree()):null).exprType==XType.FloatType) && 
					               ((r!=null?((XTree)r.getTree()):null).exprType==XType.IntType || (r!=null?((XTree)r.getTree()):null).exprType==XType.FloatType))   {
					      op_tree.exprType=XType.FloatType;
					    } else if ((l!=null?((XTree)l.getTree()):null).exprType==XType.StringType && (r!=null?((XTree)r.getTree()):null).exprType==XType.StringType && (op!=null?op.getType():0)==PLUS) {
					      op_tree.exprType=XType.StringType;
					    } else {
					      op_tree.exprType=XType.InvalidType;
					      error(op,(op!=null?op.getText():null)+" is not valid for operands "+(l!=null?((XTree)l.getTree()):null).exprType+" and "+(r!=null?((XTree)r.getTree()):null).exprType+".");
					    }
					  
					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:71:3: ^(op= UMINUS e= expr )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					op=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr266); 
					op_tree = (XTree)adaptor.dupNode(op);


					root_1 = (XTree)adaptor.becomeRoot(op_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr270);
					e=expr();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 
					      op_tree.exprType=(e!=null?((XTree)e.getTree()):null).exprType;
					  
					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:76:3: INTCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					INTCONST12=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr295); 
					INTCONST12_tree = (XTree)adaptor.dupNode(INTCONST12);


					adaptor.addChild(root_0, INTCONST12_tree);

					 INTCONST12_tree.exprType=XType.IntType; 
					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:77:3: FLOATCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					FLOATCONST13=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr308); 
					FLOATCONST13_tree = (XTree)adaptor.dupNode(FLOATCONST13);


					adaptor.addChild(root_0, FLOATCONST13_tree);

					 FLOATCONST13_tree.exprType=XType.FloatType; 
					}
					break;
				case 5 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:78:3: STRINGCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					STRINGCONST14=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr315); 
					STRINGCONST14_tree = (XTree)adaptor.dupNode(STRINGCONST14);


					adaptor.addChild(root_0, STRINGCONST14_tree);

					 STRINGCONST14_tree.exprType=XType.StringType; 
					}
					break;
				case 6 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:79:3: ID
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					ID15=(XTree)match(input,ID,FOLLOW_ID_in_expr321); 
					ID15_tree = (XTree)adaptor.dupNode(ID15);


					adaptor.addChild(root_0, ID15_tree);

					 if (!symbols.containsKey((ID15!=null?ID15.getText():null))) { 
					                  ID15_tree.exprType=XType.InvalidType;
					                  error(ID15,"Variable "+(ID15!=null?ID15.getText():null)+" is not defined.");
					                } else {
					                  ID15_tree.exprType=symbols.get((ID15!=null?ID15.getText():null)).type;
					                }
					              
					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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


	public static class assignstat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:88:1: assignstat : ^(op= ':=' ID expr ) ;
	public final XTypeCheck.assignstat_return assignstat() throws RecognitionException {
		XTypeCheck.assignstat_return retval = new XTypeCheck.assignstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree op=null;
		XTree ID16=null;
		TreeRuleReturnScope expr17 =null;

		XTree op_tree=null;
		XTree ID16_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:88:11: ( ^(op= ':=' ID expr ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:88:14: ^(op= ':=' ID expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			op=(XTree)match(input,28,FOLLOW_28_in_assignstat346); 
			op_tree = (XTree)adaptor.dupNode(op);


			root_1 = (XTree)adaptor.becomeRoot(op_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID16=(XTree)match(input,ID,FOLLOW_ID_in_assignstat348); 
			ID16_tree = (XTree)adaptor.dupNode(ID16);


			adaptor.addChild(root_1, ID16_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat351);
			expr17=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr17.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 if (!symbols.containsKey((ID16!=null?ID16.getText():null))) { 
			      ID16_tree.exprType=XType.InvalidType;
			      op_tree.exprType=XType.InvalidType;
			      error(ID16,"Variable "+(ID16!=null?ID16.getText():null)+" is not defined.");
			    } else {
			      ID16_tree.exprType=symbols.get((ID16!=null?ID16.getText():null)).type;
			      if (ID16_tree.exprType==XType.FloatType && (expr17!=null?((XTree)expr17.getTree()):null).exprType==XType.IntType) {
			        op_tree.exprType=XType.FloatType;  
			      } else if (ID16_tree.exprType!=(expr17!=null?((XTree)expr17.getTree()):null).exprType) {
			        op_tree.exprType=XType.InvalidType;
			        error(op,"An expression of type "+(expr17!=null?((XTree)expr17.getTree()):null).exprType+
			                  " cannot be assigned to a variable of type "+ID16_tree.exprType+".");                    
			      } else { 
			        op_tree.exprType=ID16_tree.exprType;
			      }
			    }
			  
			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:108:1: cond : ^(op= ( '<' | '>' | '=' ) l= expr r= expr ) ;
	public final XTypeCheck.cond_return cond() throws RecognitionException {
		XTypeCheck.cond_return retval = new XTypeCheck.cond_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree op=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;

		XTree op_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:108:5: ( ^(op= ( '<' | '>' | '=' ) l= expr r= expr ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:108:9: ^(op= ( '<' | '>' | '=' ) l= expr r= expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			op=(XTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				op_tree = (XTree)adaptor.dupNode(op);


				root_1 = (XTree)adaptor.becomeRoot(op_tree, root_1);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond381);
			l=expr();
			state._fsp--;

			adaptor.addChild(root_1, l.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond385);
			r=expr();
			state._fsp--;

			adaptor.addChild(root_1, r.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 if ((l!=null?((XTree)l.getTree()):null).exprType==XType.StringType || (r!=null?((XTree)r.getTree()):null).exprType==XType.StringType) {
			      error(op,(op!=null?op.getText():null)+" is not valid for string operands.");
			    } else if ((l!=null?((XTree)l.getTree()):null).exprType==XType.IntType && (r!=null?((XTree)r.getTree()):null).exprType==XType.IntType) {
			      op_tree.exprType=XType.IntType;
			    } else {
			      op_tree.exprType=XType.FloatType;
			    }
			  
			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:119:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTypeCheck.condstat_return condstat() throws RecognitionException {
		XTypeCheck.condstat_return retval = new XTypeCheck.condstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal18=null;
		TreeRuleReturnScope cond19 =null;
		TreeRuleReturnScope stat20 =null;
		TreeRuleReturnScope stat21 =null;

		XTree string_literal18_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:119:9: ( ^( 'if' cond stat ( stat )? ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:119:13: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal18=(XTree)match(input,38,FOLLOW_38_in_condstat402); 
			string_literal18_tree = (XTree)adaptor.dupNode(string_literal18);


			root_1 = (XTree)adaptor.becomeRoot(string_literal18_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat404);
			cond19=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond19.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat407);
			stat20=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat20.getTree());

			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:119:31: ( stat )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==STATLIST||LA10_0==28||(LA10_0 >= 37 && LA10_0 <= 38)||LA10_0==45) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:119:31: stat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat409);
					stat21=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat21.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:122:1: whilestat : ^( 'while' cond stat ) ;
	public final XTypeCheck.whilestat_return whilestat() throws RecognitionException {
		XTypeCheck.whilestat_return retval = new XTypeCheck.whilestat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal22=null;
		TreeRuleReturnScope cond23 =null;
		TreeRuleReturnScope stat24 =null;

		XTree string_literal22_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:122:10: ( ^( 'while' cond stat ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:122:15: ^( 'while' cond stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal22=(XTree)match(input,45,FOLLOW_45_in_whilestat423); 
			string_literal22_tree = (XTree)adaptor.dupNode(string_literal22);


			root_1 = (XTree)adaptor.becomeRoot(string_literal22_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat425);
			cond23=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond23.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat427);
			stat24=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat24.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:123:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTypeCheck.forstat_return forstat() throws RecognitionException {
		XTypeCheck.forstat_return retval = new XTypeCheck.forstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal25=null;
		TreeRuleReturnScope assignstat26 =null;
		TreeRuleReturnScope cond27 =null;
		TreeRuleReturnScope assignstat28 =null;
		TreeRuleReturnScope stat29 =null;

		XTree string_literal25_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:123:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:123:15: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal25=(XTree)match(input,37,FOLLOW_37_in_forstat440); 
			string_literal25_tree = (XTree)adaptor.dupNode(string_literal25);


			root_1 = (XTree)adaptor.becomeRoot(string_literal25_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat442);
			assignstat26=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat26.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat444);
			cond27=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond27.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat446);
			assignstat28=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat28.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat448);
			stat29=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat29.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTypeCheck.stat_return stat() throws RecognitionException {
		XTypeCheck.stat_return retval = new XTypeCheck.stat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope assignstat30 =null;
		TreeRuleReturnScope condstat31 =null;
		TreeRuleReturnScope whilestat32 =null;
		TreeRuleReturnScope forstat33 =null;
		TreeRuleReturnScope statlist34 =null;


		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:5: ( assignstat | condstat | whilestat | forstat | statlist )
			int alt11=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt11=1;
				}
				break;
			case 38:
				{
				alt11=2;
				}
				break;
			case 45:
				{
				alt11=3;
				}
				break;
			case 37:
				{
				alt11=4;
				}
				break;
			case STATLIST:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:15: assignstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat465);
					assignstat30=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat30.getTree());

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:28: condstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat469);
					condstat31=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat31.getTree());

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:39: whilestat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat473);
					whilestat32=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat32.getTree());

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:51: forstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat477);
					forstat33=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat33.getTree());

					}
					break;
				case 5 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:126:61: statlist
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat481);
					statlist34=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist34.getTree());

					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:128:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTypeCheck.statlist_return statlist() throws RecognitionException {
		XTypeCheck.statlist_return retval = new XTypeCheck.statlist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree STATLIST35=null;
		TreeRuleReturnScope stat36 =null;

		XTree STATLIST35_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:128:9: ( ^( STATLIST ( stat )* ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:128:18: ^( STATLIST ( stat )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			STATLIST35=(XTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist496); 
			STATLIST35_tree = (XTree)adaptor.dupNode(STATLIST35);


			root_1 = (XTree)adaptor.becomeRoot(STATLIST35_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:128:29: ( stat )*
				loop12:
				while (true) {
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==STATLIST||LA12_0==28||(LA12_0 >= 37 && LA12_0 <= 38)||LA12_0==45) ) {
						alt12=1;
					}

					switch (alt12) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:128:29: stat
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist498);
						stat36=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat36.getTree());

						}
						break;

					default :
						break loop12;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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


	public static class program_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:131:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTypeCheck.program_return program() throws RecognitionException {
		XTypeCheck.program_return retval = new XTypeCheck.program_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal37=null;
		XTree ID38=null;
		TreeRuleReturnScope decllist39 =null;
		TreeRuleReturnScope statlist40 =null;

		XTree string_literal37_tree=null;
		XTree ID38_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:131:8: ( ^( 'program' ID decllist statlist ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr X Übersetzer - Leer/src/de/dhbw/compiler/antlrxcompiler/XTypeCheck.g:131:15: ^( 'program' ID decllist statlist )
			{
			root_0 = (XTree)adaptor.nil();


			 symbols.clear(); 
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal37=(XTree)match(input,41,FOLLOW_41_in_program516); 
			string_literal37_tree = (XTree)adaptor.dupNode(string_literal37);


			root_1 = (XTree)adaptor.becomeRoot(string_literal37_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID38=(XTree)match(input,ID,FOLLOW_ID_in_program518); 
			ID38_tree = (XTree)adaptor.dupNode(ID38);


			adaptor.addChild(root_1, ID38_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program520);
			decllist39=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist39.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program522);
			statlist40=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist40.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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

	// Delegated rules



	public static final BitSet FOLLOW_DECL_in_decl87 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl89 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_decl91 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl95 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl100 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl117 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl119 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_decl121 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl125 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl147 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_decl149 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl153 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist180 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr221 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_expr266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr270 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat348 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat351 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_cond369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond381 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond385 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat404 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat407 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat423 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat425 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat442 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat444 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat446 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist498 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program518 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program520 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program522 = new BitSet(new long[]{0x0000000000000008L});
}

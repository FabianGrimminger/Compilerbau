// $ANTLR 3.5.2 /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g 2017-05-29 13:09:16
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "DECL", "DECLLIST", "DIGIT", 
		"FLOATCONST", "ID", "INTCONST", "INVALID", "LETTER", "STATLIST", "STRINGCONST", 
		"UMINUS", "WS", "'.'", "':'", "';'", "'begin'", "'end'", "'float'", "'int'", 
		"'print'", "'program'", "'read print'", "'read'", "'string'"
	};
	public static final int EOF=-1;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int BLOCK=4;
	public static final int DECL=5;
	public static final int DECLLIST=6;
	public static final int DIGIT=7;
	public static final int FLOATCONST=8;
	public static final int ID=9;
	public static final int INTCONST=10;
	public static final int INVALID=11;
	public static final int LETTER=12;
	public static final int STATLIST=13;
	public static final int STRINGCONST=14;
	public static final int UMINUS=15;
	public static final int WS=16;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public XParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public XParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:67:1: program : 'program' ID ';' declist BLOCK '.' ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token ID2=null;
		Token char_literal3=null;
		Token BLOCK5=null;
		Token char_literal6=null;
		ParserRuleReturnScope declist4 =null;

		Object string_literal1_tree=null;
		Object ID2_tree=null;
		Object char_literal3_tree=null;
		Object BLOCK5_tree=null;
		Object char_literal6_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:67:8: ( 'program' ID ';' declist BLOCK '.' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:67:10: 'program' ID ';' declist BLOCK '.'
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,25,FOLLOW_25_in_program289); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			ID2=(Token)match(input,ID,FOLLOW_ID_in_program290); 
			ID2_tree = (Object)adaptor.create(ID2);
			adaptor.addChild(root_0, ID2_tree);

			char_literal3=(Token)match(input,19,FOLLOW_19_in_program291); 
			char_literal3_tree = (Object)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);

			pushFollow(FOLLOW_declist_in_program292);
			declist4=declist();
			state._fsp--;

			adaptor.addChild(root_0, declist4.getTree());

			BLOCK5=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_program294); 
			BLOCK5_tree = (Object)adaptor.create(BLOCK5);
			adaptor.addChild(root_0, BLOCK5_tree);

			char_literal6=(Token)match(input,17,FOLLOW_17_in_program295); 
			char_literal6_tree = (Object)adaptor.create(char_literal6);
			adaptor.addChild(root_0, char_literal6_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:69:1: decl : modifier ID ':' type ';' ;
	public final XParser.decl_return decl() throws RecognitionException {
		XParser.decl_return retval = new XParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID8=null;
		Token char_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope modifier7 =null;
		ParserRuleReturnScope type10 =null;

		Object ID8_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:69:5: ( modifier ID ':' type ';' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:69:7: modifier ID ':' type ';'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_modifier_in_decl302);
			modifier7=modifier();
			state._fsp--;

			adaptor.addChild(root_0, modifier7.getTree());

			ID8=(Token)match(input,ID,FOLLOW_ID_in_decl304); 
			ID8_tree = (Object)adaptor.create(ID8);
			adaptor.addChild(root_0, ID8_tree);

			char_literal9=(Token)match(input,18,FOLLOW_18_in_decl306); 
			char_literal9_tree = (Object)adaptor.create(char_literal9);
			adaptor.addChild(root_0, char_literal9_tree);

			pushFollow(FOLLOW_type_in_decl308);
			type10=type();
			state._fsp--;

			adaptor.addChild(root_0, type10.getTree());

			char_literal11=(Token)match(input,19,FOLLOW_19_in_decl310); 
			char_literal11_tree = (Object)adaptor.create(char_literal11);
			adaptor.addChild(root_0, char_literal11_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class declist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declist"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:70:1: declist : ( decl )* ;
	public final XParser.declist_return declist() throws RecognitionException {
		XParser.declist_return retval = new XParser.declist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope decl12 =null;


		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:70:8: ( ( decl )* )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:70:10: ( decl )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:70:10: ( decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==24||(LA1_0 >= 26 && LA1_0 <= 27)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:70:10: decl
					{
					pushFollow(FOLLOW_decl_in_declist316);
					decl12=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl12.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declist"


	public static class modifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:71:1: modifier : ( 'read print' | 'read' | 'print' |);
	public final XParser.modifier_return modifier() throws RecognitionException {
		XParser.modifier_return retval = new XParser.modifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal13=null;
		Token string_literal14=null;
		Token string_literal15=null;

		Object string_literal13_tree=null;
		Object string_literal14_tree=null;
		Object string_literal15_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:71:9: ( 'read print' | 'read' | 'print' |)
			int alt2=4;
			switch ( input.LA(1) ) {
			case 26:
				{
				alt2=1;
				}
				break;
			case 27:
				{
				alt2=2;
				}
				break;
			case 24:
				{
				alt2=3;
				}
				break;
			case ID:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:71:11: 'read print'
					{
					root_0 = (Object)adaptor.nil();


					string_literal13=(Token)match(input,26,FOLLOW_26_in_modifier323); 
					string_literal13_tree = (Object)adaptor.create(string_literal13);
					adaptor.addChild(root_0, string_literal13_tree);

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:71:24: 'read'
					{
					root_0 = (Object)adaptor.nil();


					string_literal14=(Token)match(input,27,FOLLOW_27_in_modifier325); 
					string_literal14_tree = (Object)adaptor.create(string_literal14);
					adaptor.addChild(root_0, string_literal14_tree);

					}
					break;
				case 3 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:71:31: 'print'
					{
					root_0 = (Object)adaptor.nil();


					string_literal15=(Token)match(input,24,FOLLOW_24_in_modifier327); 
					string_literal15_tree = (Object)adaptor.create(string_literal15);
					adaptor.addChild(root_0, string_literal15_tree);

					}
					break;
				case 4 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:71:39: 
					{
					root_0 = (Object)adaptor.nil();


					skip();
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:72:1: type : ( 'int' | 'float' | 'string' );
	public final XParser.type_return type() throws RecognitionException {
		XParser.type_return retval = new XParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set16=null;

		Object set16_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:72:5: ( 'int' | 'float' | 'string' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set16=input.LT(1);
			if ( (input.LA(1) >= 22 && input.LA(1) <= 23)||input.LA(1)==28 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set16));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:73:1: block : 'begin' STATLIST 'end' ;
	public final XParser.block_return block() throws RecognitionException {
		XParser.block_return retval = new XParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal17=null;
		Token STATLIST18=null;
		Token string_literal19=null;

		Object string_literal17_tree=null;
		Object STATLIST18_tree=null;
		Object string_literal19_tree=null;

		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:73:6: ( 'begin' STATLIST 'end' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:73:8: 'begin' STATLIST 'end'
			{
			root_0 = (Object)adaptor.nil();


			string_literal17=(Token)match(input,20,FOLLOW_20_in_block347); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			adaptor.addChild(root_0, string_literal17_tree);

			STATLIST18=(Token)match(input,STATLIST,FOLLOW_STATLIST_in_block349); 
			STATLIST18_tree = (Object)adaptor.create(STATLIST18);
			adaptor.addChild(root_0, STATLIST18_tree);

			string_literal19=(Token)match(input,21,FOLLOW_21_in_block351); 
			string_literal19_tree = (Object)adaptor.create(string_literal19);
			adaptor.addChild(root_0, string_literal19_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"

	// Delegated rules



	public static final BitSet FOLLOW_25_in_program289 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_program290 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_program291 = new BitSet(new long[]{0x000000000D000210L});
	public static final BitSet FOLLOW_declist_in_program292 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BLOCK_in_program294 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_program295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_decl302 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl304 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_decl306 = new BitSet(new long[]{0x0000000010C00000L});
	public static final BitSet FOLLOW_type_in_decl308 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_decl310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_declist316 = new BitSet(new long[]{0x000000000D000202L});
	public static final BitSet FOLLOW_26_in_modifier323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_modifier325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_modifier327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_block347 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_STATLIST_in_block349 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_block351 = new BitSet(new long[]{0x0000000000000002L});
}

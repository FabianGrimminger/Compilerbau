// $ANTLR 3.5.2 /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g 2017-05-29 13:09:17
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public XLexer() {} 
	public XLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public XLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g"; }

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:9:7: ( '.' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:9:9: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:10:7: ( ':' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:10:9: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:11:7: ( ';' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:11:9: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:12:7: ( 'begin' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:12:9: 'begin'
			{
			match("begin"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:13:7: ( 'end' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:13:9: 'end'
			{
			match("end"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:14:7: ( 'float' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:14:9: 'float'
			{
			match("float"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:15:7: ( 'int' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:15:9: 'int'
			{
			match("int"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:16:7: ( 'print' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:16:9: 'print'
			{
			match("print"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:17:7: ( 'program' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:17:9: 'program'
			{
			match("program"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:18:7: ( 'read print' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:18:9: 'read print'
			{
			match("read print"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:19:7: ( 'read' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:19:9: 'read'
			{
			match("read"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:20:7: ( 'string' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:20:9: 'string'
			{
			match("string"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:30:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:30:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:30:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			if ( state.backtracking==0 ) { skip(); }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:54:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | 'ä' | 'Ä' | 'ö' | 'Ö' | 'ü' | 'Ü' | 'ß' ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:55:15: ( ( '0' .. '9' ) )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:56:3: ( LETTER ( LETTER | DIGIT )* )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:56:5: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); if (state.failed) return;

			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:56:11: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')||LA2_0=='\u00C4'||LA2_0=='\u00D6'||LA2_0=='\u00DC'||LA2_0=='\u00DF'||LA2_0=='\u00E4'||LA2_0=='\u00F6'||LA2_0=='\u00FC') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INTCONST"
	public final void mINTCONST() throws RecognitionException {
		try {
			int _type = INTCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:57:9: ( ( '-' )? ( DIGIT )+ )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:57:11: ( '-' )? ( DIGIT )+
			{
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:57:11: ( '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:57:11: '-'
					{
					match('-'); if (state.failed) return;
					}
					break;

			}

			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:57:15: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTCONST"

	// $ANTLR start "FLOATCONST"
	public final void mFLOATCONST() throws RecognitionException {
		try {
			int _type = FLOATCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:11: ( ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT )* )? )
			int alt10=2;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:13: ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
					{
					mINTCONST(); if (state.failed) return;

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:59:11: ( '.' ( DIGIT )* )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='.') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:59:12: '.' ( DIGIT )*
							{
							match('.'); if (state.failed) return;
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:59:16: ( DIGIT )*
							loop5:
							while (true) {
								int alt5=2;
								int LA5_0 = input.LA(1);
								if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
									alt5=1;
								}

								switch (alt5) {
								case 1 :
									// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop5;
								}
							}

							}
							break;

					}

					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:59:34: ( '+' | '-' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='+'||LA7_0=='-') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					mINTCONST(); if (state.failed) return;

					}
					break;
				case 2 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:60:2: INTCONST ( '.' ( DIGIT )* )?
					{
					mINTCONST(); if (state.failed) return;

					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:60:11: ( '.' ( DIGIT )* )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='.') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:60:12: '.' ( DIGIT )*
							{
							match('.'); if (state.failed) return;
							// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:60:16: ( DIGIT )*
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop8;
								}
							}

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATCONST"

	// $ANTLR start "STRINGCONST"
	public final void mSTRINGCONST() throws RecognitionException {
		try {
			int _type = STRINGCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:61:12: ( '\"' ( LETTER | DIGIT )* '\"' )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:61:14: '\"' ( LETTER | DIGIT )* '\"'
			{
			match('\"'); if (state.failed) return;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:61:17: ( LETTER | DIGIT )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')||LA11_0=='\u00C4'||LA11_0=='\u00D6'||LA11_0=='\u00DC'||LA11_0=='\u00DF'||LA11_0=='\u00E4'||LA11_0=='\u00F6'||LA11_0=='\u00FC') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC'||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGCONST"

	// $ANTLR start "INVALID"
	public final void mINVALID() throws RecognitionException {
		try {
			int _type = INVALID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:65:8: ( . )
			// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:65:11: .
			{
			matchAny(); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVALID"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | WS | ID | INTCONST | FLOATCONST | STRINGCONST | INVALID )
		int alt12=18;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:10: T__17
				{
				mT__17(); if (state.failed) return;

				}
				break;
			case 2 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:16: T__18
				{
				mT__18(); if (state.failed) return;

				}
				break;
			case 3 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:22: T__19
				{
				mT__19(); if (state.failed) return;

				}
				break;
			case 4 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:28: T__20
				{
				mT__20(); if (state.failed) return;

				}
				break;
			case 5 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:34: T__21
				{
				mT__21(); if (state.failed) return;

				}
				break;
			case 6 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:40: T__22
				{
				mT__22(); if (state.failed) return;

				}
				break;
			case 7 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:46: T__23
				{
				mT__23(); if (state.failed) return;

				}
				break;
			case 8 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:52: T__24
				{
				mT__24(); if (state.failed) return;

				}
				break;
			case 9 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:58: T__25
				{
				mT__25(); if (state.failed) return;

				}
				break;
			case 10 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:64: T__26
				{
				mT__26(); if (state.failed) return;

				}
				break;
			case 11 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:70: T__27
				{
				mT__27(); if (state.failed) return;

				}
				break;
			case 12 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:76: T__28
				{
				mT__28(); if (state.failed) return;

				}
				break;
			case 13 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:82: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 14 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:85: ID
				{
				mID(); if (state.failed) return;

				}
				break;
			case 15 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:88: INTCONST
				{
				mINTCONST(); if (state.failed) return;

				}
				break;
			case 16 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:97: FLOATCONST
				{
				mFLOATCONST(); if (state.failed) return;

				}
				break;
			case 17 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:108: STRINGCONST
				{
				mSTRINGCONST(); if (state.failed) return;

				}
				break;
			case 18 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:1:120: INVALID
				{
				mINVALID(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_X
	public final void synpred1_X_fragment() throws RecognitionException {
		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:13: ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )
		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:14: INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
		{
		mINTCONST(); if (state.failed) return;

		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:23: ( '.' ( DIGIT )* )?
		int alt14=2;
		int LA14_0 = input.LA(1);
		if ( (LA14_0=='.') ) {
			alt14=1;
		}
		switch (alt14) {
			case 1 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:24: '.' ( DIGIT )*
				{
				match('.'); if (state.failed) return;
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:28: ( DIGIT )*
				loop13:
				while (true) {
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
						alt13=1;
					}

					switch (alt13) {
					case 1 :
						// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
						{
						if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
							input.consume();
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							recover(mse);
							throw mse;
						}
						}
						break;

					default :
						break loop13;
					}
				}

				}
				break;

		}

		if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:58:46: ( '+' | '-' )?
		int alt15=2;
		int LA15_0 = input.LA(1);
		if ( (LA15_0=='+'||LA15_0=='-') ) {
			alt15=1;
		}
		switch (alt15) {
			case 1 :
				// /home/fabian/Compilerbau/combau/ÜB-Praxis-Antlr Parser für X-Leer/src/de/dhbw/compiler/antlrxparser/X.g:
				{
				if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

		}

		mINTCONST(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_X

	public final boolean synpred1_X() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_X_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA10_eotS =
		"\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3";
	static final String DFA10_eofS =
		"\7\uffff";
	static final String DFA10_minS =
		"\1\55\1\60\1\56\1\uffff\1\60\1\uffff\1\60";
	static final String DFA10_maxS =
		"\2\71\1\145\1\uffff\1\145\1\uffff\1\145";
	static final String DFA10_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\1\uffff";
	static final String DFA10_specialS =
		"\2\uffff\1\1\1\uffff\1\0\1\uffff\1\2}>";
	static final String[] DFA10_transitionS = {
			"\1\1\2\uffff\12\2",
			"\12\2",
			"\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
			"",
			"\12\6\13\uffff\1\5\37\uffff\1\5",
			"",
			"\12\6\13\uffff\1\5\37\uffff\1\5"
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "58:1: FLOATCONST : ( ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT )* )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA10_4 = input.LA(1);
						 
						int index10_4 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA10_4 >= '0' && LA10_4 <= '9')) ) {s = 6;}
						else if ( (LA10_4=='E'||LA10_4=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index10_4);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA10_2 = input.LA(1);
						 
						int index10_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA10_2=='.') ) {s = 4;}
						else if ( (LA10_2=='E'||LA10_2=='e') && (synpred1_X())) {s = 5;}
						else if ( ((LA10_2 >= '0' && LA10_2 <= '9')) ) {s = 2;}
						else s = 3;
						 
						input.seek(index10_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA10_6 = input.LA(1);
						 
						int index10_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA10_6=='E'||LA10_6=='e') && (synpred1_X())) {s = 5;}
						else if ( ((LA10_6 >= '0' && LA10_6 <= '9')) ) {s = 6;}
						else s = 3;
						 
						input.seek(index10_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 10, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA12_eotS =
		"\4\uffff\7\25\2\uffff\1\20\1\36\1\20\4\uffff\1\25\1\uffff\6\25\1\uffff"+
		"\1\36\3\uffff\1\25\1\52\1\25\1\54\5\25\1\uffff\1\25\1\uffff\2\25\1\66"+
		"\1\25\1\70\1\71\1\72\1\25\2\uffff\1\25\3\uffff\1\25\1\76\1\77\2\uffff";
	static final String DFA12_eofS =
		"\100\uffff";
	static final String DFA12_minS =
		"\1\0\3\uffff\1\145\1\156\1\154\1\156\1\162\1\145\1\164\2\uffff\1\60\1"+
		"\56\1\42\4\uffff\1\147\1\uffff\1\144\1\157\1\164\1\151\1\141\1\162\1\uffff"+
		"\1\56\3\uffff\1\151\1\60\1\141\1\60\1\156\1\147\1\144\1\151\1\156\1\uffff"+
		"\1\164\1\uffff\1\164\1\162\1\40\1\156\3\60\1\141\2\uffff\1\147\3\uffff"+
		"\1\155\2\60\2\uffff";
	static final String DFA12_maxS =
		"\1\uffff\3\uffff\1\145\1\156\1\154\1\156\1\162\1\145\1\164\2\uffff\1\71"+
		"\1\145\1\u00fc\4\uffff\1\147\1\uffff\1\144\1\157\1\164\1\157\1\141\1\162"+
		"\1\uffff\1\145\3\uffff\1\151\1\u00fc\1\141\1\u00fc\1\156\1\147\1\144\1"+
		"\151\1\156\1\uffff\1\164\1\uffff\1\164\1\162\1\u00fc\1\156\3\u00fc\1\141"+
		"\2\uffff\1\147\3\uffff\1\155\2\u00fc\2\uffff";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\2\1\3\7\uffff\1\15\1\16\3\uffff\1\22\1\1\1\2\1\3\1\uffff"+
		"\1\16\6\uffff\1\15\1\uffff\1\17\1\20\1\21\11\uffff\1\5\1\uffff\1\7\10"+
		"\uffff\1\12\1\13\1\uffff\1\4\1\6\1\10\3\uffff\1\14\1\11";
	static final String DFA12_specialS =
		"\1\0\77\uffff}>";
	static final String[] DFA12_transitionS = {
			"\11\20\2\13\2\20\1\13\22\20\1\13\1\20\1\17\12\20\1\15\1\1\1\20\12\16"+
			"\1\2\1\3\5\20\32\14\6\20\1\14\1\4\2\14\1\5\1\6\2\14\1\7\6\14\1\10\1\14"+
			"\1\11\1\12\7\14\111\20\1\14\21\20\1\14\5\20\1\14\2\20\1\14\4\20\1\14"+
			"\21\20\1\14\5\20\1\14\uff03\20",
			"",
			"",
			"",
			"\1\24",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"",
			"",
			"\12\35",
			"\1\37\1\uffff\12\35\13\uffff\1\37\37\uffff\1\37",
			"\1\40\15\uffff\12\40\7\uffff\32\40\6\uffff\32\40\111\uffff\1\40\21\uffff"+
			"\1\40\5\uffff\1\40\2\uffff\1\40\4\uffff\1\40\21\uffff\1\40\5\uffff\1"+
			"\40",
			"",
			"",
			"",
			"",
			"\1\41",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45\5\uffff\1\46",
			"\1\47",
			"\1\50",
			"",
			"\1\37\1\uffff\12\35\13\uffff\1\37\37\uffff\1\37",
			"",
			"",
			"",
			"\1\51",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"\1\53",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"",
			"\1\62",
			"",
			"\1\63",
			"\1\64",
			"\1\65\17\uffff\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff"+
			"\1\25\5\uffff\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1"+
			"\25",
			"\1\67",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"\1\73",
			"",
			"",
			"\1\74",
			"",
			"",
			"",
			"\1\75",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25\111\uffff\1\25\21\uffff\1\25\5\uffff"+
			"\1\25\2\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | WS | ID | INTCONST | FLOATCONST | STRINGCONST | INVALID );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_0 = input.LA(1);
						s = -1;
						if ( (LA12_0=='.') ) {s = 1;}
						else if ( (LA12_0==':') ) {s = 2;}
						else if ( (LA12_0==';') ) {s = 3;}
						else if ( (LA12_0=='b') ) {s = 4;}
						else if ( (LA12_0=='e') ) {s = 5;}
						else if ( (LA12_0=='f') ) {s = 6;}
						else if ( (LA12_0=='i') ) {s = 7;}
						else if ( (LA12_0=='p') ) {s = 8;}
						else if ( (LA12_0=='r') ) {s = 9;}
						else if ( (LA12_0=='s') ) {s = 10;}
						else if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 11;}
						else if ( ((LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='a'||(LA12_0 >= 'c' && LA12_0 <= 'd')||(LA12_0 >= 'g' && LA12_0 <= 'h')||(LA12_0 >= 'j' && LA12_0 <= 'o')||LA12_0=='q'||(LA12_0 >= 't' && LA12_0 <= 'z')||LA12_0=='\u00C4'||LA12_0=='\u00D6'||LA12_0=='\u00DC'||LA12_0=='\u00DF'||LA12_0=='\u00E4'||LA12_0=='\u00F6'||LA12_0=='\u00FC') ) {s = 12;}
						else if ( (LA12_0=='-') ) {s = 13;}
						else if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {s = 14;}
						else if ( (LA12_0=='\"') ) {s = 15;}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\u001F')||LA12_0=='!'||(LA12_0 >= '#' && LA12_0 <= ',')||LA12_0=='/'||(LA12_0 >= '<' && LA12_0 <= '@')||(LA12_0 >= '[' && LA12_0 <= '`')||(LA12_0 >= '{' && LA12_0 <= '\u00C3')||(LA12_0 >= '\u00C5' && LA12_0 <= '\u00D5')||(LA12_0 >= '\u00D7' && LA12_0 <= '\u00DB')||(LA12_0 >= '\u00DD' && LA12_0 <= '\u00DE')||(LA12_0 >= '\u00E0' && LA12_0 <= '\u00E3')||(LA12_0 >= '\u00E5' && LA12_0 <= '\u00F5')||(LA12_0 >= '\u00F7' && LA12_0 <= '\u00FB')||(LA12_0 >= '\u00FD' && LA12_0 <= '\uFFFF')) ) {s = 16;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}

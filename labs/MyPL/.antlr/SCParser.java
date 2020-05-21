// Generated from e:\Visual Studio\WorkSpace\HCMUS\[HK8][NLNNLT]\nlnnlt\labs\MyPL\SC.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ASSIGN_OPR=2, BIN_OPR=3, KEYWORD=4, TYPE=5, LINE_COMMENT=6, BLK_COMMENT=7, 
		LP=8, RP=9, LCB=10, RCB=11, LSB=12, RSB=13, SEMICOLON=14, COMMA=15, COLON=16, 
		DOT=17, CHARLITERAL=18, INTLITERAL=19, BOOLEANLITERAL=20, STRINGLITERAL=21, 
		IDENTIFIER=22;
	public static final int
		RULE_scan = 0, RULE_var_decl = 1;
	public static final String[] ruleNames = {
		"scan", "var_decl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "':'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ASSIGN_OPR", "BIN_OPR", "KEYWORD", "TYPE", "LINE_COMMENT", 
		"BLK_COMMENT", "LP", "RP", "LCB", "RCB", "LSB", "RSB", "SEMICOLON", "COMMA", 
		"COLON", "DOT", "CHARLITERAL", "INTLITERAL", "BOOLEANLITERAL", "STRINGLITERAL", 
		"IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScanContext extends ParserRuleContext {
		public List<TerminalNode> INTLITERAL() { return getTokens(SCParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(SCParser.INTLITERAL, i);
		}
		public List<TerminalNode> CHARLITERAL() { return getTokens(SCParser.CHARLITERAL); }
		public TerminalNode CHARLITERAL(int i) {
			return getToken(SCParser.CHARLITERAL, i);
		}
		public List<TerminalNode> BOOLEANLITERAL() { return getTokens(SCParser.BOOLEANLITERAL); }
		public TerminalNode BOOLEANLITERAL(int i) {
			return getToken(SCParser.BOOLEANLITERAL, i);
		}
		public List<TerminalNode> STRINGLITERAL() { return getTokens(SCParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(SCParser.STRINGLITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SCParser.IDENTIFIER, i);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_scan);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INTLITERAL) {
					{
					{
					setState(4);
					match(INTLITERAL);
					}
					}
					setState(9);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHARLITERAL) {
					{
					{
					setState(10);
					match(CHARLITERAL);
					}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOLEANLITERAL) {
					{
					{
					setState(16);
					match(BOOLEANLITERAL);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRINGLITERAL) {
					{
					{
					setState(22);
					match(STRINGLITERAL);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(28);
					match(IDENTIFIER);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SCParser.TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SCParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SCParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SCParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TYPE);
			setState(37);
			match(IDENTIFIER);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(38);
				match(COMMA);
				setState(39);
				match(IDENTIFIER);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\62\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3"+
		"\2\7\2\24\n\2\f\2\16\2\27\13\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2"+
		" \n\2\f\2\16\2#\13\2\5\2%\n\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3"+
		"\3\3\3\3\3\3\2\2\4\2\4\2\2\29\2$\3\2\2\2\4&\3\2\2\2\6\b\7\25\2\2\7\6\3"+
		"\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n%\3\2\2\2\13\t\3\2\2\2\f"+
		"\16\7\24\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20%"+
		"\3\2\2\2\21\17\3\2\2\2\22\24\7\26\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26%\3\2\2\2\27\25\3\2\2\2\30\32\7\27\2\2\31\30"+
		"\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34%\3\2\2\2\35\33\3"+
		"\2\2\2\36 \7\30\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"%"+
		"\3\2\2\2#!\3\2\2\2$\t\3\2\2\2$\17\3\2\2\2$\25\3\2\2\2$\33\3\2\2\2$!\3"+
		"\2\2\2%\3\3\2\2\2&\'\7\7\2\2\',\7\30\2\2()\7\21\2\2)+\7\30\2\2*(\3\2\2"+
		"\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\20\2\2\60\5"+
		"\3\2\2\2\t\t\17\25\33!$,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
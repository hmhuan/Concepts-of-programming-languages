// Generated from e:\Visual Studio\WorkSpace\HCMUS\[HK8][NLNNLT]\nlnnlt\labs\MyPL\SC.g4 by ANTLR 4.7.1

from LexerError import *

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ASSIGN_OPR=2, BIN_OPR=3, KEYWORD=4, TYPE=5, LINE_COMMENT=6, BLK_COMMENT=7, 
		LP=8, RP=9, LCB=10, RCB=11, LSB=12, RSB=13, SEMICOLON=14, COMMA=15, COLON=16, 
		DOT=17, CHARLITERAL=18, INTLITERAL=19, BOOLEANLITERAL=20, STRINGLITERAL=21, 
		IDENTIFIER=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "ASSIGN_OPR", "BIN_OPR", "ARITH_OPR", "REL_OPR", "EQ_OPR", "COND_OPR", 
		"PROGRAM", "IF", "BOOLEAN", "BREAK", "CALL_OUT", "CLASS", "CONTINUE", 
		"ELSE", "FOR", "INT", "RETURN", "VOID", "KEYWORD", "TYPE", "LINE_COMMENT", 
		"BLK_COMMENT", "LP", "RP", "LCB", "RCB", "LSB", "RSB", "SEMICOLON", "COMMA", 
		"COLON", "DOT", "TRUE", "FALSE", "DIGIT", "DEC_DIGITS", "HEX_DIGITS", 
		"CHAR", "SIGN", "CHARLITERAL", "INTLITERAL", "BOOLEANLITERAL", "STRINGLITERAL", 
		"IDENTIFIER", "STR_CHAR", "ESC_SEQ", "ALPHA", "ALPHA_NUM"
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


	public SCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 41:
			INTLITERAL_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INTLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

				y = str(self.text)
				if y == '0x':
					self.text = 'unexpected token: ' + self.text
					self.type = 1

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0171\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\5\4x\n\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\5\7\u0087\n"+
		"\7\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u00e4\n\25\3\26\3\26\5\26\u00e8\n\26\3\27\3\27\3\27"+
		"\3\27\7\27\u00ee\n\27\f\27\16\27\u00f1\13\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\7\30\u00f9\n\30\f\30\16\30\u00fc\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\7"+
		"&\u0127\n&\f&\16&\u012a\13&\5&\u012c\n&\3\'\3\'\3\'\3\'\3\'\7\'\u0133"+
		"\n\'\f\'\16\'\u0136\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0143\n("+
		"\3)\3)\3*\3*\3*\3*\3+\3+\5+\u014d\n+\3+\3+\3,\3,\5,\u0153\n,\3-\3-\7-"+
		"\u0157\n-\f-\16-\u015a\13-\3-\3-\3.\3.\7.\u0160\n.\f.\16.\u0163\13.\3"+
		"/\3/\5/\u0167\n/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\5\62\u0170\n\62\3"+
		"\u00fa\2\63\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33"+
		"\2\35\2\37\2!\2#\2%\2\'\2)\6+\7-\b/\t\61\n\63\13\65\f\67\r9\16;\17=\20"+
		"?\21A\22C\23E\2G\2I\2K\2M\2O\2Q\2S\24U\25W\26Y\27[\30]\2_\2a\2c\2\3\2"+
		"\16\5\2\13\f\17\17\"\"\6\2\'\',-//\61\61\4\2>>@@\4\2\f\f\17\17\3\2\62"+
		";\3\2\63;\4\2CHch\6\2\"#%(*]_\u0080\4\2--//\7\2\n\f\16\17$$))^^\n\2$$"+
		"))^^ddhhppttvv\5\2C\\aac|\2\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\3f\3\2\2\2\5q\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13\u0080\3\2\2\2"+
		"\r\u0086\3\2\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23\u0096\3\2\2\2\25"+
		"\u0099\3\2\2\2\27\u00a1\3\2\2\2\31\u00a7\3\2\2\2\33\u00af\3\2\2\2\35\u00b5"+
		"\3\2\2\2\37\u00be\3\2\2\2!\u00c3\3\2\2\2#\u00c7\3\2\2\2%\u00cb\3\2\2\2"+
		"\'\u00d2\3\2\2\2)\u00e3\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00f4\3"+
		"\2\2\2\61\u0102\3\2\2\2\63\u0104\3\2\2\2\65\u0106\3\2\2\2\67\u0108\3\2"+
		"\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010e\3\2\2\2?\u0110\3\2\2\2A\u0112"+
		"\3\2\2\2C\u0114\3\2\2\2E\u0116\3\2\2\2G\u011b\3\2\2\2I\u0121\3\2\2\2K"+
		"\u012b\3\2\2\2M\u012d\3\2\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0146\3\2"+
		"\2\2U\u014c\3\2\2\2W\u0152\3\2\2\2Y\u0154\3\2\2\2[\u015d\3\2\2\2]\u0166"+
		"\3\2\2\2_\u0168\3\2\2\2a\u016b\3\2\2\2c\u016f\3\2\2\2eg\t\2\2\2fe\3\2"+
		"\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\2\2\2k\4\3\2\2\2lr\7"+
		"?\2\2mn\7-\2\2nr\7?\2\2op\7/\2\2pr\7?\2\2ql\3\2\2\2qm\3\2\2\2qo\3\2\2"+
		"\2r\6\3\2\2\2sx\5\t\5\2tx\5\13\6\2ux\5\r\7\2vx\5\17\b\2ws\3\2\2\2wt\3"+
		"\2\2\2wu\3\2\2\2wv\3\2\2\2x\b\3\2\2\2yz\t\3\2\2z\n\3\2\2\2{\u0081\t\4"+
		"\2\2|}\7>\2\2}\u0081\7?\2\2~\177\7@\2\2\177\u0081\7?\2\2\u0080{\3\2\2"+
		"\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\f\3\2\2\2\u0082\u0083\7?\2\2\u0083"+
		"\u0087\7?\2\2\u0084\u0085\7#\2\2\u0085\u0087\7?\2\2\u0086\u0082\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087\16\3\2\2\2\u0088\u0089\7(\2\2\u0089\u008d"+
		"\7(\2\2\u008a\u008b\7~\2\2\u008b\u008d\7~\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\20\3\2\2\2\u008e\u008f\7R\2\2\u008f\u0090\7t\2\2"+
		"\u0090\u0091\7q\2\2\u0091\u0092\7i\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7o\2\2\u0095\22\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7h\2\2\u0098\24\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7m\2\2\u00a6\30\3\2\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\u00ac\7q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\32\3\2"+
		"\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7u\2\2\u00b3\u00b4\7u\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7p\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd\36\3\2\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2 \3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7t\2"+
		"\2\u00c6\"\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7"+
		"v\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"&\3\2\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7f\2\2\u00d6(\3\2\2\2\u00d7\u00e4\5\21\t\2\u00d8\u00e4\5\23\n\2"+
		"\u00d9\u00e4\5\25\13\2\u00da\u00e4\5\27\f\2\u00db\u00e4\5\31\r\2\u00dc"+
		"\u00e4\5\33\16\2\u00dd\u00e4\5\35\17\2\u00de\u00e4\5\37\20\2\u00df\u00e4"+
		"\5!\21\2\u00e0\u00e4\5#\22\2\u00e1\u00e4\5%\23\2\u00e2\u00e4\5\'\24\2"+
		"\u00e3\u00d7\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00da"+
		"\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4*\3\2\2\2\u00e5\u00e8\5#\22\2\u00e6\u00e8"+
		"\5\25\13\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8,\3\2\2\2\u00e9"+
		"\u00ea\7\61\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\n"+
		"\5\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\27"+
		"\2\2\u00f3.\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6\u00fa"+
		"\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b\30\2\2\u0101\60\3\2\2\2\u0102\u0103\7*\2\2\u0103\62\3\2\2\2\u0104"+
		"\u0105\7+\2\2\u0105\64\3\2\2\2\u0106\u0107\7}\2\2\u0107\66\3\2\2\2\u0108"+
		"\u0109\7\177\2\2\u01098\3\2\2\2\u010a\u010b\7]\2\2\u010b:\3\2\2\2\u010c"+
		"\u010d\7_\2\2\u010d<\3\2\2\2\u010e\u010f\7=\2\2\u010f>\3\2\2\2\u0110\u0111"+
		"\7.\2\2\u0111@\3\2\2\2\u0112\u0113\7<\2\2\u0113B\3\2\2\2\u0114\u0115\7"+
		"\60\2\2\u0115D\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\7w\2\2\u0119\u011a\7g\2\2\u011aF\3\2\2\2\u011b\u011c\7h\2\2\u011c\u011d"+
		"\7c\2\2\u011d\u011e\7n\2\2\u011e\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120"+
		"H\3\2\2\2\u0121\u0122\t\6\2\2\u0122J\3\2\2\2\u0123\u012c\5I%\2\u0124\u0128"+
		"\t\7\2\2\u0125\u0127\5I%\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u0123\3\2\2\2\u012b\u0124\3\2\2\2\u012cL\3\2\2\2\u012d\u012e"+
		"\7\62\2\2\u012e\u012f\7z\2\2\u012f\u0134\3\2\2\2\u0130\u0133\5I%\2\u0131"+
		"\u0133\t\b\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135N\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0143\t\t\2\2\u0138\u0139\7^\2\2\u0139\u0143\7p\2\2\u013a"+
		"\u013b\7^\2\2\u013b\u0143\7v\2\2\u013c\u013d\7^\2\2\u013d\u0143\7^\2\2"+
		"\u013e\u013f\7^\2\2\u013f\u0143\7$\2\2\u0140\u0141\7^\2\2\u0141\u0143"+
		"\7)\2\2\u0142\u0137\3\2\2\2\u0142\u0138\3\2\2\2\u0142\u013a\3\2\2\2\u0142"+
		"\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0140\3\2\2\2\u0143P\3\2\2\2"+
		"\u0144\u0145\t\n\2\2\u0145R\3\2\2\2\u0146\u0147\7)\2\2\u0147\u0148\5O"+
		"(\2\u0148\u0149\7)\2\2\u0149T\3\2\2\2\u014a\u014d\5K&\2\u014b\u014d\5"+
		"M\'\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\b+\3\2\u014fV\3\2\2\2\u0150\u0153\5E#\2\u0151\u0153\5G$\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153X\3\2\2\2\u0154\u0158\7$\2\2\u0155"+
		"\u0157\5]/\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c"+
		"\7$\2\2\u015cZ\3\2\2\2\u015d\u0161\5a\61\2\u015e\u0160\5c\62\2\u015f\u015e"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\\\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0167\n\13\2\2\u0165\u0167\5_\60"+
		"\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167^\3\2\2\2\u0168\u0169"+
		"\7^\2\2\u0169\u016a\t\f\2\2\u016a`\3\2\2\2\u016b\u016c\t\r\2\2\u016cb"+
		"\3\2\2\2\u016d\u0170\5a\61\2\u016e\u0170\5I%\2\u016f\u016d\3\2\2\2\u016f"+
		"\u016e\3\2\2\2\u0170d\3\2\2\2\30\2hqw\u0080\u0086\u008c\u00e3\u00e7\u00ef"+
		"\u00fa\u0128\u012b\u0132\u0134\u0142\u014c\u0152\u0158\u0161\u0166\u016f"+
		"\4\b\2\2\3+\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
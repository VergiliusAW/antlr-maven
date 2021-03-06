// Generated from mikhail.ashcheulov/Pl0.g4 by ANTLR 4.9.3
package mikhail.ashcheulov;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pl0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, EQ=8, NEQ=9, LESS=10, 
		GREATER=11, ADD=12, SUB=13, MUL=14, DIV=15, WRITE=16, WHILE=17, DO=18, 
		IF=19, THEN=20, ODD=21, BEGIN=22, END=23, CALL=24, CONST=25, VAR=26, PROCEDURE=27, 
		STRING=28, NUMBER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "EQ", "NEQ", 
			"LESS", "GREATER", "ADD", "SUB", "MUL", "DIV", "WRITE", "WHILE", "DO", 
			"IF", "THEN", "ODD", "BEGIN", "END", "CALL", "CONST", "VAR", "PROCEDURE", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "STRING", 
			"NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "';'", "':='", "'?'", "'('", "')'", "'='", "'#'", 
			"'<'", "'>'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "EQ", "NEQ", "LESS", 
			"GREATER", "ADD", "SUB", "MUL", "DIV", "WRITE", "WHILE", "DO", "IF", 
			"THEN", "ODD", "BEGIN", "END", "CALL", "CONST", "VAR", "PROCEDURE", "STRING", 
			"NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Pl0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pl0.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\7\67\u0107\n\67\f\67\16\67\u010a\13\67\38\68\u010d\n8\r8\168\u010e\3"+
		"9\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2"+
		"a\2c\2e\2g\2i\2k\2m\36o\37q \3\2\37\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4"+
		"\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOo"+
		"o\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2"+
		"XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2"+
		"\2\13|\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3"+
		"\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2"+
		"\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0098\3\2\2\2%"+
		"\u009e\3\2\2\2\'\u00a1\3\2\2\2)\u00a4\3\2\2\2+\u00a9\3\2\2\2-\u00ad\3"+
		"\2\2\2/\u00b3\3\2\2\2\61\u00b7\3\2\2\2\63\u00bc\3\2\2\2\65\u00c2\3\2\2"+
		"\2\67\u00c6\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4\3\2\2\2?\u00d6"+
		"\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00de\3\2\2\2I"+
		"\u00e0\3\2\2\2K\u00e2\3\2\2\2M\u00e4\3\2\2\2O\u00e6\3\2\2\2Q\u00e8\3\2"+
		"\2\2S\u00ea\3\2\2\2U\u00ec\3\2\2\2W\u00ee\3\2\2\2Y\u00f0\3\2\2\2[\u00f2"+
		"\3\2\2\2]\u00f4\3\2\2\2_\u00f6\3\2\2\2a\u00f8\3\2\2\2c\u00fa\3\2\2\2e"+
		"\u00fc\3\2\2\2g\u00fe\3\2\2\2i\u0100\3\2\2\2k\u0102\3\2\2\2m\u0104\3\2"+
		"\2\2o\u010c\3\2\2\2q\u0110\3\2\2\2st\7\60\2\2t\4\3\2\2\2uv\7.\2\2v\6\3"+
		"\2\2\2wx\7=\2\2x\b\3\2\2\2yz\7<\2\2z{\7?\2\2{\n\3\2\2\2|}\7A\2\2}\f\3"+
		"\2\2\2~\177\7*\2\2\177\16\3\2\2\2\u0080\u0081\7+\2\2\u0081\20\3\2\2\2"+
		"\u0082\u0083\7?\2\2\u0083\22\3\2\2\2\u0084\u0085\7%\2\2\u0085\24\3\2\2"+
		"\2\u0086\u0087\7>\2\2\u0087\26\3\2\2\2\u0088\u0089\7@\2\2\u0089\30\3\2"+
		"\2\2\u008a\u008b\7-\2\2\u008b\32\3\2\2\2\u008c\u008d\7/\2\2\u008d\34\3"+
		"\2\2\2\u008e\u008f\7,\2\2\u008f\36\3\2\2\2\u0090\u0091\7\61\2\2\u0091"+
		" \3\2\2\2\u0092\u0093\5e\63\2\u0093\u0094\5[.\2\u0094\u0095\5I%\2\u0095"+
		"\u0096\5_\60\2\u0096\u0097\5A!\2\u0097\"\3\2\2\2\u0098\u0099\5e\63\2\u0099"+
		"\u009a\5G$\2\u009a\u009b\5I%\2\u009b\u009c\5O(\2\u009c\u009d\5A!\2\u009d"+
		"$\3\2\2\2\u009e\u009f\5? \2\u009f\u00a0\5U+\2\u00a0&\3\2\2\2\u00a1\u00a2"+
		"\5I%\2\u00a2\u00a3\5C\"\2\u00a3(\3\2\2\2\u00a4\u00a5\5_\60\2\u00a5\u00a6"+
		"\5G$\2\u00a6\u00a7\5A!\2\u00a7\u00a8\5S*\2\u00a8*\3\2\2\2\u00a9\u00aa"+
		"\5U+\2\u00aa\u00ab\5? \2\u00ab\u00ac\5? \2\u00ac,\3\2\2\2\u00ad\u00ae"+
		"\5;\36\2\u00ae\u00af\5A!\2\u00af\u00b0\5E#\2\u00b0\u00b1\5I%\2\u00b1\u00b2"+
		"\5S*\2\u00b2.\3\2\2\2\u00b3\u00b4\5A!\2\u00b4\u00b5\5S*\2\u00b5\u00b6"+
		"\5? \2\u00b6\60\3\2\2\2\u00b7\u00b8\5=\37\2\u00b8\u00b9\59\35\2\u00b9"+
		"\u00ba\5O(\2\u00ba\u00bb\5O(\2\u00bb\62\3\2\2\2\u00bc\u00bd\5=\37\2\u00bd"+
		"\u00be\5U+\2\u00be\u00bf\5S*\2\u00bf\u00c0\5]/\2\u00c0\u00c1\5_\60\2\u00c1"+
		"\64\3\2\2\2\u00c2\u00c3\5c\62\2\u00c3\u00c4\59\35\2\u00c4\u00c5\5[.\2"+
		"\u00c5\66\3\2\2\2\u00c6\u00c7\5W,\2\u00c7\u00c8\5[.\2\u00c8\u00c9\5U+"+
		"\2\u00c9\u00ca\5=\37\2\u00ca\u00cb\5A!\2\u00cb\u00cc\5? \2\u00cc\u00cd"+
		"\5a\61\2\u00cd\u00ce\5[.\2\u00ce\u00cf\5A!\2\u00cf8\3\2\2\2\u00d0\u00d1"+
		"\t\2\2\2\u00d1:\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3<\3\2\2\2\u00d4\u00d5"+
		"\t\4\2\2\u00d5>\3\2\2\2\u00d6\u00d7\t\5\2\2\u00d7@\3\2\2\2\u00d8\u00d9"+
		"\t\6\2\2\u00d9B\3\2\2\2\u00da\u00db\t\7\2\2\u00dbD\3\2\2\2\u00dc\u00dd"+
		"\t\b\2\2\u00ddF\3\2\2\2\u00de\u00df\t\t\2\2\u00dfH\3\2\2\2\u00e0\u00e1"+
		"\t\n\2\2\u00e1J\3\2\2\2\u00e2\u00e3\t\13\2\2\u00e3L\3\2\2\2\u00e4\u00e5"+
		"\t\f\2\2\u00e5N\3\2\2\2\u00e6\u00e7\t\r\2\2\u00e7P\3\2\2\2\u00e8\u00e9"+
		"\t\16\2\2\u00e9R\3\2\2\2\u00ea\u00eb\t\17\2\2\u00ebT\3\2\2\2\u00ec\u00ed"+
		"\t\20\2\2\u00edV\3\2\2\2\u00ee\u00ef\t\21\2\2\u00efX\3\2\2\2\u00f0\u00f1"+
		"\t\22\2\2\u00f1Z\3\2\2\2\u00f2\u00f3\t\23\2\2\u00f3\\\3\2\2\2\u00f4\u00f5"+
		"\t\24\2\2\u00f5^\3\2\2\2\u00f6\u00f7\t\25\2\2\u00f7`\3\2\2\2\u00f8\u00f9"+
		"\t\26\2\2\u00f9b\3\2\2\2\u00fa\u00fb\t\27\2\2\u00fbd\3\2\2\2\u00fc\u00fd"+
		"\t\30\2\2\u00fdf\3\2\2\2\u00fe\u00ff\t\31\2\2\u00ffh\3\2\2\2\u0100\u0101"+
		"\t\32\2\2\u0101j\3\2\2\2\u0102\u0103\t\33\2\2\u0103l\3\2\2\2\u0104\u0108"+
		"\t\34\2\2\u0105\u0107\t\34\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109n\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010b\u010d\t\35\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fp\3\2\2\2\u0110\u0111\t\36\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0113\b9\2\2\u0113r\3\2\2\2\5\2\u0108\u010e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
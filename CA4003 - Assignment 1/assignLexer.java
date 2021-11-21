// Generated from assign.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assignLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Constant=2, Return=3, Void=4, Main=5, If=6, Else=7, While=8, 
		Begin=9, End=10, Is=11, Integer=12, Boolean=13, Skipping=14, NEG=15, ASSIGN=16, 
		ADD=17, SEMI=18, MINUS=19, OR=20, AND=21, LBR=22, RBR=23, EQL=24, NEQL=25, 
		LESS=26, LESSEQ=27, GREATER=28, GREATEREQ=29, COLON=30, COMMA=31, BOOL=32, 
		ID=33, NUMBER=34, COMMENT=35, LINE_COMMENT=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Letter", "Digit", "Underscore", "A", "B", "C", "D", "E", "F", "G", "H", 
		"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
		"W", "X", "Y", "Z", "Variable", "Constant", "Return", "Void", "Main", 
		"If", "Else", "While", "Begin", "End", "Is", "Integer", "Boolean", "Skipping", 
		"NEG", "ASSIGN", "ADD", "SEMI", "MINUS", "OR", "AND", "LBR", "RBR", "EQL", 
		"NEQL", "LESS", "LESSEQ", "GREATER", "GREATEREQ", "COLON", "COMMA", "BOOL", 
		"ID", "NUMBER", "COMMENT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'~'", "':='", "'+'", "';'", "'-'", "'|'", "'&'", "'('", 
		"')'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Variable", "Constant", "Return", "Void", "Main", "If", "Else", 
		"While", "Begin", "End", "Is", "Integer", "Boolean", "Skipping", "NEG", 
		"ASSIGN", "ADD", "SEMI", "MINUS", "OR", "AND", "LBR", "RBR", "EQL", "NEQL", 
		"LESS", "LESSEQ", "GREATER", "GREATEREQ", "COLON", "COMMA", "BOOL", "ID", 
		"NUMBER", "COMMENT", "LINE_COMMENT", "WS"
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


	public assignLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "assign.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\39"+
		"\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0144"+
		"\n>\3?\3?\3?\3?\7?\u014a\n?\f?\16?\u014d\13?\3@\3@\7@\u0151\n@\f@\16@"+
		"\u0154\13@\3@\3@\3@\7@\u0159\n@\f@\16@\u015c\13@\5@\u015e\n@\3A\3A\3A"+
		"\3A\3A\7A\u0165\nA\fA\16A\u0168\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u0173"+
		"\nB\fB\16B\u0176\13B\3B\3B\3C\6C\u017b\nC\rC\16C\u017c\3C\3C\3\u0166\2"+
		"D\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\3?\4A\5C\6E\7G"+
		"\bI\tK\nM\13O\fQ\rS\16U\17W\20Y\21[\22]\23_\24a\25c\26e\27g\30i\31k\32"+
		"m\33o\34q\35s\36u\37w y!{\"}#\177$\u0081%\u0083&\u0085\'\3\2 \4\2C\\c"+
		"|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2"+
		"JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u016d\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2"+
		"\2\5\u0089\3\2\2\2\7\u008b\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r"+
		"\u0091\3\2\2\2\17\u0093\3\2\2\2\21\u0095\3\2\2\2\23\u0097\3\2\2\2\25\u0099"+
		"\3\2\2\2\27\u009b\3\2\2\2\31\u009d\3\2\2\2\33\u009f\3\2\2\2\35\u00a1\3"+
		"\2\2\2\37\u00a3\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'"+
		"\u00ab\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2"+
		"\2\2\61\u00b5\3\2\2\2\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2\67\u00bb\3\2\2"+
		"\29\u00bd\3\2\2\2;\u00bf\3\2\2\2=\u00c1\3\2\2\2?\u00ca\3\2\2\2A\u00d3"+
		"\3\2\2\2C\u00da\3\2\2\2E\u00df\3\2\2\2G\u00e4\3\2\2\2I\u00e7\3\2\2\2K"+
		"\u00ec\3\2\2\2M\u00f2\3\2\2\2O\u00f8\3\2\2\2Q\u00fc\3\2\2\2S\u00ff\3\2"+
		"\2\2U\u0107\3\2\2\2W\u010f\3\2\2\2Y\u0114\3\2\2\2[\u0116\3\2\2\2]\u0119"+
		"\3\2\2\2_\u011b\3\2\2\2a\u011d\3\2\2\2c\u011f\3\2\2\2e\u0121\3\2\2\2g"+
		"\u0123\3\2\2\2i\u0125\3\2\2\2k\u0127\3\2\2\2m\u0129\3\2\2\2o\u012c\3\2"+
		"\2\2q\u012e\3\2\2\2s\u0131\3\2\2\2u\u0133\3\2\2\2w\u0136\3\2\2\2y\u0138"+
		"\3\2\2\2{\u0143\3\2\2\2}\u0145\3\2\2\2\177\u015d\3\2\2\2\u0081\u015f\3"+
		"\2\2\2\u0083\u016e\3\2\2\2\u0085\u017a\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\4\3\2\2\2\u0089\u008a\t\3\2\2\u008a\6\3\2\2\2\u008b\u008c\7a\2\2\u008c"+
		"\b\3\2\2\2\u008d\u008e\t\4\2\2\u008e\n\3\2\2\2\u008f\u0090\t\5\2\2\u0090"+
		"\f\3\2\2\2\u0091\u0092\t\6\2\2\u0092\16\3\2\2\2\u0093\u0094\t\7\2\2\u0094"+
		"\20\3\2\2\2\u0095\u0096\t\b\2\2\u0096\22\3\2\2\2\u0097\u0098\t\t\2\2\u0098"+
		"\24\3\2\2\2\u0099\u009a\t\n\2\2\u009a\26\3\2\2\2\u009b\u009c\t\13\2\2"+
		"\u009c\30\3\2\2\2\u009d\u009e\t\f\2\2\u009e\32\3\2\2\2\u009f\u00a0\t\r"+
		"\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\t\16\2\2\u00a2\36\3\2\2\2\u00a3\u00a4"+
		"\t\17\2\2\u00a4 \3\2\2\2\u00a5\u00a6\t\20\2\2\u00a6\"\3\2\2\2\u00a7\u00a8"+
		"\t\21\2\2\u00a8$\3\2\2\2\u00a9\u00aa\t\22\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\t\23\2\2\u00ac(\3\2\2\2\u00ad\u00ae\t\24\2\2\u00ae*\3\2\2\2\u00af\u00b0"+
		"\t\25\2\2\u00b0,\3\2\2\2\u00b1\u00b2\t\26\2\2\u00b2.\3\2\2\2\u00b3\u00b4"+
		"\t\27\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\t\30\2\2\u00b6\62\3\2\2\2\u00b7"+
		"\u00b8\t\31\2\2\u00b8\64\3\2\2\2\u00b9\u00ba\t\32\2\2\u00ba\66\3\2\2\2"+
		"\u00bb\u00bc\t\33\2\2\u00bc8\3\2\2\2\u00bd\u00be\t\34\2\2\u00be:\3\2\2"+
		"\2\u00bf\u00c0\t\35\2\2\u00c0<\3\2\2\2\u00c1\u00c2\5\63\32\2\u00c2\u00c3"+
		"\5\t\5\2\u00c3\u00c4\5+\26\2\u00c4\u00c5\5\31\r\2\u00c5\u00c6\5\t\5\2"+
		"\u00c6\u00c7\5\13\6\2\u00c7\u00c8\5\37\20\2\u00c8\u00c9\5\21\t\2\u00c9"+
		">\3\2\2\2\u00ca\u00cb\5\r\7\2\u00cb\u00cc\5%\23\2\u00cc\u00cd\5#\22\2"+
		"\u00cd\u00ce\5-\27\2\u00ce\u00cf\5/\30\2\u00cf\u00d0\5\t\5\2\u00d0\u00d1"+
		"\5#\22\2\u00d1\u00d2\5/\30\2\u00d2@\3\2\2\2\u00d3\u00d4\5+\26\2\u00d4"+
		"\u00d5\5\21\t\2\u00d5\u00d6\5/\30\2\u00d6\u00d7\5\61\31\2\u00d7\u00d8"+
		"\5+\26\2\u00d8\u00d9\5#\22\2\u00d9B\3\2\2\2\u00da\u00db\5\63\32\2\u00db"+
		"\u00dc\5%\23\2\u00dc\u00dd\5\31\r\2\u00dd\u00de\5\17\b\2\u00deD\3\2\2"+
		"\2\u00df\u00e0\5!\21\2\u00e0\u00e1\5\t\5\2\u00e1\u00e2\5\31\r\2\u00e2"+
		"\u00e3\5#\22\2\u00e3F\3\2\2\2\u00e4\u00e5\5\31\r\2\u00e5\u00e6\5\23\n"+
		"\2\u00e6H\3\2\2\2\u00e7\u00e8\5\21\t\2\u00e8\u00e9\5\37\20\2\u00e9\u00ea"+
		"\5-\27\2\u00ea\u00eb\5\21\t\2\u00ebJ\3\2\2\2\u00ec\u00ed\5\65\33\2\u00ed"+
		"\u00ee\5\27\f\2\u00ee\u00ef\5\31\r\2\u00ef\u00f0\5\37\20\2\u00f0\u00f1"+
		"\5\21\t\2\u00f1L\3\2\2\2\u00f2\u00f3\5\13\6\2\u00f3\u00f4\5\21\t\2\u00f4"+
		"\u00f5\5\25\13\2\u00f5\u00f6\5\31\r\2\u00f6\u00f7\5#\22\2\u00f7N\3\2\2"+
		"\2\u00f8\u00f9\5\21\t\2\u00f9\u00fa\5#\22\2\u00fa\u00fb\5\17\b\2\u00fb"+
		"P\3\2\2\2\u00fc\u00fd\5\31\r\2\u00fd\u00fe\5-\27\2\u00feR\3\2\2\2\u00ff"+
		"\u0100\5\31\r\2\u0100\u0101\5#\22\2\u0101\u0102\5/\30\2\u0102\u0103\5"+
		"\21\t\2\u0103\u0104\5\25\13\2\u0104\u0105\5\21\t\2\u0105\u0106\5+\26\2"+
		"\u0106T\3\2\2\2\u0107\u0108\5\13\6\2\u0108\u0109\5%\23\2\u0109\u010a\5"+
		"%\23\2\u010a\u010b\5\37\20\2\u010b\u010c\5\21\t\2\u010c\u010d\5\t\5\2"+
		"\u010d\u010e\5#\22\2\u010eV\3\2\2\2\u010f\u0110\5-\27\2\u0110\u0111\5"+
		"\35\17\2\u0111\u0112\5\31\r\2\u0112\u0113\5\'\24\2\u0113X\3\2\2\2\u0114"+
		"\u0115\7\u0080\2\2\u0115Z\3\2\2\2\u0116\u0117\7<\2\2\u0117\u0118\7?\2"+
		"\2\u0118\\\3\2\2\2\u0119\u011a\7-\2\2\u011a^\3\2\2\2\u011b\u011c\7=\2"+
		"\2\u011c`\3\2\2\2\u011d\u011e\7/\2\2\u011eb\3\2\2\2\u011f\u0120\7~\2\2"+
		"\u0120d\3\2\2\2\u0121\u0122\7(\2\2\u0122f\3\2\2\2\u0123\u0124\7*\2\2\u0124"+
		"h\3\2\2\2\u0125\u0126\7+\2\2\u0126j\3\2\2\2\u0127\u0128\7?\2\2\u0128l"+
		"\3\2\2\2\u0129\u012a\7#\2\2\u012a\u012b\7?\2\2\u012bn\3\2\2\2\u012c\u012d"+
		"\7>\2\2\u012dp\3\2\2\2\u012e\u012f\7>\2\2\u012f\u0130\7?\2\2\u0130r\3"+
		"\2\2\2\u0131\u0132\7@\2\2\u0132t\3\2\2\2\u0133\u0134\7@\2\2\u0134\u0135"+
		"\7?\2\2\u0135v\3\2\2\2\u0136\u0137\7<\2\2\u0137x\3\2\2\2\u0138\u0139\7"+
		".\2\2\u0139z\3\2\2\2\u013a\u013b\7v\2\2\u013b\u013c\7t\2\2\u013c\u013d"+
		"\7w\2\2\u013d\u0144\7g\2\2\u013e\u013f\7h\2\2\u013f\u0140\7c\2\2\u0140"+
		"\u0141\7n\2\2\u0141\u0142\7u\2\2\u0142\u0144\7g\2\2\u0143\u013a\3\2\2"+
		"\2\u0143\u013e\3\2\2\2\u0144|\3\2\2\2\u0145\u014b\5\3\2\2\u0146\u014a"+
		"\5\3\2\2\u0147\u014a\5\177@\2\u0148\u014a\5\7\4\2\u0149\u0146\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c~\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0152\5\5\3\2\u014f\u0151\5\5\3\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015e\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\5a\61\2\u0156\u015a\5\5\3\2\u0157\u0159\5\5"+
		"\3\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u014e\3\2"+
		"\2\2\u015d\u0155\3\2\2\2\u015e\u0080\3\2\2\2\u015f\u0160\7\61\2\2\u0160"+
		"\u0161\7,\2\2\u0161\u0166\3\2\2\2\u0162\u0165\5\u0081A\2\u0163\u0165\13"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016a\7,\2\2\u016a\u016b\7\61\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\bA\2\2\u016d\u0082\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\61"+
		"\2\2\u0170\u0174\3\2\2\2\u0171\u0173\n\36\2\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0177\u0178\bB\2\2\u0178\u0084\3\2\2\2\u0179"+
		"\u017b\t\37\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\bC\2\2\u017f"+
		"\u0086\3\2\2\2\r\2\u0143\u0149\u014b\u0152\u015a\u015d\u0164\u0166\u0174"+
		"\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
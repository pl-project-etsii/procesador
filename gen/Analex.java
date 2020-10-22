// Generated from /root/IdeaProjects/procesador/src/Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, VARIABLES=5, ASIGNACIONES=6, 
		LOG=7, SEQ=8, NUMERO=9, IDENT=10, PA=11, PC=12, PyC=13, COMA=14, DP=15, 
		MAS=16, MENOS=17, POR=18, IGUAL=19, TRUE=20, FALSE=21, COMENTARIO_BLOQUE=22, 
		COMENTARIO_LINEA=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "NUM", "VARIABLES", 
			"ASIGNACIONES", "LOG", "SEQ", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", 
			"DP", "MAS", "MENOS", "POR", "IGUAL", "TRUE", "FALSE", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'VARIABLES'", "'ASIGNACIONES'", 
			"'LOG'", "'SEQ'", null, null, "'('", "')'", "';'", "','", "':'", "'+'", 
			"'-'", "'*'", "'='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "VARIABLES", "ASIGNACIONES", 
			"LOG", "SEQ", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", "DP", "MAS", 
			"MENOS", "POR", "IGUAL", "TRUE", "FALSE", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4?\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\5\fm\n\f\3\f\6\fp\n\f\r\f\16\fq\3\r\3\r"+
		"\3\r\7\rw\n\r\f\r\16\rz\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u009d\n\31"+
		"\f\31\16\31\u00a0\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7"+
		"\32\u00ab\n\32\f\32\16\32\u00ae\13\32\3\32\3\32\3\32\3\32\4\u009e\u00ac"+
		"\2\33\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\3\2\4\3\2\62;\4"+
		"\2C\\c|\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7>\3\2\2\2\tD\3\2\2\2\13F\3"+
		"\2\2\2\rH\3\2\2\2\17L\3\2\2\2\21V\3\2\2\2\23c\3\2\2\2\25g\3\2\2\2\27l"+
		"\3\2\2\2\31s\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2"+
		"\2\2#\u0083\3\2\2\2%\u0085\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b"+
		"\3\2\2\2-\u008d\3\2\2\2/\u0092\3\2\2\2\61\u0098\3\2\2\2\63\u00a6\3\2\2"+
		"\2\65\66\7\"\2\2\66\67\3\2\2\2\678\b\2\2\28\4\3\2\2\29:\7\13\2\2:;\3\2"+
		"\2\2;<\b\3\2\2<\6\3\2\2\2=?\7\17\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7"+
		"\f\2\2AB\3\2\2\2BC\b\4\2\2C\b\3\2\2\2DE\t\2\2\2E\n\3\2\2\2FG\t\3\2\2G"+
		"\f\3\2\2\2HI\7P\2\2IJ\7W\2\2JK\7O\2\2K\16\3\2\2\2LM\7X\2\2MN\7C\2\2NO"+
		"\7T\2\2OP\7K\2\2PQ\7C\2\2QR\7D\2\2RS\7N\2\2ST\7G\2\2TU\7U\2\2U\20\3\2"+
		"\2\2VW\7C\2\2WX\7U\2\2XY\7K\2\2YZ\7I\2\2Z[\7P\2\2[\\\7C\2\2\\]\7E\2\2"+
		"]^\7K\2\2^_\7Q\2\2_`\7P\2\2`a\7G\2\2ab\7U\2\2b\22\3\2\2\2cd\7N\2\2de\7"+
		"Q\2\2ef\7I\2\2f\24\3\2\2\2gh\7U\2\2hi\7G\2\2ij\7S\2\2j\26\3\2\2\2km\7"+
		"/\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\t\5\2on\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2r\30\3\2\2\2sx\5\13\6\2tw\5\13\6\2uw\5\t\5\2vt\3\2\2\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\32\3\2\2\2zx\3\2\2\2{|\7*\2"+
		"\2|\34\3\2\2\2}~\7+\2\2~\36\3\2\2\2\177\u0080\7=\2\2\u0080 \3\2\2\2\u0081"+
		"\u0082\7.\2\2\u0082\"\3\2\2\2\u0083\u0084\7<\2\2\u0084$\3\2\2\2\u0085"+
		"\u0086\7-\2\2\u0086&\3\2\2\2\u0087\u0088\7/\2\2\u0088(\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a*\3\2\2\2\u008b\u008c\7?\2\2\u008c,\3\2\2\2\u008d\u008e\7"+
		"v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090\u0091\7g\2\2\u0091."+
		"\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\60\3\2\2\2\u0098\u0099\7\61\2\2"+
		"\u0099\u009a\7,\2\2\u009a\u009e\3\2\2\2\u009b\u009d\13\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\61"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\31\2\2\u00a5\62\3\2\2\2\u00a6\u00a7"+
		"\7\61\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\13\2\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\7\4\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\b\32\2\2\u00b2\64\3\2\2\2\n\2>lqvx\u009e\u00ac"+
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
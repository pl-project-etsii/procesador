// Generated from C:/Users/enri7/IdeaProjects/ProyectoPL/src\Analex.g4 by ANTLR 4.8
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
		MAS=16, MENOS=17, POR=18, IGUAL=19, CA=20, CC=21, TRUE=22, FALSE=23, NO=24, 
		COMENTARIO_BLOQUE=25, COMENTARIO_LINEA=26;
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
			"DP", "MAS", "MENOS", "POR", "IGUAL", "CA", "CC", "TRUE", "FALSE", "NO", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'VARIABLES'", "'ASIGNACIONES'", 
			"'LOG'", "'SEQ'", null, null, "'('", "')'", "';'", "','", "':'", "'+'", 
			"'-'", "'*'", "'='", "'['", "']'", "'true'", "'false'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "VARIABLES", "ASIGNACIONES", 
			"LOG", "SEQ", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", "DP", "MAS", 
			"MENOS", "POR", "IGUAL", "CA", "CC", "TRUE", "FALSE", "NO", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\5\fs\n"+
		"\f\3\f\6\fv\n\f\r\f\16\fw\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00ab"+
		"\n\34\f\34\16\34\u00ae\13\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\7\35\u00b9\n\35\f\35\16\35\u00bc\13\35\3\35\3\35\3\35\3\35\4\u00ac"+
		"\u00ba\2\36\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34\3\2\4\3\2\62;\4\2C\\c|\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\3;\3\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2"+
		"\2\17R\3\2\2\2\21\\\3\2\2\2\23i\3\2\2\2\25m\3\2\2\2\27r\3\2\2\2\31y\3"+
		"\2\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2"+
		"\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0091"+
		"\3\2\2\2-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u009c\3\2\2"+
		"\2\65\u00a2\3\2\2\2\67\u00a6\3\2\2\29\u00b4\3\2\2\2;<\7\"\2\2<=\3\2\2"+
		"\2=>\b\2\2\2>\4\3\2\2\2?@\7\13\2\2@A\3\2\2\2AB\b\3\2\2B\6\3\2\2\2CE\7"+
		"\17\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\f\2\2GH\3\2\2\2HI\b\4\2\2I\b"+
		"\3\2\2\2JK\t\2\2\2K\n\3\2\2\2LM\t\3\2\2M\f\3\2\2\2NO\7P\2\2OP\7W\2\2P"+
		"Q\7O\2\2Q\16\3\2\2\2RS\7X\2\2ST\7C\2\2TU\7T\2\2UV\7K\2\2VW\7C\2\2WX\7"+
		"D\2\2XY\7N\2\2YZ\7G\2\2Z[\7U\2\2[\20\3\2\2\2\\]\7C\2\2]^\7U\2\2^_\7K\2"+
		"\2_`\7I\2\2`a\7P\2\2ab\7C\2\2bc\7E\2\2cd\7K\2\2de\7Q\2\2ef\7P\2\2fg\7"+
		"G\2\2gh\7U\2\2h\22\3\2\2\2ij\7N\2\2jk\7Q\2\2kl\7I\2\2l\24\3\2\2\2mn\7"+
		"U\2\2no\7G\2\2op\7S\2\2p\26\3\2\2\2qs\7/\2\2rq\3\2\2\2rs\3\2\2\2su\3\2"+
		"\2\2tv\5\t\5\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\30\3\2\2\2y~\5"+
		"\13\6\2z}\5\13\6\2{}\5\t\5\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\32\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7*\2\2\u0082"+
		"\34\3\2\2\2\u0083\u0084\7+\2\2\u0084\36\3\2\2\2\u0085\u0086\7=\2\2\u0086"+
		" \3\2\2\2\u0087\u0088\7.\2\2\u0088\"\3\2\2\2\u0089\u008a\7<\2\2\u008a"+
		"$\3\2\2\2\u008b\u008c\7-\2\2\u008c&\3\2\2\2\u008d\u008e\7/\2\2\u008e("+
		"\3\2\2\2\u008f\u0090\7,\2\2\u0090*\3\2\2\2\u0091\u0092\7?\2\2\u0092,\3"+
		"\2\2\2\u0093\u0094\7]\2\2\u0094.\3\2\2\2\u0095\u0096\7_\2\2\u0096\60\3"+
		"\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7w\2\2\u009a"+
		"\u009b\7g\2\2\u009b\62\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\64\3\2\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7v\2\2\u00a5\66\3\2\2\2\u00a6"+
		"\u00a7\7\61\2\2\u00a7\u00a8\7,\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\13"+
		"\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7,"+
		"\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\34\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00ba\3\2\2"+
		"\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\5\7\4\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\35\2\2\u00c0"+
		":\3\2\2\2\n\2Drw|~\u00ac\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/casto/IdeaProjects/procesador/out/production/procesador\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, VARIABLES=5, LOG=6, SEQ=7, 
		NUMERO=8, IDENT=9, PA=10, PC=11, PyC=12, COMA=13, DP=14, MAS=15, MENOS=16, 
		POR=17, COMENTARIO_BLOQUE=18, COMENTARIO_LINEA=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "NUM", "VARIABLES", 
			"LOG", "SEQ", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", "DP", "MAS", 
			"MENOS", "POR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'VARIABLES'", "'LOG'", "'SEQ'", 
			null, null, "'('", "')'", "';'", "','", "':'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "VARIABLES", "LOG", 
			"SEQ", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", "DP", "MAS", "MENOS", 
			"POR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\5\13X\n\13\3\13\6\13[\n\13\r\13\16\13\\\3\f\3\f\3\f\7\fb\n\f"+
		"\f\f\16\fe\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25{\n\25\f\25\16\25~\13"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0089\n\26\f\26"+
		"\16\26\u008c\13\26\3\26\3\26\3\26\3\26\4|\u008a\2\27\3\3\5\4\7\5\t\2\13"+
		"\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25\3\2\4\3\2\62;\4\2C\\c|\2\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2"+
		"\2\2\5\61\3\2\2\2\7\66\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17D\3"+
		"\2\2\2\21N\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27^\3\2\2\2\31f\3\2\2\2\33"+
		"h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2"+
		"\2\2)v\3\2\2\2+\u0084\3\2\2\2-.\7\"\2\2./\3\2\2\2/\60\b\2\2\2\60\4\3\2"+
		"\2\2\61\62\7\13\2\2\62\63\3\2\2\2\63\64\b\3\2\2\64\6\3\2\2\2\65\67\7\17"+
		"\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\f\2\29:\3\2\2\2:;\b\4"+
		"\2\2;\b\3\2\2\2<=\t\2\2\2=\n\3\2\2\2>?\t\3\2\2?\f\3\2\2\2@A\7P\2\2AB\7"+
		"W\2\2BC\7O\2\2C\16\3\2\2\2DE\7X\2\2EF\7C\2\2FG\7T\2\2GH\7K\2\2HI\7C\2"+
		"\2IJ\7D\2\2JK\7N\2\2KL\7G\2\2LM\7U\2\2M\20\3\2\2\2NO\7N\2\2OP\7Q\2\2P"+
		"Q\7I\2\2Q\22\3\2\2\2RS\7U\2\2ST\7G\2\2TU\7S\2\2U\24\3\2\2\2VX\7/\2\2W"+
		"V\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\t\5\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]\26\3\2\2\2^c\5\13\6\2_b\5\13\6\2`b\5\t\5\2a_\3\2\2\2a`"+
		"\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\30\3\2\2\2ec\3\2\2\2fg\7*\2\2"+
		"g\32\3\2\2\2hi\7+\2\2i\34\3\2\2\2jk\7=\2\2k\36\3\2\2\2lm\7.\2\2m \3\2"+
		"\2\2no\7<\2\2o\"\3\2\2\2pq\7-\2\2q$\3\2\2\2rs\7/\2\2s&\3\2\2\2tu\7,\2"+
		"\2u(\3\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2"+
		"\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080"+
		"\u0081\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\25\2\2\u0083*\3\2\2"+
		"\2\u0084\u0085\7\61\2\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2\2\2\u0087"+
		"\u0089\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\5\7\4\2\u008e\u008f\3\2\2\2\u008f\u0090\b\26\2\2\u0090,\3\2\2\2"+
		"\n\2\66W\\ac|\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
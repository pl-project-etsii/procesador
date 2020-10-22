// Generated from C:/Users/casto/IdeaProjects/procesador/out/production/procesador\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, VARIABLES=5, LOG=6, SEQ=7, 
		NUMERO=8, IDENT=9, PA=10, PC=11, PyC=12, COMA=13, DP=14, MAS=15, MENOS=16, 
		POR=17, COMENTARIO_BLOQUE=18, COMENTARIO_LINEA=19;
	public static final int
		RULE_sentencia = 0, RULE_variables = 1, RULE_lista_variables = 2, RULE_tipo = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "variables", "lista_variables", "tipo"
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

	@Override
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SentenciaContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			variables();
			setState(9);
			match(EOF);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public List<Lista_variablesContext> lista_variables() {
			return getRuleContexts(Lista_variablesContext.class);
		}
		public Lista_variablesContext lista_variables(int i) {
			return getRuleContext(Lista_variablesContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(VARIABLES);
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				lista_variables();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class Lista_variablesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Lista_variablesContext lista_variables() {
			return getRuleContext(Lista_variablesContext.class,0);
		}
		public TerminalNode DP() { return getToken(Anasint.DP, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public Lista_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLista_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLista_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLista_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_variablesContext lista_variables() throws RecognitionException {
		Lista_variablesContext _localctx = new Lista_variablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lista_variables);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(IDENT);
				setState(18);
				match(COMA);
				setState(19);
				lista_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(IDENT);
				setState(21);
				match(DP);
				setState(22);
				tipo();
				setState(23);
				match(PyC);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode SEQ() { return getToken(Anasint.SEQ, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode LOG() { return getToken(Anasint.LOG, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(SEQ);
				setState(28);
				match(PA);
				setState(29);
				tipo();
				setState(30);
				match(PC);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(NUM);
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(LOG);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\6\3\20\n\3\r\3\16\3\21\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"%\n\5\3\5\2\2\6\2\4\6\b\2\2\2&\2\n\3\2\2\2\4\r\3\2\2\2\6\33\3\2\2\2\b"+
		"$\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\3\3\2\2\2\r\17\7\7\2\2\16\20\5\6"+
		"\4\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\5\3\2"+
		"\2\2\23\24\7\13\2\2\24\25\7\17\2\2\25\34\5\6\4\2\26\27\7\13\2\2\27\30"+
		"\7\20\2\2\30\31\5\b\5\2\31\32\7\16\2\2\32\34\3\2\2\2\33\23\3\2\2\2\33"+
		"\26\3\2\2\2\34\7\3\2\2\2\35\36\7\t\2\2\36\37\7\f\2\2\37 \5\b\5\2 !\7\r"+
		"\2\2!%\3\2\2\2\"%\7\6\2\2#%\7\b\2\2$\35\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%"+
		"\t\3\2\2\2\5\21\33$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/bea/IdeaProjects/procesador/src/Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, VARIABLES=5, ASIGNACIONES=6, 
		LOG=7, SEQ=8, NUMERO=9, IDENT=10, MAYORQ=11, MENORQ=12, PA=13, PC=14, 
		BA=15, BC=16, PyC=17, COMA=18, DP=19, MAS=20, MENOS=21, POR=22, IGUAL=23, 
		TRUE=24, FALSE=25, WHILE=26, COMENTARIO_BLOQUE=27, COMENTARIO_LINEA=28, 
		NO=29, VAR=30;
	public static final int
		RULE_sentencia = 0, RULE_variables = 1, RULE_lista_variables = 2, RULE_tipo = 3, 
		RULE_asignaciones = 4, RULE_asignacion = 5, RULE_expresion = 6, RULE_funcion_entera = 7, 
		RULE_expresion_entera = 8, RULE_expresion_logica = 9, RULE_expresion_no_elemental = 10, 
		RULE_secuencia = 11, RULE_stat = 12, RULE_relational = 13, RULE_loop = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "variables", "lista_variables", "tipo", "asignaciones", 
			"asignacion", "expresion", "funcion_entera", "expresion_entera", "expresion_logica", 
			"expresion_no_elemental", "secuencia", "stat", "relational", "loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'VARIABLES'", "'ASIGNACIONES'", 
			"'LOG'", "'SEQ'", null, null, "'>'", "'<'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "':'", "'+'", "'-'", "'*'", "'='", "'true'", "'false'", 
			"'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "VARIABLES", "ASIGNACIONES", 
			"LOG", "SEQ", "NUMERO", "IDENT", "MAYORQ", "MENORQ", "PA", "PC", "BA", 
			"BC", "PyC", "COMA", "DP", "MAS", "MENOS", "POR", "IGUAL", "TRUE", "FALSE", 
			"WHILE", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", "NO", "VAR"
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
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
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
			setState(30);
			variables();
			setState(31);
			asignaciones();
			setState(32);
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
			setState(34);
			match(VARIABLES);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				lista_variables();
				}
				}
				setState(38); 
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(IDENT);
				setState(41);
				match(COMA);
				setState(42);
				lista_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(IDENT);
				setState(44);
				match(DP);
				setState(45);
				tipo();
				setState(46);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(SEQ);
				setState(51);
				match(PA);
				setState(52);
				tipo();
				setState(53);
				match(PC);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(NUM);
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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

	public static class AsignacionesContext extends ParserRuleContext {
		public TerminalNode ASIGNACIONES() { return getToken(Anasint.ASIGNACIONES, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ASIGNACIONES);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(60);
				asignacion();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENT);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(67);
				match(COMA);
				setState(68);
				match(IDENT);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(IGUAL);
			setState(75);
			expresion();
			setState(76);
			match(PyC);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_no_elementalContext expresion_no_elemental() {
			return getRuleContext(Expresion_no_elementalContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expresion);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case IDENT:
			case PyC:
			case COMA:
			case MAS:
			case MENOS:
			case POR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				expresion_entera();
				}
				break;
			case TRUE:
			case FALSE:
			case NO:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				expresion_logica();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				expresion_no_elemental();
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

	public static class Funcion_enteraContext extends ParserRuleContext {
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public Funcion_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterFuncion_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitFuncion_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitFuncion_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_enteraContext funcion_entera() throws RecognitionException {
		Funcion_enteraContext _localctx = new Funcion_enteraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcion_entera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Expresion_enteraContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public Funcion_enteraContext funcion_entera() {
			return getRuleContext(Funcion_enteraContext.class,0);
		}
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public List<Expresion_enteraContext> expresion_entera() {
			return getRuleContexts(Expresion_enteraContext.class);
		}
		public Expresion_enteraContext expresion_entera(int i) {
			return getRuleContext(Expresion_enteraContext.class,i);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Expresion_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_enteraContext expresion_entera() throws RecognitionException {
		Expresion_enteraContext _localctx = new Expresion_enteraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresion_entera);
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(NUMERO);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(IDENT);
				}
				break;
			case MAS:
			case MENOS:
			case POR:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				funcion_entera();
				setState(88);
				match(PA);
				setState(89);
				expresion_entera();
				setState(90);
				match(PC);
				}
				break;
			case EOF:
			case PC:
			case PyC:
			case COMA:
			case TRUE:
			case FALSE:
			case NO:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						match(COMA);
						setState(93);
						expresion_entera();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
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

	public static class Expresion_logicaContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Anasint.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Anasint.FALSE, 0); }
		public TerminalNode NO() { return getToken(Anasint.NO, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion_logica);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(FALSE);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(NO);
				setState(104);
				match(PA);
				{
				setState(105);
				expresion_logica();
				}
				setState(106);
				match(PC);
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

	public static class Expresion_no_elementalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Anasint.VAR, 0); }
		public Expresion_no_elementalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_no_elemental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion_no_elemental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion_no_elemental(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion_no_elemental(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_no_elementalContext expresion_no_elemental() throws RecognitionException {
		Expresion_no_elementalContext _localctx = new Expresion_no_elementalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion_no_elemental);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VAR);
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

	public static class SecuenciaContext extends ParserRuleContext {
		public List<Expresion_enteraContext> expresion_entera() {
			return getRuleContexts(Expresion_enteraContext.class);
		}
		public Expresion_enteraContext expresion_entera(int i) {
			return getRuleContext(Expresion_enteraContext.class,i);
		}
		public List<Expresion_logicaContext> expresion_logica() {
			return getRuleContexts(Expresion_logicaContext.class);
		}
		public Expresion_logicaContext expresion_logica(int i) {
			return getRuleContext(Expresion_logicaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public SecuenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecuenciaContext secuencia() throws RecognitionException {
		SecuenciaContext _localctx = new SecuenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_secuencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(112);
				expresion_entera();
				}
				break;
			case 2:
				{
				setState(113);
				expresion_logica();
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMA) | (1L << TRUE) | (1L << FALSE) | (1L << NO))) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMA:
					{
					setState(116);
					match(COMA);
					setState(117);
					expresion_entera();
					}
					break;
				case TRUE:
				case FALSE:
				case NO:
					{
					setState(118);
					expresion_logica();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode FIN_LINEA() { return getToken(Anasint.FIN_LINEA, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLES:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				variables();
				setState(125);
				match(FIN_LINEA);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(IDENT);
				setState(128);
				match(IGUAL);
				setState(129);
				variables();
				setState(130);
				match(PyC);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				loop();
				setState(133);
				match(FIN_LINEA);
				}
				break;
			case FIN_LINEA:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(FIN_LINEA);
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

	public static class RelationalContext extends ParserRuleContext {
		public Token op;
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode MAYORQ() { return getToken(Anasint.MAYORQ, 0); }
		public TerminalNode MENORQ() { return getToken(Anasint.MENORQ, 0); }
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			variables();
			setState(139);
			((RelationalContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MAYORQ || _la==MENORQ) ) {
				((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			variables();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Anasint.WHILE, 0); }
		public List<TerminalNode> PA() { return getTokens(Anasint.PA); }
		public TerminalNode PA(int i) {
			return getToken(Anasint.PA, i);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode BA() { return getToken(Anasint.BA, 0); }
		public TerminalNode BC() { return getToken(Anasint.BC, 0); }
		public TerminalNode FIN_LINEA() { return getToken(Anasint.FIN_LINEA, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE);
			setState(143);
			match(PA);
			setState(144);
			expresion_logica();
			setState(145);
			match(PA);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIN_LINEA) {
				{
				setState(146);
				match(FIN_LINEA);
				}
			}

			setState(149);
			match(BA);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIN_LINEA) | (1L << VARIABLES) | (1L << IDENT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(150);
				stat();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(BC);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3"+
		"\7\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bT\n"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\na\n\n\f\n\16\nd\13\n"+
		"\5\nf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\f\3\f\3\r\3"+
		"\r\5\ru\n\r\3\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\20\3\20\7\20\u009a\n"+
		"\20\f\20\16\20\u009d\13\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\4\3\2\26\30\3\2\r\16\2\u00a7\2 \3\2\2\2\4$\3\2\2"+
		"\2\6\62\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\fD\3\2\2\2\16S\3\2\2\2\20U\3\2\2"+
		"\2\22e\3\2\2\2\24n\3\2\2\2\26p\3\2\2\2\30t\3\2\2\2\32\u008a\3\2\2\2\34"+
		"\u008c\3\2\2\2\36\u0090\3\2\2\2 !\5\4\3\2!\"\5\n\6\2\"#\7\2\2\3#\3\3\2"+
		"\2\2$&\7\7\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5"+
		"\3\2\2\2*+\7\f\2\2+,\7\24\2\2,\63\5\6\4\2-.\7\f\2\2./\7\25\2\2/\60\5\b"+
		"\5\2\60\61\7\23\2\2\61\63\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\63\7\3\2\2\2"+
		"\64\65\7\n\2\2\65\66\7\17\2\2\66\67\5\b\5\2\678\7\20\2\28<\3\2\2\29<\7"+
		"\6\2\2:<\7\t\2\2;\64\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\t\3\2\2\2=A\7\b\2\2"+
		">@\5\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CA\3\2\2"+
		"\2DI\7\f\2\2EF\7\24\2\2FH\7\f\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KI\3\2\2\2LM\7\31\2\2MN\5\16\b\2NO\7\23\2\2O\r\3\2\2\2P"+
		"T\5\22\n\2QT\5\24\13\2RT\5\26\f\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\17\3"+
		"\2\2\2UV\t\2\2\2V\21\3\2\2\2Wf\7\13\2\2Xf\7\f\2\2YZ\5\20\t\2Z[\7\17\2"+
		"\2[\\\5\22\n\2\\]\7\20\2\2]f\3\2\2\2^_\7\24\2\2_a\5\22\n\2`^\3\2\2\2a"+
		"d\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eW\3\2\2\2eX\3\2\2\2"+
		"eY\3\2\2\2eb\3\2\2\2f\23\3\2\2\2go\7\32\2\2ho\7\33\2\2ij\7\37\2\2jk\7"+
		"\17\2\2kl\5\24\13\2lm\7\20\2\2mo\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2"+
		"o\25\3\2\2\2pq\7 \2\2q\27\3\2\2\2ru\5\22\n\2su\5\24\13\2tr\3\2\2\2ts\3"+
		"\2\2\2u{\3\2\2\2vw\7\24\2\2wz\5\22\n\2xz\5\24\13\2yv\3\2\2\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\31\3\2\2\2}{\3\2\2\2~\177\5\4\3\2\177"+
		"\u0080\7\5\2\2\u0080\u008b\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\31"+
		"\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7\23\2\2\u0085\u008b\3\2\2\2\u0086"+
		"\u0087\5\36\20\2\u0087\u0088\7\5\2\2\u0088\u008b\3\2\2\2\u0089\u008b\7"+
		"\5\2\2\u008a~\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\33\3\2\2\2\u008c\u008d\5\4\3\2\u008d\u008e\t\3\2\2\u008e"+
		"\u008f\5\4\3\2\u008f\35\3\2\2\2\u0090\u0091\7\34\2\2\u0091\u0092\7\17"+
		"\2\2\u0092\u0093\5\24\13\2\u0093\u0095\7\17\2\2\u0094\u0096\7\5\2\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009b\7\21"+
		"\2\2\u0098\u009a\5\32\16\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\7\22\2\2\u009f\37\3\2\2\2\21(\62;AISbenty{\u008a\u0095"+
		"\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
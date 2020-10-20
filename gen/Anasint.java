// Generated from C:/Users/casto/IdeaProjects/procesador/src\Anasint.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, CIERTO=4, FALSO=5, ENTERO=6, BOOLEANO=7, 
		Y=8, O=9, NO=10, NUMERO=11, IDENT=12, PA=13, PC=14, PyC=15, COMA=16, ASIG=17, 
		MAYOR=18, MENOR=19, IGUAL=20, MAS=21, MENOS=22, POR=23, DIV=24, COMENTARIO_BLOQUE=25, 
		COMENTARIO_LINEA=26;
	public static final int
		RULE_sentencia = 0, RULE_variables = 1, RULE_tipo = 2, RULE_decl_vars = 3, 
		RULE_expr = 4, RULE_expr1 = 5, RULE_expr2 = 6, RULE_expr3 = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "variables", "tipo", "decl_vars", "expr", "expr1", "expr2", 
			"expr3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'cierto'", "'falso'", "'entero'", "'booleano'", 
			"'O'", "'Y'", "'NO'", null, null, "'('", "')'", "';'", "','", "'='", 
			"'>'", "'<'", "'=='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "CIERTO", "FALSO", "ENTERO", 
			"BOOLEANO", "Y", "O", "NO", "NUMERO", "IDENT", "PA", "PC", "PyC", "COMA", 
			"ASIG", "MAYOR", "MENOR", "IGUAL", "MAS", "MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", 
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(16);
			variables();
			setState(17);
			expr();
			setState(18);
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
		public Decl_varsContext decl_vars() {
			return getRuleContext(Decl_varsContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			decl_vars();
			setState(21);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(Anasint.ENTERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(Anasint.BOOLEANO, 0); }
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
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==BOOLEANO) ) {
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

	public static class Decl_varsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Decl_varsContext decl_vars() {
			return getRuleContext(Decl_varsContext.class,0);
		}
		public Decl_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varsContext decl_vars() throws RecognitionException {
		Decl_varsContext _localctx = new Decl_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_vars);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(IDENT);
				setState(26);
				tipo();
				setState(27);
				match(COMA);
				setState(28);
				decl_vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(IDENT);
				setState(31);
				tipo();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_Y_OContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode Y() { return getToken(Anasint.Y, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode O() { return getToken(Anasint.O, 0); }
		public Expr_Y_OContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr_Y_O(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr_Y_O(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr_Y_O(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_NOContext extends ExprContext {
		public TerminalNode NO() { return getToken(Anasint.NO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_NOContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr_NO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr_NO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr_NO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public RelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Expr_Y_OContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				expr1();
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Y:
					{
					setState(35);
					match(Y);
					setState(36);
					expr();
					}
					break;
				case O:
					{
					setState(37);
					match(O);
					setState(38);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new Expr_NOContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(NO);
				setState(42);
				expr();
				}
				break;
			case 3:
				_localctx = new RelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rel_MAYOR_MENOR_IGUALContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MAYOR() { return getToken(Anasint.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Anasint.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(Anasint.IGUAL, 0); }
		public Rel_MAYOR_MENOR_IGUALContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRel_MAYOR_MENOR_IGUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRel_MAYOR_MENOR_IGUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRel_MAYOR_MENOR_IGUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TermContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Rel_MAYOR_MENOR_IGUALContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				expr2();
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAYOR:
					{
					setState(47);
					match(MAYOR);
					setState(48);
					expr2();
					}
					break;
				case MENOR:
					{
					setState(49);
					match(MENOR);
					setState(50);
					expr2();
					}
					break;
				case IGUAL:
					{
					setState(51);
					match(IGUAL);
					setState(52);
					expr2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_DIVContext extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode DIV() { return getToken(Anasint.DIV, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Term_DIVContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTerm_DIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTerm_DIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTerm_DIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_MAS_MENOS_PORContext extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public Term_MAS_MENOS_PORContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTerm_MAS_MENOS_POR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTerm_MAS_MENOS_POR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTerm_MAS_MENOS_POR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_BaseContext extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Term_BaseContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTerm_Base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTerm_Base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTerm_Base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr2);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Term_MAS_MENOS_PORContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expr3();
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MAS:
					{
					setState(59);
					match(MAS);
					setState(60);
					expr2();
					}
					break;
				case MENOS:
					{
					setState(61);
					match(MENOS);
					setState(62);
					expr2();
					}
					break;
				case POR:
					{
					setState(63);
					match(POR);
					setState(64);
					expr2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new Term_DIVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				expr3();
				{
				setState(68);
				match(DIV);
				setState(69);
				expr2();
				}
				}
				break;
			case 3:
				_localctx = new Term_BaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				expr3();
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

	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TContext extends Expr3Context {
		public TerminalNode CIERTO() { return getToken(Anasint.CIERTO, 0); }
		public TContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FContext extends Expr3Context {
		public TerminalNode FALSO() { return getToken(Anasint.FALSO, 0); }
		public FContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends Expr3Context {
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public ParExprContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends Expr3Context {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public NumContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends Expr3Context {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public IdContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr3);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(IDENT);
				}
				break;
			case NUMERO:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(NUMERO);
				}
				break;
			case CIERTO:
				_localctx = new TContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(CIERTO);
				}
				break;
			case FALSO:
				_localctx = new FContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(FALSO);
				}
				break;
			case PA:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(PA);
				setState(79);
				expr();
				setState(80);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6*\n\6\3\6\3\6\3\6\5\6/\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\78\n"+
		"\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bD\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tU\n\t\3\t\2\2\n\2\4\6\b"+
		"\n\f\16\20\2\3\3\2\b\t\2]\2\22\3\2\2\2\4\26\3\2\2\2\6\31\3\2\2\2\b\"\3"+
		"\2\2\2\n.\3\2\2\2\f:\3\2\2\2\16J\3\2\2\2\20T\3\2\2\2\22\23\5\4\3\2\23"+
		"\24\5\n\6\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\5\b\5\2\27\30\7\21\2\2\30"+
		"\5\3\2\2\2\31\32\t\2\2\2\32\7\3\2\2\2\33\34\7\16\2\2\34\35\5\6\4\2\35"+
		"\36\7\22\2\2\36\37\5\b\5\2\37#\3\2\2\2 !\7\16\2\2!#\5\6\4\2\"\33\3\2\2"+
		"\2\" \3\2\2\2#\t\3\2\2\2$)\5\f\7\2%&\7\n\2\2&*\5\n\6\2\'(\7\13\2\2(*\5"+
		"\n\6\2)%\3\2\2\2)\'\3\2\2\2*/\3\2\2\2+,\7\f\2\2,/\5\n\6\2-/\5\f\7\2.$"+
		"\3\2\2\2.+\3\2\2\2.-\3\2\2\2/\13\3\2\2\2\60\67\5\16\b\2\61\62\7\24\2\2"+
		"\628\5\16\b\2\63\64\7\25\2\2\648\5\16\b\2\65\66\7\26\2\2\668\5\16\b\2"+
		"\67\61\3\2\2\2\67\63\3\2\2\2\67\65\3\2\2\28;\3\2\2\29;\5\16\b\2:\60\3"+
		"\2\2\2:9\3\2\2\2;\r\3\2\2\2<C\5\20\t\2=>\7\27\2\2>D\5\16\b\2?@\7\30\2"+
		"\2@D\5\16\b\2AB\7\31\2\2BD\5\16\b\2C=\3\2\2\2C?\3\2\2\2CA\3\2\2\2DK\3"+
		"\2\2\2EF\5\20\t\2FG\7\32\2\2GH\5\16\b\2HK\3\2\2\2IK\5\20\t\2J<\3\2\2\2"+
		"JE\3\2\2\2JI\3\2\2\2K\17\3\2\2\2LU\7\16\2\2MU\7\r\2\2NU\7\6\2\2OU\7\7"+
		"\2\2PQ\7\17\2\2QR\5\n\6\2RS\7\20\2\2SU\3\2\2\2TL\3\2\2\2TM\3\2\2\2TN\3"+
		"\2\2\2TO\3\2\2\2TP\3\2\2\2U\21\3\2\2\2\n\").\67:CJT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
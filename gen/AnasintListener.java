// Generated from /root/IdeaProjects/procesador/src/Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(Anasint.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(Anasint.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#lista_variables}.
	 * @param ctx the parse tree
	 */
	void enterLista_variables(Anasint.Lista_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#lista_variables}.
	 * @param ctx the parse tree
	 */
	void exitLista_variables(Anasint.Lista_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_entera}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_entera(Anasint.Expresion_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(Anasint.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(Anasint.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_no_elemental}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_no_elemental(Anasint.Expresion_no_elementalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_no_elemental}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_no_elemental(Anasint.Expresion_no_elementalContext ctx);
}
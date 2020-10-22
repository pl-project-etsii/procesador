// Generated from C:/Users/casto/IdeaProjects/procesador/src\AnasintEjemplo.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Y_O}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Y_O(Anasint.Expr_Y_OContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Y_O}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Y_O(Anasint.Expr_Y_OContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_NO}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_NO(Anasint.Expr_NOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_NO}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_NO(Anasint.Expr_NOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rel}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterRel(Anasint.RelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rel}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitRel(Anasint.RelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rel_MAYOR_MENOR_IGUAL}
	 * labeled alternative in {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void enterRel_MAYOR_MENOR_IGUAL(Anasint.Rel_MAYOR_MENOR_IGUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rel_MAYOR_MENOR_IGUAL}
	 * labeled alternative in {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void exitRel_MAYOR_MENOR_IGUAL(Anasint.Rel_MAYOR_MENOR_IGUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Term}
	 * labeled alternative in {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Anasint.TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Anasint.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Term_MAS_MENOS_POR}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterTerm_MAS_MENOS_POR(Anasint.Term_MAS_MENOS_PORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Term_MAS_MENOS_POR}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitTerm_MAS_MENOS_POR(Anasint.Term_MAS_MENOS_PORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Term_DIV}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterTerm_DIV(Anasint.Term_DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Term_DIV}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitTerm_DIV(Anasint.Term_DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Term_Base}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Base(Anasint.Term_BaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Term_Base}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Base(Anasint.Term_BaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void enterId(Anasint.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void exitId(Anasint.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void enterNum(Anasint.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void exitNum(Anasint.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code T}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void enterT(Anasint.TContext ctx);
	/**
	 * Exit a parse tree produced by the {@code T}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void exitT(Anasint.TContext ctx);
	/**
	 * Enter a parse tree produced by the {@code F}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void enterF(Anasint.FContext ctx);
	/**
	 * Exit a parse tree produced by the {@code F}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void exitF(Anasint.FContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(Anasint.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(Anasint.ParExprContext ctx);
}
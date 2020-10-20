// Generated from C:/Users/casto/IdeaProjects/procesador/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(Anasint.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Y_O}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Y_O(Anasint.Expr_Y_OContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_NO}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_NO(Anasint.Expr_NOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rel}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(Anasint.RelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rel_MAYOR_MENOR_IGUAL}
	 * labeled alternative in {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_MAYOR_MENOR_IGUAL(Anasint.Rel_MAYOR_MENOR_IGUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Anasint.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term_MAS_MENOS_POR}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_MAS_MENOS_POR(Anasint.Term_MAS_MENOS_PORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term_DIV}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_DIV(Anasint.Term_DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term_Base}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_Base(Anasint.Term_BaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Anasint.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(Anasint.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(Anasint.TContext ctx);
	/**
	 * Visit a parse tree produced by the {@code F}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(Anasint.FContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(Anasint.ParExprContext ctx);
}
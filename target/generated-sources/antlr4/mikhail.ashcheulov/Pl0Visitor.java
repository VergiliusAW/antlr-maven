// Generated from mikhail.ashcheulov/Pl0.g4 by ANTLR 4.9.3
package mikhail.ashcheulov;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Pl0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Pl0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Pl0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Pl0Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(Pl0Parser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#vars_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars_(Pl0Parser.Vars_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(Pl0Parser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Pl0Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(Pl0Parser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(Pl0Parser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#writestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestmt(Pl0Parser.WritestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#qstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQstmt(Pl0Parser.QstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#beginstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginstmt(Pl0Parser.BeginstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(Pl0Parser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(Pl0Parser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oddExpr}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOddExpr(Pl0Parser.OddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(Pl0Parser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEquals}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(Pl0Parser.NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(Pl0Parser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(Pl0Parser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(Pl0Parser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(Pl0Parser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(Pl0Parser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(Pl0Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(Pl0Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl0Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Pl0Parser.NumberContext ctx);
}
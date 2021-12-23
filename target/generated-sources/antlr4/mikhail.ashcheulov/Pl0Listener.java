// Generated from mikhail.ashcheulov/Pl0.g4 by ANTLR 4.9.3
package mikhail.ashcheulov;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Pl0Parser}.
 */
public interface Pl0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Pl0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Pl0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Pl0Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Pl0Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(Pl0Parser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(Pl0Parser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#vars_}.
	 * @param ctx the parse tree
	 */
	void enterVars_(Pl0Parser.Vars_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#vars_}.
	 * @param ctx the parse tree
	 */
	void exitVars_(Pl0Parser.Vars_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(Pl0Parser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(Pl0Parser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Pl0Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Pl0Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(Pl0Parser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(Pl0Parser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(Pl0Parser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(Pl0Parser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#writestmt}.
	 * @param ctx the parse tree
	 */
	void enterWritestmt(Pl0Parser.WritestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#writestmt}.
	 * @param ctx the parse tree
	 */
	void exitWritestmt(Pl0Parser.WritestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#qstmt}.
	 * @param ctx the parse tree
	 */
	void enterQstmt(Pl0Parser.QstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#qstmt}.
	 * @param ctx the parse tree
	 */
	void exitQstmt(Pl0Parser.QstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#beginstmt}.
	 * @param ctx the parse tree
	 */
	void enterBeginstmt(Pl0Parser.BeginstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#beginstmt}.
	 * @param ctx the parse tree
	 */
	void exitBeginstmt(Pl0Parser.BeginstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(Pl0Parser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(Pl0Parser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(Pl0Parser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(Pl0Parser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oddExpr}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOddExpr(Pl0Parser.OddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oddExpr}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOddExpr(Pl0Parser.OddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEquals(Pl0Parser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEquals(Pl0Parser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEquals}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(Pl0Parser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEquals}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(Pl0Parser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code less}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLess(Pl0Parser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code less}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLess(Pl0Parser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greater}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreater(Pl0Parser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link Pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreater(Pl0Parser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(Pl0Parser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(Pl0Parser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(Pl0Parser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(Pl0Parser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(Pl0Parser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(Pl0Parser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(Pl0Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Pl0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(Pl0Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(Pl0Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(Pl0Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl0Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Pl0Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl0Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Pl0Parser.NumberContext ctx);
}
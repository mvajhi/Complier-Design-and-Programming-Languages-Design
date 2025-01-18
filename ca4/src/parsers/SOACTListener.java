// Generated from D:/9/TA/Compiler/Fall-1403-project/Phase2/Project/src/main/grammar/SOACT.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.type.*;
    import main.utils.*;
    import main.ast.nodes.statements.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.operator.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SOACTParser}.
 */
public interface SOACTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SOACTParser#soact}.
	 * @param ctx the parse tree
	 */
	void enterSoact(SOACTParser.SoactContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#soact}.
	 * @param ctx the parse tree
	 */
	void exitSoact(SOACTParser.SoactContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(SOACTParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(SOACTParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorDec}.
	 * @param ctx the parse tree
	 */
	void enterActorDec(SOACTParser.ActorDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorDec}.
	 * @param ctx the parse tree
	 */
	void exitActorDec(SOACTParser.ActorDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#customPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterCustomPrimitive(SOACTParser.CustomPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#customPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitCustomPrimitive(SOACTParser.CustomPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorVars}.
	 * @param ctx the parse tree
	 */
	void enterActorVars(SOACTParser.ActorVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorVars}.
	 * @param ctx the parse tree
	 */
	void exitActorVars(SOACTParser.ActorVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(SOACTParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(SOACTParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(SOACTParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(SOACTParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SOACTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SOACTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(SOACTParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(SOACTParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(SOACTParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(SOACTParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#msgHandler}.
	 * @param ctx the parse tree
	 */
	void enterMsgHandler(SOACTParser.MsgHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#msgHandler}.
	 * @param ctx the parse tree
	 */
	void exitMsgHandler(SOACTParser.MsgHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SOACTParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SOACTParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SOACTParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SOACTParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#accesslevels}.
	 * @param ctx the parse tree
	 */
	void enterAccesslevels(SOACTParser.AccesslevelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#accesslevels}.
	 * @param ctx the parse tree
	 */
	void exitAccesslevels(SOACTParser.AccesslevelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#authorized}.
	 * @param ctx the parse tree
	 */
	void enterAuthorized(SOACTParser.AuthorizedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#authorized}.
	 * @param ctx the parse tree
	 */
	void exitAuthorized(SOACTParser.AuthorizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#accesslevelsParam}.
	 * @param ctx the parse tree
	 */
	void enterAccesslevelsParam(SOACTParser.AccesslevelsParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#accesslevelsParam}.
	 * @param ctx the parse tree
	 */
	void exitAccesslevelsParam(SOACTParser.AccesslevelsParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(SOACTParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(SOACTParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#forLoopCondition}.
	 * @param ctx the parse tree
	 */
	void enterForLoopCondition(SOACTParser.ForLoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#forLoopCondition}.
	 * @param ctx the parse tree
	 */
	void exitForLoopCondition(SOACTParser.ForLoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(SOACTParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(SOACTParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(SOACTParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(SOACTParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(SOACTParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(SOACTParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#joinBlock}.
	 * @param ctx the parse tree
	 */
	void enterJoinBlock(SOACTParser.JoinBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#joinBlock}.
	 * @param ctx the parse tree
	 */
	void exitJoinBlock(SOACTParser.JoinBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#joinBlockBody}.
	 * @param ctx the parse tree
	 */
	void enterJoinBlockBody(SOACTParser.JoinBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#joinBlockBody}.
	 * @param ctx the parse tree
	 */
	void exitJoinBlockBody(SOACTParser.JoinBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#pipeStatement}.
	 * @param ctx the parse tree
	 */
	void enterPipeStatement(SOACTParser.PipeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#pipeStatement}.
	 * @param ctx the parse tree
	 */
	void exitPipeStatement(SOACTParser.PipeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SOACTParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SOACTParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SOACTParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SOACTParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SOACTParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SOACTParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#initStatement}.
	 * @param ctx the parse tree
	 */
	void enterInitStatement(SOACTParser.InitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#initStatement}.
	 * @param ctx the parse tree
	 */
	void exitInitStatement(SOACTParser.InitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(SOACTParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(SOACTParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#initRecord}.
	 * @param ctx the parse tree
	 */
	void enterInitRecord(SOACTParser.InitRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#initRecord}.
	 * @param ctx the parse tree
	 */
	void exitInitRecord(SOACTParser.InitRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(SOACTParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(SOACTParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(SOACTParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(SOACTParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#observeStatement}.
	 * @param ctx the parse tree
	 */
	void enterObserveStatement(SOACTParser.ObserveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#observeStatement}.
	 * @param ctx the parse tree
	 */
	void exitObserveStatement(SOACTParser.ObserveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SOACTParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SOACTParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SOACTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SOACTParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SOACTParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SOACTParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#customPrimAccess}.
	 * @param ctx the parse tree
	 */
	void enterCustomPrimAccess(SOACTParser.CustomPrimAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#customPrimAccess}.
	 * @param ctx the parse tree
	 */
	void exitCustomPrimAccess(SOACTParser.CustomPrimAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#handlerCall}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCall(SOACTParser.HandlerCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#handlerCall}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCall(SOACTParser.HandlerCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#primitivesVals}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivesVals(SOACTParser.PrimitivesValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#primitivesVals}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivesVals(SOACTParser.PrimitivesValsContext ctx);
}
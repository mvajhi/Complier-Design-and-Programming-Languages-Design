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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SOACTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SOACTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SOACTParser#soact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoact(SOACTParser.SoactContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(SOACTParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorDec(SOACTParser.ActorDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#customPrimitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomPrimitive(SOACTParser.CustomPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorVars(SOACTParser.ActorVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(SOACTParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(SOACTParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SOACTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(SOACTParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SOACTParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#msgHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgHandler(SOACTParser.MsgHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SOACTParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SOACTParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#accesslevels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesslevels(SOACTParser.AccesslevelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#authorized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorized(SOACTParser.AuthorizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#accesslevelsParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesslevelsParam(SOACTParser.AccesslevelsParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(SOACTParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#forLoopCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopCondition(SOACTParser.ForLoopConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(SOACTParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(SOACTParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(SOACTParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#joinBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinBlock(SOACTParser.JoinBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#joinBlockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinBlockBody(SOACTParser.JoinBlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#pipeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeStatement(SOACTParser.PipeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SOACTParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SOACTParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SOACTParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#initStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitStatement(SOACTParser.InitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(SOACTParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#initRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitRecord(SOACTParser.InitRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(SOACTParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#exprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(SOACTParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#observeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserveStatement(SOACTParser.ObserveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(SOACTParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SOACTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SOACTParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#customPrimAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomPrimAccess(SOACTParser.CustomPrimAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#handlerCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCall(SOACTParser.HandlerCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#primitivesVals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivesVals(SOACTParser.PrimitivesValsContext ctx);
}
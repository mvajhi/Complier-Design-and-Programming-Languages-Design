// Generated from D:/UT/Term 7/PLC-TA/git/Fall-1403-project/Phase1/Project/src/main/grammer/SOACT.g4 by ANTLR 4.13.1
package main.grammer;
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
	 * Visit a parse tree produced by {@link SOACTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SOACTParser.ProgramContext ctx);
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
	 * Visit a parse tree produced by {@link SOACTParser#actorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorBody(SOACTParser.ActorBodyContext ctx);
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
	 * Visit a parse tree produced by {@link SOACTParser#primitives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitives(SOACTParser.PrimitivesContext ctx);
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
	 * Visit a parse tree produced by {@link SOACTParser#authorized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorized(SOACTParser.AuthorizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#accesslevels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesslevels(SOACTParser.AccesslevelsContext ctx);
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
	 * Visit a parse tree produced by {@link SOACTParser#observers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservers(SOACTParser.ObserversContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SOACTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComma(SOACTParser.ExpCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expCommaPrim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCommaPrim(SOACTParser.ExpCommaPrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAssign(SOACTParser.ExpAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expTernary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTernary(SOACTParser.ExpTernaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOr(SOACTParser.ExpOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(SOACTParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expAndPrim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAndPrim(SOACTParser.ExpAndPrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEquals(SOACTParser.ExpEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expEqualsPrim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEqualsPrim(SOACTParser.ExpEqualsPrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCompare(SOACTParser.ExpCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expComparePrim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComparePrim(SOACTParser.ExpComparePrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPlusMinus(SOACTParser.ExpPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expPlusMinusPrim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPlusMinusPrim(SOACTParser.ExpPlusMinusPrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expDivideMultMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDivideMultMod(SOACTParser.ExpDivideMultModContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expPreUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPreUnary(SOACTParser.ExpPreUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expPreUnaryPrim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPreUnaryPrim(SOACTParser.ExpPreUnaryPrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expPostUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPostUnary(SOACTParser.ExpPostUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBracket(SOACTParser.ExpBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAccess(SOACTParser.ExpAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(SOACTParser.ExpParContext ctx);
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
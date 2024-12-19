// Generated from D:/UT/Term 7/PLC-TA/git/Fall-1403-project/Phase1/Project/src/main/grammer/SOACT.g4 by ANTLR 4.13.1
package main.grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SOACTParser}.
 */
public interface SOACTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SOACTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SOACTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SOACTParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#actorBody}.
	 * @param ctx the parse tree
	 */
	void enterActorBody(SOACTParser.ActorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorBody}.
	 * @param ctx the parse tree
	 */
	void exitActorBody(SOACTParser.ActorBodyContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#primitives}.
	 * @param ctx the parse tree
	 */
	void enterPrimitives(SOACTParser.PrimitivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#primitives}.
	 * @param ctx the parse tree
	 */
	void exitPrimitives(SOACTParser.PrimitivesContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#observers}.
	 * @param ctx the parse tree
	 */
	void enterObservers(SOACTParser.ObserversContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#observers}.
	 * @param ctx the parse tree
	 */
	void exitObservers(SOACTParser.ObserversContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#expComma}.
	 * @param ctx the parse tree
	 */
	void enterExpComma(SOACTParser.ExpCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expComma}.
	 * @param ctx the parse tree
	 */
	void exitExpComma(SOACTParser.ExpCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expCommaPrim}.
	 * @param ctx the parse tree
	 */
	void enterExpCommaPrim(SOACTParser.ExpCommaPrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expCommaPrim}.
	 * @param ctx the parse tree
	 */
	void exitExpCommaPrim(SOACTParser.ExpCommaPrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expAssign}.
	 * @param ctx the parse tree
	 */
	void enterExpAssign(SOACTParser.ExpAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expAssign}.
	 * @param ctx the parse tree
	 */
	void exitExpAssign(SOACTParser.ExpAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expTernary}.
	 * @param ctx the parse tree
	 */
	void enterExpTernary(SOACTParser.ExpTernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expTernary}.
	 * @param ctx the parse tree
	 */
	void exitExpTernary(SOACTParser.ExpTernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expOr}.
	 * @param ctx the parse tree
	 */
	void enterExpOr(SOACTParser.ExpOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expOr}.
	 * @param ctx the parse tree
	 */
	void exitExpOr(SOACTParser.ExpOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expAnd}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(SOACTParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expAnd}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(SOACTParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expAndPrim}.
	 * @param ctx the parse tree
	 */
	void enterExpAndPrim(SOACTParser.ExpAndPrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expAndPrim}.
	 * @param ctx the parse tree
	 */
	void exitExpAndPrim(SOACTParser.ExpAndPrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expEquals}.
	 * @param ctx the parse tree
	 */
	void enterExpEquals(SOACTParser.ExpEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expEquals}.
	 * @param ctx the parse tree
	 */
	void exitExpEquals(SOACTParser.ExpEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expEqualsPrim}.
	 * @param ctx the parse tree
	 */
	void enterExpEqualsPrim(SOACTParser.ExpEqualsPrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expEqualsPrim}.
	 * @param ctx the parse tree
	 */
	void exitExpEqualsPrim(SOACTParser.ExpEqualsPrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expCompare}.
	 * @param ctx the parse tree
	 */
	void enterExpCompare(SOACTParser.ExpCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expCompare}.
	 * @param ctx the parse tree
	 */
	void exitExpCompare(SOACTParser.ExpCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expComparePrim}.
	 * @param ctx the parse tree
	 */
	void enterExpComparePrim(SOACTParser.ExpComparePrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expComparePrim}.
	 * @param ctx the parse tree
	 */
	void exitExpComparePrim(SOACTParser.ExpComparePrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterExpPlusMinus(SOACTParser.ExpPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitExpPlusMinus(SOACTParser.ExpPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expPlusMinusPrim}.
	 * @param ctx the parse tree
	 */
	void enterExpPlusMinusPrim(SOACTParser.ExpPlusMinusPrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expPlusMinusPrim}.
	 * @param ctx the parse tree
	 */
	void exitExpPlusMinusPrim(SOACTParser.ExpPlusMinusPrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expDivideMultMod}.
	 * @param ctx the parse tree
	 */
	void enterExpDivideMultMod(SOACTParser.ExpDivideMultModContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expDivideMultMod}.
	 * @param ctx the parse tree
	 */
	void exitExpDivideMultMod(SOACTParser.ExpDivideMultModContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expPreUnary}.
	 * @param ctx the parse tree
	 */
	void enterExpPreUnary(SOACTParser.ExpPreUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expPreUnary}.
	 * @param ctx the parse tree
	 */
	void exitExpPreUnary(SOACTParser.ExpPreUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expPreUnaryPrim}.
	 * @param ctx the parse tree
	 */
	void enterExpPreUnaryPrim(SOACTParser.ExpPreUnaryPrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expPreUnaryPrim}.
	 * @param ctx the parse tree
	 */
	void exitExpPreUnaryPrim(SOACTParser.ExpPreUnaryPrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expPostUnary}.
	 * @param ctx the parse tree
	 */
	void enterExpPostUnary(SOACTParser.ExpPostUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expPostUnary}.
	 * @param ctx the parse tree
	 */
	void exitExpPostUnary(SOACTParser.ExpPostUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expBracket}.
	 * @param ctx the parse tree
	 */
	void enterExpBracket(SOACTParser.ExpBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expBracket}.
	 * @param ctx the parse tree
	 */
	void exitExpBracket(SOACTParser.ExpBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expAccess}.
	 * @param ctx the parse tree
	 */
	void enterExpAccess(SOACTParser.ExpAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expAccess}.
	 * @param ctx the parse tree
	 */
	void exitExpAccess(SOACTParser.ExpAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expPar}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(SOACTParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expPar}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(SOACTParser.ExpParContext ctx);
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
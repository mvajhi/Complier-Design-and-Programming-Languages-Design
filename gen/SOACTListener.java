// Generated from /home/sadra/Documents/Codes/Compiler/Complier-Design-and-Programming-Languages-Design/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link SOACTParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(SOACTParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(SOACTParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SOACTParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SOACTParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(SOACTParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(SOACTParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorComponentsWithBrace}.
	 * @param ctx the parse tree
	 */
	void enterActorComponentsWithBrace(SOACTParser.ActorComponentsWithBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorComponentsWithBrace}.
	 * @param ctx the parse tree
	 */
	void exitActorComponentsWithBrace(SOACTParser.ActorComponentsWithBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorComponents}.
	 * @param ctx the parse tree
	 */
	void enterActorComponents(SOACTParser.ActorComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorComponents}.
	 * @param ctx the parse tree
	 */
	void exitActorComponents(SOACTParser.ActorComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorComponent}.
	 * @param ctx the parse tree
	 */
	void enterActorComponent(SOACTParser.ActorComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorComponent}.
	 * @param ctx the parse tree
	 */
	void exitActorComponent(SOACTParser.ActorComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorConstructor}.
	 * @param ctx the parse tree
	 */
	void enterActorConstructor(SOACTParser.ActorConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorConstructor}.
	 * @param ctx the parse tree
	 */
	void exitActorConstructor(SOACTParser.ActorConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorMethod}.
	 * @param ctx the parse tree
	 */
	void enterActorMethod(SOACTParser.ActorMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorMethod}.
	 * @param ctx the parse tree
	 */
	void exitActorMethod(SOACTParser.ActorMethodContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#decVarsWithBrace}.
	 * @param ctx the parse tree
	 */
	void enterDecVarsWithBrace(SOACTParser.DecVarsWithBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#decVarsWithBrace}.
	 * @param ctx the parse tree
	 */
	void exitDecVarsWithBrace(SOACTParser.DecVarsWithBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#varsRecords}.
	 * @param ctx the parse tree
	 */
	void enterVarsRecords(SOACTParser.VarsRecordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#varsRecords}.
	 * @param ctx the parse tree
	 */
	void exitVarsRecords(SOACTParser.VarsRecordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#decPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterDecPrimitive(SOACTParser.DecPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#decPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitDecPrimitive(SOACTParser.DecPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#varsPrimitiveWithBrace}.
	 * @param ctx the parse tree
	 */
	void enterVarsPrimitiveWithBrace(SOACTParser.VarsPrimitiveWithBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#varsPrimitiveWithBrace}.
	 * @param ctx the parse tree
	 */
	void exitVarsPrimitiveWithBrace(SOACTParser.VarsPrimitiveWithBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#varsPrimitives}.
	 * @param ctx the parse tree
	 */
	void enterVarsPrimitives(SOACTParser.VarsPrimitivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#varsPrimitives}.
	 * @param ctx the parse tree
	 */
	void exitVarsPrimitives(SOACTParser.VarsPrimitivesContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#decArgsWithPar}.
	 * @param ctx the parse tree
	 */
	void enterDecArgsWithPar(SOACTParser.DecArgsWithParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#decArgsWithPar}.
	 * @param ctx the parse tree
	 */
	void exitDecArgsWithPar(SOACTParser.DecArgsWithParContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#decArgs}.
	 * @param ctx the parse tree
	 */
	void enterDecArgs(SOACTParser.DecArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#decArgs}.
	 * @param ctx the parse tree
	 */
	void exitDecArgs(SOACTParser.DecArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#decArg}.
	 * @param ctx the parse tree
	 */
	void enterDecArg(SOACTParser.DecArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#decArg}.
	 * @param ctx the parse tree
	 */
	void exitDecArg(SOACTParser.DecArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#argsWithPar}.
	 * @param ctx the parse tree
	 */
	void enterArgsWithPar(SOACTParser.ArgsWithParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#argsWithPar}.
	 * @param ctx the parse tree
	 */
	void exitArgsWithPar(SOACTParser.ArgsWithParContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(SOACTParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(SOACTParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#recordArgs}.
	 * @param ctx the parse tree
	 */
	void enterRecordArgs(SOACTParser.RecordArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#recordArgs}.
	 * @param ctx the parse tree
	 */
	void exitRecordArgs(SOACTParser.RecordArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#recordArg}.
	 * @param ctx the parse tree
	 */
	void enterRecordArg(SOACTParser.RecordArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#recordArg}.
	 * @param ctx the parse tree
	 */
	void exitRecordArg(SOACTParser.RecordArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#statementWithBrace}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithBrace(SOACTParser.StatementWithBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#statementWithBrace}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithBrace(SOACTParser.StatementWithBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(SOACTParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(SOACTParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SOACTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SOACTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void enterJoinStatement(SOACTParser.JoinStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void exitJoinStatement(SOACTParser.JoinStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatement(SOACTParser.OtherStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatement(SOACTParser.OtherStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SOACTParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SOACTParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#whileArgWithPar}.
	 * @param ctx the parse tree
	 */
	void enterWhileArgWithPar(SOACTParser.WhileArgWithParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#whileArgWithPar}.
	 * @param ctx the parse tree
	 */
	void exitWhileArgWithPar(SOACTParser.WhileArgWithParContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SOACTParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SOACTParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#forArgWithPar}.
	 * @param ctx the parse tree
	 */
	void enterForArgWithPar(SOACTParser.ForArgWithParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#forArgWithPar}.
	 * @param ctx the parse tree
	 */
	void exitForArgWithPar(SOACTParser.ForArgWithParContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#forArg}.
	 * @param ctx the parse tree
	 */
	void enterForArg(SOACTParser.ForArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#forArg}.
	 * @param ctx the parse tree
	 */
	void exitForArg(SOACTParser.ForArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#setVarStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVarStatement(SOACTParser.SetVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#setVarStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVarStatement(SOACTParser.SetVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#builtInFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunctionName(SOACTParser.BuiltInFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#builtInFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunctionName(SOACTParser.BuiltInFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#builtInFunction}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunction(SOACTParser.BuiltInFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#builtInFunction}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunction(SOACTParser.BuiltInFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#builtInFunctionList}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunctionList(SOACTParser.BuiltInFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#builtInFunctionList}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunctionList(SOACTParser.BuiltInFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#builtInFunctionListName}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunctionListName(SOACTParser.BuiltInFunctionListNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#builtInFunctionListName}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunctionListName(SOACTParser.BuiltInFunctionListNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SOACTParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SOACTParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SOACTParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SOACTParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(SOACTParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(SOACTParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#objectCall}.
	 * @param ctx the parse tree
	 */
	void enterObjectCall(SOACTParser.ObjectCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#objectCall}.
	 * @param ctx the parse tree
	 */
	void exitObjectCall(SOACTParser.ObjectCallContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#declareVarStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVarStatement(SOACTParser.DeclareVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#declareVarStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVarStatement(SOACTParser.DeclareVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void enterArraySize(SOACTParser.ArraySizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void exitArraySize(SOACTParser.ArraySizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#initialayzer}.
	 * @param ctx the parse tree
	 */
	void enterInitialayzer(SOACTParser.InitialayzerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#initialayzer}.
	 * @param ctx the parse tree
	 */
	void exitInitialayzer(SOACTParser.InitialayzerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SOACTParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SOACTParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#expressionWithPar}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithPar(SOACTParser.ExpressionWithParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expressionWithPar}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithPar(SOACTParser.ExpressionWithParContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(SOACTParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(SOACTParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(SOACTParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(SOACTParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(SOACTParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(SOACTParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(SOACTParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(SOACTParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(SOACTParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(SOACTParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(SOACTParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(SOACTParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(SOACTParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(SOACTParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(SOACTParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(SOACTParser.PostfixContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#expressionPar}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPar(SOACTParser.ExpressionParContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#expressionPar}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPar(SOACTParser.ExpressionParContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#pipe}.
	 * @param ctx the parse tree
	 */
	void enterPipe(SOACTParser.PipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#pipe}.
	 * @param ctx the parse tree
	 */
	void exitPipe(SOACTParser.PipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(SOACTParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(SOACTParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#primitiveUse}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveUse(SOACTParser.PrimitiveUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#primitiveUse}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveUse(SOACTParser.PrimitiveUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#actorInstance}.
	 * @param ctx the parse tree
	 */
	void enterActorInstance(SOACTParser.ActorInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#actorInstance}.
	 * @param ctx the parse tree
	 */
	void exitActorInstance(SOACTParser.ActorInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#recordInstance}.
	 * @param ctx the parse tree
	 */
	void enterRecordInstance(SOACTParser.RecordInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#recordInstance}.
	 * @param ctx the parse tree
	 */
	void exitRecordInstance(SOACTParser.RecordInstanceContext ctx);
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
	 * Enter a parse tree produced by {@link SOACTParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInType(SOACTParser.BuiltInTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#builtInType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInType(SOACTParser.BuiltInTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SOACTParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SOACTParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SOACTParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SOACTParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SOACTParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SOACTParser.ListContext ctx);
}
// Generated from /home/sadra/Documents/Codes/Compiler/Complier-Design-and-Programming-Languages-Design/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link SOACTParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(SOACTParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SOACTParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActor(SOACTParser.ActorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorComponentsWithBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorComponentsWithBrace(SOACTParser.ActorComponentsWithBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorComponents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorComponents(SOACTParser.ActorComponentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorComponent(SOACTParser.ActorComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorConstructor(SOACTParser.ActorConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorMethod(SOACTParser.ActorMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#authorized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorized(SOACTParser.AuthorizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorVars(SOACTParser.ActorVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(SOACTParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#decVarsWithBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVarsWithBrace(SOACTParser.DecVarsWithBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#varsRecords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsRecords(SOACTParser.VarsRecordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#decPrimitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecPrimitive(SOACTParser.DecPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#varsPrimitiveWithBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsPrimitiveWithBrace(SOACTParser.VarsPrimitiveWithBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#varsPrimitives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsPrimitives(SOACTParser.VarsPrimitivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SOACTParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#decArgsWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecArgsWithPar(SOACTParser.DecArgsWithParContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#decArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecArgs(SOACTParser.DecArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#decArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecArg(SOACTParser.DecArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#argsWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsWithPar(SOACTParser.ArgsWithParContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SOACTParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#recordArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordArgs(SOACTParser.RecordArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#recordArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordArg(SOACTParser.RecordArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#statementWithBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithBrace(SOACTParser.StatementWithBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(SOACTParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SOACTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#joinStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinStatement(SOACTParser.JoinStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#otherStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherStatement(SOACTParser.OtherStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SOACTParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#whileArgWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileArgWithPar(SOACTParser.WhileArgWithParContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SOACTParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#forArgWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForArgWithPar(SOACTParser.ForArgWithParContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#forArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForArg(SOACTParser.ForArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#setVarStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarStatement(SOACTParser.SetVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#builtInFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFunctionName(SOACTParser.BuiltInFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#builtInFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFunction(SOACTParser.BuiltInFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#builtInFunctionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFunctionList(SOACTParser.BuiltInFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#builtInFunctionListName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInFunctionListName(SOACTParser.BuiltInFunctionListNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SOACTParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SOACTParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(SOACTParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#objectCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCall(SOACTParser.ObjectCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#observers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservers(SOACTParser.ObserversContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#declareVarStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVarStatement(SOACTParser.DeclareVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SOACTParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#arraySize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySize(SOACTParser.ArraySizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#initialayzer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialayzer(SOACTParser.InitialayzerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SOACTParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expressionWithPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithPar(SOACTParser.ExpressionWithParContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SOACTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(SOACTParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(SOACTParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(SOACTParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(SOACTParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(SOACTParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(SOACTParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(SOACTParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(SOACTParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(SOACTParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#expressionPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPar(SOACTParser.ExpressionParContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipe(SOACTParser.PipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(SOACTParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#primitiveUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveUse(SOACTParser.PrimitiveUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#actorInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorInstance(SOACTParser.ActorInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#recordInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordInstance(SOACTParser.RecordInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SOACTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#builtInType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInType(SOACTParser.BuiltInTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SOACTParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SOACTParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SOACTParser.ListContext ctx);
}
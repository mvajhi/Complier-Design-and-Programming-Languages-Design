package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.statements.*;

public interface IVisitor<T> {

    T visit(Soact soact);
    T visit(Declaration declaration);
    T visit(Identifier identifier);
    T visit(VarDeclaration varDeclaration);
    T visit(CustomPrimitiveDeclaration customPrimitiveDeclaration);
    T visit(ActorDec actorDec);
    T visit(RecordNode recordNode);
    T visit(ForStatement forStatement);
    T visit(IntValue intValue);
    T visit(WhileStatement whileStatement);
    T visit(ServiceHandler serviceHandler);
    T visit(ObserveHandler observeHandler);
    T visit(IfStatement ifStatement);
    T visit(JoinStatement joinStatement);
    T visit(PipeStatement pipeStatement);
    T visit(InitStatement assignmentStatement);
    T visit(ConstructorExpression constructorExpression);
    T visit(ExpressionStatement expressionStatement);
    T visit(ObserveStatement observeStatement);
}

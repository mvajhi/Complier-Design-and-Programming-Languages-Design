package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.statements.*;


public abstract class Visitor<T> implements IVisitor<T> {
    public T visit(Soact soact) {return null;}
    public T visit(Declaration declaration) {return null;}
    public T visit(Identifier identifier) {return null;}
    public T visit(VarDeclaration varDeclaration) {return null;}
    public T visit(CustomPrimitiveDeclaration customPrimitiveDeclaration) {return null;}
    public T visit(ActorDec actorDec) {
        return null;
    }
    public T visit(RecordNode recordNode) {
        return null;
    }
    public T visit(ForStatement forStatement) {return null;}
    public T visit(IntValue intValue) {return null;}
    public T visit(WhileStatement whileStatement) {return null;}
    public T visit(ServiceHandler serviceHandler) {return null;}
    public T visit(ObserveHandler observeHandler) {return null;}
    public T visit(IfStatement ifStatement) {return null;}
    public T visit(JoinStatement joinStatement) {return null;}
    public T visit(PipeStatement pipeStatement) {return null;}
    public T visit(InitStatement assignmentStatement) {return null;}
    public T visit(ConstructorExpression constructorExpression) {return null;}
    public T visit(ExpressionStatement expressionStatement) {return null;}
    public T visit(ObserveStatement observeStatement) {return null;}
}

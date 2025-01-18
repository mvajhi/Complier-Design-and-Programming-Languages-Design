package main.visitor;

import com.sun.jdi.BooleanValue;
import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.statements.*;
import main.ast.nodes.type.*;


public abstract class Visitor<T> implements IVisitor<T> {
    public T visit(Soact soact) {return null;}
    public T visit(Declaration declaration) {return null;}
    public T visit(Identifier identifier) {return null;}
    public T visit(ExpressionList expressionList) {return null;}
    public T visit(SelfExpression selfExpression) {return null;}
    public T visit(BinaryExpression binaryExpression) {return null;}
    public T visit(UnaryExpression unaryExpression) {return null;}
    public T visit(AccessExpression accessExpression) {return null;}
    public T visit(CallExpression callExpression) {return null;}
    public T visit(BracketExpression bracketExpression) {return null;}
    public T visit(CustomPrimAccessExpression customPrimAccessExpression) {return null;}
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
    public T visit(StringValue stringValue) {return null;}
    public T visit(BoolValue boolValue) {return null;}
    public T visit(WhileStatement whileStatement) {return null;}
    public T visit(ServiceHandler serviceHandler) {return null;}
    public T visit(ObserveHandler observeHandler) {return null;}
    public T visit(Handler handler) {return null;}
    public T visit(AssignmentStatement assignmentStatement) {return null;}

    public T visit(IfStatement ifStatement) {return null;}
    public T visit(JoinStatement joinStatement) {return null;}
    public T visit(PipeStatement pipeStatement) {return null;}
    public T visit(InitStatement assignmentStatement) {return null;}
    public T visit(ConstructorExpression constructorExpression) {return null;}
    public T visit(ExpressionStatement expressionStatement) {return null;}
    public T visit(ObserveStatement observeStatement) {return null;}
    public T visit(Main main) {return null;}
    public T visit(IntType intType) {return null;}
    public T visit(StringType stringType) {return null;}
    public T visit(IdType idType) {return null;}
    public T visit(BooleanType booleanType) {return null;}
    public T visit(OtherType otherType) {return null;}
    public T visit(ArrayType arrayType) {return null;}
    public T visit(SetType setType) {return null;}
    public T visit(ListType listType) {return null;}
    public T visit(Expression expression) {return null;}
    public T visit(BooleanValue booleanValue) {return null;}
    public T visit(ContinueStatement continueStatement) {return null;}
    public T visit(BreakStatement breakStatement) {return null;}
}

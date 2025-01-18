package main.visitor;

import com.sun.jdi.BooleanValue;
import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.statements.*;
import main.ast.nodes.type.*;

import java.util.List;

public interface IVisitor<T> {

    T visit(Soact soact);
    T visit(Declaration declaration);
    T visit(Identifier identifier);
    T visit(ExpressionList expressionList);
    T visit(SelfExpression selfExpression);

    T visit(BinaryExpression binaryExpression);
    T visit(UnaryExpression unaryExpression);
    T visit(AccessExpression accessExpression);
    T visit(BracketExpression bracketExpression);
    T visit(CallExpression callExpression);
    T visit(CustomPrimAccessExpression customPrimAccessExpression);
    T visit(VarDeclaration varDeclaration);
    T visit(CustomPrimitiveDeclaration customPrimitiveDeclaration);
    T visit(ActorDec actorDec);
    T visit(RecordNode recordNode);
    T visit(ForStatement forStatement);
    T visit(IntValue intValue);
    T visit(StringValue stringValue);
    T visit(BoolValue boolValue);
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
    T visit(Main main);
    T visit(IntType intType);
    T visit(StringType stringType);
    T visit(IdType idType);
    T visit(BooleanType booleanType);
    T visit(OtherType otherType);
    T visit(ArrayType arrayType);
    T visit(ListType listType);
    T visit(SetType setType);
    T visit(Handler handler);
    T visit(AssignmentStatement assignmentStatement);
    T visit(Expression expression);
    T visit(BooleanValue booleanValue);
    T visit(BreakStatement breakStatement);
    T visit(ContinueStatement continueStatement);
}

package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.CallExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ExpressionList;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statements.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.items.*;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    @Override
    public Void visit(Soact soact) {
        SymbolTable.top = new SymbolTable();
        soact.setSymbolTable(SymbolTable.top);

        for (RecordNode recordNode : soact.getRecords()) {
            recordNode.accept(this);
        }

        for (ActorDec actorDec : soact.getActorDecs()) {
            actorDec.accept(this);
        }

        if (soact.getMain() != null) {
            soact.getMain().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ActorDec actorDec) {
        ActorDecItem actorDecItem = new ActorDecItem(actorDec);

        try {
            SymbolTable.top.put(actorDecItem);
        } catch (ItemAlreadyExists e) {
            throw new RuntimeException(e); // or other errors based on our description
        }

        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        actorDec.setSymbolTable(symbolTable);
        SymbolTable.push(symbolTable);

        for (CustomPrimitiveDeclaration customPrimitive : actorDec.getCustomPrimitiveDeclarations()) {
            customPrimitive.accept(this);
        }

        for (VarDeclaration varDeclaration : actorDec.getActorVars()) {
            varDeclaration.accept(this);
        }

        for (Handler handler : actorDec.getMsgHandlers()) {
            handler.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(RecordNode recordNode) {
        RecordNodeItem recordNodeItem = new RecordNodeItem(recordNode);

        try {
            SymbolTable.top.put(recordNodeItem);
        } catch (ItemAlreadyExists e) {
            throw new RuntimeException(e); // or other errors based on our description
        }

        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        recordNode.setSymbolTable(symbolTable);
        SymbolTable.push(symbolTable);

        for (VarDeclaration varDeclaration : recordNode.getVars()) {
            varDeclaration.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        VarDeclarationItem varDeclarationItem = new VarDeclarationItem(varDeclaration);

        try {
            SymbolTable.top.put(varDeclarationItem);
        } catch (ItemAlreadyExists e) {
//            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Void visit(CustomPrimitiveDeclaration customPrimitive) {
        CustomPrimitiveDeclarationItem customPrimitiveDeclarationItem = new CustomPrimitiveDeclarationItem(customPrimitive);

        try {
            SymbolTable.top.put(customPrimitiveDeclarationItem);
        } catch (ItemAlreadyExists e) {
            throw new RuntimeException(e);
        }

        for (Identifier state : customPrimitive.getStates()) {
            state.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(Main main) {
        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        main.setSymbolTable(symbolTable);
        SymbolTable.push(symbolTable);

        for (Statement statement : main.getStatements()) {
            statement.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(InitStatement initStatement) {
        VarDeclarationItem varDeclarationItem = new VarDeclarationItem(initStatement.getAssignee(), initStatement.getAssigned());

        try {
            SymbolTable.top.put(varDeclarationItem);
        } catch (ItemAlreadyExists e) {
//            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Void visit(ServiceHandler serviceHandler) {
        ServiceHandlerItem serviceHandlerItem = new ServiceHandlerItem(serviceHandler);

        try {
            SymbolTable.top.put(serviceHandlerItem);
        } catch (ItemAlreadyExists e) {
            throw new RuntimeException(e); // or other errors based on our description
        }

        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        serviceHandler.setSymbolTable(symbolTable);
        SymbolTable.push(symbolTable);

        for (VarDeclaration arg : serviceHandler.getArgs()) {
            arg.accept(this);
        }

        for (Statement statement : serviceHandler.getBody()) {
            statement.accept(this);
        }

        for (Expression expr : serviceHandler.getAuthorizationExpressions()) {
            expr.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(ObserveHandler observeHandler) {
        ObserveHandlerItem observeHandlerItem = new ObserveHandlerItem(observeHandler);

        try {
            SymbolTable.top.put(observeHandlerItem);
        } catch (ItemAlreadyExists e) {
            throw new RuntimeException(e); // or other errors based on our description
        }

        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        observeHandler.setSymbolTable(symbolTable);
        SymbolTable.push(symbolTable);

        for (VarDeclaration arg : observeHandler.getArgs()) {
            arg.accept(this);
        }

        for (Statement statement : observeHandler.getBody()) {
            statement.accept(this);
        }

        for (Expression expr : observeHandler.getAuthorizationExpressions()) {
            expr.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(AssignmentStatement assignmentStatement) {
        for (Identifier id : assignmentStatement.getIds()) {
            id.accept(this);
        }

        assignmentStatement.getAssigned().accept(this);

        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        if (forStatement.getIterator() != null) {
            forStatement.getIterator().accept(this);
        }

        for (Expression condition : forStatement.getConditions()) {
            condition.accept(this);
        }

        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        forStatement.setSymbolTable(symbolTable);
        SymbolTable.push(symbolTable);

        for (Statement statement : forStatement.getBody()) {
            statement.accept(this);
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        if (ifStatement.getIfConds() instanceof ExpressionList)
            for (Expression condition : ((ExpressionList) ifStatement.getIfConds()).getExpressionList())
                condition.accept(this);
        else
            ifStatement.getIfConds().accept(this);


        for (Statement statement : ifStatement.getIfBody()) {
            statement.accept(this);
        }

        for (Expression elseIfConds : ifStatement.getElseIfBlocksConds()) {
            elseIfConds.accept(this);
            //
//            for (Expression condition : elseIfConds) {
//                condition.accept(this);
//            }
        }

        for (ArrayList<Statement> elseIfBody : ifStatement.getElseIfBlocksBody()) {
            for (Statement statement : elseIfBody) {
                statement.accept(this);
            }
        }

        for (Statement statement : ifStatement.getElseBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement) {
        if (whileStatement.getConditions() instanceof ExpressionList)
            for (Expression condition : ((ExpressionList) whileStatement.getConditions()).getExpressionList())
                condition.accept(this);
        else
            whileStatement.getConditions().accept(this);

        for (Statement statement : whileStatement.getBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(CallExpression callExpression) {
        if (callExpression.getExpressions() instanceof ExpressionList)
            for (Expression expression : ((ExpressionList) callExpression.getExpressions()).getExpressionList())
                expression.accept(this);
        else
            callExpression.getExpressions().accept(this);

//        for (Expression expression : callExpression.getExpressions()) {
//            expression.accept(this);
//        }
        if (callExpression.getIdentifier() != null) {
            callExpression.getIdentifier().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }
}

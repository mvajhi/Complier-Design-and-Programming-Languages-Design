package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.Value;
import main.ast.nodes.statements.ExpressionStatement;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.IdentifierSymbolTableItem;
import main.symbolTable.items.MsgHandlerTableItem;
import main.symbolTable.items.RecordNodeSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;

import java.util.List;
import java.util.Objects;

public class NameAnalyzer extends Visitor<Void> {

//   visit
    @Override
    public Void visit(Soact soact) {
        SymbolTable.top = new SymbolTable();

        soact.setSymbolTable(SymbolTable.top);

        visitAllActorDeclaration(soact);

        visitAllRecordDeclaration(soact);

        visitAllMainDeclaration(soact);

        return null;
    }

    @Override
    public Void visit(ActorDec actorDec){
        IdentifierSymbolTableItem actorDecSymbolTableItem = new IdentifierSymbolTableItem(actorDec.getName());
        checkActorName(actorDec, actorDecSymbolTableItem);

        SymbolTable actorDecSymbolTable = new SymbolTable(SymbolTable.top);
        actorDec.setSymbolTable(actorDecSymbolTable);
        SymbolTable.push(actorDecSymbolTable);

        checkActorScope(actorDec);

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ObserveHandler handler){
        handle_visit_handler(handler, "obs_msg");
        return null;
    }

    @Override
    public Void visit(ServiceHandler handler){
        handle_visit_handler(handler, "serv_msg");
        return null;
    }

    @Override
    public  Void visit(RecordNode recordNode){
        RecordNodeSymbolTableItem recordNodeSymbolTableItem = new RecordNodeSymbolTableItem(recordNode.getId().getName());
        boolean is_redefine = checkAndAddName(recordNodeSymbolTableItem);
        if (is_redefine){
            System.out.println("Line:" + recordNode.getLine() + "-> Redefinition of record " + recordNode.getId().getName());
        }
        SymbolTable recordNodeSymbolTable = new SymbolTable(SymbolTable.top);
        recordNode.setSymbolTable(recordNodeSymbolTable);
        SymbolTable.push(recordNodeSymbolTable);

        visitAllVars(recordNode.getVars());

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        visitAllExpression(expressionStatement.getExpressions());
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression){
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression){
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall){
        visitAllExpression(functionCall.getArgs());
        return null;
    }

    @Override
    public Void visit(CustomPrimitiveAccess customPrimitiveAccess){
        return null;
    }

    @Override
    public Void visit(ConstructorExpression constructorExpression){
        visitAllExpression(constructorExpression.getArgs());
        return null;
    }

    @Override
    public Void visit(Value value){
        return null;
    }

    @Override
    public Void visit(Identifier identifier){
        IdentifierSymbolTableItem tmp = new IdentifierSymbolTableItem(identifier.getName());
        if (!checkIsDeclared(tmp.getKey())) {
            System.out.println("Line:" + identifier.getLine() + "-> Variable not declared ");
        }
        return null;
    }

//    values
    @Override
    public Void visit(BooleanValue value){
        return null;
    }

    @Override
    public Void visit(IntValue value){
        return null;
    }

    @Override
    public Void visit(StringValue value){
        return null;
    }

    @Override
    public Void visit(Value value){
        return null;
    }

//    TODO: visit for statements (all types)
//    TODO: visit for expression (all types)

//  visit all
    private void visitAllStatements(List<Statement> stmts) {
        for (Statement stmt : stmts) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }
    }

    private void visitAllMsgHandler(List<Handler> handlers) {
        for (Handler msgHandler : handlers) {
            if (msgHandler != null) {
                msgHandler.accept(this);
            }
        }
    }

    private void visitAllVars(List<VarDeclaration> vars) {
        for (VarDeclaration varDec : vars) {
            if (varDec != null) {
                varDec.accept(this);
            }
        }
    }

    private void visitAllExpression(List<Expression> expressions) {
        for (Expression exp : expressions) {
            if (exp != null) {
                exp.accept(this);
            }
        }
    }

    private void visitAllMainDeclaration(Soact soact) {
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(mainSymbolTable);
        visitAllStatements(soact.getMain());
        SymbolTable.pop();
    }

    private void visitAllRecordDeclaration(Soact soact) {
        for (RecordNode recordNode : soact.getRecords()) {
            if (recordNode != null) {
                recordNode.accept(this);
            }
        }
    }

    private void visitAllActorDeclaration(Soact soact) {
        for (ActorDec actorDec : soact.getActorDecs()) {
            if (actorDec != null) {
                actorDec.accept(this);
            }
        }
    }



    private void checkActorScope(ActorDec actorDec) {
        visitAllVars(actorDec.getVars());
        visitAllMsgHandler(actorDec.getMsgHandlers());
        handleConstructor(actorDec);
    }

    private void handleConstructor(ActorDec actorDec) {
        visitAllVars(actorDec.getConstructorArgs());
        visitAllStatements(actorDec.getConstructorBody());
    }


    private void handle_visit_handler(Handler handler, String type_hand) {
        MsgHandlerTableItem msgHandlerTableItem = new MsgHandlerTableItem(
                handler.getName(), handler.getArgs(), type_hand);
        checkMsgName(handler, msgHandlerTableItem);

        SymbolTable msgDecSymbolTable = new SymbolTable(SymbolTable.top);
        handler.setSymbolTable(msgDecSymbolTable);
        SymbolTable.push(msgDecSymbolTable);

        visitAllVars(handler.getArgs());
        visitAllStatements(handler.getBody());
        visitAllExpression(handler.getAuthorizationExpressions());

        SymbolTable.pop();
    }

    private void checkMsgName(Handler handler, MsgHandlerTableItem msgHandlerTableItem) {
        if (Objects.equals(handler.getName(), handler.getClass().getName())) {
            System.out.println("Line:" + handler.getLine() + "-> Massage Handler name conflicts with Actor name");
        }
        boolean is_redefine = checkAndAddName(msgHandlerTableItem);
        if (is_redefine){
            System.out.println("Line:" + handler.getLine() + "-> Redefinition of msgHandler " + handler.getName());
        }
    }

    private void checkActorName(ActorDec actorDec, IdentifierSymbolTableItem actorDecSymbolTableItem) {
        boolean is_redefine = checkAndAddName(actorDecSymbolTableItem);
        if (is_redefine){
            System.out.println("Line:" + actorDec.getLine() + "-> Redefinition of actor " + actorDec.getName());
        }
    }

    private boolean checkAndAddName(SymbolTableItem item){
        boolean is_redefine = false;
        while (true) {
            try {
                SymbolTable.top.put(item);
                break;
            } catch (Exception exp) {
                if (!item.getName().endsWith("'")) {
                    is_redefine = true;
                }
                item.setName(item.getName() + "'");
            }
        }
        return is_redefine;
    }
}

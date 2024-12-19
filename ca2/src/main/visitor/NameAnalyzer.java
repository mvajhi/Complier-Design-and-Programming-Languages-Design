package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.ActorDecSymbolTableItem;
import main.symbolTable.items.MsgHandlerTableItem;

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
        ActorDecSymbolTableItem actorDecSymbolTableItem = new ActorDecSymbolTableItem(actorDec.getName());
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
        while (true) {
            try {
                SymbolTable.top.put(msgHandlerTableItem);
                break;
            } catch (Exception exp) {
                if (!msgHandlerTableItem.getName().endsWith("'")) {
                    System.out.println("Line:" + handler.getLine() + "-> Redefinition of msgHandler " + handler.getName());
                }
                msgHandlerTableItem.setName(msgHandlerTableItem.getName() + "'");
            }
        }
    }

    private void checkActorName(ActorDec actorDec, ActorDecSymbolTableItem actorDecSymbolTableItem) {
        while (true) {
            try {
                SymbolTable.top.put(actorDecSymbolTableItem);
                break;
            } catch (Exception exp) {
                if (!actorDecSymbolTableItem.getName().endsWith("'")) {
                    System.out.println("Line:" + actorDec.getLine() + "-> Redefinition of actor " + actorDec.getName());
                }
                actorDecSymbolTableItem.setName(actorDecSymbolTableItem.getName() + "'");
            }
        }
    }
}

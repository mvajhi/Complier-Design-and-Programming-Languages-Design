package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.ActorDecSymbolTableItem;
import main.symbolTable.items.MsgHandlerTableItem;

import java.util.List;

public class NameAnalyzer extends Visitor<Void> {

    @Override
    public Void visit(Soact soact) {
        SymbolTable.top = new SymbolTable();

        soact.setSymbolTable(SymbolTable.top);

        visitAllActorDeclaration(soact);

        visitAllRecordDeclaration(soact);

        visitAllMainDeclaration(soact);

        return null;
    }

    private void visitAllMainDeclaration(Soact soact) {
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(mainSymbolTable);
        for (Statement stmt : soact.getMain()) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }
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

    private void checkActorScope(ActorDec actorDec) {
        checkActorVars(actorDec);
        checkActorMsgHandler(actorDec);
    }

    private void checkActorMsgHandler(ActorDec actorDec) {
        for (Handler msgHandler : actorDec.getMsgHandlers()) {
            if (msgHandler != null) {
                msgHandler.accept(this);
            }
        }
    }

    public Void visit(ObserveHandler handler){
        handle_visit_handler(handler, "obs_msg");
        return null;
    }

    private void handle_visit_handler(Handler handler, String type_hand) {
        MsgHandlerTableItem msgHandlerTableItem = new MsgHandlerTableItem(
                handler.getName(), handler.getArgs(), type_hand);
        checkMsgName(handler, msgHandlerTableItem);

        SymbolTable msgDecSymbolTable = new SymbolTable(SymbolTable.top);
        handler.setSymbolTable(msgDecSymbolTable);
        SymbolTable.push(msgDecSymbolTable);


//        TODO: check args name
        for (VarDeclaration arg : handler.getArgs()) {
            arg.accept(this);
        }

//        TODO: check scope

        SymbolTable.pop();
    }

    private void checkMsgName(Handler handler, MsgHandlerTableItem msgHandlerTableItem) {
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

    private void checkActorVars(ActorDec actorDec) {
        for (VarDeclaration varDec : actorDec.getVars()) {
            if (varDec != null) {
                varDec.accept(this);
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

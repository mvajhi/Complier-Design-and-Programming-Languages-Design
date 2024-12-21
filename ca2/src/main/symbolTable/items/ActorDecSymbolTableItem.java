package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.symbolTable.SymbolTable;

public class ActorDecSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "ActorDec_";

    private String ActorName;

    public ActorDecSymbolTableItem(String actorName) {
        this.ActorName = actorName;
    }

    @Override
    public String getKey() {
        return START_KEY + this.ActorName;
    }

    public String getActorName() {
        return ActorName;
    }

    public void setActorName(String actorName) {
        this.ActorName = actorName;
    }
}

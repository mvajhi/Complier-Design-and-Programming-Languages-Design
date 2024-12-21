package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.symbolTable.SymbolTable;

public class ActorDecSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "ActorDec_";

    public ActorDecSymbolTableItem(String actorName) {
        this.name = actorName;
    }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }

    public String getActorName() {
        return name;
    }

    public void setActorName(String actorName) {
        this.name = actorName;
    }
}

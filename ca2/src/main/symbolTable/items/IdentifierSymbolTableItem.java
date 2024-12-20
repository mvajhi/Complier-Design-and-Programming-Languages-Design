package main.symbolTable.items;

public class IdentifierSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Identifier_";

    private String ActorName;

    public IdentifierSymbolTableItem(String actorName) {
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

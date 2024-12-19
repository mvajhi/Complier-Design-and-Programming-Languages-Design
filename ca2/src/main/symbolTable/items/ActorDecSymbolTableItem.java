package main.symbolTable.items;

public class ActorDecSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "ActorDec_";

    private String ActorName;

    public ActorDecSymbolTableItem(String functionName) {
        this.ActorName = functionName;
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

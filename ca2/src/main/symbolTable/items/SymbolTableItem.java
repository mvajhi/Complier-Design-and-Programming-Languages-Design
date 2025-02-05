package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.ast.nodes.expression.InitRecord;
import main.ast.nodes.type.Type;

public abstract class SymbolTableItem {
    protected String name;
    private ActorDec actorDec;
    private InitRecord initRecord;
    private Type type;

    public abstract String getKey();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActorDec(ActorDec actorDec){
        this.actorDec = actorDec;
    }

    public ActorDec getActorDec(){
        return actorDec;
    }

    public void setType(Type type){
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    public InitRecord getInitRecord() {
        return initRecord;
    }

    public void setInitRecord(InitRecord initRecord) {
        this.initRecord = initRecord;
    }
}

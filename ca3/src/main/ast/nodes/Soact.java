package main.ast.nodes;

import main.ast.nodes.declaration.ActorDec;
import main.ast.nodes.declaration.Main;
import main.ast.nodes.declaration.RecordNode;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Soact extends Node{
    private ArrayList<ActorDec> actorDecs = new ArrayList<>();
    private ArrayList<RecordNode> records = new ArrayList<>();
    private Main main;
    private SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void addActorDec(ActorDec actorDec) {
        this.actorDecs.add(actorDec);
    }

    public void addRecordNode(RecordNode recordNode) {
        this.records.add(recordNode);
    }

    public void setMain(Main _main){
        this.main = _main;
    }

    public Soact() {}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<ActorDec> getActorDecs() {
        return actorDecs;
    }

    public void setActorDecs(ArrayList<ActorDec> actorDecs) {
        this.actorDecs = actorDecs;
    }

    public ArrayList<RecordNode> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<RecordNode> records) {
        this.records = records;
    }

    public Main getMain() {
        return main;
    }
}

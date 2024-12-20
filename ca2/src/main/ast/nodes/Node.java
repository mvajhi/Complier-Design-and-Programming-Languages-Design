package main.ast.nodes;

import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public abstract class Node {
    protected int line;

    public void setLine(int line){this.line = line;}
    public int getLine(){return this.line;}
    public abstract <T> T accept(IVisitor<T> visitor);

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private SymbolTable symbolTable;
}

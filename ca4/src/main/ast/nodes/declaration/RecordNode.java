package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.expression.Identifier;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class RecordNode extends Declaration {
    private Identifier id;
    private ArrayList<VarDeclaration> vars = new ArrayList<>();
    private SymbolTable symbolTable;
    
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public RecordNode(Identifier _id, int _line) {
        id = _id;
        line = _line;
    }

    public void addVar(VarDeclaration varDeclaration){vars.add(varDeclaration);}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public ArrayList<VarDeclaration> getVars() {
        return vars;
    }

    public void setVars(ArrayList<VarDeclaration> vars) {
        this.vars = vars;
    }
}

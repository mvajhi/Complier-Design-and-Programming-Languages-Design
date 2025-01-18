package main.symbolTable.items;

import main.ast.nodes.declaration.RecordNode;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.type.Type;

public class VarDeclarationItem extends SymbolTableItem {
    public static final String START_KEY = "VarDeclaration_";

    private VarDeclaration varDeclaration;
    private Expression initValue;

    public VarDeclarationItem(VarDeclaration varDeclaration) {
        this.varDeclaration = varDeclaration;
    }

    public VarDeclarationItem(VarDeclaration assignee, Expression assigned) {
        this.varDeclaration = assignee;
        this.initValue = assigned;
    }

    public Type getType(){return varDeclaration.getType();}

    @Override
    public String getKey() {
        return START_KEY + this.varDeclaration.getName().getName();
    }
}

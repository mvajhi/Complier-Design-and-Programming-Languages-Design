package main.symbolTable.items;

import main.ast.nodes.type.Type;

public class IdentifierSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Identifier_";

    private String idName;

    public IdentifierSymbolTableItem(String idName) {
        this.idName = idName;
    }

    @Override
    public String getKey() {
        return START_KEY + this.idName;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }
}

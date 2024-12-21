package main.symbolTable.items;

import main.ast.nodes.type.Type;

public class IdentifierSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Identifier_";

    public IdentifierSymbolTableItem(String idName) {
        this.name = idName;
    }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }

    public String getIdName() {
        return name;
    }

    public void setIdName(String idName) {
        this.name = idName;
    }
}

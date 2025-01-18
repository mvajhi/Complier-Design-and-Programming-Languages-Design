package main.symbolTable.items;

import main.ast.nodes.declaration.CustomPrimitiveDeclaration;

public class CustomPrimitiveDeclarationItem extends SymbolTableItem {
    public static final String START_KEY = "CustomPrimitiveDeclaration_";

    private CustomPrimitiveDeclaration customPrimitiveDeclaration;

    public CustomPrimitiveDeclarationItem(CustomPrimitiveDeclaration customPrimitiveDeclaration) {
        this.customPrimitiveDeclaration = customPrimitiveDeclaration;
    }

    @Override
    public String getKey() {
        return START_KEY + this.customPrimitiveDeclaration.getName().getName();
    }
}

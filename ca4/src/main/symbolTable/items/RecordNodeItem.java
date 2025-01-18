package main.symbolTable.items;

import main.ast.nodes.declaration.RecordNode;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.type.IdType;
import main.ast.nodes.type.Type;
import main.symbolTable.items.SymbolTableItem;

import java.util.HashMap;

public class RecordNodeItem extends SymbolTableItem {
    public static final String START_KEY = "RecordNode_";

    private RecordNode recordNode;
    HashMap<String, Type> fields = new HashMap<>();

    public RecordNodeItem(RecordNode recordNode) {
        this.recordNode = recordNode;
    }

    public void addField(VarDeclaration field) { fields.put(field.getName().getName(), field.getType()); }

    public Type getFieldType(Identifier fieldName){
        return fields.get(fieldName.getName());
    }

    @Override
    public String getKey() {
        return START_KEY + this.recordNode.getId().getName();
    }
}

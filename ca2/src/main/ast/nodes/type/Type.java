package main.ast.nodes.type;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class Type extends Node {
    private String typeName;
    private boolean isBuiltInType;
    private boolean isArray;

    public Type(String typeName) {
        this.typeName = typeName;
        this.isBuiltInType = true;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean getIsBuiltInType() {
        return isBuiltInType;
    }

    public void setIsBuiltInType(boolean isBuiltInType) {
        this.isBuiltInType = isBuiltInType;
    }

    public boolean getIsArray() {
        return isArray;
    }

    public void setIsArray(boolean isArray) {
        this.isArray = isArray;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

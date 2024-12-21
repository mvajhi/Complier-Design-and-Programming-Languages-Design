package main.ast.nodes.type;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class Type extends Node {
    private String typeName;
    private boolean isBuiltInType;
    private boolean isArray;
    private ContainerType container;

    public Type(String typeName) {
        this.typeName = typeName;
        this.isBuiltInType = true;
        this.container = null;
    }

    public void setContainer(ContainerType container){
        this.container = container;
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

    public String getSimpKey(){
        return typeName + isArray;
    }

    public String getKey(){
        if (container == null) {
            return typeName + isArray;
        }
        else {
            return container.getTypeNameContainer();
        }
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

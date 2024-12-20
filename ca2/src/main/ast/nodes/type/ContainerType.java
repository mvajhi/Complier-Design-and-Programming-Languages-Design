package main.ast.nodes.type;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

public class ContainerType extends Type {
    private Type innerType;

    public ContainerType(String typeName, Type innerType) {
        super(typeName);
        this.innerType = innerType;
    }

    public Type getInnerType() {
        return innerType;
    }

    public void setInnerType(Type innerType) {
        this.innerType = innerType;
    }

    @Override
    public Void accept(IVisitor visitor) {
        return null;
    }
}

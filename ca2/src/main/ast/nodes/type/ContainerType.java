package main.ast.nodes.type;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

public class ContainerType extends Type {
    private Type innerType;

    public ContainerType(String typeName, Type innerType) {
        super(typeName);
        this.innerType = innerType;
        this.setContainer(this);
    }

    public Type getInnerType() {
        return innerType;
    }

    public void setInnerType(Type innerType) {
        this.innerType = innerType;
    }

    public String getTypeNameContainer() {
        return super.getSimpKey() + "<" + innerType.getTypeName() + ">";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

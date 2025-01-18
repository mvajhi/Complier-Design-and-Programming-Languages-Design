package main.ast.nodes.type;

import main.visitor.IVisitor;

public class ArrayType extends Type{
    private Type type;
    public ArrayType(Type type) {
        this.type = type;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }

    public Type getType(){
        return type;
    }

}

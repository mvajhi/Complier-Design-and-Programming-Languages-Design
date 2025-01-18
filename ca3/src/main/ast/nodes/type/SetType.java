package main.ast.nodes.type;

import main.visitor.IVisitor;

import java.util.Set;

public class SetType extends Type{
    private Type type;
    public SetType(Type type) {
        this.type = type;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }

    public Type getType(){
        return type;
    }
}

package main.ast.nodes.type;

import main.visitor.IVisitor;

public class BooleanType extends Type{
    public BooleanType() {

    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }

}

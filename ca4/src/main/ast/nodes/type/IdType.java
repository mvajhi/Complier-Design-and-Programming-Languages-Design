package main.ast.nodes.type;

import main.visitor.IVisitor;

public class IdType extends Type{
    public IdType() {

    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }
}

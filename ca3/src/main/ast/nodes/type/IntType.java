package main.ast.nodes.type;

import main.visitor.IVisitor;

public class IntType extends Type{
    public IntType() {

    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }

}

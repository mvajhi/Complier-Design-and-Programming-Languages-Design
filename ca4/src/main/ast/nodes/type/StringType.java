package main.ast.nodes.type;

import main.visitor.IVisitor;

public class StringType extends Type{
    public StringType() {

    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }

}

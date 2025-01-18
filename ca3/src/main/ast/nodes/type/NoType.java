package main.ast.nodes.type;

import main.visitor.IVisitor;

public class NoType extends Type{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}

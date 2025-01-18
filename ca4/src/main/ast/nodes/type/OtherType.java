package main.ast.nodes.type;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.Objects;

public class OtherType extends Type{
    private String name;
    public OtherType(String name) {
        this.name = name;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }

    @Override
    public String toString() { return name; }

    public String getName() {
        return name;
    }
}

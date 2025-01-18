package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.type.Type;
import main.visitor.IVisitor;

public class ArrayIndex extends Declaration{
    private String number;

    public ArrayIndex(String number) {
        this.number = number;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}
}

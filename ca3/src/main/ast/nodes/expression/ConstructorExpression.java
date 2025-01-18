package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ConstructorExpression extends Expression{
    private Identifier Id ;
    private Expression args;

    public ConstructorExpression(Identifier _id, int _line) {
        Id = _id;
        line = _line;
    }

    public void setArgs(Expression _args){
        args = _args;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getId() {
        return Id;
    }

    public void setId(Identifier id) {
        Id = id;
    }
}

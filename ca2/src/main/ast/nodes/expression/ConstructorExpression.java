package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class ConstructorExpression extends Expression{
    private Identifier Id ;
    private List<Expression> args = new ArrayList<>();

    public ConstructorExpression(Identifier _id, int _line) {
        Id = _id;
        line = _line;
    }

    public void setArgs(List<Expression> _args){
        args.addAll(_args);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

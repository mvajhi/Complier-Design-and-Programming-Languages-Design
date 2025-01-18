package main.ast.nodes.expression;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class SelfExpression extends Expression {
    public SelfExpression() {
        super();
    }

    @Override
    public String toString() {
        return "SelfExpression";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
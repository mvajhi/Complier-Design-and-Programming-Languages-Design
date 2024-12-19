package main.ast.nodes.expression.value;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class IntValue extends Expression {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

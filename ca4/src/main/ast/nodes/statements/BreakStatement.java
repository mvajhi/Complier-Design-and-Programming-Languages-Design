package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class BreakStatement extends Statement {
    public BreakStatement() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

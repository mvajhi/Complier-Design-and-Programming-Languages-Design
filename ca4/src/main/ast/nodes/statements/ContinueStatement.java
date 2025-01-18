package main.ast.nodes.statements;

import main.visitor.IVisitor;

public class ContinueStatement extends Statement {
    public ContinueStatement() {
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ExpressionStatement extends Statement {
    Expression expression;

    public ExpressionStatement(Expression expression, int _line) {
        this.expression = expression;
        line = _line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}

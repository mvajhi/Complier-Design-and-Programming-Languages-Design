package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class ExpressionStatement extends Statement {
    List<Expression> expression = new ArrayList<>();

    public ExpressionStatement(List<Expression> expression, int _line) {
        this.expression.addAll(expression);
        line = _line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

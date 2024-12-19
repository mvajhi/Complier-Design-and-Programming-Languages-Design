package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class WhileStatement extends Statement{
    private List<Expression> conditions = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();

    public WhileStatement(List<Expression> conditions, List<Statement> body, int _line) {
        this.conditions = conditions;
        this.body = body;
        line = _line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

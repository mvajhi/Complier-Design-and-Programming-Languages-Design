package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class WhileStatement extends Statement{
    private Expression condition;
    private ArrayList<Statement> body = new ArrayList<>();

    public WhileStatement(Expression condition, ArrayList<Statement> body, int _line) {
        this.condition = condition;
        this.body = body;
        line = _line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expression getConditions() {
        return condition;
    }

    public void setConditions(Expression condition) {
        this.condition = condition;
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }
}

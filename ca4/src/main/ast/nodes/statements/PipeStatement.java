package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class PipeStatement extends Statement{
    private Expression assignee;
    private Expression assigned;
    private Expression pipeExpressions;

    public PipeStatement(int _line) {
        line = _line;
    }

    public void setAssignee(Expression _assignee) {
        this.assignee = _assignee;
    }

    public void setAssigned(Expression _assigned) {
        this.assigned = _assigned;
    }

    public void addPipeExp(Expression expression) {
        this.pipeExpressions = expression;
    }

    public Expression getAssignee(){
        return assignee;
    }

    public Expression getAssigned(){
        return assigned;
    }

    public Expression getPipeExpressions(){
        return pipeExpressions;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class PipeStatement extends Statement{
    private List<Expression> assignee = new ArrayList<>();
    private List<Expression> assigned = new ArrayList<>();
    private List<Expression> pipeExpressions = new ArrayList<>();

    public PipeStatement(int _line) {
        line = _line;
    }

    public void setAssignee(List<Expression> _assignee) {
        this.assignee.addAll(_assignee);
    }

    public void setAssigned(List<Expression> _assigned) {
        this.assigned.addAll(_assigned);
    }

    public void addPipeExp(List<Expression> expression){
        pipeExpressions.addAll(expression);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

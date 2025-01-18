package main.ast.nodes.statements;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitStatement extends Statement{
    private VarDeclaration assignee;
    private Expression assigend;

    public InitStatement(VarDeclaration assignee, Expression assigend, int _line) {
        this.assignee = assignee;
        this.assigend = assigend;
        line = _line;
    }

    public VarDeclaration getAssignee(){
        return assignee;
    }

    public Expression getAssigned(){
        return assigend;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

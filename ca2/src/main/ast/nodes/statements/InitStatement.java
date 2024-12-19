package main.ast.nodes.statements;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class InitStatement extends Statement{
    private VarDeclaration assignee;
    private List<Expression> assigend = new ArrayList<>();

    public InitStatement(VarDeclaration assignee, List<Expression> assigend, int _line) {
        this.assignee = assignee;
        this.assigend.addAll(assigend);
        line = _line;
    }


    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

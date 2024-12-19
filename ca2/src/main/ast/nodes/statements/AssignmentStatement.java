package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

public class AssignmentStatement extends Statement{
    List<Identifier> ids = new ArrayList<>();
    List<Expression> assigned = new ArrayList<>();

    public AssignmentStatement() {}

    public void addIdentifier(Identifier id){
        ids.add(id);
    }

    public void setAssigned(List<Expression> _assigned){
        assigned.addAll(_assigned);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}

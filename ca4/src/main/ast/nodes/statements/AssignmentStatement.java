package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.IdentityHashMap;

public class AssignmentStatement extends Statement{
    ArrayList<Identifier> ids = new ArrayList<>();
    Expression assigned;

    public AssignmentStatement() {}

    public void addIdentifier(Identifier id){
        ids.add(id);
    }

    public void setAssigned(Expression _assigned) {
        assigned = _assigned;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Identifier> getIds() {
        return ids;
    }

    public void setIds(ArrayList<Identifier> ids) {
        this.ids = ids;
    }

    public Expression getAssigned() {
        return assigned;
    }
}

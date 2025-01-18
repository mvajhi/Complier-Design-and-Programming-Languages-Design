package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ObserveStatement extends Statement{
    ArrayList<Identifier> ids = new ArrayList<>();
    Expression args;
    ArrayList<Expression> observers = new ArrayList<>();

    public ObserveStatement() {}

    public void addId(Identifier id){
        ids.add(id);
    }

    public void setArgs(Expression _args){
        args = _args;
    }
    public void setObservers(ArrayList<Expression> _observers){
        observers.addAll(_observers);
    }

    public ArrayList<Identifier> getIds(){
        return ids;
    }

    public Expression getArgs(){
        return args;
    }

    public ArrayList<Expression> getObservers(){
        return observers;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

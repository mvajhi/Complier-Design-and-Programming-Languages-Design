package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObserveStatement extends Statement{
    List<Identifier> ids = new ArrayList<>();
    List<Expression> args = new ArrayList<>();
    List<Expression> observers = new ArrayList<>();

    public ObserveStatement() {}

    public void addId(Identifier id){
        ids.add(id);
    }

    public void setArgs(List<Expression> _args){
        args.addAll(_args);
    }

    public void setObservers(List<Expression> _observers){
        observers.addAll(_observers);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

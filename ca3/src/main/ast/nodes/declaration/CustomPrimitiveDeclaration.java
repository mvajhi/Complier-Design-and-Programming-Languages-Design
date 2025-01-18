package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class CustomPrimitiveDeclaration extends Declaration{
    private Identifier name ;

    private ArrayList<Identifier> states = new ArrayList<>();

    public CustomPrimitiveDeclaration(Identifier _name, int _line) {
        this.name = _name;
        line = _line;
    }

    public void addState(Identifier state){
        states.add(state);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public ArrayList<Identifier> getStates() {
        return states;
    }

    public void setStates(ArrayList<Identifier> states) {
        this.states = states;
    }
}

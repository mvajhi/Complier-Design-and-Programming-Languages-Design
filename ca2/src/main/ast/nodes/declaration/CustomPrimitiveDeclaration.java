package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class CustomPrimitiveDeclaration extends Declaration{
    private Identifier name ;

    private List<Identifier> states = new ArrayList<>();

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
}

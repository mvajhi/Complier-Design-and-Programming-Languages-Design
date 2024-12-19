package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

public class VarDeclaration extends Declaration{
    private Identifier name;

    public VarDeclaration(Identifier _name, int _line) {
        this.name = _name;
        line = _line;
    }

    public Identifier getName(){return this.name;}

    public void setName(Identifier name){this.name = name;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}
}

package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.type.Type;
import main.visitor.IVisitor;

public class VarDeclaration extends Declaration{
    private Identifier name;
    private Type type;

    public VarDeclaration(Identifier _name, Type _type, int _line) {
        this.name = _name;
        line = _line;
        this.type = _type;
    }

    public Identifier getName(){return this.name;}

    public void setName(Identifier name){this.name = name;}

    public Type getType(){return this.type;}

    public void setType(Type type){this.type = type;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}
}

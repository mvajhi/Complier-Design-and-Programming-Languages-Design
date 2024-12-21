package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.type.Type;
import main.visitor.IVisitor;

public class VarDeclaration extends Declaration{
    private Identifier identifier;
    private Type type;

    public VarDeclaration(Identifier _identifier, Type _type, int _line) {
        this.identifier = _identifier;
        line = _line;
        this.type = _type;
    }

    public Identifier getIdentifier(){return this.identifier;}

    public void setIdentifier(Identifier identifier){this.identifier = identifier;}

    public Type getType(){return this.type;}

    public void setType(Type type){this.type = type;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}
}

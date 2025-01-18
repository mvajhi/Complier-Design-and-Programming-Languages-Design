package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.type.Type;
import main.visitor.IVisitor;

public class VarDeclaration extends Declaration{
    private Identifier name;
    private Type type;
    private ArrayIndex arrayIndex = null;

    public void setArrayIndex(ArrayIndex arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    public VarDeclaration(Identifier _name, int _line, Type type) {
        this.name = _name;
        line = _line;
        this.type = type;
    }

    public Identifier getName(){return this.name;}

    public void setName(Identifier name){this.name = name;}

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayIndex getArrayIndex() {
        return arrayIndex;
    }
}

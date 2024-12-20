package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class CustomPrimitiveAccess extends Expression {

    private Identifier primitiveName;
    private Identifier subName;

    public CustomPrimitiveAccess(Identifier primitiveName_, Identifier subName_) {
        this.primitiveName = primitiveName_;
        this.subName = subName_;
    }

    public Identifier getPrimitiveName() {
        return primitiveName;
    }

    public void setPrimitiveName(Identifier primitiveName) {
        this.primitiveName = primitiveName;
    }

    public Identifier getSubName() {
        return subName;
    }

    public void setSubName(Identifier subName) {
        this.subName = subName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}


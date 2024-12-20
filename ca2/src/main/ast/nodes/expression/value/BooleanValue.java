package main.ast.nodes.expression.value;

import main.visitor.IVisitor;

public class BooleanValue extends Value {
    private boolean constant;

    public BooleanValue(boolean constant) {
        this.constant = constant;
    }

    public boolean getConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}

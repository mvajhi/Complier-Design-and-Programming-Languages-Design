package main.ast.nodes.expression.value;

import main.visitor.IVisitor;

public class StringValue extends Value {
    private String constant;

    public StringValue(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}

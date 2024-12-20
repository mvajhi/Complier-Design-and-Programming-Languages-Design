package main.ast.nodes.expression.value;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public abstract class Value extends Expression {
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
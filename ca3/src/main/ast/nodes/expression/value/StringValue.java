package main.ast.nodes.expression.value;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

public class StringValue extends Expression {
    private String str;
    public StringValue(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    @Override
    public String toString(){return "StringValue:"+this.str;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

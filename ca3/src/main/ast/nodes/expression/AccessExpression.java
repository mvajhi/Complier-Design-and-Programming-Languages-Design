package main.ast.nodes.expression;

import main.ast.nodes.expression.operator.UnaryOperator;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class AccessExpression extends Expression{
    private Expression left;
    private Expression right;

    public AccessExpression() { }
    public AccessExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString(){return "AccessExpression";}

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}

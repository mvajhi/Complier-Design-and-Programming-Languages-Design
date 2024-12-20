package main.ast.nodes.expression;

import main.visitor.IVisitor;
import main.visitor.Visitor;
import main.ast.nodes.expression.operators.BinaryOperator;

public class DotExpression extends Expression {

    private Expression left;
    private Expression right;

    public DotExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}


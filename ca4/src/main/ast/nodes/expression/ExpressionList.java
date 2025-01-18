package main.ast.nodes.expression;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ExpressionList extends Expression {
    private ArrayList<Expression> expressionList = new ArrayList<>();

    public ExpressionList() {
    }

    public ExpressionList(Expression expression) {
        this.expressionList.add(expression);
    }

    public void add(Expression expression) {
        this.expressionList.add(expression);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(ArrayList<Expression> expressionList) {
        this.expressionList = expressionList;
    }
}
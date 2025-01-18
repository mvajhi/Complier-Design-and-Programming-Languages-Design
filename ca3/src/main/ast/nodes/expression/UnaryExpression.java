package main.ast.nodes.expression;

import main.ast.nodes.expression.operator.UnaryOperator;
import main.visitor.IVisitor;

public class UnaryExpression extends Expression{
    private Expression operand;
    protected UnaryOperator unaryOperator;

    public UnaryExpression() { }
    public UnaryExpression(Expression operand, UnaryOperator unaryOperator){
        this.operand = operand;
        this.unaryOperator = unaryOperator;
    }
    public UnaryExpression(Expression operand, UnaryOperator unaryOperator, int line){
        this.operand = operand;
        this.unaryOperator = unaryOperator;
        this.setLine(line);
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    public void setExpression(Expression operand) {
        this.operand = operand;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public String toString(){return "UnaryOperation:" + this.unaryOperator.name();}

    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}

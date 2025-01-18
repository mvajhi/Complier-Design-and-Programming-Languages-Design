package main.ast.nodes.expression;

import main.ast.nodes.expression.operator.BinaryOperator;
import main.visitor.IVisitor;

public class BinaryExpression extends Expression{
    private Expression leftOperand;
    private Expression rightOperand;
    private BinaryOperator binaryOperator;

    public BinaryExpression() { }
    public BinaryExpression(Expression leftOperand, Expression rightOperand,
                            BinaryOperator binaryOperator){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.binaryOperator = binaryOperator;
    }
    public BinaryExpression(Expression leftOperand, Expression rightOperand,
                            BinaryOperator binaryOperator, int line){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.binaryOperator = binaryOperator;
        this.setLine(line);
    }

    public void setBinaryOperator(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    public void setLeftOperand(Expression leftOperand) {
        this.leftOperand = leftOperand;
    }

    public void setRightOperand(Expression rightOperand) {
        this.rightOperand = rightOperand;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    @Override
    public String toString(){return "BinaryOperation:" + this.binaryOperator.name();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}

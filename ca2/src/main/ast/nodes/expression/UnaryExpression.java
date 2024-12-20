package main.ast.nodes.expression;

import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.operators.UnarySide;
import main.visitor.IVisitor;

public class UnaryExpression extends Expression {

    private UnaryOperator unaryOperator;
    private Expression operand;
    private UnarySide unarySide;

    public UnaryExpression(UnaryOperator unaryOperator, UnarySide side, Expression operand) {
        this.unaryOperator = unaryOperator;
        this.operand = operand;
        this.unarySide = side;
    }

    public Expression getOperand() {
        return operand;
    }

    public UnarySide getUnarySide() {
        return unarySide;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    public void setUnarySide(UnarySide unarySide) {
        this.unarySide = unarySide;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

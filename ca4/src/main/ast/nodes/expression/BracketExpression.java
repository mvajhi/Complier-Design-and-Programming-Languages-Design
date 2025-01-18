package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class BracketExpression extends Expression{
    private ArrayList<Expression> accessExpressions = new ArrayList<>();
    private BracketExpression bracketExpression = null;

    public BracketExpression() { }
    public BracketExpression(ArrayList<Expression> _accessExpressions) {
        accessExpressions.addAll(_accessExpressions);
    }

    public void setAccessExpressions(ArrayList<Expression> _accessExpressions){
        accessExpressions.addAll(_accessExpressions);
    }

    public void setBracketExpression(BracketExpression _bracketExpression){
        bracketExpression = _bracketExpression;
    }

    public ArrayList<Expression> getAccessExpressions(){
        return accessExpressions;
    }

    public BracketExpression getBracketExpression(){
        return bracketExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

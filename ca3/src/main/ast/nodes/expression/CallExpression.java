package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class CallExpression extends Expression {
    private String handlerName;
    private Expression expressions;
    private boolean isIdentifier = false;
    private Identifier identifier = null;
    public CallExpression() { }
    public CallExpression(String _handlerName, Expression _expressions) {
        handlerName = _handlerName;
        expressions = _expressions;
    }

    public void setHandlerName(String _handlerName){
        handlerName = _handlerName;
    }

    public void setExpressions(Expression _expressions) {
        expressions = _expressions;
    }

    public void setIdentifier(Identifier _identifier){
        identifier = _identifier;
        isIdentifier = true;
    }

    public String getHandlerName(){
        return handlerName;
    }

    public Expression getExpressions(){
        return expressions;
    }

    public Identifier getIdentifier(){
        return identifier;
    }

    public boolean isIdentifier(){
        return isIdentifier;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public void setIdentifier(boolean identifier) {
        isIdentifier = identifier;
    }
}

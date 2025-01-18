package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class CustomPrimAccessExpression extends Expression {
    private Identifier id1;
    private Identifier id2;

    public CustomPrimAccessExpression() { }
    public CustomPrimAccessExpression(Identifier _id1, Identifier _id2) {
        id1 = _id1;
        id2 = _id2;
    }

    public void setId1(Identifier _id1){
        id1 = _id1;
    }

    public void setId2(Identifier _id2){
        id2 = _id2;
    }

    public Identifier getId1(){
        return id1;
    }

    public Identifier getId2(){
        return id2;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

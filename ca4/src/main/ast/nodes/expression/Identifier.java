package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class Identifier extends Expression{
    private String name;
    public Identifier(String _name) {name = _name;}
    public void setName(String name) {this.name = name;}
    public String getName(){return this.name;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}

    public static Identifier createId(String name ,int line){
        Identifier id = new Identifier(name);
        id.setLine(line);
        return id ;
    }
}

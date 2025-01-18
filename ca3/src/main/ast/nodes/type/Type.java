package main.ast.nodes.type;

import main.ast.nodes.Node;

public abstract class Type extends Node {
    public boolean hasSameType(Type other){
        return (this.getClass().equals(other.getClass())) && !((this instanceof NoType) || (other instanceof NoType));
    }
}

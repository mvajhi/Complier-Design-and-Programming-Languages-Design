package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class ObserveHandler extends Handler{
    public ObserveHandler(int _line) {
        line = _line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

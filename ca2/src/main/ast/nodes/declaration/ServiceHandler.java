package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class ServiceHandler extends Handler{
    public ServiceHandler(int _line) {
        line = _line;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

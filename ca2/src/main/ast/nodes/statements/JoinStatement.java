package main.ast.nodes.statements;

import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class JoinStatement extends Statement{
    List<Statement> body = new ArrayList<>();

    public JoinStatement(int _line) {
        line = _line;
    }

    public void setBody(List<Statement> _body){
        body.addAll(_body);
    }

    public List<Statement> getBody() {
        return body;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

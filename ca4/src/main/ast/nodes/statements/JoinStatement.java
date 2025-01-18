package main.ast.nodes.statements;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class JoinStatement extends Statement{
    ArrayList<Statement> body = new ArrayList<>();

    public JoinStatement(int _line) {
        line = _line;
    }

    public void setBody(ArrayList<Statement> _body){
        body.addAll(_body);
    }
    public ArrayList<Statement> getBody(){
        return body;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

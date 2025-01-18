package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class IfStatement extends Statement{
    private Expression ifConds;
    private ArrayList<Statement> ifBody = new ArrayList<>();
    private ArrayList<Expression> elseIfBlocksConds = new ArrayList<>();
    private ArrayList<ArrayList<Statement>> elseIfBlocksBody = new ArrayList<>();
    private ArrayList<Statement> elseBody = new ArrayList<>();

    public IfStatement(int _line) {
        line = _line;
    }

    public void setIfConds(Expression _ifConds) {
        ifConds = _ifConds;
    }

    public void setIfBody(ArrayList<Statement> _ifBody){
        ifBody.addAll(_ifBody);
    }

    public void addElseIfcond(Expression cond){
        elseIfBlocksConds.add(cond);
    }

    public void addElseIfBody(ArrayList<Statement> body){
        elseIfBlocksBody.add(body);
    }

    public void setElseBody(ArrayList<Statement> body){
        elseBody.addAll(body);
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Expression getIfConds() {
        return ifConds;
    }

    public ArrayList<Statement> getIfBody() {
        return ifBody;
    }

    public ArrayList<Expression> getElseIfBlocksConds() {
        return elseIfBlocksConds;
    }

    public void setElseIfBlocksConds(ArrayList<Expression> elseIfBlocksConds) {
        this.elseIfBlocksConds = elseIfBlocksConds;
    }

    public ArrayList<ArrayList<Statement>> getElseIfBlocksBody() {
        return elseIfBlocksBody;
    }

    public void setElseIfBlocksBody(ArrayList<ArrayList<Statement>> elseIfBlocksBody) {
        this.elseIfBlocksBody = elseIfBlocksBody;
    }

    public ArrayList<Statement> getElseBody() {
        return elseBody;
    }
}

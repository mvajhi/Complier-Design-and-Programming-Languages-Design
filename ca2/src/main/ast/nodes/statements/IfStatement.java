package main.ast.nodes.statements;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends Statement{
    private List<Expression> ifConds = new ArrayList<>();
    private List<Statement> ifBody = new ArrayList<>();
    private List<List<Expression>> elseIfBlocksConds = new ArrayList<>();
    private List<List<Statement>> elseIfBlocksBody = new ArrayList<>();
    private List<Statement> elseBody = new ArrayList<>();

    public IfStatement(int _line) {
        line = _line;
    }

    public void setIfConds(List<Expression> _ifConds){
        ifConds.addAll(_ifConds);
    }

    public void setIfBody(List<Statement> _ifBody){
        ifBody.addAll(_ifBody);
    }

    public void addElseIfcond(List<Expression> conds){
        elseIfBlocksConds.add(conds);
    }

    public void addElseIfBody(List<Statement> body){
        elseIfBlocksBody.add(body);
    }

    public void setElseBody(List<Statement> body){
        elseBody.addAll(body);
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

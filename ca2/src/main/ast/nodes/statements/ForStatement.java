package main.ast.nodes.statements;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends Statement{
    private Identifier iterator;
    private List<Expression> conditions = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();

    public ForStatement(List<Expression> loopConditions, List<Statement> _body, int _line) {
        line = _line;
        body.addAll(_body);
        iterator = (Identifier) loopConditions.getFirst();
        for (int i = 1 ; i < loopConditions.size(); i++)
            conditions.add(loopConditions.get(i));
    }


    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}

    public Identifier getIterator() {
        return iterator;
    }

    public List<Expression> getConditions() {
        return conditions;
    }

    public List<Statement> getBody() {
        return body;
    }
}

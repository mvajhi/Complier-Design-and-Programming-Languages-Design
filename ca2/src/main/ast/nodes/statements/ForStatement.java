package main.ast.nodes.statements;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends Statement{
    private VarDeclaration iterator;
    private List<Expression> conditions = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();

    public ForStatement(List<Expression> loopConditions, List<Statement> _body, int _line) {
        line = _line;
        body.addAll(_body);
        Identifier iterId = (Identifier) loopConditions.getFirst();
        iterator = new VarDeclaration(iterId, iterId.getLine());
        for (int i = 1 ; i < loopConditions.size(); i++)
            conditions.add(loopConditions.get(i));
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}
}

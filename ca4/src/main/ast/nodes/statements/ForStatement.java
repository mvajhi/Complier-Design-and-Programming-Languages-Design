package main.ast.nodes.statements;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.type.IntType;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ForStatement extends Statement{
    private VarDeclaration iterator;
    private ArrayList<Expression> conditions = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private SymbolTable symbolTable;

    public ForStatement(ArrayList<Expression> loopConditions, ArrayList<Statement> _body, int _line) {
        line = _line;
        body.addAll(_body);
        Identifier iterId = (Identifier) loopConditions.getFirst();
        iterator = new VarDeclaration(iterId, iterId.getLine(), new IntType());
        for (int i = 1 ; i < loopConditions.size(); i++)
            conditions.add(loopConditions.get(i));
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}

    public VarDeclaration getIterator() {
        return iterator;
    }

    public void setIterator(VarDeclaration iterator) {
        this.iterator = iterator;
    }

    public ArrayList<Expression> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Expression> conditions) {
        this.conditions = conditions;
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }
}

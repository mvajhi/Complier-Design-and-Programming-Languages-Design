package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public abstract class Handler extends Declaration{
    private Identifier name ;

    public void setName(Identifier _name) {
        this.name = _name;
    }

    private ArrayList<VarDeclaration> args = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();
    private ArrayList<Expression> authorizationExpressions = new ArrayList<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private SymbolTable symbolTable;

    public void setArgs (ArrayList<VarDeclaration> _args){
        args.addAll(_args);
    }

    public void setBody(ArrayList<Statement> _body){
        body.addAll(_body);
    }

    public void setAuthorizationExpressions(ArrayList<Expression> _authorizationExpressions) {
        authorizationExpressions.addAll(_authorizationExpressions);
    }

    public Identifier getName() {
        return name;
    }

    public ArrayList<VarDeclaration> getArgs() {
        return args;
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public ArrayList<Expression> getAuthorizationExpressions() {
        return authorizationExpressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

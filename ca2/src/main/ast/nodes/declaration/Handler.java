package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statements.ExpressionStatement;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler extends Declaration{
    private Identifier name ;

    public void setName(Identifier _name) {
        this.name = _name;
    }

    private List<VarDeclaration> args = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();
    private List<Expression> authorizationExpressions = new ArrayList<>();

    public String getName() { return name.getName(); }
    public List<VarDeclaration> getArgs() { return args; }
    public List<Statement> getBody() { return body; }
    public List<Expression> getAuthorizationExpressions() { return authorizationExpressions; }

    public void setArgs (List<VarDeclaration> _args){
        args.addAll(_args);
    }

    public void setBody(List<Statement> _body){
        body.addAll(_body);
    }

    public void setAuthorizationExpressions(List<Expression> _authorizationExpressions) {
        authorizationExpressions.addAll(_authorizationExpressions);
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private SymbolTable symbolTable;
}

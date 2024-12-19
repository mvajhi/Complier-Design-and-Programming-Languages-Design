package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.utils.ConstructorDto;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class ActorDec extends Declaration {
    private Identifier name;
    private List<CustomPrimitiveDeclaration> customPrimitiveDeclarations = new ArrayList<>();
    private List<VarDeclaration> actorVars = new ArrayList<>();
    private boolean hasConstructor;
    private String constructorName;
    private List<VarDeclaration> constructorArgs = new ArrayList<>();
    private List<Handler> msgHandlers = new ArrayList<>();
    private List<Statement> constructorBody = new ArrayList<>();

    private List<List<Expression>> accessExpressions = new ArrayList<>();

    public List<CustomPrimitiveDeclaration> getCPD(){ return customPrimitiveDeclarations; }
    public List<VarDeclaration> getVars(){ return actorVars; }
    public boolean hasConstructor(){ return hasConstructor; }
    public String getConstructorName(){ return constructorName; }
    public List<VarDeclaration> getConstructorArgs(){ return constructorArgs; }
    public List<Handler> getMsgHandlers(){ return msgHandlers; }
    public List<List<Expression>> getAccessExpressions() { return accessExpressions; }
    public List<Statement> getConstructorBody() { return constructorBody; }

    public ActorDec(Identifier _name, int _line) {
        name = _name;
        line = _line;
        hasConstructor = false;
    }
    public void addCustomPrimitive(CustomPrimitiveDeclaration customPrimitiveDeclaration){
        customPrimitiveDeclarations.add(customPrimitiveDeclaration);
    }

    public void setActorVars(List<VarDeclaration> _actorVars){
        actorVars.addAll(_actorVars);
    }

    public void setConstructor (ConstructorDto constructor){
        constructorName = constructor.name;
        hasConstructor = true;
        constructorArgs.addAll(constructor.args);
        constructorBody = constructor.body;
    }

    public void addHandler(Handler handler){
        msgHandlers.add(handler);
    }

    public String getName() {
        return name.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public void setAccessExpressions(List<List<Expression>> accessExpressions) {
        this.accessExpressions.addAll(accessExpressions);
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private SymbolTable symbolTable;
}

package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statements.Statement;
import main.symbolTable.SymbolTable;
import main.utils.ConstructorDto;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ActorDec extends Declaration {
    private Identifier name;
    private ArrayList<CustomPrimitiveDeclaration> customPrimitiveDeclarations = new ArrayList<>();
    private ArrayList<VarDeclaration> actorVars = new ArrayList<>();
    private boolean hasConstructor;
    private String constructorName;
    private ArrayList<VarDeclaration> constructorArgs = new ArrayList<>();
    private ArrayList<Handler> msgHandlers = new ArrayList<>();
    private ArrayList<Statement> constructorBody = new ArrayList<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    private SymbolTable symbolTable;

    private ArrayList<ArrayList<Expression>> accessExpressions = new ArrayList<>();

    public ActorDec(Identifier _name, int _line) {
        name = _name;
        line = _line;
        hasConstructor = false;
    }
    public void addCustomPrimitive(CustomPrimitiveDeclaration customPrimitiveDeclaration){
        customPrimitiveDeclarations.add(customPrimitiveDeclaration);
    }

    public void setActorVars(ArrayList<VarDeclaration> _actorVars) {
        actorVars.addAll(_actorVars);
    }


    public void setConstructor (ConstructorDto constructor){
        constructorName = constructor.name;
        hasConstructor = true;
        constructorBody.addAll(constructor.body);
        constructorArgs.addAll(constructor.args);
    }

    public void addHandler(Handler handler){
        msgHandlers.add(handler);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public void setAccessExpressions(ArrayList<ArrayList<Expression>> accessExpressions) {
        this.accessExpressions.addAll(accessExpressions);
    }

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public ArrayList<CustomPrimitiveDeclaration> getCustomPrimitiveDeclarations() {
        return customPrimitiveDeclarations;
    }

    public void setCustomPrimitiveDeclarations(ArrayList<CustomPrimitiveDeclaration> customPrimitiveDeclarations) {
        this.customPrimitiveDeclarations = customPrimitiveDeclarations;
    }

    public ArrayList<VarDeclaration> getActorVars() {
        return actorVars;
    }

    public boolean isHasConstructor() {
        return hasConstructor;
    }

    public void setHasConstructor(boolean hasConstructor) {
        this.hasConstructor = hasConstructor;
    }

    public String getConstructorName() {
        return constructorName;
    }


    public void setConstructorName(String constructorName) {
        this.constructorName = constructorName;
    }

    public ArrayList<VarDeclaration> getConstructorArgs() {
        return constructorArgs;
    }

    public  ArrayList<Statement> getConstructorBody() {return constructorBody; }

    public void setConstructorArgs(ArrayList<VarDeclaration> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    public ArrayList<Handler> getMsgHandlers() {
        return msgHandlers;
    }

    public void setMsgHandlers(ArrayList<Handler> msgHandlers) {
        this.msgHandlers = msgHandlers;
    }

    public ArrayList<ArrayList<Expression>> getAccessExpressions() {
        return accessExpressions;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}

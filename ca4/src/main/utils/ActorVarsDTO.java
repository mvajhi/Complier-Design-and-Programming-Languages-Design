package main.utils;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;

import java.util.ArrayList;

public class ActorVarsDTO {
    public ActorVarsDTO() {
    }
    public ArrayList<VarDeclaration> vars = new ArrayList<>();
    public ArrayList<ArrayList<Expression>> accessLevels = new ArrayList<>();
}

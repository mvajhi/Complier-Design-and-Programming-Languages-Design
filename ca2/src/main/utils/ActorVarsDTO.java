package main.utils;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class ActorVarsDTO {
    public List<VarDeclaration> vars = new ArrayList<>();
    public List<List<Expression>> accessLevels = new ArrayList<>();
}

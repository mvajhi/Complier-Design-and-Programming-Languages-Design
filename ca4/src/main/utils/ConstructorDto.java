package main.utils;
import main.ast.nodes.declaration.*;
import main.ast.nodes.statements.Statement;

import java.util.ArrayList;

public class ConstructorDto {
    public String name;
    public ArrayList<VarDeclaration> args = new ArrayList<>();
    public ArrayList<Statement> body = new ArrayList<>();

    public ConstructorDto() {}
}

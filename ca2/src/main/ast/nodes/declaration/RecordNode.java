package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class RecordNode extends Declaration {
    private Identifier id ;
    private List<VarDeclaration> vars = new ArrayList<>();
    public RecordNode(Identifier _id, int _line) {
        id = _id;
        line = _line;
    }

    public void addVar(VarDeclaration varDeclaration){vars.add(varDeclaration);}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

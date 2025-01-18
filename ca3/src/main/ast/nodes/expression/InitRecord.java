package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitRecord extends Expression{
    private Identifier recordName;
    private ArrayList<Identifier> fieldNames = new ArrayList<>();
    private ArrayList<Expression> fieldValues = new ArrayList<>();

    public InitRecord(Identifier _recordName, int _line) {
        recordName = recordName;
        line = _line;
    }

    public void addFieldName (Identifier fieldName){
        fieldNames.add(fieldName);
    }

    public void addFieldValue(Expression fieldValue){
        fieldValues.add(fieldValue);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}

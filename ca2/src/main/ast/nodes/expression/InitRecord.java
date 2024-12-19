package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class InitRecord extends Expression{
    private Identifier recordName;
    private List<Identifier> fieldNames = new ArrayList<>();
    private List<List<Expression>> fieldValues = new ArrayList<>();

    public InitRecord(Identifier _recordName, int _line) {
        recordName = recordName;
        line = _line;
    }

    public void addFieldName (Identifier fieldName){
        fieldNames.add(fieldName);
    }

    public void addFieldValue(List<Expression> fieldValue){
        fieldValues.add(fieldValue);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}

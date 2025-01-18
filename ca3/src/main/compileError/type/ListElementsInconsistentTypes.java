package main.compileError.type;

import main.compileError.CompileError;

public class ListElementsInconsistentTypes extends CompileError {
    public ListElementsInconsistentTypes(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> all elements of the list must have same type";}
}

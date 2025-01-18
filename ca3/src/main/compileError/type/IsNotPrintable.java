package main.compileError.type;

import main.ast.nodes.type.Type;
import main.compileError.CompileError;

public class IsNotPrintable extends CompileError {
    private Type type;
    public IsNotPrintable(int line){
        this.line = line;
        this.type = type;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> cannot be printed";}
}
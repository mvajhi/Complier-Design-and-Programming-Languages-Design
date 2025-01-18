package main.compileError.type;

import main.compileError.CompileError;

public class IsNotIterable extends CompileError {
    public IsNotIterable(int line){
        this.line = line;
    }
    @Override
    public String getErrorMessage() {
        return "Line:" + this.line + " -> variable is not iterable";
    }
}

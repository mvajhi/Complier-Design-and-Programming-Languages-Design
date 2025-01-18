package main.compileError.type;

import main.compileError.CompileError;

public class NunSetAccessLevel extends CompileError {
    public NunSetAccessLevel (int line){
        this.line = line;
    }
    @Override
    public String getErrorMessage() {
        return  "Line:" + this.line + "-> access Level types are not set.";
    }
}

package main.compileError.type;

import main.compileError.CompileError;

public class IsNotAddable extends CompileError {
    public IsNotAddable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> only lists and strings can get pushed into";}//TODO: find better error message!!
}

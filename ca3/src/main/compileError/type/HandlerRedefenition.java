package main.compileError.type;

import main.compileError.CompileError;

public class HandlerRedefenition extends CompileError {
    String handlerName;
    public HandlerRedefenition(String name, int line){
        this.handlerName = name;
        this.line = line;
    }
    @Override
    public String getErrorMessage() {
        return "Line:" + this.line + "-> redefenition of handler " + handlerName;
    }
}

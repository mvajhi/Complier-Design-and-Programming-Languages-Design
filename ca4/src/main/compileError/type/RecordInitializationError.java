package main.compileError.type;

import main.compileError.CompileError;

public class RecordInitializationError extends CompileError {
    public RecordInitializationError(int line){
        this.line = line;
    }
    @Override
    public String getErrorMessage() {
        return "something";
    }
}

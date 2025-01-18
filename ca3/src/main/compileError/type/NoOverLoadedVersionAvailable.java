package main.compileError.type;

import main.compileError.CompileError;

public class NoOverLoadedVersionAvailable extends CompileError {
    public NoOverLoadedVersionAvailable(int line){
        this.line = line;
    }
    @Override
    public String getErrorMessage() {
        return "something";
    }
}

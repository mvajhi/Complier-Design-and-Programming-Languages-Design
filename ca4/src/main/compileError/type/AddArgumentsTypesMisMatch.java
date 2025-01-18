package main.compileError.type;

import main.compileError.CompileError;
public class AddArgumentsTypesMisMatch extends CompileError{
    public AddArgumentsTypesMisMatch(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of add function arguments must same as their called list";}
}

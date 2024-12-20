package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.List;

public class FunctionCall extends Expression {
    private String handlerType;
    private List<Expression> args;
    private int line;
    private boolean isBuiltin;

    public FunctionCall(String funcName, List<Expression> args, boolean isBuiltin, int line) {
        this.handlerType = funcName;
        this.line = line;
        this.args = args;
        this.isBuiltin = isBuiltin;
    }

    public String getHandlerType() {
        return handlerType;
    }

    public void setHandlerType(String handlerType) {
        this.handlerType = handlerType;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public List<Expression> getArgs() {
        return args;
    }

    public void setArgs(List<Expression> args) {
        this.args = args;
    }

    public Boolean getIsBuiltin() {
        return isBuiltin;
    }

    public void setIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
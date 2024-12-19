package main.symbolTable.items;

import main.ast.nodes.declaration.VarDeclaration;

import java.util.List;

public class MsgHandlerTableItem extends SymbolTableItem {
    public static final String START_KEY = "ActorDec_";

    private String Name;
    private List<VarDeclaration> argsTypes;
    private String returnType;

    public MsgHandlerTableItem(String functionName, List<VarDeclaration> argsTypes, String returnType) {
        this.Name = functionName;
        this.argsTypes = argsTypes;
        this.returnType = returnType;
    }

    @Override
//    TODO: added arg and return types to the key
    public String getKey() {
        String types = "";
        for (VarDeclaration vd : this.argsTypes){
//            vd.
        }
        return START_KEY + this.returnType + this.Name;
    }

    public String getName() {
        return Name;
    }

    public List<VarDeclaration> getArgsTypes() {
        return argsTypes;
    }

    public String getReturnType() { return returnType; }

    public void setName(String name) {
        this.Name = name;
    }
}
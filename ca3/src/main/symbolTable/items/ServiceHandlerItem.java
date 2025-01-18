package main.symbolTable.items;

import main.ast.nodes.declaration.ServiceHandler;
import main.ast.nodes.declaration.VarDeclaration;

public class ServiceHandlerItem extends SymbolTableItem {
    public static final String START_KEY = "ServiceHandler_";

    private ServiceHandler serviceHandler;

    public ServiceHandlerItem(ServiceHandler serviceHandler) {
        this.serviceHandler = serviceHandler;
    }

    public boolean isSame(ServiceHandler serviceHandler){
        if (this.serviceHandler.getName().equals(serviceHandler.getName())){
            boolean hasSameArgs = true;
            if (this.serviceHandler.getArgs().size() != serviceHandler.getArgs().size())
                return false;
            for (int i = 0 ; i < this.serviceHandler.getArgs().size() ; i++){
                if (!this.serviceHandler.getArgs().get(i).getType().hasSameType(serviceHandler.getArgs().get(i).getType())){
                    hasSameArgs = false;
                }
            }
            return hasSameArgs;
        }
        return false;
    }

    @Override
    public String getKey() {
        return START_KEY + this.serviceHandler.getName().getName();
    }

    public ServiceHandler getServiceHandler() {
        return serviceHandler;
    }
}

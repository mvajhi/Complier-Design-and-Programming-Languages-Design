package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.ast.nodes.declaration.ObserveHandler;
import main.ast.nodes.declaration.ServiceHandler;

public class ObserveHandlerItem extends SymbolTableItem {
    public static final String START_KEY = "ObserveHandler_";

    private ObserveHandler observeHandler;

    public ObserveHandlerItem(ObserveHandler observeHandler) {
        this.observeHandler = observeHandler;
    }

    public boolean isSame(ObserveHandler observeHandler){
        if (this.observeHandler.getName().equals(observeHandler.getName())){
            boolean hasSameArgs = true;
            if (this.observeHandler.getArgs().size() != observeHandler.getArgs().size())
                return false;
            for (int i = 0 ; i < this.observeHandler.getArgs().size() ; i++){
                if (!this.observeHandler.getArgs().get(i).getType().hasSameType(observeHandler.getArgs().get(i).getType())){
                    hasSameArgs = false;
                }
            }
            return hasSameArgs;
        }
        return false;
    }

    @Override
    public String getKey() {
        return START_KEY + this.observeHandler.getName().getName();
    }

    public ObserveHandler getObserveHandler() {
        return observeHandler;
    }
}

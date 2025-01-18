package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.ast.nodes.declaration.ObserveHandler;
import main.ast.nodes.declaration.RecordNode;
import main.ast.nodes.declaration.ServiceHandler;
import main.ast.nodes.type.Type;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.items.SymbolTableItem;

import java.util.ArrayList;

public class ActorDecItem extends SymbolTableItem {
    public static final String START_KEY = "ActorDec_";

    public ActorDec getActorDec() {
        return actorDec;
    }

    public void setActorDec(ActorDec actorDec) {
        this.actorDec = actorDec;
    }

    private ActorDec actorDec;

    private ArrayList<ServiceHandlerItem> serviceHandlerItems = new ArrayList<>();

    private ArrayList<ObserveHandlerItem> observeHandlerItems = new ArrayList<>();

    private boolean hasConstructor;

    private ArrayList<Type> constructorArgsType = new ArrayList<>();

    public ActorDecItem(ActorDec actorDec) {
        this.actorDec = actorDec;
        this.hasConstructor = false;
    }
    public void addServiceHandler(ServiceHandler serviceHandler) throws ItemAlreadyExists {
        for (ServiceHandlerItem serviceHandlerItem : serviceHandlerItems)
            if (serviceHandlerItem.isSame(serviceHandler))
                throw new ItemAlreadyExists();
    }

    public void addObservationHandler(ObserveHandler observeHandler) throws ItemAlreadyExists {
        for (ObserveHandlerItem observeHandlerItem : observeHandlerItems)
            if (observeHandlerItem.isSame(observeHandler))
                throw new ItemAlreadyExists();
    }

    public void addConstructorArgType(Type type){
        if(!this.hasConstructor)
            this.hasConstructor = true;
        constructorArgsType.add(type);
    }

    @Override
    public String getKey() {
        return START_KEY + this.actorDec.getName().getName();
    }

    public ArrayList<ObserveHandlerItem> getObserveHandlerItems() {
        return observeHandlerItems;
    }

    public ArrayList<ServiceHandlerItem> getServiceHandlerItems() {
        return serviceHandlerItems;
    }
}

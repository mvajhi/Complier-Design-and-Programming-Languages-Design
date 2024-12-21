package main.symbolTable;

import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.items.SymbolTableItem;
import main.utils.Stack;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;
    public SymbolTable pre;
    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }
    public static void pop() {
        top = stack.pop();
    }
    public SymbolTable() {
        this.items = new HashMap<>();
    }
    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
    }

    private boolean checkPre = true;
    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        checkPre = false;
        try{
            getItem(item.getKey());
            throw new ItemAlreadyExists();
        } catch (ItemNotFound e) {
            items.put(item.getKey(), item);
        }
        finally {
            checkPre = true;
        }
    }
    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem tableItem = this.items.get(key);
        if (tableItem == null && pre != null && checkPre){
            tableItem = pre.getItem(key);
        }
        if( tableItem != null ){
            return tableItem;
        }
        throw new ItemNotFound();
    }
}

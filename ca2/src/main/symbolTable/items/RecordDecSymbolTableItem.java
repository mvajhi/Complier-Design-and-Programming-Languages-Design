package main.symbolTable.items;

public class RecordDecSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "RecordDec_";

    public RecordDecSymbolTableItem(String recordName) {
        this.name = recordName;
    }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }

    public String getRecordName() {
        return name;
    }

    public void getRecordName(String recordName) {
        this.name = recordName;
    }
}

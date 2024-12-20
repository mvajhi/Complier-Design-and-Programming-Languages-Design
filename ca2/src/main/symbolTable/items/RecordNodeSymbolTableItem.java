package main.symbolTable.items;

public class RecordNodeSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "Record_";

    private String RecordName;

    public RecordNodeSymbolTableItem(String recordName) {
        this.RecordName = recordName;
    }

    @Override
    public String getKey() {
        return START_KEY + this.RecordName;
    }

    public String getRecordName() {
        return RecordName;
    }

    public void setRecordName(String recordName) {
        this.RecordName = recordName;
    }
}

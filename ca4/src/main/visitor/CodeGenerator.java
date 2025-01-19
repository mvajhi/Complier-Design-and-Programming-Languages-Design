package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operator.BinaryOperator;
import main.ast.nodes.expression.operator.UnaryOperator;
import main.ast.nodes.expression.value.BoolValue;
import main.ast.nodes.expression.value.IntValue;
import main.ast.nodes.expression.value.StringValue;
import main.ast.nodes.statements.*;
import main.ast.nodes.type.BooleanType;
import main.ast.nodes.type.IntType;
import main.ast.nodes.type.Type;
import main.symbolTable.SymbolTable;
import main.symbolTable.items.VarDeclarationItem;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter currentFile;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private final HashMap<BinaryOperator, String> Op2ByteCode = new HashMap<>();
    private SymbolTable currentSymbolTable;
    private boolean convertToNonPrimitive = false;

    public CodeGenerator() {
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
        initOp2BC();
    }

    private void initOp2BC() {
        Op2ByteCode.put(BinaryOperator.AND, "iand");
        Op2ByteCode.put(BinaryOperator.OR, "ior");
        Op2ByteCode.put(BinaryOperator.PLUS, "iadd");
        Op2ByteCode.put(BinaryOperator.MINUS, "isub");
        Op2ByteCode.put(BinaryOperator.MULT, "imul");
        Op2ByteCode.put(BinaryOperator.DIVIDE, "idiv");
        Op2ByteCode.put(BinaryOperator.MOD, "irem");

//        boolean operators
        Op2ByteCode.put(BinaryOperator.EQUAL, "if_icmpeq");
        Op2ByteCode.put(BinaryOperator.NOT_EQUAL, "if_icmpne");
        Op2ByteCode.put(BinaryOperator.GREATER_THAN, "if_icmpgt");
        Op2ByteCode.put(BinaryOperator.LESS_THAN, "if_icmplt");
        Op2ByteCode.put(BinaryOperator.LESS_EQUAL_THAN, "if_icmple");
        Op2ByteCode.put(BinaryOperator.GREATER_EQUAL_THAN, "if_icmpge");
    }

    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            currentFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }

    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                currentFile.write(command + "\n");
            else
                currentFile.write("\t\t" + command + "\n");
            currentFile.flush();
        } catch (IOException e){
            // ignore
        }
    }

    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {}
    }

    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Soact soact) {
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

//        for (RecordNode recordNode : soact.getRecords()) {
//            recordNode.accept(this);
//        }

        for (ActorDec actorDec : soact.getActorDecs()) {
            actorDec.accept(this);
        }

        if (soact.getMain() != null) {
            soact.getMain().accept(this);
        }

        return null;
    }

    @Override
    public String visit(ActorDec actorDec) {
//        for (CustomPrimitiveDeclaration customPrimitive : actorDec.getCustomPrimitiveDeclarations()) {
//            customPrimitive.accept(this);
//        }

        for (VarDeclaration varDeclaration : actorDec.getActorVars()) {
            varDeclaration.accept(this);
        }

        for (Handler handler : actorDec.getMsgHandlers()) {
            handler.accept(this);
        }

        return null;
    }

//    @Override
//    public Void visit(RecordNode recordNode) {
//        for (VarDeclaration varDeclaration : recordNode.getVars()) {
//            varDeclaration.accept(this);
//        }
//
//        return null;
//    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        return null;
    }

//    @Override
//    public Void visit(CustomPrimitiveDeclaration customPrimitive) {
//        for (Identifier state : customPrimitive.getStates()) {
//            state.accept(this);
//        }
//
//        return null;
//    }

    @Override
    public String visit(Main main) {
        currentSymbolTable = main.getSymbolTable();
        restSlots();
        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        addCommand(commands);
        commands = "";

        for (Statement statement : main.getStatements()) {
            statement.accept(this);
        }

        commands += "return\n";
        commands += ".end method\n";
        addCommand(commands);

        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        boolean isConvToNP = convertToNonPrimitive;
        convertToNonPrimitive = false;
        String jasminCode = "";
        if (Arrays.asList(BinaryOperator.PLUS, BinaryOperator.MINUS,
                BinaryOperator.MULT, BinaryOperator.DIVIDE, BinaryOperator.MULT)
                .contains(binaryExpression.getBinaryOperator())) {
            jasminCode += visitIntBinExp(binaryExpression);
            if (isConvToNP) {
                jasminCode += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            }
        }
        else {
            jasminCode += visitBoolBinExp(binaryExpression);
            if (isConvToNP) {
                jasminCode += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            }
        }
        convertToNonPrimitive = isConvToNP;
        return jasminCode;
    }

    private String visitIntBinExp(BinaryExpression binaryExpression) {
        String jasminCode = "";
        jasminCode += binaryExpression.getLeftOperand().accept(this);
        jasminCode += binaryExpression.getRightOperand().accept(this);
        jasminCode += Op2ByteCode.get(binaryExpression.getBinaryOperator()) + "\n";
        return jasminCode;
    }
    private String visitBoolBinExp(BinaryExpression binaryExpression) {
        String jasminCode = "";
        return jasminCode;
    }

    @Override
    public String visit(InitStatement initStatement) {
        convertToNonPrimitive = true;
        if (initStatement.getAssigned() != null) {
            String jasminCode = "";
            jasminCode += initStatement.getAssigned().accept(this);
            addCommand(jasminCode);
            genrateStoreCode(initStatement.getAssignee().getName());
        }

        convertToNonPrimitive = false;
        return null;
    }

    @Override
    public String visit(ServiceHandler serviceHandler) {
        for (VarDeclaration arg : serviceHandler.getArgs()) {
            arg.accept(this);
        }

        for (Statement statement : serviceHandler.getBody()) {
            statement.accept(this);
        }

        for (Expression expr : serviceHandler.getAuthorizationExpressions()) {
            expr.accept(this);
        }

        return null;
    }

    @Override
    public String visit(ObserveHandler observeHandler) {
        for (VarDeclaration arg : observeHandler.getArgs()) {
            arg.accept(this);
        }

        for (Statement statement : observeHandler.getBody()) {
            statement.accept(this);
        }

        for (Expression expr : observeHandler.getAuthorizationExpressions()) {
            expr.accept(this);
        }

        return null;
    }

    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }

    private void restSlots() {
        slots.clear();
        slotOf("self");
    }

    @Override
    public String visit(AssignmentStatement assignmentStatement) {
        for (Identifier id : assignmentStatement.getIds()) {
            id.accept(this);
        }

        addCommand(assignmentStatement.getAssigned().accept(this));

        genrateStoreCode(assignmentStatement.getIds().getFirst());

        return null;
    }

    @Override
    public String visit(IntValue intValue) {
        String jasminCode = "ldc " + intValue.getIntVal() + "\n";
        if (convertToNonPrimitive) {
            jasminCode += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        return jasminCode;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String jasminCode = "ldc " + (boolValue.getBool() ? "1" : "0") + "\n";
        if (convertToNonPrimitive) {
            jasminCode += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        return jasminCode;
    }

    @Override
    public String visit(StringValue stringValue) {
        return "ldc " + stringValue.getStr() + "\n";
    }

    private void genrateStoreCode(Identifier id) {
        String jasminCode;

        VarDeclarationItem leftHand = getItemFromName(id.getName());

        int index = slotOf(id.getName());
        jasminCode = createIndexByteCode("astore", index);


        addCommand(jasminCode);
    }

    private String createIndexByteCode(String instraction, int index) {
        if (0 <= index && index <= 3) {
            return instraction + "_" + index;
        } else {
            return instraction + " " + index;
        }
    }

    private VarDeclarationItem getItemFromName(String name) {
        SymbolTable symbolTable = currentSymbolTable;

        VarDeclarationItem varDecSymbolTableItem = null;
        try {
            return (VarDeclarationItem) symbolTable.getItem(VarDeclarationItem.START_KEY + name);
        } catch (Exception e) {
        }

        return null;
    }

    @Override
    public String visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public String visit(ForStatement forStatement) {
        if (forStatement.getIterator() != null) {
            forStatement.getIterator().accept(this);
        }

        for (Expression condition : forStatement.getConditions()) {
            condition.accept(this);
        }

        for (Statement statement : forStatement.getBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public String visit(IfStatement ifStatement) {
        if (ifStatement.getIfConds() instanceof ExpressionList)
            for (Expression condition : ((ExpressionList) ifStatement.getIfConds()).getExpressionList())
                condition.accept(this);
        else
            ifStatement.getIfConds().accept(this);


        for (Statement statement : ifStatement.getIfBody()) {
            statement.accept(this);
        }

        for (Expression elseIfConds : ifStatement.getElseIfBlocksConds()) {
            elseIfConds.accept(this);
//            for (Expression condition : elseIfConds) {
//                condition.accept(this);
//            }
        }

        for (ArrayList<Statement> elseIfBody : ifStatement.getElseIfBlocksBody()) {
            for (Statement statement : elseIfBody) {
                statement.accept(this);
            }
        }

        for (Statement statement : ifStatement.getElseBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public String visit(WhileStatement whileStatement) {
        if (whileStatement.getConditions() instanceof ExpressionList)
            for (Expression condition : ((ExpressionList) whileStatement.getConditions()).getExpressionList())
                condition.accept(this);
        else
            whileStatement.getConditions().accept(this);

        for (Statement statement : whileStatement.getBody()) {
            statement.accept(this);
        }

        return null;
    }

    @Override
    public String visit(CallExpression callExpression) {
        convertToNonPrimitive = true;
        if (Objects.equals(callExpression.getHandlerName(), "print")){
            visit_print(callExpression);
            convertToNonPrimitive = false;
            return null;
        }
        if (callExpression.getExpressions() instanceof ExpressionList)
            for (Expression expression : ((ExpressionList) callExpression.getExpressions()).getExpressionList())
                expression.accept(this);
        else
            callExpression.getExpressions().accept(this);

//        for (Expression expression : callExpression.getExpressions()) {
//            expression.accept(this);
//        }
        if (callExpression.getIdentifier() != null) {
            callExpression.getIdentifier().accept(this);
        }
        convertToNonPrimitive = false;
        return null;
    }

    private String visit_print(CallExpression callExpression) {
        String jasminCode = "";
        jasminCode += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        jasminCode += callExpression.getExpressions().accept(this);
        jasminCode += "invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V\n";
        addCommand(jasminCode);
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
//        return createIndexByteCode("aload", slotOf(identifier.getName())) + "\n";
        String jasminCode = "";
        jasminCode += createIndexByteCode("aload", slotOf(identifier.getName())) + "\n";
        if (!convertToNonPrimitive) {
            if (getType(identifier) instanceof IntType) {
                jasminCode += "invokevirtual java/lang/Integer/intValue()I\n";
            } else if (getType(identifier) instanceof BooleanType) {
                jasminCode += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            }
        }
        return jasminCode;
    }

    private Type getType(Identifier identifier) {
        return getItemFromName(identifier.getName()).getType();
    }
}

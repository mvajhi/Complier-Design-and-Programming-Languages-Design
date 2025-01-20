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
    private String afterLabel = "";
    private String breakLabel = "";
    private String continueLabel = "";
    private int labelCounter = 0;

    public CodeGenerator() {
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
        initOp2BC();
    }

    private String getFreshLabel() {
        return "Label_" + labelCounter++;
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

        commands += visitBody(main.getStatements());

        commands += "return\n";
        commands += ".end method\n";
        addCommand(commands);

        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
//        TODO handle index
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
            jasminCode += visitBoolExp(binaryExpression);
            if (isConvToNP) {
                jasminCode += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            }
        }
        convertToNonPrimitive = isConvToNP;
        return jasminCode;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
//        TODO handle brackets
        boolean isConvToNP = convertToNonPrimitive;
        convertToNonPrimitive = false;
        String jasminCode = "";
        if (unaryExpression.getUnaryOperator() == UnaryOperator.NOT) {
            jasminCode += visitBoolExp(unaryExpression);
            if (isConvToNP) {
                jasminCode += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            }
        }
        else {
            jasminCode += visitIntUnary(unaryExpression);
            if (isConvToNP) {
                jasminCode += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            }
        }
        convertToNonPrimitive = isConvToNP;
        return jasminCode;
    }

    private String visitIntUnary(UnaryExpression unaryExpression) {
        String jasminCode = "";
        if (unaryExpression.getUnaryOperator() == UnaryOperator.MINUS) {
            jasminCode += unaryExpression.getOperand().accept(this);
            jasminCode += "ineg\n";
            return jasminCode;
        }
        boolean is_plus = Arrays.asList(UnaryOperator.POST_INC, UnaryOperator.PRE_INC).contains(unaryExpression.getUnaryOperator());
        boolean is_pre = Arrays.asList(UnaryOperator.PRE_INC, UnaryOperator.PRE_DEC).contains(unaryExpression.getUnaryOperator());
        jasminCode += unaryExpression.getOperand().accept(this);
        if (is_pre) {
            jasminCode += "iconst_1\n";
            jasminCode += (is_plus ? "iadd" : "isub") + "\n";
            if (unaryExpression.getOperand() instanceof Identifier) {
                jasminCode += "dup\n";
                jasminCode += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                jasminCode += genrateStoreCode((Identifier) unaryExpression.getOperand());
            }
        }
        else if (unaryExpression.getOperand() instanceof Identifier) {
            jasminCode += "dup\n";
            jasminCode += "iconst_1\n";
            jasminCode += (is_plus ? "iadd" : "isub") + "\n";
            jasminCode += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            jasminCode += genrateStoreCode((Identifier) unaryExpression.getOperand());
        }
        return jasminCode;
    }

    private String visitIntBinExp(BinaryExpression binaryExpression) {
        String jasminCode = "";
        jasminCode += binaryExpression.getLeftOperand().accept(this);
        jasminCode += binaryExpression.getRightOperand().accept(this);
        jasminCode += Op2ByteCode.get(binaryExpression.getBinaryOperator()) + "\n";
        return jasminCode;
    }

    private String visitBoolExp(Expression expression) {
        String jasminCode = "";
        String nTrue = getFreshLabel();
        String nFalse = getFreshLabel();
        String nEnd = getFreshLabel();
        jasminCode += branch(expression, nTrue, nFalse);
        jasminCode += nTrue + ":\n";
        jasminCode += "iconst_1\n";
        jasminCode += "goto " + nEnd + "\n";
        jasminCode += nFalse + ":\n";
        jasminCode += "iconst_0\n";
        jasminCode += nEnd + ":\n";
        jasminCode = cleanUpLabels(jasminCode);
        return jasminCode;
    }

    private String cleanUpLabels(String jasminCode) {
        // Remove immediate jumps
        Matcher jumpMatcher = Pattern.compile("(goto Label_\\d+|if.* Label_\\d+)\n(Label_\\d+:)").matcher(jasminCode);
        while (jumpMatcher.find()) {
            String jump = jumpMatcher.group(1);
            String label = jumpMatcher.group(2);
            if (jump.contains(label.substring(0, label.length() - 1))) {
                jasminCode = jasminCode.replace(jump + "\n" + label, label);
            }
        }

        // Find all labels
        Set<String> labels = new HashSet<>();
        Matcher labelMatcher = Pattern.compile("Label_\\d+:").matcher(jasminCode);
        while (labelMatcher.find()) {
            labels.add(labelMatcher.group());
        }

        // Find all label references
        Set<String> labelReferences = new HashSet<>();
        Matcher referenceMatcher = Pattern.compile("goto Label_\\d+|if.* Label_\\d+").matcher(jasminCode);
        while (referenceMatcher.find()) {
            String reference = referenceMatcher.group();
            String label = reference.substring(reference.lastIndexOf("Label_"));
            labelReferences.add(label + ":");
        }

        // Remove unused labels
        for (String label : labels) {
            if (!labelReferences.contains(label)) {
                jasminCode = jasminCode.replace(label + "\n", "");
            }
        }

        return jasminCode;
    }

    private String branch(Expression expression, String nTrue, String nFalse) {
        if (expression instanceof BinaryExpression) {
            BinaryExpression binaryExpression = (BinaryExpression) expression;
            BinaryOperator Op = binaryExpression.getBinaryOperator();
            switch (Op) {
                case AND -> {
                    return branchAnd(binaryExpression, nTrue, nFalse);
                }
                case OR -> {
                    return branchOr(binaryExpression, nTrue, nFalse);
                }
                default -> {
                    return branchCmp(binaryExpression, nTrue, nFalse);
                }
            }
        }
        else if (expression instanceof UnaryExpression) {
            UnaryExpression unaryExpression = (UnaryExpression) expression;
            UnaryOperator Op = unaryExpression.getUnaryOperator();
            switch (Op) {
                case NOT -> {
                    return branchNot(unaryExpression.getOperand(), nTrue, nFalse);
                }
                default -> {
                    return null;
                }
            }
        }
        else if (expression instanceof BoolValue) {
            return branchBoolValue((BoolValue) expression, nTrue, nFalse);
        }
        else if (expression instanceof Identifier) {
            return branchIdentifier((Identifier) expression, nTrue, nFalse);
        }
        return null;
    }

    private String branchBoolValue(BoolValue boolValue, String nTrue, String nFalse) {
        String jasminCode = "";
        if (boolValue.getBool()) {
            jasminCode += "goto " + nTrue + "\n";
        }
        else {
            jasminCode += "goto " + nFalse + "\n";
        }
        return jasminCode;
    }

    private String branchIdentifier(Identifier identifier, String nTrue, String nFalse) {
        String jasminCode = "";
        jasminCode += identifier.accept(this);
        jasminCode += "ifeq " + nFalse + "\n";
        jasminCode += "goto " + nTrue + "\n";
        return jasminCode;
    }

    private String branchNot(Expression operand, String nTrue, String nFalse) {
        return branch(operand, nFalse, nTrue);
    }

    private String branchCmp(BinaryExpression binaryExpression, String nTrue, String nFalse) {
        String jasminCode = "";
        jasminCode += binaryExpression.getLeftOperand().accept(this);
        jasminCode += binaryExpression.getRightOperand().accept(this);
        jasminCode += Op2ByteCode.get(binaryExpression.getBinaryOperator()) + " " + nTrue + "\n";
        jasminCode += "goto " + nFalse + "\n";
        return jasminCode;
    }

    private String branchAnd(BinaryExpression binaryExpression, String nTrue, String nFalse) {
        String jasminCode = "";
        String nNext = getFreshLabel();
        jasminCode += branch(binaryExpression.getLeftOperand(), nNext, nFalse);
        jasminCode += nNext + ":\n";
        jasminCode += branch(binaryExpression.getRightOperand(), nTrue, nFalse);
        return jasminCode;
    }

    private String branchOr(BinaryExpression binaryExpression, String nTrue, String nFalse) {
        String jasminCode = "";
        String nNext = getFreshLabel();
        jasminCode += branch(binaryExpression.getLeftOperand(), nTrue, nNext);
        jasminCode += nNext + ":\n";
        jasminCode += branch(binaryExpression.getRightOperand(), nTrue, nFalse);
        return jasminCode;
    }

    @Override
    public String visit(ExpressionList expressionList) {
        String jasminCode = "";
        jasminCode += createList();
        jasminCode += addElements(expressionList.getExpressionList());
        return jasminCode;
    }

    private String addElements(ArrayList<Expression> expressions) {
        String jasminCode = "";
        for (Expression expression : expressions) {
            jasminCode += "dup\n";
            jasminCode += expression.accept(this);
            jasminCode += "invokevirtual List/addElement(Ljava/lang/Object;)V\n";
        }
        return jasminCode;
    }

    private String createList() {
        String jasminCode = "";
        jasminCode += """
                    new List
                    dup
                    new java/util/ArrayList
                    dup
                    invokespecial java/util/ArrayList/<init>()V
                    invokespecial List/<init>(Ljava/util/ArrayList;)V
                    """;
        return jasminCode;
    }

    @Override
    public String visit(InitStatement initStatement) {
        convertToNonPrimitive = true;
        String jasminCode = "";
        if (initStatement.getAssigned() != null) {
            jasminCode += initStatement.getAssigned().accept(this);
            jasminCode += genrateStoreCode(initStatement.getAssignee().getName());
        }

        convertToNonPrimitive = false;
        return jasminCode;
    }

    @Override
    public String visit(ServiceHandler serviceHandler) {
        for (VarDeclaration arg : serviceHandler.getArgs()) {
            arg.accept(this);
        }

        visitBody(serviceHandler.getBody());

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

        visitBody(observeHandler.getBody());

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
        String jasminCode = "";
        for (Identifier id : assignmentStatement.getIds()) {
            id.accept(this);
        }

        convertToNonPrimitive = true;
        jasminCode += assignmentStatement.getAssigned().accept(this);
        convertToNonPrimitive = false;

        jasminCode += genrateStoreCode(assignmentStatement.getIds().getFirst());

        return jasminCode;
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

    private String genrateStoreCode(Identifier id) {
        String jasminCode;

        VarDeclarationItem leftHand = getItemFromName(id.getName());

        int index = slotOf(id.getName());
        jasminCode = createIndexByteCode("astore", index);

        return jasminCode;
    }

    private String createIndexByteCode(String instraction, int index) {
        if (0 <= index && index <= 3) {
            return instraction + "_" + index + "\n";
        } else {
            return instraction + " " + index + "\n";
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
        return expressionStatement.getExpression().accept(this);
    }

    @Override
    public String visit(ForStatement forStatement) {
        if (forStatement.getIterator() != null) {
            forStatement.getIterator().accept(this);
        }

        for (Expression condition : forStatement.getConditions()) {
            condition.accept(this);
        }

        visitBody(forStatement.getBody());

        return null;
    }

    private String visitBody(ArrayList<Statement> statements) {
        String jasminCode = "";
        String tmpAfter = afterLabel;
        afterLabel = "";
        for (Statement statement : statements) {
            if (statement instanceof BreakStatement) {
                jasminCode += "goto " + breakLabel + "\n";
                break;
            }
            else if (statement instanceof ContinueStatement) {
                jasminCode += "goto " + continueLabel + "\n";
                break;
            }
            else {
                String tmp = statement.accept(this);
                if (tmp != null){
                    jasminCode += tmp;
                }
            }
        }

        if (!tmpAfter.equals("")) {
            jasminCode += "goto " + tmpAfter + "\n";
            afterLabel = tmpAfter;
        }

        return jasminCode;
    }

    @Override
    public String visit(IfStatement ifStatement) {
//        TODO what is this?
//        if (ifStatement.getIfConds() instanceof ExpressionList)
//            for (Expression condition : ((ExpressionList) ifStatement.getIfConds()).getExpressionList())
//                condition.accept(this);
//        else
//            ifStatement.getIfConds().accept(this);

        String jasminCode = "";

        String nIf = getFreshLabel();
        String nElse = getFreshLabel();
        boolean changeAfterLabel = false;
        if (afterLabel.equals("")) {
            afterLabel = getFreshLabel();
            changeAfterLabel = true;
        }
        String nEnd = afterLabel;

        jasminCode += branch(ifStatement.getIfConds(), nIf, nElse);
        jasminCode += nIf + ":\n";

        jasminCode += visitBody(ifStatement.getIfBody());

        for (int i = 0; i < ifStatement.getElseIfBlocksConds().size(); i++) {
            jasminCode += nElse + ":\n";
            nIf = getFreshLabel();
            nElse = getFreshLabel();
            jasminCode += branch(ifStatement.getElseIfBlocksConds().get(i), nIf, nElse);
            jasminCode += nIf + ":\n";
            jasminCode += visitBody(ifStatement.getElseIfBlocksBody().get(i));
        }

        jasminCode += nElse + ":\n";

        jasminCode += visitBody(ifStatement.getElseBody());

        if (changeAfterLabel) {
            afterLabel = "";
            jasminCode += nEnd + ":\n";
        }

        jasminCode = cleanUpLabels(jasminCode);

        return jasminCode;
    }

    @Override
    public String visit(WhileStatement whileStatement) {
        if (whileStatement.getConditions() instanceof ExpressionList)
            for (Expression condition : ((ExpressionList) whileStatement.getConditions()).getExpressionList())
                condition.accept(this);
        else
            whileStatement.getConditions().accept(this);

        visitBody(whileStatement.getBody());

        return null;
    }

    @Override
    public String visit(CallExpression callExpression) {
        convertToNonPrimitive = true;
        String jasminCode = "";
        if (Objects.equals(callExpression.getHandlerName(), "print")){
            jasminCode += visit_print(callExpression);
            convertToNonPrimitive = false;
            return jasminCode;
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
        return jasminCode;
    }

    @Override
    public String visit(Identifier identifier) {
//        return createIndexByteCode("aload", slotOf(identifier.getName())) + "\n";
        String jasminCode = "";
        jasminCode += createIndexByteCode("aload", slotOf(identifier.getName()));
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

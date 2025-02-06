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
import main.ast.nodes.type.*;
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
    private String MsgObs = "msgObs";
    private ArrayList<VarDeclaration> actorVars;
    private String actorName;

    private boolean isCncat = false;

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

    private void prepareOutputFolder() {
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
        String invockClassPath = "utilities/codeGenerationUtilityClasses/MethodInvoker.class";
        copyFile(invockClassPath, this.outputPath + "MethodInvoker.class");

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

    private String getLoadInstruction(Type type) {
        if (type instanceof IntType || type instanceof BooleanType) return "iload";
        return "aload";
    }

    private String generateParameterizedConstructor(ActorDec actorDec, String actor_name) {
        StringBuilder commands = new StringBuilder();


        commands.append(".method public <init>(");


        for (VarDeclaration var : actorDec.getConstructorArgs()) {
            commands.append(getTypeDescriptor(var.getType()));
        }
        commands.append(")V\n");

        commands.append(".limit stack 128\n");
        commands.append(".limit locals 128\n");

        commands.append("aload_0\n");
        commands.append("invokespecial java/lang/Object/<init>()V\n");

        // Call object static method
        commands.append("aload_0\n");
        commands.append("invokestatic MethodInvoker/addObject(Ljava/lang/Object;)V\n");

        int paramIndex = 1;
        for (VarDeclaration var : actorDec.getConstructorArgs()) {
            commands.append("aload_0\n");
            commands.append(createIndexByteCode("aload", paramIndex));
            commands.append("putfield ").append(actor_name).append("/").append(var.getName().getName()).append(" ")
                    .append(getTypeDescriptor(var.getType())).append("\n");
            paramIndex++;
        }

        commands.append("return\n");
        commands.append(".end method\n");

        return commands.toString();
    }


    @Override
    public String visit(ActorDec actorDec) {
        FileWriter prev_file = currentFile;
        currentSymbolTable = actorDec.getSymbolTable();
        SymbolTable prev_table = currentSymbolTable;
        currentSymbolTable = actorDec.getSymbolTable();
        actorVars = actorDec.getActorVars();
        actorName = actorDec.getName().getName();

        restSlots();
        String commands = "";
        String actor_name = actorDec.getName().getName();
        createFile(actor_name);

        // Define the Actor class
        commands += ".class public " + actor_name + "\n";
        commands += ".super java/lang/Object\n";

        // Declare actor variable fields with default values
        for (VarDeclaration varDeclaration : actorDec.getActorVars()) {
            commands += visitVarActor(varDeclaration);
        }

        // Declare handler methods with arguments and body
        for (Handler handler : actorDec.getMsgHandlers()) {
            commands += handler.accept(this);
        }
        
        commands += generateDefaultConstructor(actorDec, actor_name);

        if(actorDec.isHasConstructor())
            commands += generateParameterizedConstructor(actorDec , actor_name);

        addCommand(commands);
        currentFile = prev_file;
        currentSymbolTable = prev_table;
        actorVars = null;
        return null;
    }

    private String generateDefaultConstructor(ActorDec actorDec, String actor_name) {
        String commands = "";
        // Constructor without arguments
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";

        // Call the superclass constructor
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        // Call object static method
        commands += "aload_0\n";
        commands += "invokestatic MethodInvoker/addObject(Ljava/lang/Object;)V\n";

        // Initialize default values
        for (VarDeclaration varDeclaration : actorDec.getActorVars()) {
            commands += generateDefaultValAttr(actor_name, varDeclaration.getType(), varDeclaration.getName().getName());
        }

        commands += "return\n";
        commands += ".end method\n";
        return commands;
    }

    private String generateDefaultValAttr(String actor_name, Type type, String varName) {
        String commands = "aload_0\n";
        if (type instanceof IntType) {
            commands += "iconst_0\n"; // Default int value
            commands += convertToInteger();
            commands += "putfield " + actor_name + "/" + varName + " Ljava/lang/Integer;\n";
        } else if (type instanceof BooleanType) {
            commands += "iconst_0\n"; // Default boolean value (false)
            commands += convertToBoolean();
            commands += "putfield " + actor_name + "/" + varName + " Ljava/lang/Boolean;\n";
        } else {
            commands += "aconst_null\n"; // Default for String and Object
            commands += "putfield " + actor_name + "/" + varName + " " + (type instanceof StringType ? "Ljava/lang/String;" : "Ljava/lang/Object;") + "\n";
        }
        return commands;
    }

    private String visitVarActor(VarDeclaration varDeclaration) {
        String commands = "";
        Type type = varDeclaration.getType();

        String typeDescriptor = getTypeDescriptor(type);

        String classVar = ".field private " + varDeclaration.getName().getName() + " " + typeDescriptor + "\n";
        commands += classVar;
        return commands;
    }

    private String getTypeDescriptor(Type type) {
        String typeDescriptor;
        if (type instanceof IntType) {
            typeDescriptor = "Ljava/lang/Integer;";
        } else if (type instanceof BooleanType) {
            typeDescriptor = "Ljava/lang/Boolean;";
        } else if (type instanceof StringType) {
            typeDescriptor = "Ljava/lang/String;";
        } else {
            typeDescriptor = "Ljava/lang/Object;";
        }
        return typeDescriptor;
    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        return null;
    }

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


    private String visitAccessExpression(BinaryExpression binaryExpression) {
        String jasminCode = "";
        jasminCode += binaryExpression.getLeftOperand().accept(this);
        jasminCode += binaryExpression.getRightOperand().accept(this);
        jasminCode += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        return jasminCode;
    }

    private Type getArrayElementsType(Identifier identifier) {
        Type tmp = getItemFromName(identifier.getName()).getType();
        return ((ArrayType)tmp).getType();
    }

    private Type getExprType(Expression expr) {
        if (expr instanceof Identifier) {
            Type type = getType((Identifier) expr);
            if (type == null)
                throw new RuntimeException("Error: Identifier type is null!");
            return type;
        }
        if (expr instanceof IntValue)
            return new IntType();
        if (expr instanceof BoolValue)
            return new BooleanType();
        if (expr instanceof StringValue)
            return new StringType();
        return null;
    }

    private String handleOperandForConcat(Expression operand) {
        StringBuilder code = new StringBuilder();

        code.append(operand.accept(this)).append("\n");

        Type operandType = getExprType(operand);

        if (operandType instanceof IntType) {
            code.append("invokestatic java/lang/String/valueOf(I)Ljava/lang/String;\n");
        }
        if (operandType instanceof BooleanType) {
            code.append("invokestatic java/lang/String/valueOf(Z)Ljava/lang/String;\n");
        }
        code.append("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n");
        return code.toString();
    }


    private String StringBuilderForConcat() {
        return "new java/lang/StringBuilder\n" +
                "dup\n" +
                "invokespecial java/lang/StringBuilder/<init>()V\n";
    }

    private String visitStringConcat(BinaryExpression binaryExpression) {
        StringBuilder code = new StringBuilder();

        code.append(StringBuilderForConcat());

        code.append(handleOperandForConcat(binaryExpression.getLeftOperand()));

        code.append(handleOperandForConcat(binaryExpression.getRightOperand()));

        code.append("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;\n");

        return code.toString();
    }



    @Override
    public String visit(BinaryExpression binaryExpression) {
        boolean isConvToNP = convertToNonPrimitive;
        convertToNonPrimitive = false;
        String jasminCode = "";

        if (Arrays.asList(BinaryOperator.MINUS,BinaryOperator.PLUS,
                BinaryOperator.MULT, BinaryOperator.DIVIDE, BinaryOperator.MOD)
                .contains(binaryExpression.getBinaryOperator()))
        {
            if(isCncat) {
                jasminCode += visitStringConcat(binaryExpression);
            }

            else {
                jasminCode += visitIntBinExp(binaryExpression);


                if (isConvToNP) {
                    jasminCode += convertToInteger();
                }
            }
        } else if (binaryExpression.getBinaryOperator() == BinaryOperator.INDEXING) {
            jasminCode += visitAccessExpression(binaryExpression);
            if (!isConvToNP) {
                Type type = getArrayElementsType((Identifier) binaryExpression.getLeftOperand());
                if (type instanceof IntType) {
                    jasminCode += "checkcast java/lang/Integer\n";
                    jasminCode += convertToint();
                } else if (type instanceof BooleanType) {
                    jasminCode += "checkcast java/lang/Boolean\n";
                    jasminCode += convertTobool();
                }
            }
        } else {
            jasminCode += visitBoolExp(binaryExpression);
            if (isConvToNP) {
                jasminCode += convertToBoolean();
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
                jasminCode += convertToBoolean();
            }
        }
        else {
            jasminCode += visitIntUnary(unaryExpression);
            if (isConvToNP) {
                jasminCode += convertToInteger();
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
                jasminCode += convertToInteger();
                jasminCode += generateStoreCode((Identifier) unaryExpression.getOperand());
            }
        }
        else if (unaryExpression.getOperand() instanceof Identifier) {
            jasminCode += "dup\n";
            jasminCode += "iconst_1\n";
            jasminCode += (is_plus ? "iadd" : "isub") + "\n";
            jasminCode += convertToInteger();
            jasminCode += generateStoreCode((Identifier) unaryExpression.getOperand());
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
        jasminCode += generateGoto(nEnd);
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
            jasminCode += generateGoto(nTrue);
        }
        else {
            jasminCode += generateGoto(nFalse);
        }
        return jasminCode;
    }

    private String branchIdentifier(Identifier identifier, String nTrue, String nFalse) {
        String jasminCode = "";
        jasminCode += identifier.accept(this);
        jasminCode += "ifeq " + nFalse + "\n";
        jasminCode += generateGoto(nTrue);
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
        jasminCode += generateGoto(nFalse);
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

    private String generateDefaultVal(Type type) {
        String jasminCode = "";
        if (type instanceof IntType) {
            jasminCode += "iconst_0\n";
            jasminCode += convertToInteger();
        } else if (type instanceof BooleanType) {
            jasminCode += "ldc 0\n";
            jasminCode += convertToBoolean();
        } else if (type instanceof StringType) {
            jasminCode += "ldc \"\"\n";
        }
        return jasminCode;
    }

    @Override
    public String visit(InitStatement initStatement) {
        convertToNonPrimitive = true;
        String jasminCode = "";
        if (initStatement.getAssigned() != null) {
            jasminCode += initStatement.getAssigned().accept(this);
            jasminCode += generateStoreCode(initStatement.getAssignee().getName());
        } else {
            jasminCode += generateDefaultVal(initStatement.getAssignee().getType());
            jasminCode += generateStoreCode(initStatement.getAssignee().getName());
        }

        convertToNonPrimitive = false;
        return jasminCode;
    }

    private String loadArgs(Expression expression) {
        convertToNonPrimitive = true;
        String jasminCode = "";

        if (expression == null) {
        }
        else if (expression instanceof ExpressionList) {
            for (Expression subExp : ((ExpressionList) expression).getExpressionList()){
                jasminCode += subExp.accept(this);
            }
        }
        else {
            jasminCode += expression.accept(this);
        }

        convertToNonPrimitive = false;
        return jasminCode;
    }

    private String getSign(Expression expression) {
        Type type;
        if (expression instanceof IntValue) {
            return "Ljava/lang/Integer;";
        } else if (expression instanceof BoolValue) {
            return "Ljava/lang/Boolean;";
        } else if (expression instanceof StringValue) {
            return "Ljava/lang/String;";
        } else if (expression instanceof Identifier) {
            Identifier identifier = (Identifier) expression;
            if (actorVars != null && isIdInActVar(identifier)) {
                type = getTypeActVar(identifier);
            } else {
                type = getType(identifier);
            }
        } else {
            type = getExprType(expression);
        }

        if (type instanceof IntType) {
            return "Ljava/lang/Integer;";
        } else if (type instanceof BooleanType) {
            return "Ljava/lang/Boolean;";
        } else if (type instanceof StringType) {
            return "Ljava/lang/String;";
        }
//       TODO handel expression as arg
        return "Ljava/lang/Object;";
    }

    private String generateSignArg(Expression expression) {
        String sign = "";

        if (expression == null) {
        }
        else if (expression instanceof ExpressionList) {
            for (Expression subExp : ((ExpressionList) expression).getExpressionList()){
                sign += getSign(subExp);
            }
        }
        else {
            sign += getSign(expression);
        }
        return sign;
    }

    @Override
    public String visit(ConstructorExpression constructorExpression) {
        String jasminCode = "";
//        TODO handle args
        String actorName = constructorExpression.getId().getName();
        jasminCode += "new " + actorName + "\n";
        jasminCode += "dup\n";
        jasminCode += loadArgs(constructorExpression.getArgs());
        jasminCode += "invokespecial " + actorName + "/<init>(" + generateSignArg(constructorExpression.getArgs()) + ")V\n";
        return jasminCode;
    }

    public String visitHandler(Handler handler) {
        String commands = "";

        SymbolTable old = currentSymbolTable;
        currentSymbolTable = handler.getSymbolTable();

        String handlerName = handler.getName().getName();
        if(handler instanceof  ObserveHandler){
            handlerName = '_' + MsgObs + '_' + handlerName;
        }

        restSlots();
        slotOf("self");

        commands += createSignAndArgs(handlerName, handler.getArgs());

        commands += getHandlerBody(handler);

        currentSymbolTable = old;
        return commands;
    }

    private String getHandlerBody(Handler handler) {
        String commands = "";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";

        commands += visitBody(handler.getBody());

        commands += "return\n";
        commands += ".end method\n";
        return commands;
    }

    private String createSignAndArgs(String handlerName, List<VarDeclaration> handlerArgs) {
        StringBuilder methodSignature = new StringBuilder();
        methodSignature.append(".method public ").append(handlerName).append("(");
        for (VarDeclaration arg : handlerArgs) {

            slotOf(arg.getName().getName());

            Type argType = arg.getType();
            if (argType instanceof IntType) {
                methodSignature.append("I");
            } else if (argType instanceof BooleanType) {
                methodSignature.append("Z");
            } else if (argType instanceof StringType) {
                methodSignature.append("Ljava/lang/String;");
            } else {
                methodSignature.append("Ljava/lang/Object;");
            }
        }
        methodSignature.append(")V\n");
        return methodSignature.toString();
    }

    @Override
    public String visit(ServiceHandler serviceHandler) {
        return visitHandler(serviceHandler);
    }

    @Override
    public String visit(ObserveHandler observeHandler) {
        return visitHandler(observeHandler);
    }

    private String generateInvoker(Expression status) {
        String jasminCode = "";
        boolean isPublic = ((BoolValue)status).getBool();
        if (isPublic) {
            jasminCode = "invokestatic MethodInvoker/invokeMethodPublic(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V\n";
        } else {
            jasminCode = "invokestatic MethodInvoker/invokeMethodPrivate(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V\n";
        }
        return jasminCode;
    }

    @Override
    public String visit(ObserveStatement observeStatement) {
        convertToNonPrimitive = true;
        String jasminCode = "";

        jasminCode += observeStatement.getIds().getFirst().accept(this);

        jasminCode += generateObs(observeStatement.getObservers());

        jasminCode += "ldc \"" + observeStatement.getIds().getLast().getName() + "\"\n";

        jasminCode += visitArgsList(observeStatement.getArgs());

        jasminCode += generateInvoker(observeStatement.getObservers().getFirst());

        convertToNonPrimitive = false;
        return jasminCode;
    }

    private String generateObs(ArrayList<Expression> obs) {
        String jasminCode = "";
        try {
            jasminCode += obs.get(1).accept(this);
        } catch (Exception e) {
            jasminCode += "ldc \"\"\n";
        }
        try {
            jasminCode += obs.get(2).accept(this);
        } catch (Exception e) {
            jasminCode += "ldc \"\"\n";
        }

        return jasminCode;
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

        jasminCode += generateStoreCode(assignmentStatement.getIds().getFirst());

        return jasminCode;
    }

    @Override
    public String visit(AccessExpression accessExpression) {
        String jasminCode = "";
        jasminCode += accessExpression.getLeft().accept(this);
        jasminCode += "ldc \"" + ((CallExpression)accessExpression.getRight()).getIdentifier().getName() + "\"\n";
        jasminCode += visitArgsList(((CallExpression)accessExpression.getRight()).getExpressions());
        jasminCode += "invokestatic MethodInvoker/invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V\n";
        return jasminCode;
    }

    public String visitArgsList(Expression expression) {
        convertToNonPrimitive = true;
        String jasminCode = "";

        int size = getCountOfArgs(expression);
        jasminCode += "ldc " + size + "\n";

        jasminCode += "anewarray java/lang/Object\n";

        if (expression == null) {
        }
        else if (expression instanceof ExpressionList) {
            jasminCode += handelArgsList((ExpressionList) expression);
        }
        else {
            jasminCode += handleArg(expression);
        }

        convertToNonPrimitive = false;
        return jasminCode;
    }

    private static int getCountOfArgs(Expression expression) {
        int size = 1;
        if (expression == null){
            size = 0;
        }
        else if (expression instanceof ExpressionList){
            size = ((ExpressionList) expression).getExpressionList().size();
        }
        return size;
    }

    private String handleArg(Expression expression) {
        String jasminCode = "";
        jasminCode += "dup\n";
        jasminCode += "iconst_0\n";
        jasminCode += expression.accept(this);
        jasminCode += "aastore\n";
        return jasminCode;
    }

    private String handelArgsList(ExpressionList expressionList) {
        String jasminCode = "";
        int index = 0;
        for (Expression subExp : expressionList.getExpressionList()){
            jasminCode += "dup\n";
            jasminCode += "ldc " + index + "\n";
            jasminCode += subExp.accept(this);
            jasminCode += "aastore\n";
            index++;
        }
        return jasminCode;
    }

    @Override
    public String visit(IntValue intValue) {
        String jasminCode = "ldc " + intValue.getIntVal() + "\n";
        if (convertToNonPrimitive) {
            jasminCode += convertToInteger();
        }
        return jasminCode;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String jasminCode = "ldc " + (boolValue.getBool() ? "1" : "0") + "\n";
        if (convertToNonPrimitive) {
            jasminCode += convertToBoolean();
        }
        return jasminCode;
    }

    @Override
    public String visit(StringValue stringValue) {
        return "ldc " + stringValue.getStr() + "\n";
    }

    private String generateStoreCode(Identifier id) {
        VarDeclarationItem leftHand = getItemFromName(id.getName());
        return generateStoreWithName(id.getName());
    }

    private String generateStoreWithName(String name) {
        int index = slotOf(name);
        return createIndexByteCode("astore", index);
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

    private String getIteratorName(ForStatement forStatement) {
        return forStatement.getIterator().getName().getName();
    }

    private String createIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += generateDefaultVal(forStatement.getIterator().getType());
        jasminCode += generateStoreWithName(getIteratorName(forStatement));
        return jasminCode;
    }

    private String getIteratorIndexName(ForStatement forStatement) {
        return getIteratorName(forStatement) + "$index";
    }

    private String createIndexIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += "ldc -1\n";
        jasminCode += convertToInteger();
        jasminCode += generateStoreWithName(getIteratorIndexName(forStatement));
        return jasminCode;
    }


    private String getIteratorMaxName(ForStatement forStatement) {
        return getIteratorName(forStatement) + "$max";
    }

    private String loadMaxList(Identifier list) {
        String jasminCode = "";
        jasminCode += generateLoadCode(list);
        jasminCode += "invokevirtual List/getSize()I\n";
        jasminCode += convertToInteger();
        return jasminCode;
    }

    private String createMaxIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += loadMaxList((Identifier)forStatement.getConditions().getFirst());
        jasminCode += generateStoreWithName(getIteratorMaxName(forStatement));
        return jasminCode;
    }

    private String initIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += createIterator(forStatement);
        jasminCode += createIndexIterator(forStatement);
        jasminCode += createMaxIterator(forStatement);
        return jasminCode;
    }

    private String incerementIndexIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += generateLoadWithName(getIteratorIndexName(forStatement));
        jasminCode += convertToint();
        jasminCode += "iconst_1\n";
        jasminCode += "iadd\n";
        jasminCode += convertToInteger();
        jasminCode += generateStoreWithName(getIteratorIndexName(forStatement));
        return jasminCode;
    }

    private String compareWithMax(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += generateLoadWithName(getIteratorIndexName(forStatement));
        jasminCode += convertToint();
        jasminCode += generateLoadWithName(getIteratorMaxName(forStatement));
        jasminCode += convertToint();
        jasminCode += "if_icmpge " + breakLabel + "\n";
        return jasminCode;
    }

    private String generateCheckcast(Identifier listIdentifier) {
        ArrayType arrayType = (ArrayType)getItemFromName(listIdentifier.getName()).getType();
        Type type = arrayType.getType();
        if (type instanceof IntType) {
            return "checkcast java/lang/Integer\n";
        } else if (type instanceof BooleanType) {
            return "checkcast java/lang/Boolean\n";
        } else if (type instanceof StringType) {
            return "";
        } else {
            return "";
        }
    }

    private String setValueIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += generateLoadCode((Identifier)forStatement.getConditions().getFirst());
        jasminCode += generateLoadWithName(getIteratorIndexName(forStatement));
        jasminCode += convertToint();
        jasminCode += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        jasminCode += generateCheckcast((Identifier)forStatement.getConditions().getFirst());
        jasminCode += generateStoreWithName(getIteratorName(forStatement));
        return jasminCode;
    }

    private String handleForIterator(ForStatement forStatement) {
        String jasminCode = "";
        jasminCode += incerementIndexIterator(forStatement);
        jasminCode += compareWithMax(forStatement);
        jasminCode += setValueIterator(forStatement);
        return jasminCode;
    }

    @Override
    public String visit(ForStatement forStatement) {
        SymbolTable oldST = currentSymbolTable;
        currentSymbolTable = forStatement.getSymbolTable();
        String jasminCode = "";

        String oldBreakLabel = breakLabel;
        String oldContinueLabel = continueLabel;
        String oldAfterLabel = afterLabel;
        String nStart = getFreshLabel();
        boolean tmpAfter = afterLabel.equals("");
        if (tmpAfter) {
            breakLabel = getFreshLabel();
        }
        else {
            breakLabel = oldAfterLabel;
        }
        continueLabel = nStart;
        afterLabel = nStart;

        jasminCode += initIterator(forStatement);

        jasminCode += nStart + ":\n";

        jasminCode += handleForIterator(forStatement);

        jasminCode += visitBody(forStatement.getBody());

        jasminCode += generateGoto(nStart);

        if (tmpAfter) {
            jasminCode += breakLabel + ":\n";
        }

        jasminCode = cleanUpLabels(jasminCode);

        breakLabel = oldBreakLabel;
        continueLabel = oldContinueLabel;
        afterLabel = oldAfterLabel;

        currentSymbolTable = oldST;
        return jasminCode;
    }

    @Override
    public String visit(BreakStatement breakStatement) {
        return generateGoto(breakLabel);
    }

    @Override
    public String visit(ContinueStatement continueStatement) {
        return generateGoto(continueLabel);
    }

    private String visitBody(ArrayList<Statement> statements) {
        String jasminCode = "";
        String tmpAfter = afterLabel;
        afterLabel = "";
        for (Statement statement : statements) {
            String tmp = statement.accept(this);
            if (tmp != null){
                jasminCode += tmp;
            }
            if (statement instanceof ContinueStatement || statement instanceof BreakStatement) {
                break;
            }
        }

        if (!tmpAfter.equals("")) {
            jasminCode += generateGoto(tmpAfter);
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
//        ast bug
//        SymbolTable oldST = currentSymbolTable;
//        currentSymbolTable = whileStatement.getSymbolTable();

        String jasminCode = "";

        String oldBreakLabel = breakLabel;
        String oldContinueLabel = continueLabel;
        String oldAfterLabel = afterLabel;
        String nStart = getFreshLabel();
        boolean tmpAfter = afterLabel.equals("");
        if (tmpAfter) {
            breakLabel = getFreshLabel();
        }
        else {
            breakLabel = oldAfterLabel;
        }
        continueLabel = nStart;
        afterLabel = nStart;
        String nBody = getFreshLabel();

        jasminCode += nStart + ":\n";

        jasminCode += branch(whileStatement.getConditions(), nBody, breakLabel);

        jasminCode += nBody + ":\n";

        jasminCode += visitBody(whileStatement.getBody());

        jasminCode += generateGoto(nStart);

        if (tmpAfter) {
            jasminCode += breakLabel + ":\n";
        }

        jasminCode = cleanUpLabels(jasminCode);

        breakLabel = oldBreakLabel;
        continueLabel = oldContinueLabel;
        afterLabel = oldAfterLabel;

//        currentSymbolTable = oldST;
        return jasminCode;
    }

    @Override
    public String visit(CallExpression callExpression) {
        convertToNonPrimitive = true;
        isCncat = false;
        String jasminCode = "";
        if (Objects.equals(callExpression.getHandlerName(), "print")){
            isCncat = true;
            jasminCode += visitPrint(callExpression);
            convertToNonPrimitive = false;
            isCncat = false;
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

    private String visitPrint(CallExpression callExpression) {
        String jasminCode = "";
        jasminCode += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        jasminCode += callExpression.getExpressions().accept(this);
        jasminCode += "invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V\n";
        return jasminCode;
    }

    private boolean isIdInActVar(Identifier identifier) {
        for (VarDeclaration i : actorVars) {
            if (i.getName().getName().equals(identifier.getName())) {
                return true;
            }
        }
        return false;
    }

    private Type getTypeActVar(Identifier identifier) {
        for (VarDeclaration i : actorVars) {
            if (i.getName().getName().equals(identifier.getName())) {
                return i.getType();
            }
        }
        return null;
    }

    private String generateLoadCodeActVar(Identifier identifier) {
        String jasminCode = "";
        Type type = getTypeActVar(identifier);
        String varName = identifier.getName();
        jasminCode += "aload_0\n";
        if (type instanceof IntType) {
            jasminCode += "getfield " + actorName + "/" + varName + " Ljava/lang/Integer;\n";
        } else if (type instanceof BooleanType) {
            jasminCode += "getfield " + actorName + "/" + varName + " Ljava/lang/Boolean;\n";
        } else {
            jasminCode += "getfield " + actorName + "/" + varName + " " + (type instanceof StringType ? "Ljava/lang/String;" : "Ljava/lang/Object;") + "\n";
        }
        return jasminCode;
    }

    private String visitActVar(Identifier identifier) {
        String jasminCode = "";
        jasminCode += generateLoadCodeActVar(identifier);
        if (!convertToNonPrimitive) {
            if (getTypeActVar(identifier) instanceof IntType) {
                jasminCode += convertToint();
            } else if (getTypeActVar(identifier) instanceof BooleanType) {
                jasminCode += convertTobool();
            }
        }
        return jasminCode;
    }

    @Override
    public String visit(Identifier identifier) {
        if (actorVars != null && isIdInActVar(identifier)) {
            return visitActVar(identifier);
        } else {
            return visitVar(identifier);
        }
    }

    private String visitVar(Identifier identifier) {
        String jasminCode = "";
        jasminCode += generateLoadCode(identifier);
        if (!convertToNonPrimitive) {
            if (getType(identifier) instanceof IntType) {
                jasminCode += convertToint();
            } else if (getType(identifier) instanceof BooleanType) {
                jasminCode += convertTobool();
            }
        }
        return jasminCode;
    }

    private String generateLoadCode(Identifier id) {
        return generateLoadWithName(id.getName());
    }

    private String generateLoadWithName(String name) {
        int index = slotOf(name);
        return createIndexByteCode("aload", index);
    }

    private Type getType(Identifier identifier) {
        return getItemFromName(identifier.getName()).getType();
    }
    private String convertToInteger() {
        return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
    }

    private String convertToint() {
        return "invokevirtual java/lang/Integer/intValue()I\n";
    }

    private String convertTobool() {
        return "invokevirtual java/lang/Boolean/booleanValue()Z\n";
    }

    private String convertToBoolean() {
        return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
    }

    private String generateGoto(String label) {
        return "goto " + label + "\n";
    }
}

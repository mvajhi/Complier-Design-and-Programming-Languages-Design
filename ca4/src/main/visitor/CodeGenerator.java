package main.visitor;

import main.ast.nodes.Soact;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.CallExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ExpressionList;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statements.*;

import java.io.*;
import java.util.ArrayList;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter currentFile;

    public CodeGenerator() {
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
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
        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";

        for (Statement statement : main.getStatements()) {
            statement.accept(this);
        }

        commands += "return\n";
        commands += ".end method\n";
        addCommand(commands);

        return null;
    }

    @Override
    public String visit(InitStatement initStatement) {
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

    @Override
    public String visit(AssignmentStatement assignmentStatement) {
        for (Identifier id : assignmentStatement.getIds()) {
            id.accept(this);
        }

        assignmentStatement.getAssigned().accept(this);

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
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        return null;
    }
}

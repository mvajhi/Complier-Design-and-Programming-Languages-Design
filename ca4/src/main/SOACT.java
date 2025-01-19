package main;

import main.ast.nodes.Soact;
import main.symbolTable.SymbolTable;
import main.visitor.CodeGenerator;
import main.visitor.NameAnalyzer;
import main.visitor.TypeChecker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SOACTLexer;
import parsers.SOACTParser;

import java.io.*;

public class SOACT {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SOACTLexer soactLexer = new SOACTLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(soactLexer);
        SOACTParser soactParser = new SOACTParser(tokens);
        Soact soact = soactParser.soact().soactRet;
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(soact);

//        TypeChecker typeChecker = new TypeChecker();
//        typeChecker.visit(soact);

        SymbolTable.top.hashCode();

        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.visit(soact);

        runJasminCode();
    }

    private static void runJasminCode() {
        try {
            System.out.println("---------------------------Compilation Successful---------------------------");
            File dir = new File("./codeGenOutput");
//            Process process = Runtime.getRuntime().exec("java -jar jasmin.jar *.j", null, dir);
            Process process = Runtime.getRuntime().exec(new String[]{ "/usr/bin/sh", "-c", "java -jar jasmin.jar *.j" }, null, dir);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            process = Runtime.getRuntime().exec("java Main", null, dir);
            printResults(process.getInputStream());
            printResults(process.getErrorStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printResults(InputStream stream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line;
        try {
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


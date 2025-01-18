package main;

import main.ast.nodes.Soact;
import main.symbolTable.SymbolTable;
import main.visitor.NameAnalyzer;
import main.visitor.TypeChecker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SOACTLexer;
import parsers.SOACTParser;
import java.io.IOException;

public class SOACT {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SOACTLexer soactLexer = new SOACTLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(soactLexer);
        SOACTParser soactParser = new SOACTParser(tokens);
        Soact soact = soactParser.soact().soactRet;
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(soact);

        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(soact);

        SymbolTable.top.hashCode();

         System.out.println();
    }
}

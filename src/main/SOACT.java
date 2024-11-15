package main;

import main.grammar.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class SOACT {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        SOACTLexer lexer = new SOACTLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SOACTParser parser = new SOACTParser(tokens);
        ParseTree tree = parser.program();
    }
}
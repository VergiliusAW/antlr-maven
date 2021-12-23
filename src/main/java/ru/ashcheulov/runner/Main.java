package ru.ashcheulov.runner;


import com.github.bgora.rpnlibrary.Calculator;
import mikhail.ashcheulov.Pl0Lexer;
import mikhail.ashcheulov.Pl0Parser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import mikhail.ashcheulov.MuLexer;
import mikhail.ashcheulov.MuParser;
import ru.ashcheulov.mu.MuVisitorImpl;
import ru.ashcheulov.pl0.Pl0VisitorImpl;

import java.io.IOException;

public class Main {
    public static void main(String... a) throws IOException {
        Pl0Lexer pl0Lexer = new Pl0Lexer(CharStreams.fromFileName("examples/example2.pl0"));
        CommonTokenStream tokens = new CommonTokenStream(pl0Lexer);
        Pl0Parser parser = new Pl0Parser(tokens);
        ParseTree tree = parser.program();
        Pl0VisitorImpl visitor = new Pl0VisitorImpl();
        visitor.visit(tree);

//        MuLexer lexer = new MuLexer(CharStreams.fromFileName("examples-test/example.mu"));
//        MuParser parser = new MuParser(new CommonTokenStream(lexer));
//        ParseTree tree = parser.parse();
//        MuVisitorImpl visitor = new MuVisitorImpl();
//        visitor.visit(tree);
    }
}

package io.lutra;

import antlr4.MySqlLangRuleLexer;
import antlr4.MySqlLangRuleParser;
import io.lutra.common.CaseSensitiveCharStream;
import io.lutra.visitor.ddl.DdlLangVisitorFactory;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Hello world!
 *
 */
public class App 
{

    static final String SQL = "CREATE TABLE IF NOT EXISTS  myTable \n" +
            "(\n" +
            "  id INT NOT NULL PRIMARY KEY,\n" +
            "  name VARCHAR(255),\n" +
            "  sex CHAR(0)\n" +
            ")";

    public static void main( String[] args )
    {
        CharStream stream = CharStreams.fromString(SQL);
        MySqlLangRuleLexer lexer  = new MySqlLangRuleLexer(new CaseSensitiveCharStream(stream,true));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MySqlLangRuleParser parser = new MySqlLangRuleParser(tokenStream);
        ParseTree tree = parser.root();
        DdlLangVisitorFactory factory = new DdlLangVisitorFactory();
        long startTime = System.currentTimeMillis();
        for (int i=0;i<10000;i++) {
            CreateStatementTableNameVisitor visitor = factory.newVisitor(CreateStatementTableNameVisitor.class);
            visitor.visit(tree);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Using:"+(endTime-startTime));
    }
}

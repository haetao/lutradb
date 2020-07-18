package io.lutra;

import antlr4.MySqlLangRuleLexer;
import antlr4.MySqlLangRuleParser;
import io.lutra.common.CaseSensitiveCharStream;
import io.lutra.visitor.MySqlLangRuleVisitor;
import io.lutra.visitor.impl.create.CreateStatementVisitor;
import io.lutra.visitor.impl.create.CreateTableNode;
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
        MySqlLangRuleVisitor<Void> visitor = new CreateStatementVisitor();
        visitor.visit(tree);

        CreateTableNode node = new CreateTableNode();
    }
}

package io.lutra;

import io.lutra.common.CaseSensitiveCharStream;
import io.lutra.parser.ddl.DdlLangRuleLexer;
import io.lutra.parser.ddl.DdlLangRuleParser;
import io.lutra.visitor.ddl.DdlLangVisitorFactory;
import io.lutra.visitor.ddl.create.CreateLangVisitor;
import io.lutra.visitor.ddl.create.pojo.LangStatementPayload;
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
        DdlLangRuleLexer lexer  = new DdlLangRuleLexer(new CaseSensitiveCharStream(stream,true));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DdlLangRuleParser parser = new DdlLangRuleParser(tokenStream);
        ParseTree tree = parser.root();
        long startTime = System.currentTimeMillis();
        CreateLangVisitor visitor = DdlLangVisitorFactory.newVisitor(CreateLangVisitor.class,new LangStatementPayload());
        tree.accept(visitor);
        long endTime = System.currentTimeMillis();
        System.out.println("Using:"+(endTime-startTime));
    }
}

package io.lutra.antlr.handlers;

import io.lutra.antlr.ParseTreeFactory;
import io.lutra.antlr.visitor.ddl.DdlLangVisitorFactory;
import io.lutra.antlr.visitor.ddl.create.CreateLangVisitor;
import io.lutra.sql.SqlHandler;
import io.lutra.sql.pojo.TableCreation;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParseCreateHandler implements SqlHandler<String, TableCreation> {

    private final CreateLangVisitor visitor;

    public ParseCreateHandler() {
        visitor =  DdlLangVisitorFactory.newVisitor(CreateLangVisitor.class,new TableCreation());

    }

    @Override
    public TableCreation channelProcess(String input) {
        ParseTree tree = ParseTreeFactory.genParseTree(input);
        tree.accept(visitor);
        return visitor.getStatementPayload();
    }
}

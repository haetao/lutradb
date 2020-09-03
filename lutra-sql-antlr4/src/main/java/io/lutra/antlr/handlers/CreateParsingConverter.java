package io.lutra.antlr.handlers;

import io.lutra.antlr.ParseTreeFactory;
import io.lutra.antlr.visitor.ddl.DdlLangVisitorFactory;
import io.lutra.antlr.visitor.ddl.create.CreateLangVisitor;
import io.lutra.common.converter.Converter;
import io.lutra.pipeline.pojo.TableCreation;
import org.antlr.v4.runtime.tree.ParseTree;

public class CreateParsingConverter implements Converter<String, TableCreation> {

    private final CreateLangVisitor visitor;

    public CreateParsingConverter() {
        visitor =  DdlLangVisitorFactory.newVisitor(CreateLangVisitor.class,new TableCreation());
    }

    @Override
    public TableCreation handle(String input) {
        ParseTree tree = ParseTreeFactory.genParseTree(input);
        tree.accept(visitor);
        return visitor.getStatementPayload();
    }
}

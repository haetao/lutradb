package io.lutra.visitor.ddl.create;

import io.lutra.parser.ddl.DdlLangRuleParser;
import io.lutra.visitor.ddl.base.DdlLangRuleBaseVisitor;
import io.lutra.visitor.ddl.create.pojo.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class CreateLangVisitor extends DdlLangRuleBaseVisitor<Void> {

    @Getter
    private LangStatementPayload statementPayload;

    public CreateLangVisitor(LangStatementPayload statementPayload) {
        this.statementPayload = statementPayload;
        this.statementPayload.setColumnPayloads(new ArrayList<ColumnPayload>());
        this.statementPayload.setForeignPayloads(new ArrayList<ForeignItemPayload>());
    }

    @Override
    public Void visitTableName(DdlLangRuleParser.TableNameContext ctx) {
        statementPayload.setTableName(ctx.isEmpty()?null:ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Void visitIfNotExists(DdlLangRuleParser.IfNotExistsContext ctx) {
        statementPayload.setNotExistsSymbol(ctx != null);
        return visitChildren(ctx);
    }

    @Override
    public Void visitColumnDefineStyle(DdlLangRuleParser.ColumnDefineStyleContext ctx) {
        parseColumnDefineStyle(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Void visitPrimaryKeyContent(DdlLangRuleParser.PrimaryKeyContentContext ctx) {
        if((ctx != null ) && !ctx.isEmpty()) {
            String[] keys = ctx.keys().getText().split(",");
            MultiplePrimaryKeysPayload primaryKeysPayload = new MultiplePrimaryKeysPayload();
            primaryKeysPayload.setKeys(keys);
            statementPayload.setPrimaryKeysPayload(primaryKeysPayload);
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitForeignKeyContent(DdlLangRuleParser.ForeignKeyContentContext ctx) {
        return visitChildren(ctx);
    }

    private void parseColumnDefineStyle(DdlLangRuleParser.ColumnDefineStyleContext ctx){
        List<DdlLangRuleParser.ColumnNameContext> columnNameContexts = ctx.columnName();
        ColumnPayload payload = new ColumnPayload();
        for(DdlLangRuleParser.ColumnNameContext each : columnNameContexts){
            String columnName = each.getText().replaceAll("`","");
            payload.setColumnName(columnName);
        }
        payload.setDataTypePayload(new DataTypePayload());
        List<DdlLangRuleParser.DataTypeContentContext> dataTypeContentContexts = ctx.dataTypeContent();
        for(DdlLangRuleParser.DataTypeContentContext each : dataTypeContentContexts){
            String dataType = each.dataType().getText();
            int length = Integer.parseInt(each.number()==null?"0":each.number().getText());
            payload.getDataTypePayload().setTypeName(dataType);
            payload.getDataTypePayload().setDataLength(length);
        }
        List<DdlLangRuleParser.ColumnDefParametersContext> parametersContexts = ctx.columnDefParameters();
        for(DdlLangRuleParser.ColumnDefParametersContext each : parametersContexts){
            payload.setNutNullSymbol(each.notNull() != null);
            payload.setAutoIncrementSymbol(each.AUTO_INCREMENT()!=null);
            payload.setPrimaryKeySymbol(each.primaryKey() != null);
        }
        statementPayload.getColumnPayloads().add(payload);
    }

}

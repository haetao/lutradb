package io.lutra.antlr.visitor.ddl.create;

import io.lutra.antlr.parser.ddl.DdlLangRuleParser;
import io.lutra.antlr.visitor.ddl.base.DdlLangRuleBaseVisitor;
import io.lutra.sql.pojo.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class CreateLangVisitor extends DdlLangRuleBaseVisitor<Void> {

    @Getter
    private final TableCreation statementPayload;

    public CreateLangVisitor(TableCreation statementPayload) {
        this.statementPayload = statementPayload;
        this.statementPayload.setColumnCreations(new ArrayList<ColumnCreation>());
        this.statementPayload.setForeignPayloads(new ArrayList<ForeignItemCarrier>());
    }

    @Override
    public Void visitTableName(DdlLangRuleParser.TableNameContext ctx) {
        statementPayload.setName(ctx.isEmpty()?null:ctx.getText());
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
            MultiplePrimaryKeysCarrier primaryKeysPayload = new MultiplePrimaryKeysCarrier();
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
        ColumnCreation payload = new ColumnCreation();
        for(DdlLangRuleParser.ColumnNameContext each : columnNameContexts){
            String columnName = each.getText().replaceAll("`","");
            payload.setName(columnName);
        }
        payload.setDataTypeCarrier(new DataTypeCarrier());
        List<DdlLangRuleParser.DataTypeContentContext> dataTypeContentContexts = ctx.dataTypeContent();
        for(DdlLangRuleParser.DataTypeContentContext each : dataTypeContentContexts){
            String dataType = each.dataType().getText();
            int length = Integer.parseInt(each.number()==null?"0":each.number().getText());
            payload.getDataTypeCarrier().setTypeName(dataType);
            payload.getDataTypeCarrier().setDataLength(length);
        }
        List<DdlLangRuleParser.ColumnDefParametersContext> parametersContexts = ctx.columnDefParameters();
        for(DdlLangRuleParser.ColumnDefParametersContext each : parametersContexts){
            if(each.notNull() != null){
                payload.setNotNullSymbol(true);
            }
            if(each.AUTO_INCREMENT() != null){
                payload.setAutoIncrementSymbol(true);
            }
            if(each.primaryKey() != null){
                payload.setPrimaryKeySymbol(true);
            }
        }
        payload.setBelongTable(statementPayload.getName());
        statementPayload.getColumnCreations().add(payload);
    }

}

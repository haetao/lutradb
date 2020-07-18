package io.lutra.visitor.impl.create;

import antlr4.MySqlLangRuleParser;
import com.google.common.base.Preconditions;
import io.lutra.visitor.impl.MySqlLangRuleBaseVisitor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateStatementVisitor extends MySqlLangRuleBaseVisitor<Void> {

    @Getter
    private Map<String,Object> resultMap;

    private List<CreateColumnNode> createColumnNodes;

    public CreateStatementVisitor() {
        createColumnNodes = new ArrayList<>();
        resultMap = new HashMap<>();
    }

    @Override
    public Void visitTableName(MySqlLangRuleParser.TableNameContext ctx) {
        String tableName = Preconditions.checkNotNull(ctx.getText(),"TableNameContext"+ctx+" is null");
        resultMap.put("tableName",tableName);
        return null;
    }

    @Override
    public Void visitIfNotExists(MySqlLangRuleParser.IfNotExistsContext ctx) {
        boolean nullSymbol = !ctx.isEmpty();
        resultMap.put("ifNotExists",nullSymbol);
        return null;
    }

    @Override
    public Void visitColumnDefineStyle(MySqlLangRuleParser.ColumnDefineStyleContext ctx) {
        return super.visitColumnDefineStyle(ctx);
    }
}

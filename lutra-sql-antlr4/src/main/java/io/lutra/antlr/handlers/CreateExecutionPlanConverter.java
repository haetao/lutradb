package io.lutra.antlr.handlers;

import io.lutra.common.converter.Converter;
import io.lutra.sql.SqlExecutionPlan;
import io.lutra.sql.pojo.TableCreation;

public class CreateExecutionPlanConverter implements Converter<TableCreation, SqlExecutionPlan> {

    @Override
    public SqlExecutionPlan handle(TableCreation input) {
        return null;
    }
}

package io.lutra.antlr.handlers;

import io.lutra.common.converter.Converter;
import io.lutra.pipeline.SqlExecutionPlan;
import io.lutra.pipeline.pojo.TableCreation;

public class CreateVerifyConverter implements Converter<TableCreation, SqlExecutionPlan> {

    @Override
    public SqlExecutionPlan handle(TableCreation input) {
        return null;
    }
}

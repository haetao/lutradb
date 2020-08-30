package io.lutra.antlr.handlers;

import io.lutra.sql.SqlHandler;
import io.lutra.sql.SqlExecutePlan;
import io.lutra.sql.pojo.TableCreation;

public class GenerateCreateExecutorPlanHandler implements SqlHandler<TableCreation, SqlExecutePlan> {
    @Override
    public SqlExecutePlan channelProcess(TableCreation input) {
        return null;
    }
}

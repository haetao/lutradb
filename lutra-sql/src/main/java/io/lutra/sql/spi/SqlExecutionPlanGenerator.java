package io.lutra.sql.spi;

import io.lutra.sql.SqlExecutionPlan;
import io.lutra.sql.SqlWrapper;

public interface SqlExecutionPlanGenerator {
    SqlExecutionPlan genExecutionPlan(SqlWrapper sqlWrapper) throws Exception;
}

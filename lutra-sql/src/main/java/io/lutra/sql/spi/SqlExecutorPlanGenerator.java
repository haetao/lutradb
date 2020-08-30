package io.lutra.sql.spi;

import io.lutra.sql.SqlExecutePlan;
import io.lutra.sql.SqlWrapper;

public interface SqlExecutorPlanGenerator {
    SqlExecutePlan genExecutorPlan(SqlWrapper sqlWrapper) throws Exception;
}

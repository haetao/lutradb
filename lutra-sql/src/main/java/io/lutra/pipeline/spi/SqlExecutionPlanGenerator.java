package io.lutra.pipeline.spi;

import io.lutra.pipeline.SqlExecutionPlan;
import io.lutra.pipeline.SqlWrapper;

public interface SqlExecutionPlanGenerator {
    SqlExecutionPlan genExecutionPlan(SqlWrapper sqlWrapper) throws Exception;
}

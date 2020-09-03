package io.lutra.pipeline;

import io.lutra.pipeline.statement.SqlLangType;
import io.lutra.pipeline.statement.StatementType;

public interface SqlWrapper {
     SqlLangType getLangType();
     StatementType getStatementType();
     String getSourceSql();
}

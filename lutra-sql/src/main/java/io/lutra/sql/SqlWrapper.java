package io.lutra.sql;

import io.lutra.sql.statement.SqlLangType;
import io.lutra.sql.statement.StatementType;

public interface SqlWrapper {
     SqlLangType getLangType();
     StatementType getStatementType();
     String getSourceSql();
}

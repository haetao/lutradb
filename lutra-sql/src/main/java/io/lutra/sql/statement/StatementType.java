package io.lutra.sql.statement;

public enum StatementType {
    GRANT,
    REVOKE,
    SAVEPOINT,
    ROLLBACK,
    COMMIT,
    SELECT,
    INSERT,
    UPDATE,
    DELETE,
    CREATE,
    DROP,
    ALTER,
    RENAME,
    TRUNCATE
}

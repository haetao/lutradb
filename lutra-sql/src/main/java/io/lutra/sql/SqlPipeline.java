package io.lutra.sql;

public interface SqlPipeline<I,O> {
    <K> SqlPipeline<I,K> addHandler(SqlHandler<O,K> handler);
    O execute(I input);
}

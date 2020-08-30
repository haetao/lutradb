package io.lutra.antlr;

import io.lutra.sql.SqlHandler;
import io.lutra.sql.SqlPipeline;

public class StatementProcessPipeline<I,O> implements SqlPipeline<I,O> {

    private final SqlHandler<I,O> currentHandler;

    public StatementProcessPipeline(SqlHandler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    @Override
    public<K> SqlPipeline<I,K> addHandler(SqlHandler<O, K> handler) {
        return new StatementProcessPipeline<>(input -> handler.channelProcess(currentHandler.channelProcess(input)));
    }

    @Override
    public O execute(I input) {
        return currentHandler.channelProcess(input);
    }
}

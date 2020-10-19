package io.lutra.common.pipeline;

public interface PipelineHandler<T> {
    Object handle(PipelineContext pipelineContext, T obj);
}

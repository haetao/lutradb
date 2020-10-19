package io.lutra.common.pipeline;

public interface PipelineContext<T> {
    Object transmit(T obj);
    Object doProcess(T obj);
    PipelineHandler<T> getHandler();
    void setNext(PipelineContext<T> next);
    void setPrev(PipelineContext<T> prev);
    PipelineContext<T> getNext();
    PipelineContext<T> getPrev();
}

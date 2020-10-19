package io.lutra.common.pipeline;


public class PipelineContextImpl<T> implements PipelineContext<T> {

    private PipelineContext<T> next;

    private PipelineContext<T> perv;

    private final PipelineHandler<T> handler;

    public PipelineContextImpl(PipelineHandler<T> handler) {
        this.handler = handler;
    }

    @Override
    public Object transmit(T obj) {
        return next.getHandler().handle(next,obj);
    }

    @Override
    public Object doProcess(T obj) {
        return handler.handle(this,obj);
    }

    @Override
    public PipelineHandler<T> getHandler() {
        return handler;
    }

    @Override
    public void setNext(PipelineContext<T> next) {
        this.next = next;
    }

    @Override
    public void setPrev(PipelineContext<T> prev) {
        this.perv = prev;
    }

    @Override
    public PipelineContext<T> getNext() {
        return next;
    }

    @Override
    public PipelineContext<T> getPrev() {
        return perv;
    }
}

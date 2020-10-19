package io.lutra.common;

import io.lutra.common.pipeline.PipelineContext;
import io.lutra.common.pipeline.PipelineHandler;
import io.lutra.common.pipeline.PipelineContextImpl;

public final class Pipeline<T> {
    private PipelineContext<T> head;
    private PipelineContext<T> defaultTail;
    private PipelineContext<T> tail;

    public Pipeline(PipelineHandler<T> handler) {
        defaultTail = new PipelineContextImpl<>(new DefaultHandler<>());
        PipelineContext<T> pipelineContext = new PipelineContextImpl<>(handler);
        pipelineContext.setNext(defaultTail);
        defaultTail.setPrev(pipelineContext);
        head = pipelineContext;
        tail = head;
    }

    public Pipeline<T> addLast(PipelineHandler<T> handler){
        PipelineContext<T> tmp = new PipelineContextImpl<>(handler);
        tmp.setPrev(tail);
        tmp.setNext(defaultTail);
        tail.setNext(tmp);
        tail = tail.getNext();
        defaultTail.setPrev(tail);
        return this;
    }
    public Pipeline<T> addFirst(PipelineHandler<T> handler){
        PipelineContext<T> tmp = new PipelineContextImpl<>(handler);
        tmp.setPrev(null);
        tmp.setNext(head);
        head.setPrev(tmp);
        head = head.getPrev();
        return this;
    }

    public Object doHandle(T obj){
        return head.doProcess(obj);
    }

    class DefaultHandler<T> implements PipelineHandler<T> {
        @Override
        public Object handle(PipelineContext pipelineContext, T obj) {
            return obj;
        }
    }
}

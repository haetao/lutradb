package io.lutra.common;

import com.google.common.collect.Lists;
import io.lutra.common.filter.Filter;
import io.lutra.common.converter.ConverterChain;
import io.lutra.common.filter.FilterChain;
import io.lutra.common.converter.Converter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/2
 * @Description:
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LutraChain {

    static class InnerConverterChain<I,O> implements ConverterChain<I,O> {
        private final Converter<I,O> currentHandler;

        private InnerConverterChain(Converter<I, O> currentHandler) {
            this.currentHandler = currentHandler;
        }

        @Override
        public <K> ConverterChain<I, K> addConverter(Converter<O, K> handler) {
            return new InnerConverterChain<>(input -> handler.handle(currentHandler.handle(input)));
        }

        @Override
        public O submit(I input) {
            return currentHandler.handle(input);
        }
    }


    static class InnerFilterChain<T> implements FilterChain<T>{

        private final LinkedList<Filter<T>> filters;

        private InnerFilterChain(Filter<T> filter){
            filters = Lists.newLinkedList();
            addFilterToFirst(filter);
        }

        @Override
        public FilterChain<T> addFilterToFirst(Filter<T> filter) {
            filters.addFirst(filter);
            return this;
        }

        @Override
        public FilterChain<T> addFilterToLast(Filter<T> filter) {
            filters.addLast(filter);
            return this;
        }

        @Override
        public T doFilter(T obj) {
            for(Filter<T> filter : filters){
                obj = filter.doFilter(obj);
            }
            return obj;
        }
    }

    public static<I,O> ConverterChain<I,O> newConverterChain(Converter<I, O> converter){
        return new InnerConverterChain<>(converter);
    }

    public static<T> FilterChain<T> newFilterChain(Filter<T> filter){
        return new InnerFilterChain<>(filter);
    }
}

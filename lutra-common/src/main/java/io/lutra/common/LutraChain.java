package io.lutra.common;

import com.google.common.collect.Lists;
import io.lutra.common.filter.Filter;
import io.lutra.common.converter.ConverterChain;
import io.lutra.common.filter.FilterChain;
import io.lutra.common.interceptor.Interceptor;
import io.lutra.common.converter.Converter;
import io.lutra.common.interceptor.InterceptorChain;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/2
 * @Description:
 */
@Slf4j
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
        public void addFilterToFirst(Filter<T> filter) {
            filters.addFirst(filter);
        }

        @Override
        public void addFilterToLast(Filter<T> filter) {
            filters.addLast(filter);
        }

        @Override
        public T doFilter(T obj) {
            for(Filter<T> filter : filters){
                obj = filter.doFilter(obj);
            }
            return obj;
        }
    }

    static class InnerInterceptorChain<T> implements InterceptorChain<T>{

        private final List<Interceptor<T>> interceptors;

        private InnerInterceptorChain(Interceptor<T> interceptor){
            interceptors = Lists.newLinkedList();
            addInterceptor(interceptor);
        }

        @Override
        public void addInterceptor(Interceptor<T> interceptor) {
            interceptors.add(interceptor);
        }

        @Override
        public boolean intercept(T obj) {
            for(Interceptor<T> interceptor : interceptors){
                if(!interceptor.doIntercept(obj)){
                    return false;
                }
            }
            return true;
        }
    }

    public static<I,O> ConverterChain<I,O> newConverterChain(Converter<I, O> converter){
        return new InnerConverterChain<>(converter);
    }

    public static<T> FilterChain<T> newFilterChain(Filter<T> filter){
        return new InnerFilterChain<>(filter);
    }

    public static<T> InterceptorChain<T> newInterceptorChain(Interceptor<T> interceptor){
        return new InnerInterceptorChain<>(interceptor);
    }

}

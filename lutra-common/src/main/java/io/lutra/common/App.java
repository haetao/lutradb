package io.lutra.common;
import io.lutra.common.interceptor.Interceptor;
import io.lutra.common.interceptor.InterceptorChain;
import io.lutra.common.proxy.DynamicProxyFactoryBuilder;
import io.lutra.common.proxy.ProxyFactory;
import io.lutra.common.util.RegexUtil;

import java.awt.*;
import java.util.List;

import static java.lang.Long.valueOf;

public class App {
    public static void main(String[] args) {
        InterceptorChain<A> interceptorChain  =LutraChain.newInterceptorChain(new DefaultInterceptor());
        interceptorChain.addInterceptor(new DefaultInterceptor());
    }

    static interface A{
        void sayA();
    }

    static class DefaultInterceptor implements Interceptor<A>{
        @Override
        public boolean doIntercept(A obj) {
            return false;
        }
    }
}

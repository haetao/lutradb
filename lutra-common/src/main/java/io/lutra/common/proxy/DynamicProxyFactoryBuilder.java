package io.lutra.common.proxy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.InvocationHandler;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DynamicProxyFactoryBuilder {
    public static<T> ProxyFactory<T> buildCGlibProxyFactory(Class<T> cl, MethodInterceptor interceptor){
        return new CGlibDynamicProxyFactory<>(cl, interceptor);
    }

    public static<T> ProxyFactory<T> buildJdkProxyFactory(T obj, Class[] interfaces, InvocationHandler handler){
        return new JdkDynamicProxyFactory<>(obj, interfaces, handler);
    }
}

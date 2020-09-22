package io.lutra.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyFactory<T> implements ProxyFactory<T> {

    private final T obj;

    private final Class[] interfaces;

    private final InvocationHandler handler;

    public JdkDynamicProxyFactory(T obj, Class[] interfaces, InvocationHandler handler) {
        this.obj = obj;
        this.interfaces = interfaces;
        this.handler = handler;
    }

    @Override
    public T newProxyInstance() {
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),interfaces,handler);
    }
}

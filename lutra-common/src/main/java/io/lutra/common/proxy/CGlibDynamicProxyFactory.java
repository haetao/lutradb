package io.lutra.common.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

class CGlibDynamicProxyFactory<T> implements ProxyFactory<T>{
    private final Class<T> cl;

    private final MethodInterceptor interceptor;

    public CGlibDynamicProxyFactory(Class<T> cl, MethodInterceptor interceptor) {
        this.cl = cl;
        this.interceptor = interceptor;
    }

    @Override
    public T newProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cl);
        enhancer.setCallback(interceptor);
        return (T) enhancer.create();
    }
}

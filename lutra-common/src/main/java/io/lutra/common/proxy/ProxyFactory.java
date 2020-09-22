package io.lutra.common.proxy;

public interface ProxyFactory<T> {
    T newProxyInstance();
}

package io.lutra.common.interceptor;

public interface InterceptorChain<T> {
    void addInterceptor(Interceptor<T> interceptor);
    boolean intercept(T obj);
}

package io.lutra.common.interceptor;


/**
 * @Author: wanght_oup_cq
 * @Date: 2020/8/31
 * @Description:
 */
public interface Interceptor<T> {
    boolean doIntercept(T obj);
}

package io.lutra.common.filter;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/3
 * @Description:
 */
public interface Filter<T> {
    T doFilter(T obj);
}

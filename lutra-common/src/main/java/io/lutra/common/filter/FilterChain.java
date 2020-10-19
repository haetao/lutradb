package io.lutra.common.filter;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/3
 * @Description:
 */
public interface FilterChain<T> {
    FilterChain<T> addFilterToFirst(Filter<T> filter);
    FilterChain<T> addFilterToLast(Filter<T> filter);
    T doFilter(T obj);
}

package io.lutra.common.filter;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/3
 * @Description:
 */
public interface FilterChain<T> {
    void addFilterToFirst(Filter<T> filter);
    void addFilterToLast(Filter<T> filter);
    T doFilter(T obj);
}

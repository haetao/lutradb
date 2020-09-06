package io.lutra.common;

import io.lutra.common.filter.Filter;
import io.lutra.common.filter.FilterChain;
import io.lutra.common.interceptor.InterceptorChain;

public class App {
    public static void main(String[] args) {
        FilterChain<String> filterChain = LutraChain.newFilterChain(obj -> obj+" "+"Tony");
        filterChain.addFilterToFirst(obj -> obj+",Tom");
        filterChain.addFilterToLast(obj -> obj+" done!");
        System.out.print(filterChain.doFilter("hello"));

        InterceptorChain<String> interceptorChain = LutraChain.newInterceptorChain(obj -> obj.endsWith("end"));
        interceptorChain.addInterceptor(obj -> obj.contains("tony"));
        interceptorChain.addInterceptor(obj -> obj.startsWith("start"));

        if(interceptorChain.intercept("startend")){
            System.out.println("its ok!");
        }else {
            System.out.println("false");
        }
    }
}

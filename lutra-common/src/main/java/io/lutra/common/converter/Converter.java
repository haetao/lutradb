package io.lutra.common.converter;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/8/30
 * @Description:
 */
public interface Converter<I,O> {
    /**
     * do something in handle method
     * @param input
     * @return
     */
    O handle(I input);
}

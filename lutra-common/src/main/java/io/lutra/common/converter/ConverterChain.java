package io.lutra.common.converter;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/8/30
 * @Description:
 */
public interface ConverterChain<I,O> {
    /**
     * add handler to converter
     * @param handler
     * @param <K>
     * @return
     */
    <K> ConverterChain<I,K> addConverter(Converter<O,K> handler);

    /**
     * put type <I> into converter stream
     * @param input
     * @return
     */
    O submit(I input);
}

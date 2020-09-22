package io.lutra.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.ServerChannel;

import java.io.Closeable;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/17
 * @Description:
 */
public interface Server extends Closeable {

    void startUp();

    <E extends ServerChannel> Server channel(Class<E> channelType);

    <T> Server option(ChannelOption<T> option, T value);

    Server handler(ChannelHandler handler);

    Server childHandler(ChannelHandler handler);

    <U> Server childOption(ChannelOption<U> option ,U value);


}

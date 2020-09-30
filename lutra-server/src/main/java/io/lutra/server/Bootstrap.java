package io.lutra.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;

import java.io.IOException;


/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/17
 * @Description:
 */
public class Bootstrap implements Server {

    private final int port;

    private final EventLoopGroup boss;

    private final EventLoopGroup workers;

    private final ServerBootstrap serverBootstrap;

    private ChannelFuture future;

    public Bootstrap() {
        boss = new NioEventLoopGroup(1);
        workers = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(boss,workers);
        port = 3306;
    }

    public Bootstrap(int port) {
        boss = new NioEventLoopGroup(1);
        workers = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(boss,workers);
        this.port = port;
    }

    public Bootstrap(int port,int nBossEventLoops,int mWorkersEventLoops) {
        boss = new NioEventLoopGroup(nBossEventLoops);
        workers = new NioEventLoopGroup(mWorkersEventLoops);
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(boss,workers);
        this.port = port;
    }

    @Override
    public void startUp() {
        try {
            future = serverBootstrap.bind(port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            try {
                close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public <E extends ServerChannel> Server channel(Class<E> channelType) {
        serverBootstrap.channel(channelType);
        return this;
    }

    @Override
    public <T> Server option(ChannelOption<T> option, T value) {
        serverBootstrap.option(option,value);
        return this;
    }

    @Override
    public Server handler(ChannelHandler handler) {
        serverBootstrap.handler(handler);
        return this;
    }

    @Override
    public Server childHandler(ChannelHandler handler) {
        serverBootstrap.childHandler(handler);
        return this;
    }

    @Override
    public <U> Server childOption(ChannelOption<U> option, U value) {
        serverBootstrap.childOption(option,value);
        return this;
    }

    @Override
    public void close() throws IOException {
        boss.shutdownGracefully();
        workers.shutdownGracefully();
    }
}

package io.lutra.server;

import io.lutra.server.codec.FrontEncoder;
import io.lutra.server.codec.FrontDecoder;
import io.lutra.server.handler.AuthHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Hello world!
 *
 */
public class ServerTest
{
    public static void main( String[] args ) throws Exception {
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup workers = new NioEventLoopGroup();
        try{
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(boss,workers)
                    .childOption(ChannelOption.SO_KEEPALIVE,true)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            ChannelPipeline pipeline = socketChannel.pipeline();
                            pipeline.addLast("DeCoder",new FrontDecoder());
                            pipeline.addLast("EnCoder",new FrontEncoder());
                            pipeline.addLast("AuthHandler",new AuthHandler());

                        }
                    });
            ChannelFuture future = bootstrap.bind(3309).sync();
            System.out.println("服务端启动。。。。");
            future.channel().closeFuture().sync();

        }finally {
            boss.shutdownGracefully();
            workers.shutdownGracefully();
        }
    }
}

package io.lutra.server;

import io.lutra.server.mysql.HandShakePacket;
import io.netty.channel.*;

import java.net.SocketAddress;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/17
 * @Description:
 */
public class ShakeHandsPacketHandler extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        HandShakePacket packet = new HandShakePacket();
        ctx.writeAndFlush()
    }
}

package io.lutra.server.handler;

import io.lutra.server.mysql.constant.CapabilityFlags;
import io.lutra.server.mysql.constant.CharacterSet;
import io.lutra.server.mysql.constant.MySqlServerStatus;
import io.lutra.server.mysql.packet.AuthPacket;
import io.lutra.server.mysql.packet.BinaryPacket;
import io.lutra.server.mysql.packet.HandShakePacket;
import io.lutra.server.mysql.packet.OkPacket;
import io.lutra.server.mysql.util.RandomUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class AuthHandler extends ChannelInboundHandlerAdapter {

    private byte[] seed;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("通道激活，正在发送握手报文");
        // 生成认证数据
        byte[] rand1 = RandomUtil.randomBytes(8);
        byte[] rand2 = RandomUtil.randomBytes(12);

        // 保存认证数据
        byte[] seed = new byte[rand1.length + rand2.length];
        System.arraycopy(rand1, 0, seed, 0, rand1.length);
        System.arraycopy(rand2, 0, seed, rand1.length, rand2.length);
        this.seed = seed;

        // 发送握手数据包
        HandShakePacket packet = new HandShakePacket();
        packet.setPacketNumber(0);
        packet.setProtocolVersion(10);
        packet.setServerVersion("mysql");//8.0.20 MySQL Community Server - GPL
        packet.setConnectionId(1);
        packet.setAuthPluginDataPart1(rand1);
        packet.setCapabilityFlagLow(CapabilityFlags.CLIENT_SECURE_CONNECTION.getCode());
        packet.setCharacterSet(CharacterSet.getCharacterSetCode("utf8"));
        packet.setServerStatus(MySqlServerStatus.SERVER_STATUS_AUTOCOMMIT.getCode());
        packet.setAuthPluginDataPart2(rand2);
        packet.setAuthPluginName(HandShakePacket.DEFAULT_AUTH_PLUGIN_NAME);
        packet.setCapabilityFlagHigh(CapabilityFlags.CLIENT_SECURE_CONNECTION.getCode() >> 16);
        packet.setPacketLength(packet.calcSize());
        System.out.println("握手报文发送");
        ctx.writeAndFlush(packet);
        System.out.println("发送成功");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        BinaryPacket packet = (BinaryPacket) msg;
        AuthPacket authPacket = new AuthPacket();
        authPacket.read(packet.getData());
        System.out.println("接收到认证报文，用户名为："+authPacket.getUsername());
        if("root".equals(authPacket.getUsername())){
            OkPacket ok = new OkPacket();
            ok.read(OkPacket.AUTH_OK);
            ctx.writeAndFlush(ok);
        }
    }
}

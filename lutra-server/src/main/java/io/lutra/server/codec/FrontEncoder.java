package io.lutra.server.codec;

import io.lutra.server.mysql.packet.BinaryPacket;
import io.lutra.server.mysql.packet.MySqlPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.util.Arrays;

public class FrontEncoder extends MessageToByteEncoder<MySqlPacket> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MySqlPacket mySqlPacket, ByteBuf byteBuf) throws Exception {
        System.out.println("握手报文编码");
        mySqlPacket.write(byteBuf);
        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.getBytes(0,bytes);
        System.out.println(Arrays.toString(bytes));
    }
}

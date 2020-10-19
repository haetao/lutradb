package io.lutra.server.codec;

import io.lutra.server.mysql.packet.BinaryPacket;
import io.lutra.server.mysql.packet.MySqlPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class FrontDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if(byteBuf.readableBytes() < MySqlPacket.HEAD_LENGTH) {
            return;
        }
        BinaryPacket packet = new BinaryPacket();
        byte[] data = new byte[byteBuf.readableBytes()];
        byteBuf.getBytes(0,data);
        packet.read(data);
        list.add(packet);
    }
}

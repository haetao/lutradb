package io.lutra.server.mysql.packet;

import io.lutra.server.mysql.Message;
import io.lutra.server.mysql.util.ByteArrayUtil;
import io.lutra.server.mysql.util.ByteBufUtil;
import io.netty.buffer.ByteBuf;
import lombok.Getter;


public class BinaryPacket extends MySqlPacket{

    @Getter
    private byte[] data;


    @Override
    public void read(byte[] data) {
        Message message = new Message(data);
        setPacketLength(message.readUB3());
        setPacketNumber(message.readUB1());
        ByteArrayUtil.byteArrayCopyReturnSrcPos(data,
                message.getPosition(),this.data,0,
                (data.length-message.getPosition()));
    }

    @Override
    public void write(ByteBuf byteBuf) {
        ByteBufUtil.writeUB3(byteBuf, getPacketLength());
        ByteBufUtil.writeByte(byteBuf,getPacketNumber());
        ByteBufUtil.writeBytes(byteBuf,data);
    }

    @Override
    public int calcSize() {
        return 0;
    }
}

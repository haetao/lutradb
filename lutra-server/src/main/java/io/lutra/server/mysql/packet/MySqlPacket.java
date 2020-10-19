package io.lutra.server.mysql.packet;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MySqlPacket {

    public static final int HEAD_LENGTH = 4;
    private int packetLength;//3bytes
    private int packetNumber;//1byte

    public abstract void read(byte[] data);
    public abstract void write(ByteBuf byteBuf);
    public abstract int calcSize();
}

package io.lutra.server.mysql.packet;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryPacket extends MySqlPacket{
    private byte flag;
    private byte[] message;

    @Override
    public void read(byte[] data) {

    }

    @Override
    public void write(ByteBuf byteBuf) {

    }

    @Override
    public int calcSize() {
        return 0;
    }
}

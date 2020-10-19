package io.lutra.server.mysql.packet;

import io.lutra.server.mysql.constant.MySqlShutdownType;


import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShutdownPacket extends MySqlPacket{
    private byte code = (byte) MySqlShutdownType.SHUTDOWN_DEFAULT.getCode();

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

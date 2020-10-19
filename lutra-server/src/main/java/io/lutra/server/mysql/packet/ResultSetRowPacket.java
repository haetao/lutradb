package io.lutra.server.mysql.packet;



import java.util.List;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultSetRowPacket extends MySqlPacket{
    private int columnCount;
    private List<byte[]> columnValues;

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

package io.lutra.server.mysql.packet;


/**
 * Packet网址：https://dev.mysql.com/doc/internals/en/com-query-response.html#text-resultset
 */
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnCountPacket extends MySqlPacket{
    private int columnCount;

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

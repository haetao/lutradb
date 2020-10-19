package io.lutra.server.mysql.packet;



import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EOFPacket extends MySqlPacket {
    private final byte header = (byte) 0xfe;
    private int warningCount;
    private final int status = 2;


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

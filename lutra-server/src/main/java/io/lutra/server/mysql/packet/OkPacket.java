package io.lutra.server.mysql.packet;



import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OkPacket extends MySqlPacket {
    public static final byte[] AUTH_OK = new byte[] { 7, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0 };
    public static final byte[] OK = new byte[] { 7, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0 };

    private final byte header = 0x00;
    private long affectedRows;
    private long insertId;
    private int serverStatus;
    private int warningCount;
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

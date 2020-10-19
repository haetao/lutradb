package io.lutra.server.mysql.packet;



import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorPacket extends MySqlPacket{
    private final byte header = (byte) 0xff;
    private int errorCode;
    private final byte sqlStateMark = (byte) '#';
    private final byte[] sqlState = "HY000".getBytes();
    private byte[] errorMessage;


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

package io.lutra.server.mysql.packet;



import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnDefinitionPacket extends MySqlPacket{
    private final byte[] catalog = "def".getBytes();
    private byte[] schema; //String<lenenc> Length Encoding String
    private byte[] table; //String<lenenc> Length Encoding String
    private byte[] orgTable; //String<lenenc> Length Encoding String
    private byte[] name; //String<lenenc> Length Encoding String
    private byte[] orgName; //String<lenenc> Length Encoding String
    private final byte fixedLength = 0x0c;  //int<lenenc> Length Encoding Integer
    private int charsetSet; //4bytes  is the column character set and is defined in Protocol::CharacterSet
    private int length; //4bytes maximum length of the field
    private int type; //1byte type of the column as defined in Column Type
    private int flags; //2bytes flags
    private byte decimals; /*max shown decimal digits :0x00 for integers and static strings
                                                       0x1f for dynamic strings, double, float
                                                       0x00 to 0x51 for decimals*/

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

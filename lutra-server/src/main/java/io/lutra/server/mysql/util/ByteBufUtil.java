package io.lutra.server.mysql.util;

import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ByteBufUtil {

    public static void writeByte(ByteBuf byteBuf, final int value){
        byteBuf.writeByte(value);
    }

    public static void writeBytes(ByteBuf byteBuf, final byte[] value){
        byteBuf.writeBytes(value);
    }

    public static void writeUB2(ByteBuf byteBuf, final int value){
        byteBuf.writeBytes(TypesTransUtil.intToByte2(value));
    }

    public static void writeUB3(ByteBuf byteBuf, final int value){
        byteBuf.writeBytes(TypesTransUtil.intToByte3(value));
    }

    public static void writeInt(ByteBuf byteBuf, final int value){
        byteBuf.writeInt(value);
    }

    public static void writeLong(ByteBuf byteBuf, final long value){
        byteBuf.writeLong(value);
    }

    public static void writeStringFixed(ByteBuf byteBuf, final String value){
        byteBuf.writeBytes(value.getBytes());
    }

    public static void writeStringNul(ByteBuf byteBuf, final String value){
        byteBuf.writeBytes(value.getBytes());
        byteBuf.writeByte(0);
    }

    public static void writeStringLen(ByteBuf byteBuf, final String value){
        byte[] bytes = value.getBytes();
        int baseLength = bytes.length;
        if(baseLength < 251){
            byte[] aclArr = new byte[1+baseLength];
            aclArr[0] = (byte)baseLength;
            System.arraycopy(bytes,0,aclArr,1,baseLength);
            byteBuf.writeBytes(aclArr);
        }else if(baseLength < 0x10000L){//0x10000L = 65536
            byteBuf.writeByte(252);
            byteBuf.writeBytes(TypesTransUtil.intToByte2(baseLength));
            byteBuf.writeBytes(bytes);
        }else if(baseLength < 0x1000000L){ //0x1000000L = 16777216
            byteBuf.writeByte(253);
            byteBuf.writeBytes(TypesTransUtil.intToByte3(baseLength));
            byteBuf.writeBytes(bytes);
        }else{
            byteBuf.writeByte(254);
            byteBuf.writeBytes(TypesTransUtil.intToByte8(baseLength));
            byteBuf.writeBytes(bytes);
        }
    }
}

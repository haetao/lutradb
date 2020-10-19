package io.lutra.server.mysql.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Integer length types: 1、2、3、4、8
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TypesTransUtil {

    public static int byte1ToInt(byte b){
        return b;
    }

    public static int byte2ToInt(byte[] bytes){
        return getValue(bytes);
    }

    public static int byte3ToInt(byte[] bytes){
        return getValue(bytes);
    }

    public static int byte4ToInt(byte[] bytes){
        return getValue(bytes);
    }

    public static long byte8ToLong(byte[] bytes){
        return getValue(bytes);
    }

    public static byte intToByte1(int i){
        return (byte)(i & 0xff);
    }

    public static byte[] intToByte2(int i){
        byte[] bytes = new byte[2];
        bytes[0] = (byte) ((i >> 16) & 0xff);
        bytes[1] = (byte) ((i >> 8) & 0xff);
        return bytes;
    }

    public static byte[] intToByte3(int i){
        byte[] bytes = new byte[3];
        bytes[0] = (byte) ((i >> 16) & 0xff);
        bytes[1] = (byte) ((i >> 8) & 0xff);
        bytes[2] = (byte) (i & 0xff);
        return bytes;
    }

    public static byte[] intToByte4(int i){
        byte[] bytes = new byte[4];
        bytes[0] = (byte) ((i >> 24) & 0xff);
        bytes[1] = (byte) ((i >> 16) & 0xff);
        bytes[2] = (byte) ((i >> 8) & 0xff);
        bytes[3] = (byte) (i & 0xff);
        return bytes;
    }

    public static byte[] intToByte8(int i){
        byte[] bytes = new byte[8];
        bytes[0] = (byte) (((long) i >> 56) & 0xff);
        bytes[1] = (byte) (((long) i >> 48) & 0xff);
        bytes[2] = (byte) (((long) i >> 40) & 0xff);
        bytes[3] = (byte) (((long) i >> 32) & 0xff);
        bytes[4] = (byte) (((long) i >> 24) & 0xff);
        bytes[5] = (byte) (((long) i >> 16) & 0xff);
        bytes[6] = (byte) (((long) i >> 8) & 0xff);
        bytes[7] = (byte) ((long) i & 0xff);
        return bytes;
    }

    private static int getValue(byte[] bytes){
        int value=0;
        for(int i = 0; i < bytes.length; i++) {
            int shift= (bytes.length-i) * 8;
            value +=(bytes[i] & 0xFF) << shift;
        }
        return value;
    }
}

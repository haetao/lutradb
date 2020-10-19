package io.lutra.server.mysql.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ByteArrayUtil {

    private static byte[] byteArrayCopy(byte[] srcArr, int needLength, int startPos){
        byte[] result = new byte[needLength];
        System.arraycopy(srcArr,startPos,result,0,needLength);
        return result;
    }

    public static int byteArrayCopyReturnDestPos(byte[] src,int srcPos,byte[] dest,int destPos,int length){
        System.arraycopy(src,srcPos,dest,destPos,length);
        return destPos + length;
    }

    public static int byteArrayCopyReturnSrcPos(byte[] src,int srcPos,byte[] dest,int destPos,int length){
        System.arraycopy(src,srcPos,dest,destPos,length);
        return srcPos + length;
    }

    public static int byteArrayCopy(byte src,byte[] dest,int destPos){
        byte[] srcByte = {src};
        System.arraycopy(srcByte,0,dest,destPos,1);
        return ++destPos;
    }
}

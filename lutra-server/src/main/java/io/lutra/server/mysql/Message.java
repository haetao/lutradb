package io.lutra.server.mysql;

import io.lutra.server.mysql.util.ByteArrayUtil;
import io.lutra.server.mysql.util.TypesTransUtil;
import lombok.Getter;

public final class Message {

    @Getter
    private int position;

    private final byte[] msg;

    @Getter
    private final int size;

    public Message(byte[] msg) {
        this.msg = msg;
        size = msg.length;
        position = 0;
    }

    public int readUB2(){
        byte[] b = new byte[2];
        position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,b,0,2);
        return TypesTransUtil.byte2ToInt(b);
    }

    public int readUB3(){
        byte[] b = new byte[3];
        position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,b,0,3);
        return TypesTransUtil.byte3ToInt(b);
    }

    public int readUB1(){
        return TypesTransUtil.byte1ToInt(msg[position++]);
    }

    public int readUB4(){
        byte[] b = new byte[4];
        position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,b,0,4);
        return TypesTransUtil.byte4ToInt(b);
    }

    public long readLong(){
        byte[] b = new byte[8];
        position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,b,0,8);
        return TypesTransUtil.byte8ToLong(b);
    }

    public String readStringNul() throws Exception {
        if(position >= size){
            return null;
        }
        int offset = -1;
        for(int i = position ;i< size;i++){
            if(msg[i] == 0){
                offset = i;
                break;
            }
        }
        if(offset == -1){
            throw new Exception("Illegal string with nul from offset="+offset);
        }
        if(offset > position){
            String result = new String(msg,position,offset-position);
            position += (++offset);
            return result;
        }else {
            position++;
            return null;
        }
    }

    public String readStringLen(){
        int byteLength = msg[position++];
        switch (byteLength){
            case 251:{
                return null;
            }
            case 252:{
                byte[] arr = new byte[2];
                position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,arr,0,2);
                int length = TypesTransUtil.byte2ToInt(arr);
                String result = new String(msg,position,length);
                position += length;
                return result;
            }
            case 253:{
                byte[] arr = new byte[3];
                position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,arr,0,3);
                int length = TypesTransUtil.byte2ToInt(arr);
                String result = new String(msg,position,length);
                position += length;
                return result;
            }
            case 254:{
                byte[] arr = new byte[4];
                position = ByteArrayUtil.byteArrayCopyReturnSrcPos(msg,position,arr,0,4);
                int length = TypesTransUtil.byte2ToInt(arr);
                String result = new String(msg,position,length);
                position += length;
                return result;
            }
            default:{
                String result = new String(msg,position,byteLength);
                position += byteLength;
                return result;
            }
        }
    }
}

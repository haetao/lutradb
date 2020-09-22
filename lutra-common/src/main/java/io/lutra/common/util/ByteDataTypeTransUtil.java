package io.lutra.common.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.io.UnsupportedEncodingException;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/12
 * @Description:
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ByteDataTypeTransUtil {
    private static final int SHORT_BYTES_LENGTH = 2;
    private static final int INT_BYTES_LENGTH = 4;
    private static final int LONG_BYTES_LENGTH = 8;
    private static final int DOUBLE_BYTE_LENGTH = 8;
    private static final int CHAR_BYTES_LENGTH = 2;
    /**
     * short到字节数组的转换.
     */
    public static byte[] shortToByte(short val) {
        int temp = val;
        byte[] b = new byte[SHORT_BYTES_LENGTH];
        for (int i = 0; i < b.length; i++) {
                b[i] = new Integer(temp & 0xff).byteValue();
                temp = temp >> 8;
            }
            return b;
        }

        /**
         * 字节数组到short的转换.
         */
        public static short byteToShort(byte[] bytes) {
            short s;
            short s0 = (short) (bytes[0] & 0xff);
            short s1 = (short) (bytes[1] & 0xff);
            s1 <<= 8;
            s = (short) (s0 | s1);
            return s;
        }


        /**
         * int到字节数组的转换.
         */
        public static byte[] intToByte(int val) {
            int temp = val;
            byte[] bytes = new byte[INT_BYTES_LENGTH];
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = new Integer(temp & 0xff).byteValue();// 将最低位保存在最低位
                temp = temp >> 8;// 向右移8位
            }
            return bytes;
        }

        /**
         * 字节数组到int的转换.
         */
        public static int byteToInt(byte[] bytes) {
            int s;
            int s0 = bytes[0] & 0xff;// 最低位
            int s1 = bytes[1] & 0xff;
            int s2 = bytes[2] & 0xff;
            int s3 = bytes[3] & 0xff;
            s3 <<= 24;
            s2 <<= 16;
            s1 <<= 8;
            s = s0 | s1 | s2 | s3;
            return s;
        }


        /**
         * long类型转成byte数组
         */
        public static byte[] longToByte(long val) {
            long temp = val;
            byte[] b = new byte[LONG_BYTES_LENGTH];
            for (int i = 0; i < b.length; i++) {
                b[i] = new Long(temp & 0xff).byteValue();// 将最低位保存在最低位
                temp = temp >> 8;// 向右移8位
            }
            return b;
        }

        /**
         * 字节数组到long的转换.
         */
        public static long byteToLong(byte[] b) {
            long s;
            long s0 = b[0] & 0xff;// 最低位
            long s1 = b[1] & 0xff;
            long s2 = b[2] & 0xff;
            long s3 = b[3] & 0xff;
            long s4 = b[4] & 0xff;// 最低位
            long s5 = b[5] & 0xff;
            long s6 = b[6] & 0xff;
            long s7 = b[7] & 0xff;

            // s0不变
            s1 <<= 8;
            s2 <<= 16;
            s3 <<= 24;
            s4 <<= 8 * 4;
            s5 <<= 8 * 5;
            s6 <<= 8 * 6;
            s7 <<= 8 * 7;
            s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7;
            return s;
        }

        /**
         * double到字节数组的转换.
         */
        public static byte[] doubleToByte(double num) {
            byte[] b = new byte[DOUBLE_BYTE_LENGTH];
            long l = Double.doubleToLongBits(num);
            for (int i = 0; i < 8; i++) {
                b[i] = new Long(l).byteValue();
                l = l >> 8;
            }
            return b;
        }

        /**
         * 字节数组到double的转换.
         */
        public static double bytesToDouble(byte[] bytes) {
            long m;
            m = bytes[0];
            m &= 0xff;
            m |= ((long) bytes[1] << 8);
            m &= 0xffff;
            m |= ((long) bytes[2] << 16);
            m &= 0xffffff;
            m |= ((long) bytes[3] << 24);
            m &= 0xffffffffL;
            m |= ((long) bytes[4] << 32);
            m &= 0xffffffffffL;
            m |= ((long) bytes[5] << 40);
            m &= 0xffffffffffffL;
            m |= ((long) bytes[6] << 48);
            m &= 0xffffffffffffffL;
            m |= ((long) bytes[7] << 56);
            return Double.longBitsToDouble(m);
        }


        /**
         * float到字节数组的转换.
         */
        public static byte[] floatToBytes(float val) {
            int intBits = Float.floatToIntBits(val);
            return getBytes(intBits);
        }


        private static byte[] getBytes(int data) {
            byte[] bytes = new byte[4];
            bytes[0] = (byte) (data & 0xff);
            bytes[1] = (byte) ((data & 0xff00) >> 8);
            bytes[2] = (byte) ((data & 0xff0000) >> 16);
            bytes[3] = (byte) ((data & 0xff000000) >> 24);
            return bytes;
    }

        /**
         * 字节数组到float的转换.
         */
        public static float bytesToFloat(byte[] bytes) {
            return Float.intBitsToFloat(byteToInt(bytes));
        }


        /**
         * char到字节数组的转换.
         */
        public static byte[] charToByte(char val){
            byte[] b = new byte[CHAR_BYTES_LENGTH];
            b[0] = (byte) ((val & 0xFF00) >> 8);
            b[1] = (byte) (val & 0xFF);
            return b;
        }

        /**
         * 字节数组到char的转换.
         */
        public static char byteToChar(byte[] bytes){
            char c = (char) (((bytes[0] & 0xFF) << 8) | (bytes[1] & 0xFF));
            return c;
        }

        /**
         * string到字节数组的转换.
         */
        public static byte[] stringToByte(String val,String encoding) {
            try {
                return val.getBytes(encoding);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }

        public static byte[] stringToByte(String val) {
            return val.getBytes();
        }
        /**
         * 字节数组到String的转换.
         */
        public static String bytesToString(byte[] str,String encoding) {
            String result = null;
            try {
                result = new String(str, encoding);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return result;
        }
}

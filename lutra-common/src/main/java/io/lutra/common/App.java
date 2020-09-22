package io.lutra.common;

import io.lutra.common.util.ByteDataTypeTransUtil;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        byte[] bytes = ByteDataTypeTransUtil.floatToBytes(12);
        System.out.println(ByteDataTypeTransUtil.bytesToFloat(bytes));
        byte[] bytes1 = ByteDataTypeTransUtil.charToByte('c');
        System.out.print(ByteDataTypeTransUtil.byteToChar(bytes1));
    }
}

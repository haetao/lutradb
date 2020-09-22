package io.lutra.core;

import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

/**
 * Hello world!
 *
 */
public class App
{
    static {
        RocksDB.loadLibrary();
    }
    public static void main( String[] args )
    {
        Options options = new Options().setCreateIfMissing(true);
        try (RocksDB rocksDB = RocksDB.open(options,"Rocks")){
            System.out.print(new String(rocksDB.get("name".getBytes())));
        } catch (RocksDBException e) {
            e.printStackTrace();
        }
    }
}

package io.lutra.core.store;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.rocksdb.*;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/14
 * @Description:
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class

DBFactory {
    static {
        RocksDB.loadLibrary();
    }

    public static OptimisticTransactionDB openOptimisticTransactionDB(Options options,String dbPath){
        try {
            return OptimisticTransactionDB.open(options,dbPath);
        } catch (RocksDBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static RocksDB openRocksDB(Options options,String dbPtah){
        try {
            return RocksDB.open(options,dbPtah);
        } catch (RocksDBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  static TransactionDB openTransactionDB(Options options ,TransactionDBOptions dbOptions , String dbPtah){
        try {
            return TransactionDB.open(options,dbOptions,dbPtah);
        } catch (RocksDBException e) {
            e.printStackTrace();
        }
        return null;
    }
}

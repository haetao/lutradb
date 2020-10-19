package io.lutra.server.mysql.constant;

import lombok.Getter;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/20
 * @Description:
 */
public enum  MySqlServerStatus {
    // a transaction is active
     SERVER_STATUS_IN_TRANS ( 0x0001),
    // auto-commit is enabled
     SERVER_STATUS_AUTOCOMMIT ( 0x0002),
     SERVER_MORE_RESULTS_EXISTS ( 0x0008),
     SERVER_STATUS_NO_GOOD_INDEX_USED ( 0x0010),
     SERVER_STATUS_NO_INDEX_USED ( 0x0020),
    // Used by Binary Protocol Resultset to signal that COM_STMT_FETCH must be
    // used to fetch the row-data.
     SERVER_STATUS_CURSOR_EXISTS ( 0x0040),
     SERVER_STATUS_LAST_ROW_SENT ( 0x0080),
     SERVER_STATUS_DB_DROPPED ( 0x0100),
     SERVER_STATUS_NO_BACKSLASH_ESCAPES ( 0x0200),
     SERVER_STATUS_METADATA_CHANGED ( 0x0400),
     SERVER_QUERY_WAS_SLOW ( 0x0800),
     SERVER_PS_OUT_PARAMS ( 0x1000),
    // in a read-only transaction
     SERVER_STATUS_IN_TRANS_READONLY ( 0x2000),
    // connection state information has changed
     SERVER_SESSION_STATE_CHANGED ( 0x4000);

     @Getter
     private final int code;

    MySqlServerStatus(int code) {
        this.code = code;
    }
}

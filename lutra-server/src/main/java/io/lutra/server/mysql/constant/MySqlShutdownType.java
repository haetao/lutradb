package io.lutra.server.mysql.constant;

import lombok.Getter;

public enum MySqlShutdownType {

    SHUTDOWN_DEFAULT(0x00),
    SHUTDOWN_WAIT_CONNECTIONS(0x01),
    SHUTDOWN_WAIT_TRANSACTIONS(0x02),
    SHUTDOWN_WAIT_UPDATES(0x08),
    SHUTDOWN_WAIT_ALL_BUFFERS(0x10),
    SHUTDOWN_WAIT_CRITICAL_BUFFERS(0x11),
    KILL_QUERY(0xfe),
    KILL_CONNECTION(0xff);

    @Getter
    private int code;

    MySqlShutdownType(int code) {
        this.code = code;
    }
}

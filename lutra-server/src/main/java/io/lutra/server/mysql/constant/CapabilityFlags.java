package io.lutra.server.mysql.constant;

import lombok.Getter;

public enum CapabilityFlags {

     CLIENT_LONG_PASSWORD ( 1),
     CLIENT_FOUND_ROWS ( 2),
     CLIENT_LONG_FLAG ( 4),
     CLIENT_CONNECT_WITH_DB ( 8),
     CLIENT_NO_SCHEMA ( 16),
     CLIENT_COMPRESS ( 32),
     CLIENT_ODBC ( 64),
     CLIENT_LOCAL_FILES ( 128),
     CLIENT_IGNORE_SPACE ( 256),
     CLIENT_PROTOCOL_41 ( 512),
     CLIENT_ERACTIVE ( 1024),
     CLIENT_SSL ( 2048),
     CLIENT_IGNORE_SIGPIPE ( 4096),
     CLIENT_TRANSACTIONS ( 8192),
     CLIENT_RESERVED ( 16384),
     CLIENT_SECURE_CONNECTION ( 32768),
     CLIENT_MULTI_STATEMENTS ( 65536),
     CLIENT_MULTI_RESULTS ( 131072),
     CLIENT_PLUGIN_AUTH(524288);

     @Getter
     private final int code;

    CapabilityFlags(int code) {
        this.code = code;
    }
}

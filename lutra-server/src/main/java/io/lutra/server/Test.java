package io.lutra.server;

import io.lutra.server.mysql.constant.CapabilityFlags;
import io.lutra.server.mysql.constant.CharacterSet;
import io.lutra.server.mysql.constant.MySqlServerStatus;
import io.lutra.server.mysql.packet.HandShakePacket;
import io.lutra.server.mysql.util.RandomUtil;
import io.lutra.server.mysql.util.TypesTransUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class Test {
    public static void main(String[] args) {
        System.out.println(0xf7ff >> 16);
    }
}

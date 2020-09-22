package io.lutra.server.mysql;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/17
 * @Description:
 */
@Data
public class HandShakePacket implements Serializable {
    public byte protocolVersion;
    public byte[] serverVersion;
    public long threadId;
    public byte[] seed;
    public int serverCapabilities;
    public byte serverCharsetIndex;
    public int serverStatus;
    public byte[] restOfScrambleBuff;
}

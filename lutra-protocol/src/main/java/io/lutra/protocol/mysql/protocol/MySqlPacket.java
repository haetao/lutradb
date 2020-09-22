package io.lutra.protocol.mysql.protocol;

import lombok.Data;

/**
 * @Author: wanght_oup_cq
 * @Date: 2020/9/20
 * @Description:
 */
@Data
public abstract class MySqlPacket<T> {

    private int packetLength;
    private int packetNumber;
    private T packetContent;
}

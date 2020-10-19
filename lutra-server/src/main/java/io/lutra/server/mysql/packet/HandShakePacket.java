package io.lutra.server.mysql.packet;



import io.lutra.server.mysql.constant.CapabilityFlags;
import io.lutra.server.mysql.util.ByteBufUtil;
import io.lutra.server.mysql.util.TypesTransUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.Setter;

import java.nio.ByteBuffer;

/**
 * protocol_version (1) -- 0x0a protocol_version
 *
 * server_version (string.NUL) -- human-readable server version
 *
 * connection_id (4) -- connection id
 *
 * auth_plugin_data_part_1 (string.fix_len) -- [len=8] first 8 bytes of the auth-plugin data
 *
 * filler_1 (1) -- 0x00
 *
 * capability_flag_1 (2) -- lower 2 bytes of the Protocol::CapabilityFlags (optional)
 *
 * character_set (1) -- default server character-set, only the lower 8-bits Protocol::CharacterSet (optional)
 *
 * This “character set” value is really a collation ID but implies the character set; see the Protocol::CharacterSet description.
 *
 * status_flags (2) -- Protocol::StatusFlags (optional)
 *
 * capability_flags_2 (2) -- upper 2 bytes of the Protocol::CapabilityFlags
 *
 * auth_plugin_data_len (1) -- length of the combined auth_plugin_data, if auth_plugin_data_len is > 0
 *
 * auth_plugin_name (string.NUL) -- name of the auth_method that the auth_plugin_data belongs to
 */
@Getter
@Setter
public class HandShakePacket extends MySqlPacket {
    private static final String DEFAULT_AUTH_PLUGIN_NAME = "mysql_native_password";
    private static final byte[] FILL_10 = new byte[]{0,0,0,0,0,0,0,0,0,0};

    private int protocolVersion; //1byte
    private String serverVersion; //String<NUL>
    private int connectionId; //4bytes
    private byte[] authPluginDataPart1; //String<fix_len> len=8
    private final byte filler = 0; // 1byte
    private int capabilityFlagLow; //2bytes (Optional)
    private int characterSet; //1byte (Optional)
    private int serverStatus; //2byte (Optional)
    private int capabilityFlagHigh; //2bytes
    public byte[] authPluginDataPart2; // auth-plugin-data-part-2 ($len=MAX(13, length of auth-plugin-data - 8))
    private String authPluginName = DEFAULT_AUTH_PLUGIN_NAME; //String<NUL>

    @Override
    public void read(byte[] data) {

    }

    @Override
    public void write(ByteBuf byteBuf) {

        //byteBuf = Unpooled.buffer(getPacketLength()+HEAD_LENGTH);
        ByteBufUtil.writeUB3(byteBuf,getPacketLength());
        ByteBufUtil.writeByte(byteBuf,getPacketNumber());
        ByteBufUtil.writeByte(byteBuf,protocolVersion);
        ByteBufUtil.writeStringNul(byteBuf,serverVersion);
        ByteBufUtil.writeInt(byteBuf,connectionId);
        ByteBufUtil.writeBytes(byteBuf,authPluginDataPart1);
        ByteBufUtil.writeByte(byteBuf,filler);
        ByteBufUtil.writeUB2(byteBuf,capabilityFlagLow);
        ByteBufUtil.writeByte(byteBuf,characterSet);
        ByteBufUtil.writeUB2(byteBuf,serverStatus);
        ByteBufUtil.writeUB2(byteBuf,capabilityFlagHigh);

        if((capabilityFlagLow & CapabilityFlags.CLIENT_PLUGIN_AUTH.getCode()) != 0) {
            if(authPluginDataPart2.length <= 13) {
                ByteBufUtil.writeByte(byteBuf,(authPluginDataPart1.length + 13));
            } else {
                ByteBufUtil.writeByte(byteBuf,(authPluginDataPart1.length + authPluginDataPart2.length));
            }
        } else {
            ByteBufUtil.writeByte(byteBuf,0);
        }
        ByteBufUtil.writeBytes(byteBuf,FILL_10);
        if((capabilityFlagLow & CapabilityFlags.CLIENT_SECURE_CONNECTION.getCode()) != 0) {
            ByteBufUtil.writeBytes(byteBuf,authPluginDataPart2);
            // authPluginDataPart2.length always to be 12
            if(authPluginDataPart2.length < 13) {
                for(int i = 13 - authPluginDataPart2.length; i > 0; i--) {
                    ByteBufUtil.writeByte(byteBuf,0);
                }
            }
        }
        if((capabilityFlagLow & CapabilityFlags.CLIENT_PLUGIN_AUTH.getCode()) != 0) {
            ByteBufUtil.writeStringNul(byteBuf, authPluginName);
        }
    }

    @Override
    public int calcSize() {
        int size = 1; // protocol version
        size += (serverVersion.length() + 1); // server version
        size += 4; // connection id
        size += authPluginDataPart1.length;
        size += 1; // [00] filler
        size += 2; // capability flags (lower 2 bytes)
        size += 1; // character set
        size += 2; // status flags
        size += 2; // capability flags (upper 2 bytes)
        size += 1;
        size += 10; // reserved (all [00])
        if((capabilityFlagLow & CapabilityFlags.CLIENT_SECURE_CONNECTION.getCode()) != 0) {
            if(authPluginDataPart2.length <= 13) {
                size += 13;
            } else {
                size += authPluginDataPart2.length;
            }
        }
        if((capabilityFlagLow & CapabilityFlags.CLIENT_PLUGIN_AUTH.getCode()) != 0) {
            size += (authPluginName.length() + 1); // auth-plugin name
        }
        return size;
    }
}

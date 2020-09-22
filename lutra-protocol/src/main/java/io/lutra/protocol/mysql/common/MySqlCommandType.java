package io.lutra.protocol.mysql.common;

import lombok.Getter;

/**
 * @Author: wanght_oup_cq
 * @De: 2020/9/20
 * @Description:
 */
public enum MySqlCommandType {
     COM_SLEEP (0x00),  //内部线程状态
     COM_QUIT (0x01), //关闭连接
     COM_INIT_DB (0x02), //切换数据库
     COM_QUERY (0x03), //SQL查询请求
     COM_FIELD_LIST (0x04), //获取数据表字段信息
     COM_CREATE_DB (0x05), //创建数据库
     COM_DROP_DB (0x06), //删除数据库
     COM_REFRESH (0x07), //清除缓存
     COM_SHUTDOWN (0x08), //停止服务器
     COM_STATISTICS (0x09), //获取服务器统计信息
     COM_PROCESS_INFO (0x0A), //获取当前连接的列表
     COM_CONNECT (0x0B), //内部线程状态
     COM_PROCESS_KILL (0x0C), //中断某个连接
     COM_DEBUG (0x0D), //保存服务器调试信息
     COM_PING (0x0E), //测试连通性
     COM_TIME (0x0F), //内部线程状态
     COM_DELAYED_INSERT (0x10), //内部线程状态
     COM_CHANGE_USER (0x11), //重新登陆
     COM_BINLOG_DUMP (0x12), //获取二进制日志信息
     COM_TABLE_DUMP (0x13), //获取数据表结构信息
     COM_CONNECT_OUT (0x14), //内部线程状态
     COM_REGISTER_SLAVE (0x15), //从服务器向主服务器进行注册
     COM_STMT_PREPARE (0x16), //预处理SQL语句
     COM_STMT_SEND_LONG_DATA (0x18), //发送BLOB类型的数据
     COM_STMT_CLOSE (0x19), //销毁预处理语句
     COM_STMT_RESET (0x1A), //清除预处理语句参数缓存
     COM_SET_OPTION (0x1B), //设置语句选项
     COM_STMT_FETCH (0x1C);//获取预处理语句的执行结果

    @Getter
    private int code;

    MySqlCommandType(int code) {
        this.code = code;
    }
}

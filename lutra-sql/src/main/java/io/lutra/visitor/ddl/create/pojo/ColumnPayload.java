package io.lutra.visitor.ddl.create.pojo;

import lombok.Data;

/**
 * 2 * @Author: HunterWang
 * 3 * @Date: 2020/7/21 16:18
 * 4
 */
@Data
public class ColumnPayload {
    private String columnName;
    private DataTypePayload dataTypePayload;
    private boolean nutNullSymbol;
    private boolean autoIncrementSymbol;
    private boolean primaryKeySymbol;
    private boolean foreignKeySymbol;
}

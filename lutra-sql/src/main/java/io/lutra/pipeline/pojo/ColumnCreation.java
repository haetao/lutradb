package io.lutra.pipeline.pojo;

import lombok.Data;

/**
 * @Author: HunterWang
 * @Date: 2020/7/21 16:18
 *
 */
@Data
public class ColumnCreation extends ColumnOrigin{
    private DataTypeCarrier dataTypeCarrier;
    private boolean notNullSymbol;
    private boolean autoIncrementSymbol;
    private boolean primaryKeySymbol;
    private boolean foreignKeySymbol;
}

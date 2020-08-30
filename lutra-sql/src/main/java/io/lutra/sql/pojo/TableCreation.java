package io.lutra.sql.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author: HunterWang
 * @Date: 2020/7/21 16:16
 *
 */
@Data
public class TableCreation extends TableOrigin{

    private boolean notExistsSymbol;

    private List<ColumnCreation> columnCreations;

    private MultiplePrimaryKeysCarrier primaryKeysPayload;

    private List<ForeignItemCarrier> foreignPayloads;

}

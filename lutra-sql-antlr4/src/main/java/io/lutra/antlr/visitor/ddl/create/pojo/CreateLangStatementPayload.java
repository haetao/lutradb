package io.lutra.antlr.visitor.ddl.create.pojo;

import lombok.Data;

import java.util.List;

/**
 * 2 * @Author: HunterWang
 * 3 * @Date: 2020/7/21 16:16
 * 4
 */
@Data
public class CreateLangStatementPayload {

    private String tableName;

    private boolean notExistsSymbol;

    private List<ColumnPayload> columnPayloads;

    private MultiplePrimaryKeysPayload primaryKeysPayload;

    private List<ForeignItemPayload> foreignPayloads;

}

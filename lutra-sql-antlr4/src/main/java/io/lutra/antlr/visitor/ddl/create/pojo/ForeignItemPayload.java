package io.lutra.antlr.visitor.ddl.create.pojo;

import lombok.Data;

/**
 * 2 * @Author: HunterWang
 * 3 * @Date: 2020/7/21 16:22
 * 4
 */
@Data
public class ForeignItemPayload {
    private String innerColumnName;
    private String refColumnName;
    private String refTableName;
}

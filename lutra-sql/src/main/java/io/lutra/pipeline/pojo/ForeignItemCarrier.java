package io.lutra.pipeline.pojo;

import lombok.Data;

/**
 * @Author: HunterWang
 * @Date: 2020/7/21 16:22
 * 4
 */
@Data
public class ForeignItemCarrier {
    private String innerColumnName;
    private String refColumnName;
    private String refTableName;
}

package io.lutra.visitor.ddl.create.pojo;

import lombok.Data;

/**
 * 2 * @Author: HunterWang
 * 3 * @Date: 2020/7/21 16:21
 * 4
 */
@Data
public class MultiplePrimaryKeysPayload {
    private String[] keys;
}

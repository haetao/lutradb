package io.lutra.visitor.impl.create;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class CreateColumnNode {
    private String columnName;
    private String dataType;
    private Map<String,Object> parameters;
}

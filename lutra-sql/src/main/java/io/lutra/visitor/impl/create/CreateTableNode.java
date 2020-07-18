package io.lutra.visitor.impl.create;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CreateTableNode {
    private String tableName;
    private List<CreateColumnNode> columnNodes;
}

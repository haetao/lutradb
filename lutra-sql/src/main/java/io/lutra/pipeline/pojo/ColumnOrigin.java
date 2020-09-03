package io.lutra.pipeline.pojo;


public class ColumnOrigin implements Column{
    private String name;
    private String belongTable;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBelongTable() {
        return belongTable;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBelongTable(String belongTable) {
        this.belongTable = belongTable;
    }
}

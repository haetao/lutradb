package io.lutra.pipeline.pojo;


public class TableOrigin implements Table{
    private String name;
    private String belongSchema;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBelongSchema(String belongSchema) {
        this.belongSchema = belongSchema;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBelongSchema() {
        return belongSchema;
    }
}

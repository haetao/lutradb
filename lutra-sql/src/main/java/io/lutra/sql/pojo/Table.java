package io.lutra.sql.pojo;

public interface Table {
    void setName(String name);
    void setBelongSchema(String belongSchema);
    String getName();
    String getBelongSchema();
}

package io.lutra.sql.pojo;

public interface Column {
    String getName();
    String getBelongTable();
    void setName(String name);
    void setBelongTable(String belongTable);
}

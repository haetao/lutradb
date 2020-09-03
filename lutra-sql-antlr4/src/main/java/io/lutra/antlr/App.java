package io.lutra.antlr;

import io.lutra.pipeline.SqlWrapper;
import io.lutra.pipeline.spi.SqlExecutionPlanGenerator;
import io.lutra.pipeline.statement.SqlLangType;
import io.lutra.pipeline.statement.StatementType;

public class App {
    public static void main(String[] args) {
        SqlWrapper wrapper = new SqlWrapper() {
            @Override
            public SqlLangType getLangType() {
                return SqlLangType.DDL;
            }

            @Override
            public StatementType getStatementType() {
                return StatementType.CREATE;
            }

            @Override
            public String getSourceSql() {
                return "CREATE TABLE IF NOT EXISTS Persons\n" +
                        "(\n" +
                        "Id_P int not null primary key auto_increment,\n" +
                        "LastName varchar(255),\n" +
                        "FirstName varchar(255),\n" +
                        "Address varchar(255),\n" +
                        "City varchar(255)\n" +
                        ")";
            }
        };
        SqlExecutionPlanGenerator generator = new SqlExecutionPlanGeneratorImpl();
        try {
            generator.genExecutionPlan(wrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package io.lutra.antlr;

import io.lutra.antlr.handlers.ParseCreateHandler;
import io.lutra.sql.SqlPipeline;
import io.lutra.sql.SqlWrapper;
import io.lutra.sql.pojo.TableCreation;
import io.lutra.sql.spi.SqlExecutorPlanGenerator;
import io.lutra.sql.statement.SqlLangType;
import io.lutra.sql.statement.StatementType;

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
        SqlExecutorPlanGenerator generator = new SqlExecutorPlanGeneratorImpl();
        try {
            generator.genExecutorPlan(wrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

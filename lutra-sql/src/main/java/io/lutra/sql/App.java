package io.lutra.sql;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.SqlCreate;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;

/**
 * Hello world!
 *
 */
public class App 
{

    static final String SQL = "CREATE TABLE IF NOT EXISTS  myTable \n" +
            "(\n" +
            "  id INT NOT NULL PRIMARY KEY,\n" +
            "  name VARCHAR(255),\n" +
            "  sex CHAR(0)\n" +
            ")";

    public static void main( String[] args )
    {
        SqlParser.Config config = SqlParser.configBuilder()
                .setCaseSensitive(false)
                .setLex(Lex.MYSQL)
                .build();

        SqlParser parser = SqlParser.create("CREATE TABLE Persons\n" +
                "(\n" +
                "Id_P int PRIMARY KEY,\n" +
                "LastName varchar(255),\n" +
                "FirstName varchar(255),\n" +
                "Address varchar(255),\n" +
                "City varchar(255)\n" +
                ")",config);
        try {
            SqlNode sqlNode = parser.parseStmt();
            SqlKind kind = sqlNode.getKind();
            switch (kind){
                case CREATE_TABLE:
                    SqlCreate sqlCreate = (SqlCreate) sqlNode;
                    break;
                case SELECT:
                    SqlSelect sqlSelect = (SqlSelect) sqlNode;
                    break;
            }
        } catch (SqlParseException e) {
            e.printStackTrace();
        }
    }

    static void antlr(){

    }
}

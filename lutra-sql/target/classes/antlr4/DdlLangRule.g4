grammar DdlLangRule;

import MySqlKeyWords, MySqlTypeKeyWords, Operators, BasicTypes;

root: ddlStatement? EOF;

ddlStatement:   createStatement
              | dropStatement
              | truncateStatement
              ;

createStatement: createTable ( ifNotExists )? tableName L_BRACKET
                    createContent (COMMA createContent )*
                R_BRACKET
               ;

createContent:   columnContent
               | primaryKeyContent
               | foreignKeyContent
             ;

createTable: CREATE TABLE
           ;

dropStatement: dropTable ifExists? tableName
             ;

dropTable: DROP TABLE
         ;

truncateStatement: truncateTable  tableName
                 ;

truncateTable: TRUNCATE TABLE
             ;

columnContent:   columnDefineStyle ( COMMA columnDefineStyle )*
               ;

columnDefineStyle:  ( columnName dataTypeContent ( columnDefParameters )* )+
                    ;

columnDefParameters:   notNull
                     | AUTO_INCREMENT
                     | primaryKey
                     ;

dataTypeContent:   dataType
                 | dataType L_BRACKET number R_BRACKET
                 ;

primaryKey: PRIMARY KEY
          ;

primaryKeyContent: primaryKey L_BRACKET keys R_BRACKET
                 ;

keys: columnName ( COMMA columnName)*
     ;

foreignKeyContent:  foreignKeys ( COMMA foreignKeys )*
                 ;

foreignKeys: CONSTRAINT innerName FOREIGN KEY L_BRACKET columnName R_BRACKET REFERENCES referenceTableName L_BRACKET foreignKeyName R_BRACKET foreignOnOpChange*
           | foreignKeyIndex
           ;

foreignKeyIndex: INDEX innerName L_BRACKET columnName R_BRACKET usingBTree ;

foreignOnOpChange: ON ( DELETE | UPDATE  ) RESTRICT;

dataType: TINYINT | SMALLINT | MEDIUMINT | INT | INTEGER |
          BIGINT | REAL | DOUBLE | PRECISION | FLOAT | DECIMAL | DEC |
          NUMERIC | DATE | TIME | TIMESTAMP | DATETIME |
          YEAR | CHAR | VARCHAR | NVARCHAR | NATIONAL |
          BINARY | VARBINARY | TINYBLOB | BLOB | MEDIUMBLOB |
          LONGBLOB |TINYTEXT | TEXT | MEDIUMTEXT |
          LONGTEXT | ENUM | VARYING | SERIAL
          ;

number: ( NUMBER )+ | ( S_QUOTE NUMBER S_QUOTE )+
      ;

ifExists: IF EXISTS
        ;

ifNotExists: IF NOT EXISTS
           ;

notNull: NOT NULL
       ;

columnName: R_QUOTE ID R_QUOTE | ID
          ;

foreignKeyName: R_QUOTE ID R_QUOTE | ID
              ;

referenceTableName: R_QUOTE ID R_QUOTE | ID
                  ;

innerName: R_QUOTE ID R_QUOTE | ID
         ;

usingBTree: USING BTREE;

tableName: R_QUOTE ID R_QUOTE | ID
         ;

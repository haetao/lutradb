grammar DmlLangRule;

import MySqlKeyWords, MySqlTypeKeyWords, Operators, BasicTypes;

root: dmlStatement? EOF;

dmlStatement:   selectStatement
              | insertStatement
              | updateStatement
              | deleteStatement
              ;

number: ( NUMBER )+ | ( S_QUOTE NUMBER S_QUOTE )+
      ;

selectStatement: SELECT ( START | distinctExpr | selectColumnMulp | functionExpr ) FROM tableExpr ( conditionExpr )*
               ;

functionExpr: functions ( COMMA functions )*
             ;

functions: maxFunc
         | minFunc
         | countFunc
         | sumFunc
         | avgFunc
         ;

maxFunc: MAX L_BRACKET columnName R_BRACKET
       ;

minFunc: MIN L_BRACKET columnName R_BRACKET
       ;

sumFunc: SUM L_BRACKET columnName R_BRACKET
       ;

avgFunc: AVG L_BRACKET columnName R_BRACKET
              ;

countFunc:  COUNT L_BRACKET START R_BRACKET
          | COUNT L_BRACKET '1' R_BRACKET
          | COUNT L_BRACKET columnName R_BRACKET
          | COUNT L_BRACKET countFuncExpr R_BRACKET
          ;

countFuncExpr: distinctExpr
             ;

distinctExpr: DISTINCT columnNameMultp
            ;

conditionExpr:  whereClause
             |  groupByClause
             |  orderByClause
             ;

tableExpr: tableMultp ( COMMA tableMultp)*
         ;

tableMultp: tableAlias | tableName
          ;

subQuery: L_BRACKET selectStatement R_BRACKET
        ;

tableAlias: tableName ID
         ;

filterCondition: compareExpr
               | logicOp
               | rangeExpr
               | existsClause
               | notExistsClause
               ;

logicOp: AND | OR | NOT;

compareExpr: ( columnName | columnAlias ) ( opExpr | LIKE ) ( number | valueClause | anyClause | allClause | subQuery | indistinctClause | columnAlias | '?')
           ;

indistinctClause: PERCENT ID (PERCENT)? | S_QUOTE PERCENT ID (PERCENT)? S_QUOTE
                | UNDER_LINE ID (UNDER_LINE)? | S_QUOTE UNDER_LINE ID (UNDER_LINE)? S_QUOTE
                ;

valueClause: ID | S_QUOTE ID S_QUOTE | '?'
           ;

rangeExpr: variableId IN (L_BRACKET number COMMA number R_BRACKET | subQuery )
         | variableId BETWEEN number AND number
         ;

opExpr: EQUAL | GREATER | LESS | NEQ | GREATER_EQUAL | LESS_EQUAL
      ;

allClause:  ALL subQuery
         ;

anyClause:  ANY subQuery
         ;

existsClause: EXISTS subQuery
            ;

notExistsClause: NOT EXISTS subQuery
            ;

whereClause: WHERE ( filterCondition )+
              ;

groupByClause: GROUP BY columnName
                ;

orderByClause: ORDER BY columnName
                ;

insertStatement: INSERT INTO tableName ( L_BRACKET columnNameMultp R_BRACKET )? ( VALUES L_BRACKET valueContent R_BRACKET | selectStatement? )
               ;

valueContent: valueClause ( COMMA valueClause)*
            ;

updateStatement: UPDATE tableName SET  updateContentOptional  ( whereClause )?
               ;

updateContentOptional: compareExpr ( COMMA compareExpr)*
                     ;

deleteStatement: DELETE FROM tableName whereClause
               ;

selectColumnMulp:  selectColumnName ( COMMA selectColumnName )*
                 | selectColumnAlias ( COMMA selectColumnAlias )*
                 ;

selectColumnName: columnName;

selectColumnAlias: columnAlias;

columnNameMultp: columnName (COMMA columnName )*
               | columnAlias (COMMA columnAlias )*
               ;

columnName: variableId
          ;

columnAlias: ID F_STOP ( columnName | START )
           ;

tableName: variableId
         ;

variableId: R_QUOTE ID R_QUOTE | ID
          ;
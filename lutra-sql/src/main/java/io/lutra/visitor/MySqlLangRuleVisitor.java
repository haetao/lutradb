// Generated from C:/workspace/lutradb/lutra-sql/src/main/resources/antlr4\MySqlLangRule.g4 by ANTLR 4.8
package io.lutra.visitor;

import antlr4.MySqlLangRuleParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySqlLangRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySqlLangRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(MySqlLangRuleParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(MySqlLangRuleParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(MySqlLangRuleParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(MySqlLangRuleParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(MySqlLangRuleParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#createContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateContent(MySqlLangRuleParser.CreateContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(MySqlLangRuleParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#dropStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatement(MySqlLangRuleParser.DropStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(MySqlLangRuleParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#truncateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStatement(MySqlLangRuleParser.TruncateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(MySqlLangRuleParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#columnContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnContent(MySqlLangRuleParser.ColumnContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#columnDefineStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefineStyle(MySqlLangRuleParser.ColumnDefineStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#columnDefParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefParameters(MySqlLangRuleParser.ColumnDefParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#dataTypeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeContent(MySqlLangRuleParser.DataTypeContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(MySqlLangRuleParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#primaryKeyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyContent(MySqlLangRuleParser.PrimaryKeyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeys(MySqlLangRuleParser.KeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#foreignKeyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyContent(MySqlLangRuleParser.ForeignKeyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#foreignKeyIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyIndex(MySqlLangRuleParser.ForeignKeyIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#foreignKeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeys(MySqlLangRuleParser.ForeignKeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#foreignOnOpChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignOnOpChange(MySqlLangRuleParser.ForeignOnOpChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(MySqlLangRuleParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MySqlLangRuleParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(MySqlLangRuleParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(MySqlLangRuleParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#notNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNull(MySqlLangRuleParser.NotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(MySqlLangRuleParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(MySqlLangRuleParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(MySqlLangRuleParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#maxFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxFunc(MySqlLangRuleParser.MaxFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#minFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinFunc(MySqlLangRuleParser.MinFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#sumFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumFunc(MySqlLangRuleParser.SumFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#avgFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgFunc(MySqlLangRuleParser.AvgFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#countFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountFunc(MySqlLangRuleParser.CountFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#countFuncExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountFuncExpr(MySqlLangRuleParser.CountFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#distinctExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctExpr(MySqlLangRuleParser.DistinctExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpr(MySqlLangRuleParser.ConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpr(MySqlLangRuleParser.TableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#tableMultp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableMultp(MySqlLangRuleParser.TableMultpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(MySqlLangRuleParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(MySqlLangRuleParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#filterCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterCondition(MySqlLangRuleParser.FilterConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(MySqlLangRuleParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(MySqlLangRuleParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#indistinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndistinctClause(MySqlLangRuleParser.IndistinctClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#valueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueClause(MySqlLangRuleParser.ValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#rangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(MySqlLangRuleParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(MySqlLangRuleParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#allClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllClause(MySqlLangRuleParser.AllClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#anyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyClause(MySqlLangRuleParser.AnyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#existsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsClause(MySqlLangRuleParser.ExistsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#notExistsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExistsClause(MySqlLangRuleParser.NotExistsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySqlLangRuleParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(MySqlLangRuleParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySqlLangRuleParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(MySqlLangRuleParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#valueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueContent(MySqlLangRuleParser.ValueContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(MySqlLangRuleParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#updateContentOptional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateContentOptional(MySqlLangRuleParser.UpdateContentOptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(MySqlLangRuleParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#selectColumnMulp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnMulp(MySqlLangRuleParser.SelectColumnMulpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#selectColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnName(MySqlLangRuleParser.SelectColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#selectColumnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnAlias(MySqlLangRuleParser.SelectColumnAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#columnNameMultp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameMultp(MySqlLangRuleParser.ColumnNameMultpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySqlLangRuleParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(MySqlLangRuleParser.ColumnAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#foreignKeyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyName(MySqlLangRuleParser.ForeignKeyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#referenceTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceTableName(MySqlLangRuleParser.ReferenceTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#innerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerName(MySqlLangRuleParser.InnerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#usingBTree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingBTree(MySqlLangRuleParser.UsingBTreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySqlLangRuleParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlLangRuleParser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(MySqlLangRuleParser.VariableIdContext ctx);
}
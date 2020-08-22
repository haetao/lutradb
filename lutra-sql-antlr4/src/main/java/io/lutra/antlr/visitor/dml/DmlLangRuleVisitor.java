// Generated from C:/workspace/lutradb/lutra-sql/src/main/resources/antlr4\DmlLangRule.g4 by ANTLR 4.8
package io.lutra.antlr.visitor.dml;
import io.lutra.antlr.parser.dml.DmlLangRuleParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DmlLangRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DmlLangRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DmlLangRuleParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(DmlLangRuleParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DmlLangRuleParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(DmlLangRuleParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(DmlLangRuleParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(DmlLangRuleParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#maxFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxFunc(DmlLangRuleParser.MaxFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#minFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinFunc(DmlLangRuleParser.MinFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#sumFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumFunc(DmlLangRuleParser.SumFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#avgFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgFunc(DmlLangRuleParser.AvgFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#countFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountFunc(DmlLangRuleParser.CountFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#countFuncExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountFuncExpr(DmlLangRuleParser.CountFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#distinctExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctExpr(DmlLangRuleParser.DistinctExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpr(DmlLangRuleParser.ConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpr(DmlLangRuleParser.TableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#tableMultp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableMultp(DmlLangRuleParser.TableMultpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(DmlLangRuleParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(DmlLangRuleParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#filterCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterCondition(DmlLangRuleParser.FilterConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(DmlLangRuleParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(DmlLangRuleParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#indistinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndistinctClause(DmlLangRuleParser.IndistinctClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#valueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueClause(DmlLangRuleParser.ValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#rangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(DmlLangRuleParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#opExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(DmlLangRuleParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#allClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllClause(DmlLangRuleParser.AllClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#anyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyClause(DmlLangRuleParser.AnyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#existsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsClause(DmlLangRuleParser.ExistsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#notExistsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExistsClause(DmlLangRuleParser.NotExistsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DmlLangRuleParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DmlLangRuleParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(DmlLangRuleParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(DmlLangRuleParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#valueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueContent(DmlLangRuleParser.ValueContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(DmlLangRuleParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#updateContentOptional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateContentOptional(DmlLangRuleParser.UpdateContentOptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(DmlLangRuleParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#selectColumnMulp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnMulp(DmlLangRuleParser.SelectColumnMulpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#selectColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnName(DmlLangRuleParser.SelectColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#selectColumnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnAlias(DmlLangRuleParser.SelectColumnAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#columnNameMultp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameMultp(DmlLangRuleParser.ColumnNameMultpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DmlLangRuleParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(DmlLangRuleParser.ColumnAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DmlLangRuleParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmlLangRuleParser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(DmlLangRuleParser.VariableIdContext ctx);
}
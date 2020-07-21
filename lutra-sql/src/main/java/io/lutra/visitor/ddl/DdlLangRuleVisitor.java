// Generated from C:/workspace/lutradb/lutra-sql/src/main/resources/antlr4\DdlLangRule.g4 by ANTLR 4.8
package io.lutra.visitor.ddl;
import io.lutra.parser.ddl.DdlLangRuleParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DdlLangRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DdlLangRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DdlLangRuleParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(DdlLangRuleParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(DdlLangRuleParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#createContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateContent(DdlLangRuleParser.CreateContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(DdlLangRuleParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#dropStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatement(DdlLangRuleParser.DropStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(DdlLangRuleParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#truncateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStatement(DdlLangRuleParser.TruncateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(DdlLangRuleParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#columnContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnContent(DdlLangRuleParser.ColumnContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#columnDefineStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefineStyle(DdlLangRuleParser.ColumnDefineStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#columnDefParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefParameters(DdlLangRuleParser.ColumnDefParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#dataTypeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeContent(DdlLangRuleParser.DataTypeContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(DdlLangRuleParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#primaryKeyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyContent(DdlLangRuleParser.PrimaryKeyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeys(DdlLangRuleParser.KeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#foreignKeyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyContent(DdlLangRuleParser.ForeignKeyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#foreignKeyIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyIndex(DdlLangRuleParser.ForeignKeyIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#foreignKeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeys(DdlLangRuleParser.ForeignKeysContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#foreignOnOpChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignOnOpChange(DdlLangRuleParser.ForeignOnOpChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(DdlLangRuleParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DdlLangRuleParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(DdlLangRuleParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(DdlLangRuleParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#notNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNull(DdlLangRuleParser.NotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DdlLangRuleParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#foreignKeyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyName(DdlLangRuleParser.ForeignKeyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#referenceTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceTableName(DdlLangRuleParser.ReferenceTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#innerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerName(DdlLangRuleParser.InnerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#usingBTree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingBTree(DdlLangRuleParser.UsingBTreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DdlLangRuleParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DdlLangRuleParser.TableNameContext ctx);
}
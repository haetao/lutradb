// Generated from C:/workspace/lutradb/lutra-sql/src/main/resources/antlr4\MySqlLangRule.g4 by ANTLR 4.8
package antlr4;
import io.lutra.visitor.MySqlLangRuleVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySqlLangRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ADD=3, ALL=4, ALTER=5, ALWAYS=6, ANALYZE=7, AND=8, ANY=9, 
		AS=10, ASC=11, AUTO_INCREMENT=12, BEFORE=13, BETWEEN=14, BOTH=15, BTREE=16, 
		BY=17, CALL=18, CASCADE=19, CASE=20, CAST=21, CHANGE=22, CHARACTER=23, 
		CHECK=24, COLLATE=25, COLUMN=26, CONDITION=27, CONSTRAINT=28, CONTINUE=29, 
		CONVERT=30, CREATE=31, CROSS=32, CURRENT_USER=33, CURSOR=34, DATABASE=35, 
		DATABASES=36, DECLARE=37, DEFAULT=38, DELAYED=39, DELETE=40, DESC=41, 
		DESCRIBE=42, DETERMINISTIC=43, DISTINCT=44, DISTINCTROW=45, DROP=46, EACH=47, 
		ELSE=48, ELSEIF=49, ENCLOSED=50, ESCAPED=51, EXISTS=52, EXIT=53, EXPLAIN=54, 
		FALSE=55, FETCH=56, FOR=57, FORCE=58, FOREIGN=59, FROM=60, FULLTEXT=61, 
		GENERATED=62, GRANT=63, GROUP=64, HAVING=65, HIGH_PRIORITY=66, IF=67, 
		IGNORE=68, IN=69, INDEX=70, INFILE=71, INNER=72, INOUT=73, INSERT=74, 
		INTERVAL=75, INTO=76, IS=77, ITERATE=78, JOIN=79, KEY=80, KEYS=81, KILL=82, 
		LEADING=83, LEAVE=84, LEFT=85, LIKE=86, LIMIT=87, LINEAR=88, LINES=89, 
		LOAD=90, LOCK=91, LOOP=92, LOW_PRIORITY=93, MASTER_BIND=94, MASTER_SSL_VERIFY_SERVER_CERT=95, 
		MATCH=96, MAXVALUE=97, MODIFIES=98, NATURAL=99, NOT=100, NULL=101, ON=102, 
		OPTIMIZE=103, OPTION=104, OPTIONALLY=105, OR=106, ORDER=107, OUT=108, 
		OUTER=109, OUTFILE=110, PARTITION=111, PRIMARY=112, PROCEDURE=113, PURGE=114, 
		RANGE=115, READ=116, READS=117, REFERENCES=118, REGEXP=119, RELEASE=120, 
		RENAME=121, REPEAT=122, REPLACE=123, REQUIRE=124, RESTRICT=125, RETURN=126, 
		REVOKE=127, RIGHT=128, RLIKE=129, SCHEMA=130, SCHEMAS=131, SELECT=132, 
		SET=133, SEPARATOR=134, SHOW=135, SPATIAL=136, SQL=137, TABLE=138, TERMINATED=139, 
		THEN=140, TO=141, TRAILING=142, TRIGGER=143, TRUE=144, TRUNCATE=145, UNDO=146, 
		UNION=147, UNIQUE=148, UNLOCK=149, UNSIGNED=150, UPDATE=151, USAGE=152, 
		USE=153, USING=154, VALUES=155, WHEN=156, WHERE=157, WHILE=158, WITH=159, 
		WRITE=160, XOR=161, ZEROFILL=162, MAX=163, MIN=164, COUNT=165, SUM=166, 
		AVG=167, PERCENT=168, UNDER_LINE=169, TINYINT=170, SMALLINT=171, MEDIUMINT=172, 
		INT=173, INTEGER=174, BIGINT=175, REAL=176, DOUBLE=177, PRECISION=178, 
		FLOAT=179, DECIMAL=180, DEC=181, NUMERIC=182, DATE=183, TIME=184, TIMESTAMP=185, 
		DATETIME=186, YEAR=187, CHAR=188, VARCHAR=189, NVARCHAR=190, NATIONAL=191, 
		BINARY=192, VARBINARY=193, TINYBLOB=194, BLOB=195, MEDIUMBLOB=196, LONGBLOB=197, 
		TINYTEXT=198, TEXT=199, MEDIUMTEXT=200, LONGTEXT=201, ENUM=202, VARYING=203, 
		SERIAL=204, EQUAL=205, GREATER=206, LESS=207, NEQ=208, GREATER_EQUAL=209, 
		LESS_EQUAL=210, COMMA=211, S_QUOTE=212, R_QUOTE=213, F_STOP=214, L_BRACKET=215, 
		R_BRACKET=216, START=217, NUMBER=218, ID=219, WS=220;
	public static final int
		RULE_root = 0, RULE_sqlStatement = 1, RULE_ddlStatement = 2, RULE_dmlStatement = 3, 
		RULE_createStatement = 4, RULE_createContent = 5, RULE_createTable = 6, 
		RULE_dropStatement = 7, RULE_dropTable = 8, RULE_truncateStatement = 9, 
		RULE_truncateTable = 10, RULE_columnContent = 11, RULE_columnDefineStyle = 12, 
		RULE_columnDefParameters = 13, RULE_dataTypeContent = 14, RULE_primaryKey = 15, 
		RULE_primaryKeyContent = 16, RULE_keys = 17, RULE_foreignKeyContent = 18, 
		RULE_foreignKeyIndex = 19, RULE_foreignKeys = 20, RULE_foreignOnOpChange = 21, 
		RULE_dataType = 22, RULE_number = 23, RULE_ifExists = 24, RULE_ifNotExists = 25, 
		RULE_notNull = 26, RULE_selectStatement = 27, RULE_functionExpr = 28, 
		RULE_functions = 29, RULE_maxFunc = 30, RULE_minFunc = 31, RULE_sumFunc = 32, 
		RULE_avgFunc = 33, RULE_countFunc = 34, RULE_countFuncExpr = 35, RULE_distinctExpr = 36, 
		RULE_conditionExpr = 37, RULE_tableExpr = 38, RULE_tableMultp = 39, RULE_subQuery = 40, 
		RULE_tableAlias = 41, RULE_filterCondition = 42, RULE_logicOp = 43, RULE_compareExpr = 44, 
		RULE_indistinctClause = 45, RULE_valueClause = 46, RULE_rangeExpr = 47, 
		RULE_opExpr = 48, RULE_allClause = 49, RULE_anyClause = 50, RULE_existsClause = 51, 
		RULE_notExistsClause = 52, RULE_whereClause = 53, RULE_groupByClause = 54, 
		RULE_orderByClause = 55, RULE_insertStatement = 56, RULE_valueContent = 57, 
		RULE_updateStatement = 58, RULE_updateContentOptional = 59, RULE_deleteStatement = 60, 
		RULE_selectColumnMulp = 61, RULE_selectColumnName = 62, RULE_selectColumnAlias = 63, 
		RULE_columnNameMultp = 64, RULE_columnName = 65, RULE_columnAlias = 66, 
		RULE_foreignKeyName = 67, RULE_referenceTableName = 68, RULE_innerName = 69, 
		RULE_usingBTree = 70, RULE_tableName = 71, RULE_variableId = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "sqlStatement", "ddlStatement", "dmlStatement", "createStatement", 
			"createContent", "createTable", "dropStatement", "dropTable", "truncateStatement", 
			"truncateTable", "columnContent", "columnDefineStyle", "columnDefParameters", 
			"dataTypeContent", "primaryKey", "primaryKeyContent", "keys", "foreignKeyContent", 
			"foreignKeyIndex", "foreignKeys", "foreignOnOpChange", "dataType", "number", 
			"ifExists", "ifNotExists", "notNull", "selectStatement", "functionExpr", 
			"functions", "maxFunc", "minFunc", "sumFunc", "avgFunc", "countFunc", 
			"countFuncExpr", "distinctExpr", "conditionExpr", "tableExpr", "tableMultp", 
			"subQuery", "tableAlias", "filterCondition", "logicOp", "compareExpr", 
			"indistinctClause", "valueClause", "rangeExpr", "opExpr", "allClause", 
			"anyClause", "existsClause", "notExistsClause", "whereClause", "groupByClause", 
			"orderByClause", "insertStatement", "valueContent", "updateStatement", 
			"updateContentOptional", "deleteStatement", "selectColumnMulp", "selectColumnName", 
			"selectColumnAlias", "columnNameMultp", "columnName", "columnAlias", 
			"foreignKeyName", "referenceTableName", "innerName", "usingBTree", "tableName", 
			"variableId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1'", "'?'", "'ADD'", "'ALL'", "'ALTER'", "'ALWAYS'", "'ANALYZE'", 
			"'AND'", "'ANY'", "'AS'", "'ASC'", "'AUTO_INCREMENT'", "'BEFORE'", "'BETWEEN'", 
			"'BOTH'", "'BTREE'", "'BY'", "'CALL'", "'CASCADE'", "'CASE'", "'CAST'", 
			"'CHANGE'", "'CHARACTER'", "'CHECK'", "'COLLATE'", "'COLUMN'", "'CONDITION'", 
			"'CONSTRAINT'", "'CONTINUE'", "'CONVERT'", "'CREATE'", "'CROSS'", "'CURRENT_USER'", 
			"'CURSOR'", "'DATABASE'", "'DATABASES'", "'DECLARE'", "'DEFAULT'", "'DELAYED'", 
			"'DELETE'", "'DESC'", "'DESCRIBE'", "'DETERMINISTIC'", "'DISTINCT'", 
			"'DISTINCTROW'", "'DROP'", "'EACH'", "'ELSE'", "'ELSEIF'", "'ENCLOSED'", 
			"'ESCAPED'", "'EXISTS'", "'EXIT'", "'EXPLAIN'", "'FALSE'", "'FETCH'", 
			"'FOR'", "'FORCE'", "'FOREIGN'", "'FROM'", "'FULLTEXT'", "'GENERATED'", 
			"'GRANT'", "'GROUP'", "'HAVING'", "'HIGH_PRIORITY'", "'IF'", "'IGNORE'", 
			"'IN'", "'INDEX'", "'INFILE'", "'INNER'", "'INOUT'", "'INSERT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITERATE'", "'JOIN'", "'KEY'", "'KEYS'", "'KILL'", 
			"'LEADING'", "'LEAVE'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINEAR'", "'LINES'", 
			"'LOAD'", "'LOCK'", "'LOOP'", "'LOW_PRIORITY'", "'MASTER_BIND'", "'MASTER_SSL_VERIFY_SERVER_CERT'", 
			"'MATCH'", "'MAXVALUE'", "'MODIFIES'", "'NATURAL'", "'NOT'", "'NULL'", 
			"'ON'", "'OPTIMIZE'", "'OPTION'", "'OPTIONALLY'", "'OR'", "'ORDER'", 
			"'OUT'", "'OUTER'", "'OUTFILE'", "'PARTITION'", "'PRIMARY'", "'PROCEDURE'", 
			"'PURGE'", "'RANGE'", "'READ'", "'READS'", "'REFERENCES'", "'REGEXP'", 
			"'RELEASE'", "'RENAME'", "'REPEAT'", "'REPLACE'", "'REQUIRE'", "'RESTRICT'", 
			"'RETURN'", "'REVOKE'", "'RIGHT'", "'RLIKE'", "'SCHEMA'", "'SCHEMAS'", 
			"'SELECT'", "'SET'", "'SEPARATOR'", "'SHOW'", "'SPATIAL'", "'SQL'", "'TABLE'", 
			"'TERMINATED'", "'THEN'", "'TO'", "'TRAILING'", "'TRIGGER'", "'TRUE'", 
			"'TRUNCATE'", "'UNDO'", "'UNION'", "'UNIQUE'", "'UNLOCK'", "'UNSIGNED'", 
			"'UPDATE'", "'USAGE'", "'USE'", "'USING'", "'VALUES'", "'WHEN'", "'WHERE'", 
			"'WHILE'", "'WITH'", "'WRITE'", "'XOR'", "'ZEROFILL'", "'MAX'", "'MIN'", 
			"'COUNT'", "'SUM'", "'AVG'", "'%'", "'_'", "'TINYINT'", "'SMALLINT'", 
			"'MEDIUMINT'", "'INT'", "'INTEGER'", "'BIGINT'", "'REAL'", "'DOUBLE'", 
			"'PRECISION'", "'FLOAT'", "'DECIMAL'", "'DEC'", "'NUMERIC'", "'DATE'", 
			"'TIME'", "'TIMESTAMP'", "'DATETIME'", "'YEAR'", "'CHAR'", "'VARCHAR'", 
			"'NVARCHAR'", "'NATIONAL'", "'BINARY'", "'VARBINARY'", "'TINYBLOB'", 
			"'BLOB'", "'MEDIUMBLOB'", "'LONGBLOB'", "'TINYTEXT'", "'TEXT'", "'MEDIUMTEXT'", 
			"'LONGTEXT'", "'ENUM'", "'VARYING'", "'SERIAL'", "'='", "'>'", "'<'", 
			null, "'>='", "'<='", "','", "'''", "'`'", "'.'", "'('", "')'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ADD", "ALL", "ALTER", "ALWAYS", "ANALYZE", "AND", 
			"ANY", "AS", "ASC", "AUTO_INCREMENT", "BEFORE", "BETWEEN", "BOTH", "BTREE", 
			"BY", "CALL", "CASCADE", "CASE", "CAST", "CHANGE", "CHARACTER", "CHECK", 
			"COLLATE", "COLUMN", "CONDITION", "CONSTRAINT", "CONTINUE", "CONVERT", 
			"CREATE", "CROSS", "CURRENT_USER", "CURSOR", "DATABASE", "DATABASES", 
			"DECLARE", "DEFAULT", "DELAYED", "DELETE", "DESC", "DESCRIBE", "DETERMINISTIC", 
			"DISTINCT", "DISTINCTROW", "DROP", "EACH", "ELSE", "ELSEIF", "ENCLOSED", 
			"ESCAPED", "EXISTS", "EXIT", "EXPLAIN", "FALSE", "FETCH", "FOR", "FORCE", 
			"FOREIGN", "FROM", "FULLTEXT", "GENERATED", "GRANT", "GROUP", "HAVING", 
			"HIGH_PRIORITY", "IF", "IGNORE", "IN", "INDEX", "INFILE", "INNER", "INOUT", 
			"INSERT", "INTERVAL", "INTO", "IS", "ITERATE", "JOIN", "KEY", "KEYS", 
			"KILL", "LEADING", "LEAVE", "LEFT", "LIKE", "LIMIT", "LINEAR", "LINES", 
			"LOAD", "LOCK", "LOOP", "LOW_PRIORITY", "MASTER_BIND", "MASTER_SSL_VERIFY_SERVER_CERT", 
			"MATCH", "MAXVALUE", "MODIFIES", "NATURAL", "NOT", "NULL", "ON", "OPTIMIZE", 
			"OPTION", "OPTIONALLY", "OR", "ORDER", "OUT", "OUTER", "OUTFILE", "PARTITION", 
			"PRIMARY", "PROCEDURE", "PURGE", "RANGE", "READ", "READS", "REFERENCES", 
			"REGEXP", "RELEASE", "RENAME", "REPEAT", "REPLACE", "REQUIRE", "RESTRICT", 
			"RETURN", "REVOKE", "RIGHT", "RLIKE", "SCHEMA", "SCHEMAS", "SELECT", 
			"SET", "SEPARATOR", "SHOW", "SPATIAL", "SQL", "TABLE", "TERMINATED", 
			"THEN", "TO", "TRAILING", "TRIGGER", "TRUE", "TRUNCATE", "UNDO", "UNION", 
			"UNIQUE", "UNLOCK", "UNSIGNED", "UPDATE", "USAGE", "USE", "USING", "VALUES", 
			"WHEN", "WHERE", "WHILE", "WITH", "WRITE", "XOR", "ZEROFILL", "MAX", 
			"MIN", "COUNT", "SUM", "AVG", "PERCENT", "UNDER_LINE", "TINYINT", "SMALLINT", 
			"MEDIUMINT", "INT", "INTEGER", "BIGINT", "REAL", "DOUBLE", "PRECISION", 
			"FLOAT", "DECIMAL", "DEC", "NUMERIC", "DATE", "TIME", "TIMESTAMP", "DATETIME", 
			"YEAR", "CHAR", "VARCHAR", "NVARCHAR", "NATIONAL", "BINARY", "VARBINARY", 
			"TINYBLOB", "BLOB", "MEDIUMBLOB", "LONGBLOB", "TINYTEXT", "TEXT", "MEDIUMTEXT", 
			"LONGTEXT", "ENUM", "VARYING", "SERIAL", "EQUAL", "GREATER", "LESS", 
			"NEQ", "GREATER_EQUAL", "LESS_EQUAL", "COMMA", "S_QUOTE", "R_QUOTE", 
			"F_STOP", "L_BRACKET", "R_BRACKET", "START", "NUMBER", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySqlLangRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySqlLangRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MySqlLangRuleParser.EOF, 0); }
		public SqlStatementContext sqlStatement() {
			return getRuleContext(SqlStatementContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CREATE - 31)) | (1L << (DELETE - 31)) | (1L << (DROP - 31)) | (1L << (INSERT - 31)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (SELECT - 132)) | (1L << (TRUNCATE - 132)) | (1L << (UPDATE - 132)))) != 0)) {
				{
				setState(146);
				sqlStatement();
				}
			}

			setState(149);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStatementContext extends ParserRuleContext {
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatement);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case DROP:
			case TRUNCATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				ddlStatement();
				}
				break;
			case DELETE:
			case INSERT:
			case SELECT:
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				dmlStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdlStatementContext extends ParserRuleContext {
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public DropStatementContext dropStatement() {
			return getRuleContext(DropStatementContext.class,0);
		}
		public TruncateStatementContext truncateStatement() {
			return getRuleContext(TruncateStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddlStatement);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				createStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				dropStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				truncateStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dmlStatement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				selectStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				insertStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				deleteStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStatementContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public List<CreateContentContext> createContent() {
			return getRuleContexts(CreateContentContext.class);
		}
		public CreateContentContext createContent(int i) {
			return getRuleContext(CreateContentContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			createTable();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(167);
				ifNotExists();
				}
			}

			setState(170);
			tableName();
			setState(171);
			match(L_BRACKET);
			setState(172);
			createContent();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				createContent();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateContentContext extends ParserRuleContext {
		public ColumnContentContext columnContent() {
			return getRuleContext(ColumnContentContext.class,0);
		}
		public PrimaryKeyContentContext primaryKeyContent() {
			return getRuleContext(PrimaryKeyContentContext.class,0);
		}
		public ForeignKeyContentContext foreignKeyContent() {
			return getRuleContext(ForeignKeyContentContext.class,0);
		}
		public CreateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitCreateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContentContext createContent() throws RecognitionException {
		CreateContentContext _localctx = new CreateContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createContent);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_QUOTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				columnContent();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				primaryKeyContent();
				}
				break;
			case CONSTRAINT:
			case INDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				foreignKeyContent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySqlLangRuleParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySqlLangRuleParser.TABLE, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CREATE);
			setState(188);
			match(TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropStatementContext extends ParserRuleContext {
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDropStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			dropTable();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(191);
				ifExists();
				}
			}

			setState(194);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySqlLangRuleParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MySqlLangRuleParser.TABLE, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(DROP);
			setState(197);
			match(TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateStatementContext extends ParserRuleContext {
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitTruncateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStatementContext truncateStatement() throws RecognitionException {
		TruncateStatementContext _localctx = new TruncateStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			truncateTable();
			setState(200);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(MySqlLangRuleParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(MySqlLangRuleParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(TRUNCATE);
			setState(203);
			match(TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContentContext extends ParserRuleContext {
		public List<ColumnDefineStyleContext> columnDefineStyle() {
			return getRuleContexts(ColumnDefineStyleContext.class);
		}
		public ColumnDefineStyleContext columnDefineStyle(int i) {
			return getRuleContext(ColumnDefineStyleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public ColumnContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitColumnContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContentContext columnContent() throws RecognitionException {
		ColumnContentContext _localctx = new ColumnContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			columnDefineStyle();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					columnDefineStyle();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefineStyleContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<DataTypeContentContext> dataTypeContent() {
			return getRuleContexts(DataTypeContentContext.class);
		}
		public DataTypeContentContext dataTypeContent(int i) {
			return getRuleContext(DataTypeContentContext.class,i);
		}
		public List<ColumnDefParametersContext> columnDefParameters() {
			return getRuleContexts(ColumnDefParametersContext.class);
		}
		public ColumnDefParametersContext columnDefParameters(int i) {
			return getRuleContext(ColumnDefParametersContext.class,i);
		}
		public ColumnDefineStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefineStyle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitColumnDefineStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefineStyleContext columnDefineStyle() throws RecognitionException {
		ColumnDefineStyleContext _localctx = new ColumnDefineStyleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnDefineStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				columnName();
				setState(214);
				dataTypeContent();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AUTO_INCREMENT || _la==NOT || _la==PRIMARY) {
					{
					{
					setState(215);
					columnDefParameters();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==R_QUOTE || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefParametersContext extends ParserRuleContext {
		public NotNullContext notNull() {
			return getRuleContext(NotNullContext.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(MySqlLangRuleParser.AUTO_INCREMENT, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnDefParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitColumnDefParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefParametersContext columnDefParameters() throws RecognitionException {
		ColumnDefParametersContext _localctx = new ColumnDefParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnDefParameters);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				notNull();
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(AUTO_INCREMENT);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContentContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public DataTypeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDataTypeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContentContext dataTypeContent() throws RecognitionException {
		DataTypeContentContext _localctx = new DataTypeContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dataTypeContent);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				dataType();
				setState(232);
				match(L_BRACKET);
				setState(233);
				number();
				setState(234);
				match(R_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(MySqlLangRuleParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(MySqlLangRuleParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(PRIMARY);
			setState(239);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContentContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public PrimaryKeyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitPrimaryKeyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContentContext primaryKeyContent() throws RecognitionException {
		PrimaryKeyContentContext _localctx = new PrimaryKeyContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryKeyContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			primaryKey();
			setState(242);
			match(L_BRACKET);
			setState(243);
			keys();
			setState(244);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeysContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public KeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keys; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysContext keys() throws RecognitionException {
		KeysContext _localctx = new KeysContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			columnName();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				columnName();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyContentContext extends ParserRuleContext {
		public List<ForeignKeysContext> foreignKeys() {
			return getRuleContexts(ForeignKeysContext.class);
		}
		public ForeignKeysContext foreignKeys(int i) {
			return getRuleContext(ForeignKeysContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public ForeignKeyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitForeignKeyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContentContext foreignKeyContent() throws RecognitionException {
		ForeignKeyContentContext _localctx = new ForeignKeyContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreignKeyContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			foreignKeys();
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(COMMA);
					setState(256);
					foreignKeys();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MySqlLangRuleParser.INDEX, 0); }
		public InnerNameContext innerName() {
			return getRuleContext(InnerNameContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public UsingBTreeContext usingBTree() {
			return getRuleContext(UsingBTreeContext.class,0);
		}
		public ForeignKeyIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitForeignKeyIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyIndexContext foreignKeyIndex() throws RecognitionException {
		ForeignKeyIndexContext _localctx = new ForeignKeyIndexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreignKeyIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(INDEX);
			setState(263);
			innerName();
			setState(264);
			match(L_BRACKET);
			setState(265);
			columnName();
			setState(266);
			match(R_BRACKET);
			setState(267);
			usingBTree();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeysContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(MySqlLangRuleParser.CONSTRAINT, 0); }
		public InnerNameContext innerName() {
			return getRuleContext(InnerNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(MySqlLangRuleParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySqlLangRuleParser.KEY, 0); }
		public List<TerminalNode> L_BRACKET() { return getTokens(MySqlLangRuleParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(MySqlLangRuleParser.L_BRACKET, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(MySqlLangRuleParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(MySqlLangRuleParser.R_BRACKET, i);
		}
		public TerminalNode REFERENCES() { return getToken(MySqlLangRuleParser.REFERENCES, 0); }
		public ReferenceTableNameContext referenceTableName() {
			return getRuleContext(ReferenceTableNameContext.class,0);
		}
		public ForeignKeyNameContext foreignKeyName() {
			return getRuleContext(ForeignKeyNameContext.class,0);
		}
		public List<ForeignOnOpChangeContext> foreignOnOpChange() {
			return getRuleContexts(ForeignOnOpChangeContext.class);
		}
		public ForeignOnOpChangeContext foreignOnOpChange(int i) {
			return getRuleContext(ForeignOnOpChangeContext.class,i);
		}
		public ForeignKeyIndexContext foreignKeyIndex() {
			return getRuleContext(ForeignKeyIndexContext.class,0);
		}
		public ForeignKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeys; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitForeignKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeysContext foreignKeys() throws RecognitionException {
		ForeignKeysContext _localctx = new ForeignKeysContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_foreignKeys);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(CONSTRAINT);
				setState(270);
				innerName();
				setState(271);
				match(FOREIGN);
				setState(272);
				match(KEY);
				setState(273);
				match(L_BRACKET);
				setState(274);
				columnName();
				setState(275);
				match(R_BRACKET);
				setState(276);
				match(REFERENCES);
				setState(277);
				referenceTableName();
				setState(278);
				match(L_BRACKET);
				setState(279);
				foreignKeyName();
				setState(280);
				match(R_BRACKET);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(281);
					foreignOnOpChange();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				foreignKeyIndex();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignOnOpChangeContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySqlLangRuleParser.ON, 0); }
		public TerminalNode RESTRICT() { return getToken(MySqlLangRuleParser.RESTRICT, 0); }
		public TerminalNode DELETE() { return getToken(MySqlLangRuleParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(MySqlLangRuleParser.UPDATE, 0); }
		public ForeignOnOpChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignOnOpChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitForeignOnOpChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignOnOpChangeContext foreignOnOpChange() throws RecognitionException {
		ForeignOnOpChangeContext _localctx = new ForeignOnOpChangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_foreignOnOpChange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ON);
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			match(RESTRICT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(MySqlLangRuleParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(MySqlLangRuleParser.SMALLINT, 0); }
		public TerminalNode MEDIUMINT() { return getToken(MySqlLangRuleParser.MEDIUMINT, 0); }
		public TerminalNode INT() { return getToken(MySqlLangRuleParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(MySqlLangRuleParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(MySqlLangRuleParser.BIGINT, 0); }
		public TerminalNode REAL() { return getToken(MySqlLangRuleParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(MySqlLangRuleParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(MySqlLangRuleParser.PRECISION, 0); }
		public TerminalNode FLOAT() { return getToken(MySqlLangRuleParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(MySqlLangRuleParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(MySqlLangRuleParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(MySqlLangRuleParser.NUMERIC, 0); }
		public TerminalNode DATE() { return getToken(MySqlLangRuleParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySqlLangRuleParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySqlLangRuleParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(MySqlLangRuleParser.DATETIME, 0); }
		public TerminalNode YEAR() { return getToken(MySqlLangRuleParser.YEAR, 0); }
		public TerminalNode CHAR() { return getToken(MySqlLangRuleParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(MySqlLangRuleParser.VARCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(MySqlLangRuleParser.NVARCHAR, 0); }
		public TerminalNode NATIONAL() { return getToken(MySqlLangRuleParser.NATIONAL, 0); }
		public TerminalNode BINARY() { return getToken(MySqlLangRuleParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(MySqlLangRuleParser.VARBINARY, 0); }
		public TerminalNode TINYBLOB() { return getToken(MySqlLangRuleParser.TINYBLOB, 0); }
		public TerminalNode BLOB() { return getToken(MySqlLangRuleParser.BLOB, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(MySqlLangRuleParser.MEDIUMBLOB, 0); }
		public TerminalNode LONGBLOB() { return getToken(MySqlLangRuleParser.LONGBLOB, 0); }
		public TerminalNode TINYTEXT() { return getToken(MySqlLangRuleParser.TINYTEXT, 0); }
		public TerminalNode TEXT() { return getToken(MySqlLangRuleParser.TEXT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(MySqlLangRuleParser.MEDIUMTEXT, 0); }
		public TerminalNode LONGTEXT() { return getToken(MySqlLangRuleParser.LONGTEXT, 0); }
		public TerminalNode ENUM() { return getToken(MySqlLangRuleParser.ENUM, 0); }
		public TerminalNode VARYING() { return getToken(MySqlLangRuleParser.VARYING, 0); }
		public TerminalNode SERIAL() { return getToken(MySqlLangRuleParser.SERIAL, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (TINYINT - 170)) | (1L << (SMALLINT - 170)) | (1L << (MEDIUMINT - 170)) | (1L << (INT - 170)) | (1L << (INTEGER - 170)) | (1L << (BIGINT - 170)) | (1L << (REAL - 170)) | (1L << (DOUBLE - 170)) | (1L << (PRECISION - 170)) | (1L << (FLOAT - 170)) | (1L << (DECIMAL - 170)) | (1L << (DEC - 170)) | (1L << (NUMERIC - 170)) | (1L << (DATE - 170)) | (1L << (TIME - 170)) | (1L << (TIMESTAMP - 170)) | (1L << (DATETIME - 170)) | (1L << (YEAR - 170)) | (1L << (CHAR - 170)) | (1L << (VARCHAR - 170)) | (1L << (NVARCHAR - 170)) | (1L << (NATIONAL - 170)) | (1L << (BINARY - 170)) | (1L << (VARBINARY - 170)) | (1L << (TINYBLOB - 170)) | (1L << (BLOB - 170)) | (1L << (MEDIUMBLOB - 170)) | (1L << (LONGBLOB - 170)) | (1L << (TINYTEXT - 170)) | (1L << (TEXT - 170)) | (1L << (MEDIUMTEXT - 170)) | (1L << (LONGTEXT - 170)) | (1L << (ENUM - 170)) | (1L << (VARYING - 170)) | (1L << (SERIAL - 170)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MySqlLangRuleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MySqlLangRuleParser.NUMBER, i);
		}
		public List<TerminalNode> S_QUOTE() { return getTokens(MySqlLangRuleParser.S_QUOTE); }
		public TerminalNode S_QUOTE(int i) {
			return getToken(MySqlLangRuleParser.S_QUOTE, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_number);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(296);
					match(NUMBER);
					}
					}
					setState(299); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case S_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(301);
					match(S_QUOTE);
					setState(302);
					match(NUMBER);
					setState(303);
					match(S_QUOTE);
					}
					}
					setState(306); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==S_QUOTE );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MySqlLangRuleParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySqlLangRuleParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IF);
			setState(311);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfNotExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MySqlLangRuleParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySqlLangRuleParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySqlLangRuleParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IF);
			setState(314);
			match(NOT);
			setState(315);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotNullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MySqlLangRuleParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(MySqlLangRuleParser.NULL, 0); }
		public NotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitNotNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullContext notNull() throws RecognitionException {
		NotNullContext _localctx = new NotNullContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_notNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(NOT);
			setState(318);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySqlLangRuleParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(MySqlLangRuleParser.FROM, 0); }
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public TerminalNode START() { return getToken(MySqlLangRuleParser.START, 0); }
		public DistinctExprContext distinctExpr() {
			return getRuleContext(DistinctExprContext.class,0);
		}
		public SelectColumnMulpContext selectColumnMulp() {
			return getRuleContext(SelectColumnMulpContext.class,0);
		}
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public List<ConditionExprContext> conditionExpr() {
			return getRuleContexts(ConditionExprContext.class);
		}
		public ConditionExprContext conditionExpr(int i) {
			return getRuleContext(ConditionExprContext.class,i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(SELECT);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				{
				setState(321);
				match(START);
				}
				break;
			case DISTINCT:
				{
				setState(322);
				distinctExpr();
				}
				break;
			case R_QUOTE:
			case ID:
				{
				setState(323);
				selectColumnMulp();
				}
				break;
			case MAX:
			case MIN:
			case COUNT:
			case SUM:
			case AVG:
				{
				setState(324);
				functionExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(327);
			match(FROM);
			setState(328);
			tableExpr();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GROUP || _la==ORDER || _la==WHERE) {
				{
				{
				setState(329);
				conditionExpr();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExprContext extends ParserRuleContext {
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExprContext functionExpr() throws RecognitionException {
		FunctionExprContext _localctx = new FunctionExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			functions();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(336);
				match(COMMA);
				setState(337);
				functions();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public MaxFuncContext maxFunc() {
			return getRuleContext(MaxFuncContext.class,0);
		}
		public MinFuncContext minFunc() {
			return getRuleContext(MinFuncContext.class,0);
		}
		public CountFuncContext countFunc() {
			return getRuleContext(CountFuncContext.class,0);
		}
		public SumFuncContext sumFunc() {
			return getRuleContext(SumFuncContext.class,0);
		}
		public AvgFuncContext avgFunc() {
			return getRuleContext(AvgFuncContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functions);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				maxFunc();
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				minFunc();
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				countFunc();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				sumFunc();
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				avgFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxFuncContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(MySqlLangRuleParser.MAX, 0); }
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public MaxFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitMaxFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxFuncContext maxFunc() throws RecognitionException {
		MaxFuncContext _localctx = new MaxFuncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_maxFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(MAX);
			setState(351);
			match(L_BRACKET);
			setState(352);
			columnName();
			setState(353);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinFuncContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(MySqlLangRuleParser.MIN, 0); }
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public MinFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitMinFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinFuncContext minFunc() throws RecognitionException {
		MinFuncContext _localctx = new MinFuncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_minFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(MIN);
			setState(356);
			match(L_BRACKET);
			setState(357);
			columnName();
			setState(358);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumFuncContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MySqlLangRuleParser.SUM, 0); }
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public SumFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSumFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumFuncContext sumFunc() throws RecognitionException {
		SumFuncContext _localctx = new SumFuncContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sumFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(SUM);
			setState(361);
			match(L_BRACKET);
			setState(362);
			columnName();
			setState(363);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvgFuncContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(MySqlLangRuleParser.AVG, 0); }
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public AvgFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avgFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitAvgFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvgFuncContext avgFunc() throws RecognitionException {
		AvgFuncContext _localctx = new AvgFuncContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_avgFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(AVG);
			setState(366);
			match(L_BRACKET);
			setState(367);
			columnName();
			setState(368);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountFuncContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(MySqlLangRuleParser.COUNT, 0); }
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public TerminalNode START() { return getToken(MySqlLangRuleParser.START, 0); }
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public CountFuncExprContext countFuncExpr() {
			return getRuleContext(CountFuncExprContext.class,0);
		}
		public CountFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitCountFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountFuncContext countFunc() throws RecognitionException {
		CountFuncContext _localctx = new CountFuncContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_countFunc);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(COUNT);
				setState(371);
				match(L_BRACKET);
				setState(372);
				match(START);
				setState(373);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(COUNT);
				setState(375);
				match(L_BRACKET);
				setState(376);
				match(T__0);
				setState(377);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(COUNT);
				setState(379);
				match(L_BRACKET);
				setState(380);
				columnName();
				setState(381);
				match(R_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(COUNT);
				setState(384);
				match(L_BRACKET);
				setState(385);
				countFuncExpr();
				setState(386);
				match(R_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountFuncExprContext extends ParserRuleContext {
		public DistinctExprContext distinctExpr() {
			return getRuleContext(DistinctExprContext.class,0);
		}
		public CountFuncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countFuncExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitCountFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountFuncExprContext countFuncExpr() throws RecognitionException {
		CountFuncExprContext _localctx = new CountFuncExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_countFuncExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			distinctExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctExprContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(MySqlLangRuleParser.DISTINCT, 0); }
		public ColumnNameMultpContext columnNameMultp() {
			return getRuleContext(ColumnNameMultpContext.class,0);
		}
		public DistinctExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDistinctExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctExprContext distinctExpr() throws RecognitionException {
		DistinctExprContext _localctx = new DistinctExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_distinctExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(DISTINCT);
			setState(393);
			columnNameMultp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionExprContext extends ParserRuleContext {
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitConditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditionExpr);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				whereClause();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				groupByClause();
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				orderByClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExprContext extends ParserRuleContext {
		public List<TableMultpContext> tableMultp() {
			return getRuleContexts(TableMultpContext.class);
		}
		public TableMultpContext tableMultp(int i) {
			return getRuleContext(TableMultpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitTableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		TableExprContext _localctx = new TableExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tableExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			tableMultp();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				tableMultp();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableMultpContext extends ParserRuleContext {
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableMultpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableMultp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitTableMultp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableMultpContext tableMultp() throws RecognitionException {
		TableMultpContext _localctx = new TableMultpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableMultp);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				tableAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				tableName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubQueryContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public SubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubQueryContext subQuery() throws RecognitionException {
		SubQueryContext _localctx = new SubQueryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(L_BRACKET);
			setState(413);
			selectStatement();
			setState(414);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySqlLangRuleParser.ID, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			tableName();
			setState(417);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterConditionContext extends ParserRuleContext {
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public ExistsClauseContext existsClause() {
			return getRuleContext(ExistsClauseContext.class,0);
		}
		public NotExistsClauseContext notExistsClause() {
			return getRuleContext(NotExistsClauseContext.class,0);
		}
		public FilterConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitFilterCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterConditionContext filterCondition() throws RecognitionException {
		FilterConditionContext _localctx = new FilterConditionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_filterCondition);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				compareExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				logicOp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				rangeExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				existsClause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				notExistsClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySqlLangRuleParser.AND, 0); }
		public TerminalNode OR() { return getToken(MySqlLangRuleParser.OR, 0); }
		public TerminalNode NOT() { return getToken(MySqlLangRuleParser.NOT, 0); }
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==NOT || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExprContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<ColumnAliasContext> columnAlias() {
			return getRuleContexts(ColumnAliasContext.class);
		}
		public ColumnAliasContext columnAlias(int i) {
			return getRuleContext(ColumnAliasContext.class,i);
		}
		public OpExprContext opExpr() {
			return getRuleContext(OpExprContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(MySqlLangRuleParser.LIKE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValueClauseContext valueClause() {
			return getRuleContext(ValueClauseContext.class,0);
		}
		public AnyClauseContext anyClause() {
			return getRuleContext(AnyClauseContext.class,0);
		}
		public AllClauseContext allClause() {
			return getRuleContext(AllClauseContext.class,0);
		}
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public IndistinctClauseContext indistinctClause() {
			return getRuleContext(IndistinctClauseContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_compareExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(428);
				columnName();
				}
				break;
			case 2:
				{
				setState(429);
				columnAlias();
				}
				break;
			}
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
			case GREATER:
			case LESS:
			case NEQ:
			case GREATER_EQUAL:
			case LESS_EQUAL:
				{
				setState(432);
				opExpr();
				}
				break;
			case LIKE:
				{
				setState(433);
				match(LIKE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(436);
				number();
				}
				break;
			case 2:
				{
				setState(437);
				valueClause();
				}
				break;
			case 3:
				{
				setState(438);
				anyClause();
				}
				break;
			case 4:
				{
				setState(439);
				allClause();
				}
				break;
			case 5:
				{
				setState(440);
				subQuery();
				}
				break;
			case 6:
				{
				setState(441);
				indistinctClause();
				}
				break;
			case 7:
				{
				setState(442);
				columnAlias();
				}
				break;
			case 8:
				{
				setState(443);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndistinctClauseContext extends ParserRuleContext {
		public List<TerminalNode> PERCENT() { return getTokens(MySqlLangRuleParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(MySqlLangRuleParser.PERCENT, i);
		}
		public TerminalNode ID() { return getToken(MySqlLangRuleParser.ID, 0); }
		public List<TerminalNode> S_QUOTE() { return getTokens(MySqlLangRuleParser.S_QUOTE); }
		public TerminalNode S_QUOTE(int i) {
			return getToken(MySqlLangRuleParser.S_QUOTE, i);
		}
		public List<TerminalNode> UNDER_LINE() { return getTokens(MySqlLangRuleParser.UNDER_LINE); }
		public TerminalNode UNDER_LINE(int i) {
			return getToken(MySqlLangRuleParser.UNDER_LINE, i);
		}
		public IndistinctClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indistinctClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitIndistinctClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndistinctClauseContext indistinctClause() throws RecognitionException {
		IndistinctClauseContext _localctx = new IndistinctClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indistinctClause);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(PERCENT);
				setState(447);
				match(ID);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(448);
					match(PERCENT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(S_QUOTE);
				setState(452);
				match(PERCENT);
				setState(453);
				match(ID);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(454);
					match(PERCENT);
					}
				}

				setState(457);
				match(S_QUOTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(UNDER_LINE);
				setState(459);
				match(ID);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDER_LINE) {
					{
					setState(460);
					match(UNDER_LINE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(S_QUOTE);
				setState(464);
				match(UNDER_LINE);
				setState(465);
				match(ID);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDER_LINE) {
					{
					setState(466);
					match(UNDER_LINE);
					}
				}

				setState(469);
				match(S_QUOTE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueClauseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySqlLangRuleParser.ID, 0); }
		public List<TerminalNode> S_QUOTE() { return getTokens(MySqlLangRuleParser.S_QUOTE); }
		public TerminalNode S_QUOTE(int i) {
			return getToken(MySqlLangRuleParser.S_QUOTE, i);
		}
		public ValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitValueClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueClauseContext valueClause() throws RecognitionException {
		ValueClauseContext _localctx = new ValueClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_valueClause);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(ID);
				}
				break;
			case S_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(S_QUOTE);
				setState(474);
				match(ID);
				setState(475);
				match(S_QUOTE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExprContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySqlLangRuleParser.IN, 0); }
		public TerminalNode L_BRACKET() { return getToken(MySqlLangRuleParser.L_BRACKET, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MySqlLangRuleParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(MySqlLangRuleParser.R_BRACKET, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(MySqlLangRuleParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySqlLangRuleParser.AND, 0); }
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_rangeExpr);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				variableId();
				setState(480);
				match(IN);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(481);
					match(L_BRACKET);
					setState(482);
					number();
					setState(483);
					match(COMMA);
					setState(484);
					number();
					setState(485);
					match(R_BRACKET);
					}
					break;
				case 2:
					{
					setState(487);
					subQuery();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				variableId();
				setState(491);
				match(BETWEEN);
				setState(492);
				number();
				setState(493);
				match(AND);
				setState(494);
				number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpExprContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MySqlLangRuleParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(MySqlLangRuleParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(MySqlLangRuleParser.LESS, 0); }
		public TerminalNode NEQ() { return getToken(MySqlLangRuleParser.NEQ, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(MySqlLangRuleParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(MySqlLangRuleParser.LESS_EQUAL, 0); }
		public OpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpExprContext opExpr() throws RecognitionException {
		OpExprContext _localctx = new OpExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_opExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & ((1L << (EQUAL - 205)) | (1L << (GREATER - 205)) | (1L << (LESS - 205)) | (1L << (NEQ - 205)) | (1L << (GREATER_EQUAL - 205)) | (1L << (LESS_EQUAL - 205)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllClauseContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySqlLangRuleParser.ALL, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public AllClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitAllClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllClauseContext allClause() throws RecognitionException {
		AllClauseContext _localctx = new AllClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_allClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(ALL);
			setState(501);
			subQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyClauseContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(MySqlLangRuleParser.ANY, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public AnyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitAnyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyClauseContext anyClause() throws RecognitionException {
		AnyClauseContext _localctx = new AnyClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_anyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(ANY);
			setState(504);
			subQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsClauseContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(MySqlLangRuleParser.EXISTS, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public ExistsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitExistsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsClauseContext existsClause() throws RecognitionException {
		ExistsClauseContext _localctx = new ExistsClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_existsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(EXISTS);
			setState(507);
			subQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExistsClauseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MySqlLangRuleParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySqlLangRuleParser.EXISTS, 0); }
		public SubQueryContext subQuery() {
			return getRuleContext(SubQueryContext.class,0);
		}
		public NotExistsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExistsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitNotExistsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExistsClauseContext notExistsClause() throws RecognitionException {
		NotExistsClauseContext _localctx = new NotExistsClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notExistsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(NOT);
			setState(510);
			match(EXISTS);
			setState(511);
			subQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySqlLangRuleParser.WHERE, 0); }
		public List<FilterConditionContext> filterCondition() {
			return getRuleContexts(FilterConditionContext.class);
		}
		public FilterConditionContext filterCondition(int i) {
			return getRuleContext(FilterConditionContext.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(WHERE);
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				filterCondition();
				}
				}
				setState(517); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND || _la==EXISTS || _la==NOT || _la==OR || _la==R_QUOTE || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MySqlLangRuleParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySqlLangRuleParser.BY, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(GROUP);
			setState(520);
			match(BY);
			setState(521);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MySqlLangRuleParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySqlLangRuleParser.BY, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_orderByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ORDER);
			setState(524);
			match(BY);
			setState(525);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySqlLangRuleParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(MySqlLangRuleParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySqlLangRuleParser.VALUES, 0); }
		public List<TerminalNode> L_BRACKET() { return getTokens(MySqlLangRuleParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(MySqlLangRuleParser.L_BRACKET, i);
		}
		public ValueContentContext valueContent() {
			return getRuleContext(ValueContentContext.class,0);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(MySqlLangRuleParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(MySqlLangRuleParser.R_BRACKET, i);
		}
		public ColumnNameMultpContext columnNameMultp() {
			return getRuleContext(ColumnNameMultpContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(INSERT);
			setState(528);
			match(INTO);
			setState(529);
			tableName();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(530);
				match(L_BRACKET);
				setState(531);
				columnNameMultp();
				setState(532);
				match(R_BRACKET);
				}
			}

			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(536);
				match(VALUES);
				setState(537);
				match(L_BRACKET);
				setState(538);
				valueContent();
				setState(539);
				match(R_BRACKET);
				}
				break;
			case EOF:
			case SELECT:
				{
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECT) {
					{
					setState(541);
					selectStatement();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContentContext extends ParserRuleContext {
		public List<ValueClauseContext> valueClause() {
			return getRuleContexts(ValueClauseContext.class);
		}
		public ValueClauseContext valueClause(int i) {
			return getRuleContext(ValueClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public ValueContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitValueContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContentContext valueContent() throws RecognitionException {
		ValueContentContext _localctx = new ValueContentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_valueContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			valueClause();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(547);
				match(COMMA);
				setState(548);
				valueClause();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySqlLangRuleParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySqlLangRuleParser.SET, 0); }
		public UpdateContentOptionalContext updateContentOptional() {
			return getRuleContext(UpdateContentOptionalContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(UPDATE);
			setState(555);
			tableName();
			setState(556);
			match(SET);
			setState(557);
			updateContentOptional();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(558);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContentOptionalContext extends ParserRuleContext {
		public List<CompareExprContext> compareExpr() {
			return getRuleContexts(CompareExprContext.class);
		}
		public CompareExprContext compareExpr(int i) {
			return getRuleContext(CompareExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public UpdateContentOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateContentOptional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitUpdateContentOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContentOptionalContext updateContentOptional() throws RecognitionException {
		UpdateContentOptionalContext _localctx = new UpdateContentOptionalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_updateContentOptional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			compareExpr();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(562);
				match(COMMA);
				setState(563);
				compareExpr();
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySqlLangRuleParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MySqlLangRuleParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(DELETE);
			setState(570);
			match(FROM);
			setState(571);
			tableName();
			setState(572);
			whereClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnMulpContext extends ParserRuleContext {
		public List<SelectColumnNameContext> selectColumnName() {
			return getRuleContexts(SelectColumnNameContext.class);
		}
		public SelectColumnNameContext selectColumnName(int i) {
			return getRuleContext(SelectColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public List<SelectColumnAliasContext> selectColumnAlias() {
			return getRuleContexts(SelectColumnAliasContext.class);
		}
		public SelectColumnAliasContext selectColumnAlias(int i) {
			return getRuleContext(SelectColumnAliasContext.class,i);
		}
		public SelectColumnMulpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumnMulp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSelectColumnMulp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnMulpContext selectColumnMulp() throws RecognitionException {
		SelectColumnMulpContext _localctx = new SelectColumnMulpContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_selectColumnMulp);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				selectColumnName();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(575);
					match(COMMA);
					setState(576);
					selectColumnName();
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				selectColumnAlias();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(583);
					match(COMMA);
					setState(584);
					selectColumnAlias();
					}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnNameContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SelectColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSelectColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnNameContext selectColumnName() throws RecognitionException {
		SelectColumnNameContext _localctx = new SelectColumnNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_selectColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectColumnAliasContext extends ParserRuleContext {
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public SelectColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectColumnAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitSelectColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectColumnAliasContext selectColumnAlias() throws RecognitionException {
		SelectColumnAliasContext _localctx = new SelectColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_selectColumnAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			columnAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameMultpContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySqlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySqlLangRuleParser.COMMA, i);
		}
		public List<ColumnAliasContext> columnAlias() {
			return getRuleContexts(ColumnAliasContext.class);
		}
		public ColumnAliasContext columnAlias(int i) {
			return getRuleContext(ColumnAliasContext.class,i);
		}
		public ColumnNameMultpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameMultp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitColumnNameMultp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameMultpContext columnNameMultp() throws RecognitionException {
		ColumnNameMultpContext _localctx = new ColumnNameMultpContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_columnNameMultp);
		int _la;
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				columnName();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(597);
					match(COMMA);
					setState(598);
					columnName();
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				columnAlias();
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(605);
					match(COMMA);
					setState(606);
					columnAlias();
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			variableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySqlLangRuleParser.ID, 0); }
		public TerminalNode F_STOP() { return getToken(MySqlLangRuleParser.F_STOP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode START() { return getToken(MySqlLangRuleParser.START, 0); }
		public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_columnAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(ID);
			setState(617);
			match(F_STOP);
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_QUOTE:
			case ID:
				{
				setState(618);
				columnName();
				}
				break;
			case START:
				{
				setState(619);
				match(START);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyNameContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public ForeignKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitForeignKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyNameContext foreignKeyName() throws RecognitionException {
		ForeignKeyNameContext _localctx = new ForeignKeyNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_foreignKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			variableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTableNameContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public ReferenceTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceTableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitReferenceTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTableNameContext referenceTableName() throws RecognitionException {
		ReferenceTableNameContext _localctx = new ReferenceTableNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_referenceTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			variableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerNameContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public InnerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitInnerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerNameContext innerName() throws RecognitionException {
		InnerNameContext _localctx = new InnerNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_innerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			variableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingBTreeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(MySqlLangRuleParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(MySqlLangRuleParser.BTREE, 0); }
		public UsingBTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingBTree; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitUsingBTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingBTreeContext usingBTree() throws RecognitionException {
		UsingBTreeContext _localctx = new UsingBTreeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_usingBTree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(USING);
			setState(629);
			match(BTREE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			variableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdContext extends ParserRuleContext {
		public List<TerminalNode> R_QUOTE() { return getTokens(MySqlLangRuleParser.R_QUOTE); }
		public TerminalNode R_QUOTE(int i) {
			return getToken(MySqlLangRuleParser.R_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(MySqlLangRuleParser.ID, 0); }
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySqlLangRuleVisitor ) return ((MySqlLangRuleVisitor<? extends T>)visitor).visitVariableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableId);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				match(R_QUOTE);
				setState(634);
				match(ID);
				setState(635);
				match(R_QUOTE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00de\u0282\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\5\2\u0096\n\2\3\2\3\2\3\3\3\3\5\3\u009c\n\3\3\4\3\4\3\4"+
		"\5\4\u00a1\n\4\3\5\3\5\3\5\3\5\5\5\u00a7\n\5\3\6\3\6\5\6\u00ab\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\5\7\u00bc\n\7\3\b\3\b\3\b\3\t\3\t\5\t\u00c3\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13"+
		"\r\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13\16\6\16\u00e0\n"+
		"\16\r\16\16\16\u00e1\3\17\3\17\3\17\5\17\u00e7\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u00fc\n\23\f\23\16\23\u00ff\13\23\3\24\3\24\3\24\7\24"+
		"\u0104\n\24\f\24\16\24\u0107\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u011d\n\26\f\26\16\26\u0120\13\26\3\26\5\26\u0123\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\6\31\u012c\n\31\r\31\16\31\u012d\3\31\3\31\3\31\6"+
		"\31\u0133\n\31\r\31\16\31\u0134\5\31\u0137\n\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0148\n\35"+
		"\3\35\3\35\3\35\7\35\u014d\n\35\f\35\16\35\u0150\13\35\3\36\3\36\3\36"+
		"\7\36\u0155\n\36\f\36\16\36\u0158\13\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u015f\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0187"+
		"\n$\3%\3%\3&\3&\3&\3\'\3\'\3\'\5\'\u0191\n\'\3(\3(\3(\7(\u0196\n(\f(\16"+
		"(\u0199\13(\3)\3)\5)\u019d\n)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\5,\u01ab"+
		"\n,\3-\3-\3.\3.\5.\u01b1\n.\3.\3.\5.\u01b5\n.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\5.\u01bf\n.\3/\3/\3/\5/\u01c4\n/\3/\3/\3/\3/\5/\u01ca\n/\3/\3/\3/\3/"+
		"\5/\u01d0\n/\3/\3/\3/\3/\5/\u01d6\n/\3/\5/\u01d9\n/\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u01e0\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01eb\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01f3\n\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\6\67\u0206\n\67\r\67\16\67\u0207\38\38\38\38\39\39\39\39\3:\3:\3:"+
		"\3:\3:\3:\3:\5:\u0219\n:\3:\3:\3:\3:\3:\3:\5:\u0221\n:\5:\u0223\n:\3;"+
		"\3;\3;\7;\u0228\n;\f;\16;\u022b\13;\3<\3<\3<\3<\3<\5<\u0232\n<\3=\3=\3"+
		"=\7=\u0237\n=\f=\16=\u023a\13=\3>\3>\3>\3>\3>\3?\3?\3?\7?\u0244\n?\f?"+
		"\16?\u0247\13?\3?\3?\3?\7?\u024c\n?\f?\16?\u024f\13?\5?\u0251\n?\3@\3"+
		"@\3A\3A\3B\3B\3B\7B\u025a\nB\fB\16B\u025d\13B\3B\3B\3B\7B\u0262\nB\fB"+
		"\16B\u0265\13B\5B\u0267\nB\3C\3C\3D\3D\3D\3D\5D\u026f\nD\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3J\5J\u0280\nJ\3J\2\2K\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\2\6\4\2**\u0099\u0099\3\2\u00ac\u00ce\5\2\n\nffll\3\2\u00cf\u00d4\2\u0288"+
		"\2\u0095\3\2\2\2\4\u009b\3\2\2\2\6\u00a0\3\2\2\2\b\u00a6\3\2\2\2\n\u00a8"+
		"\3\2\2\2\f\u00bb\3\2\2\2\16\u00bd\3\2\2\2\20\u00c0\3\2\2\2\22\u00c6\3"+
		"\2\2\2\24\u00c9\3\2\2\2\26\u00cc\3\2\2\2\30\u00cf\3\2\2\2\32\u00df\3\2"+
		"\2\2\34\u00e6\3\2\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2\2\"\u00f3\3\2\2\2"+
		"$\u00f8\3\2\2\2&\u0100\3\2\2\2(\u0108\3\2\2\2*\u0122\3\2\2\2,\u0124\3"+
		"\2\2\2.\u0128\3\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64\u013b\3\2\2"+
		"\2\66\u013f\3\2\2\28\u0142\3\2\2\2:\u0151\3\2\2\2<\u015e\3\2\2\2>\u0160"+
		"\3\2\2\2@\u0165\3\2\2\2B\u016a\3\2\2\2D\u016f\3\2\2\2F\u0186\3\2\2\2H"+
		"\u0188\3\2\2\2J\u018a\3\2\2\2L\u0190\3\2\2\2N\u0192\3\2\2\2P\u019c\3\2"+
		"\2\2R\u019e\3\2\2\2T\u01a2\3\2\2\2V\u01aa\3\2\2\2X\u01ac\3\2\2\2Z\u01b0"+
		"\3\2\2\2\\\u01d8\3\2\2\2^\u01df\3\2\2\2`\u01f2\3\2\2\2b\u01f4\3\2\2\2"+
		"d\u01f6\3\2\2\2f\u01f9\3\2\2\2h\u01fc\3\2\2\2j\u01ff\3\2\2\2l\u0203\3"+
		"\2\2\2n\u0209\3\2\2\2p\u020d\3\2\2\2r\u0211\3\2\2\2t\u0224\3\2\2\2v\u022c"+
		"\3\2\2\2x\u0233\3\2\2\2z\u023b\3\2\2\2|\u0250\3\2\2\2~\u0252\3\2\2\2\u0080"+
		"\u0254\3\2\2\2\u0082\u0266\3\2\2\2\u0084\u0268\3\2\2\2\u0086\u026a\3\2"+
		"\2\2\u0088\u0270\3\2\2\2\u008a\u0272\3\2\2\2\u008c\u0274\3\2\2\2\u008e"+
		"\u0276\3\2\2\2\u0090\u0279\3\2\2\2\u0092\u027f\3\2\2\2\u0094\u0096\5\4"+
		"\3\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\2\2\3\u0098\3\3\2\2\2\u0099\u009c\5\6\4\2\u009a\u009c\5\b\5\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\5\3\2\2\2\u009d\u00a1\5"+
		"\n\6\2\u009e\u00a1\5\20\t\2\u009f\u00a1\5\24\13\2\u00a0\u009d\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\7\3\2\2\2\u00a2\u00a7\5"+
		"8\35\2\u00a3\u00a7\5r:\2\u00a4\u00a7\5v<\2\u00a5\u00a7\5z>\2\u00a6\u00a2"+
		"\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\t\3\2\2\2\u00a8\u00aa\5\16\b\2\u00a9\u00ab\5\64\33\2\u00aa\u00a9\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\u0090I\2\u00ad"+
		"\u00ae\7\u00d9\2\2\u00ae\u00b3\5\f\7\2\u00af\u00b0\7\u00d5\2\2\u00b0\u00b2"+
		"\5\f\7\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\u00da"+
		"\2\2\u00b7\13\3\2\2\2\u00b8\u00bc\5\30\r\2\u00b9\u00bc\5\"\22\2\u00ba"+
		"\u00bc\5&\24\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\r\3\2\2\2\u00bd\u00be\7!\2\2\u00be\u00bf\7\u008c\2\2\u00bf"+
		"\17\3\2\2\2\u00c0\u00c2\5\22\n\2\u00c1\u00c3\5\62\32\2\u00c2\u00c1\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5\u0090I\2\u00c5"+
		"\21\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7\u00c8\7\u008c\2\2\u00c8\23\3\2"+
		"\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\5\u0090I\2\u00cb\25\3\2\2\2\u00cc"+
		"\u00cd\7\u0093\2\2\u00cd\u00ce\7\u008c\2\2\u00ce\27\3\2\2\2\u00cf\u00d4"+
		"\5\32\16\2\u00d0\u00d1\7\u00d5\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00d0\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\31\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\u0084C\2\u00d8\u00dc\5\36"+
		"\20\2\u00d9\u00db\5\34\17\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00d7\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e7\5\66\34\2\u00e4\u00e7\7\16"+
		"\2\2\u00e5\u00e7\5 \21\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00ef\5.\30\2\u00e9\u00ea\5.\30"+
		"\2\u00ea\u00eb\7\u00d9\2\2\u00eb\u00ec\5\60\31\2\u00ec\u00ed\7\u00da\2"+
		"\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ef\37"+
		"\3\2\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7R\2\2\u00f2!\3\2\2\2\u00f3\u00f4"+
		"\5 \21\2\u00f4\u00f5\7\u00d9\2\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7\u00da"+
		"\2\2\u00f7#\3\2\2\2\u00f8\u00fd\5\u0084C\2\u00f9\u00fa\7\u00d5\2\2\u00fa"+
		"\u00fc\5\u0084C\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe%\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0105\5*\26\2\u0101\u0102\7\u00d5\2\2\u0102\u0104\5*\26\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\'\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7H\2\2\u0109\u010a\5\u008c"+
		"G\2\u010a\u010b\7\u00d9\2\2\u010b\u010c\5\u0084C\2\u010c\u010d\7\u00da"+
		"\2\2\u010d\u010e\5\u008eH\2\u010e)\3\2\2\2\u010f\u0110\7\36\2\2\u0110"+
		"\u0111\5\u008cG\2\u0111\u0112\7=\2\2\u0112\u0113\7R\2\2\u0113\u0114\7"+
		"\u00d9\2\2\u0114\u0115\5\u0084C\2\u0115\u0116\7\u00da\2\2\u0116\u0117"+
		"\7x\2\2\u0117\u0118\5\u008aF\2\u0118\u0119\7\u00d9\2\2\u0119\u011a\5\u0088"+
		"E\2\u011a\u011e\7\u00da\2\2\u011b\u011d\5,\27\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5(\25\2\u0122\u010f\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123+\3\2\2\2\u0124\u0125\7h\2\2\u0125\u0126\t\2\2\2\u0126"+
		"\u0127\7\177\2\2\u0127-\3\2\2\2\u0128\u0129\t\3\2\2\u0129/\3\2\2\2\u012a"+
		"\u012c\7\u00dc\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0137\3\2\2\2\u012f\u0130\7\u00d6\2"+
		"\2\u0130\u0131\7\u00dc\2\2\u0131\u0133\7\u00d6\2\2\u0132\u012f\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137"+
		"\3\2\2\2\u0136\u012b\3\2\2\2\u0136\u0132\3\2\2\2\u0137\61\3\2\2\2\u0138"+
		"\u0139\7E\2\2\u0139\u013a\7\66\2\2\u013a\63\3\2\2\2\u013b\u013c\7E\2\2"+
		"\u013c\u013d\7f\2\2\u013d\u013e\7\66\2\2\u013e\65\3\2\2\2\u013f\u0140"+
		"\7f\2\2\u0140\u0141\7g\2\2\u0141\67\3\2\2\2\u0142\u0147\7\u0086\2\2\u0143"+
		"\u0148\7\u00db\2\2\u0144\u0148\5J&\2\u0145\u0148\5|?\2\u0146\u0148\5:"+
		"\36\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7>\2\2\u014a\u014e\5N("+
		"\2\u014b\u014d\5L\'\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f9\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0156\5<\37\2\u0152\u0153\7\u00d5\2\2\u0153\u0155\5<\37\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		";\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015f\5> \2\u015a\u015f\5@!\2\u015b"+
		"\u015f\5F$\2\u015c\u015f\5B\"\2\u015d\u015f\5D#\2\u015e\u0159\3\2\2\2"+
		"\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d"+
		"\3\2\2\2\u015f=\3\2\2\2\u0160\u0161\7\u00a5\2\2\u0161\u0162\7\u00d9\2"+
		"\2\u0162\u0163\5\u0084C\2\u0163\u0164\7\u00da\2\2\u0164?\3\2\2\2\u0165"+
		"\u0166\7\u00a6\2\2\u0166\u0167\7\u00d9\2\2\u0167\u0168\5\u0084C\2\u0168"+
		"\u0169\7\u00da\2\2\u0169A\3\2\2\2\u016a\u016b\7\u00a8\2\2\u016b\u016c"+
		"\7\u00d9\2\2\u016c\u016d\5\u0084C\2\u016d\u016e\7\u00da\2\2\u016eC\3\2"+
		"\2\2\u016f\u0170\7\u00a9\2\2\u0170\u0171\7\u00d9\2\2\u0171\u0172\5\u0084"+
		"C\2\u0172\u0173\7\u00da\2\2\u0173E\3\2\2\2\u0174\u0175\7\u00a7\2\2\u0175"+
		"\u0176\7\u00d9\2\2\u0176\u0177\7\u00db\2\2\u0177\u0187\7\u00da\2\2\u0178"+
		"\u0179\7\u00a7\2\2\u0179\u017a\7\u00d9\2\2\u017a\u017b\7\3\2\2\u017b\u0187"+
		"\7\u00da\2\2\u017c\u017d\7\u00a7\2\2\u017d\u017e\7\u00d9\2\2\u017e\u017f"+
		"\5\u0084C\2\u017f\u0180\7\u00da\2\2\u0180\u0187\3\2\2\2\u0181\u0182\7"+
		"\u00a7\2\2\u0182\u0183\7\u00d9\2\2\u0183\u0184\5H%\2\u0184\u0185\7\u00da"+
		"\2\2\u0185\u0187\3\2\2\2\u0186\u0174\3\2\2\2\u0186\u0178\3\2\2\2\u0186"+
		"\u017c\3\2\2\2\u0186\u0181\3\2\2\2\u0187G\3\2\2\2\u0188\u0189\5J&\2\u0189"+
		"I\3\2\2\2\u018a\u018b\7.\2\2\u018b\u018c\5\u0082B\2\u018cK\3\2\2\2\u018d"+
		"\u0191\5l\67\2\u018e\u0191\5n8\2\u018f\u0191\5p9\2\u0190\u018d\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191M\3\2\2\2\u0192\u0197\5"+
		"P)\2\u0193\u0194\7\u00d5\2\2\u0194\u0196\5P)\2\u0195\u0193\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198O\3\2\2\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019d\5T+\2\u019b\u019d\5\u0090I\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019dQ\3\2\2\2\u019e\u019f\7\u00d9\2\2\u019f"+
		"\u01a0\58\35\2\u01a0\u01a1\7\u00da\2\2\u01a1S\3\2\2\2\u01a2\u01a3\5\u0090"+
		"I\2\u01a3\u01a4\7\u00dd\2\2\u01a4U\3\2\2\2\u01a5\u01ab\5Z.\2\u01a6\u01ab"+
		"\5X-\2\u01a7\u01ab\5`\61\2\u01a8\u01ab\5h\65\2\u01a9\u01ab\5j\66\2\u01aa"+
		"\u01a5\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01aa\u01a9\3\2\2\2\u01abW\3\2\2\2\u01ac\u01ad\t\4\2\2\u01adY\3\2"+
		"\2\2\u01ae\u01b1\5\u0084C\2\u01af\u01b1\5\u0086D\2\u01b0\u01ae\3\2\2\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b5\5b\62\2\u01b3\u01b5"+
		"\7X\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01be\3\2\2\2\u01b6"+
		"\u01bf\5\60\31\2\u01b7\u01bf\5^\60\2\u01b8\u01bf\5f\64\2\u01b9\u01bf\5"+
		"d\63\2\u01ba\u01bf\5R*\2\u01bb\u01bf\5\\/\2\u01bc\u01bf\5\u0086D\2\u01bd"+
		"\u01bf\7\4\2\2\u01be\u01b6\3\2\2\2\u01be\u01b7\3\2\2\2\u01be\u01b8\3\2"+
		"\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf[\3\2\2\2\u01c0\u01c1\7\u00aa"+
		"\2\2\u01c1\u01c3\7\u00dd\2\2\u01c2\u01c4\7\u00aa\2\2\u01c3\u01c2\3\2\2"+
		"\2\u01c3\u01c4\3\2\2\2\u01c4\u01d9\3\2\2\2\u01c5\u01c6\7\u00d6\2\2\u01c6"+
		"\u01c7\7\u00aa\2\2\u01c7\u01c9\7\u00dd\2\2\u01c8\u01ca\7\u00aa\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d9\7\u00d6"+
		"\2\2\u01cc\u01cd\7\u00ab\2\2\u01cd\u01cf\7\u00dd\2\2\u01ce\u01d0\7\u00ab"+
		"\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d9\3\2\2\2\u01d1"+
		"\u01d2\7\u00d6\2\2\u01d2\u01d3\7\u00ab\2\2\u01d3\u01d5\7\u00dd\2\2\u01d4"+
		"\u01d6\7\u00ab\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d9\7\u00d6\2\2\u01d8\u01c0\3\2\2\2\u01d8\u01c5\3\2\2"+
		"\2\u01d8\u01cc\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d9]\3\2\2\2\u01da\u01e0"+
		"\7\u00dd\2\2\u01db\u01dc\7\u00d6\2\2\u01dc\u01dd\7\u00dd\2\2\u01dd\u01e0"+
		"\7\u00d6\2\2\u01de\u01e0\7\4\2\2\u01df\u01da\3\2\2\2\u01df\u01db\3\2\2"+
		"\2\u01df\u01de\3\2\2\2\u01e0_\3\2\2\2\u01e1\u01e2\5\u0092J\2\u01e2\u01ea"+
		"\7G\2\2\u01e3\u01e4\7\u00d9\2\2\u01e4\u01e5\5\60\31\2\u01e5\u01e6\7\u00d5"+
		"\2\2\u01e6\u01e7\5\60\31\2\u01e7\u01e8\7\u00da\2\2\u01e8\u01eb\3\2\2\2"+
		"\u01e9\u01eb\5R*\2\u01ea\u01e3\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01f3"+
		"\3\2\2\2\u01ec\u01ed\5\u0092J\2\u01ed\u01ee\7\20\2\2\u01ee\u01ef\5\60"+
		"\31\2\u01ef\u01f0\7\n\2\2\u01f0\u01f1\5\60\31\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01e1\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f3a\3\2\2\2\u01f4\u01f5\t\5\2\2"+
		"\u01f5c\3\2\2\2\u01f6\u01f7\7\6\2\2\u01f7\u01f8\5R*\2\u01f8e\3\2\2\2\u01f9"+
		"\u01fa\7\13\2\2\u01fa\u01fb\5R*\2\u01fbg\3\2\2\2\u01fc\u01fd\7\66\2\2"+
		"\u01fd\u01fe\5R*\2\u01fei\3\2\2\2\u01ff\u0200\7f\2\2\u0200\u0201\7\66"+
		"\2\2\u0201\u0202\5R*\2\u0202k\3\2\2\2\u0203\u0205\7\u009f\2\2\u0204\u0206"+
		"\5V,\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208m\3\2\2\2\u0209\u020a\7B\2\2\u020a\u020b\7\23\2\2"+
		"\u020b\u020c\5\u0084C\2\u020co\3\2\2\2\u020d\u020e\7m\2\2\u020e\u020f"+
		"\7\23\2\2\u020f\u0210\5\u0084C\2\u0210q\3\2\2\2\u0211\u0212\7L\2\2\u0212"+
		"\u0213\7N\2\2\u0213\u0218\5\u0090I\2\u0214\u0215\7\u00d9\2\2\u0215\u0216"+
		"\5\u0082B\2\u0216\u0217\7\u00da\2\2\u0217\u0219\3\2\2\2\u0218\u0214\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u0222\3\2\2\2\u021a\u021b\7\u009d\2\2"+
		"\u021b\u021c\7\u00d9\2\2\u021c\u021d\5t;\2\u021d\u021e\7\u00da\2\2\u021e"+
		"\u0223\3\2\2\2\u021f\u0221\58\35\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u021a\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"s\3\2\2\2\u0224\u0229\5^\60\2\u0225\u0226\7\u00d5\2\2\u0226\u0228\5^\60"+
		"\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022au\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7\u0099\2\2\u022d"+
		"\u022e\5\u0090I\2\u022e\u022f\7\u0087\2\2\u022f\u0231\5x=\2\u0230\u0232"+
		"\5l\67\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232w\3\2\2\2\u0233"+
		"\u0238\5Z.\2\u0234\u0235\7\u00d5\2\2\u0235\u0237\5Z.\2\u0236\u0234\3\2"+
		"\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"y\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\7*\2\2\u023c\u023d\7>\2\2\u023d"+
		"\u023e\5\u0090I\2\u023e\u023f\5l\67\2\u023f{\3\2\2\2\u0240\u0245\5~@\2"+
		"\u0241\u0242\7\u00d5\2\2\u0242\u0244\5~@\2\u0243\u0241\3\2\2\2\u0244\u0247"+
		"\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0251\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024d\5\u0080A\2\u0249\u024a\7\u00d5\2\2\u024a\u024c"+
		"\5\u0080A\2\u024b\u0249\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2"+
		"\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0240"+
		"\3\2\2\2\u0250\u0248\3\2\2\2\u0251}\3\2\2\2\u0252\u0253\5\u0084C\2\u0253"+
		"\177\3\2\2\2\u0254\u0255\5\u0086D\2\u0255\u0081\3\2\2\2\u0256\u025b\5"+
		"\u0084C\2\u0257\u0258\7\u00d5\2\2\u0258\u025a\5\u0084C\2\u0259\u0257\3"+
		"\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u0267\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0263\5\u0086D\2\u025f\u0260"+
		"\7\u00d5\2\2\u0260\u0262\5\u0086D\2\u0261\u025f\3\2\2\2\u0262\u0265\3"+
		"\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0267\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u0256\3\2\2\2\u0266\u025e\3\2\2\2\u0267\u0083\3\2"+
		"\2\2\u0268\u0269\5\u0092J\2\u0269\u0085\3\2\2\2\u026a\u026b\7\u00dd\2"+
		"\2\u026b\u026e\7\u00d8\2\2\u026c\u026f\5\u0084C\2\u026d\u026f\7\u00db"+
		"\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f\u0087\3\2\2\2\u0270"+
		"\u0271\5\u0092J\2\u0271\u0089\3\2\2\2\u0272\u0273\5\u0092J\2\u0273\u008b"+
		"\3\2\2\2\u0274\u0275\5\u0092J\2\u0275\u008d\3\2\2\2\u0276\u0277\7\u009c"+
		"\2\2\u0277\u0278\7\22\2\2\u0278\u008f\3\2\2\2\u0279\u027a\5\u0092J\2\u027a"+
		"\u0091\3\2\2\2\u027b\u027c\7\u00d7\2\2\u027c\u027d\7\u00dd\2\2\u027d\u0280"+
		"\7\u00d7\2\2\u027e\u0280\7\u00dd\2\2\u027f\u027b\3\2\2\2\u027f\u027e\3"+
		"\2\2\2\u0280\u0093\3\2\2\29\u0095\u009b\u00a0\u00a6\u00aa\u00b3\u00bb"+
		"\u00c2\u00d4\u00dc\u00e1\u00e6\u00ee\u00fd\u0105\u011e\u0122\u012d\u0134"+
		"\u0136\u0147\u014e\u0156\u015e\u0186\u0190\u0197\u019c\u01aa\u01b0\u01b4"+
		"\u01be\u01c3\u01c9\u01cf\u01d5\u01d8\u01df\u01ea\u01f2\u0207\u0218\u0220"+
		"\u0222\u0229\u0231\u0238\u0245\u024d\u0250\u025b\u0263\u0266\u026e\u027f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
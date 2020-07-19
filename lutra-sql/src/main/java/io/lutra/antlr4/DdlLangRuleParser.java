// Generated from C:/workspace/lutradb/lutra-sql/src/main/resources/antlr4\DdlLangRule.g4 by ANTLR 4.8
package io.lutra.antlr4;
import io.lutra.visitor.ddl.DdlLangRuleVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DdlLangRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ALL=2, ALTER=3, ALWAYS=4, ANALYZE=5, AND=6, ANY=7, AS=8, ASC=9, 
		AUTO_INCREMENT=10, BEFORE=11, BETWEEN=12, BOTH=13, BTREE=14, BY=15, CALL=16, 
		CASCADE=17, CASE=18, CAST=19, CHANGE=20, CHARACTER=21, CHECK=22, COLLATE=23, 
		COLUMN=24, CONDITION=25, CONSTRAINT=26, CONTINUE=27, CONVERT=28, CREATE=29, 
		CROSS=30, CURRENT_USER=31, CURSOR=32, DATABASE=33, DATABASES=34, DECLARE=35, 
		DEFAULT=36, DELAYED=37, DELETE=38, DESC=39, DESCRIBE=40, DETERMINISTIC=41, 
		DISTINCT=42, DISTINCTROW=43, DROP=44, EACH=45, ELSE=46, ELSEIF=47, ENCLOSED=48, 
		ESCAPED=49, EXISTS=50, EXIT=51, EXPLAIN=52, FALSE=53, FETCH=54, FOR=55, 
		FORCE=56, FOREIGN=57, FROM=58, FULLTEXT=59, GENERATED=60, GRANT=61, GROUP=62, 
		HAVING=63, HIGH_PRIORITY=64, IF=65, IGNORE=66, IN=67, INDEX=68, INFILE=69, 
		INNER=70, INOUT=71, INSERT=72, INTERVAL=73, INTO=74, IS=75, ITERATE=76, 
		JOIN=77, KEY=78, KEYS=79, KILL=80, LEADING=81, LEAVE=82, LEFT=83, LIKE=84, 
		LIMIT=85, LINEAR=86, LINES=87, LOAD=88, LOCK=89, LOOP=90, LOW_PRIORITY=91, 
		MASTER_BIND=92, MASTER_SSL_VERIFY_SERVER_CERT=93, MATCH=94, MAXVALUE=95, 
		MODIFIES=96, NATURAL=97, NOT=98, NULL=99, ON=100, OPTIMIZE=101, OPTION=102, 
		OPTIONALLY=103, OR=104, ORDER=105, OUT=106, OUTER=107, OUTFILE=108, PARTITION=109, 
		PRIMARY=110, PROCEDURE=111, PURGE=112, RANGE=113, READ=114, READS=115, 
		REFERENCES=116, REGEXP=117, RELEASE=118, RENAME=119, REPEAT=120, REPLACE=121, 
		REQUIRE=122, RESTRICT=123, RETURN=124, REVOKE=125, RIGHT=126, RLIKE=127, 
		SCHEMA=128, SCHEMAS=129, SELECT=130, SET=131, SEPARATOR=132, SHOW=133, 
		SPATIAL=134, SQL=135, TABLE=136, TERMINATED=137, THEN=138, TO=139, TRAILING=140, 
		TRIGGER=141, TRUE=142, TRUNCATE=143, UNDO=144, UNION=145, UNIQUE=146, 
		UNLOCK=147, UNSIGNED=148, UPDATE=149, USAGE=150, USE=151, USING=152, VALUES=153, 
		WHEN=154, WHERE=155, WHILE=156, WITH=157, WRITE=158, XOR=159, ZEROFILL=160, 
		MAX=161, MIN=162, COUNT=163, SUM=164, AVG=165, PERCENT=166, UNDER_LINE=167, 
		TINYINT=168, SMALLINT=169, MEDIUMINT=170, INT=171, INTEGER=172, BIGINT=173, 
		REAL=174, DOUBLE=175, PRECISION=176, FLOAT=177, DECIMAL=178, DEC=179, 
		NUMERIC=180, DATE=181, TIME=182, TIMESTAMP=183, DATETIME=184, YEAR=185, 
		CHAR=186, VARCHAR=187, NVARCHAR=188, NATIONAL=189, BINARY=190, VARBINARY=191, 
		TINYBLOB=192, BLOB=193, MEDIUMBLOB=194, LONGBLOB=195, TINYTEXT=196, TEXT=197, 
		MEDIUMTEXT=198, LONGTEXT=199, ENUM=200, VARYING=201, SERIAL=202, EQUAL=203, 
		GREATER=204, LESS=205, NEQ=206, GREATER_EQUAL=207, LESS_EQUAL=208, COMMA=209, 
		S_QUOTE=210, R_QUOTE=211, F_STOP=212, L_BRACKET=213, R_BRACKET=214, START=215, 
		NUMBER=216, ID=217, WS=218;
	public static final int
		RULE_root = 0, RULE_ddlStatement = 1, RULE_createStatement = 2, RULE_createContent = 3, 
		RULE_createTable = 4, RULE_dropStatement = 5, RULE_dropTable = 6, RULE_truncateStatement = 7, 
		RULE_truncateTable = 8, RULE_columnContent = 9, RULE_columnDefineStyle = 10, 
		RULE_columnDefParameters = 11, RULE_dataTypeContent = 12, RULE_primaryKey = 13, 
		RULE_primaryKeyContent = 14, RULE_keys = 15, RULE_foreignKeyContent = 16, 
		RULE_foreignKeyIndex = 17, RULE_foreignKeys = 18, RULE_foreignOnOpChange = 19, 
		RULE_dataType = 20, RULE_number = 21, RULE_ifExists = 22, RULE_ifNotExists = 23, 
		RULE_notNull = 24, RULE_columnName = 25, RULE_foreignKeyName = 26, RULE_referenceTableName = 27, 
		RULE_innerName = 28, RULE_usingBTree = 29, RULE_tableName = 30, RULE_variableId = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "ddlStatement", "createStatement", "createContent", "createTable", 
			"dropStatement", "dropTable", "truncateStatement", "truncateTable", "columnContent", 
			"columnDefineStyle", "columnDefParameters", "dataTypeContent", "primaryKey", 
			"primaryKeyContent", "keys", "foreignKeyContent", "foreignKeyIndex", 
			"foreignKeys", "foreignOnOpChange", "dataType", "number", "ifExists", 
			"ifNotExists", "notNull", "columnName", "foreignKeyName", "referenceTableName", 
			"innerName", "usingBTree", "tableName", "variableId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ADD'", "'ALL'", "'ALTER'", "'ALWAYS'", "'ANALYZE'", "'AND'", 
			"'ANY'", "'AS'", "'ASC'", "'AUTO_INCREMENT'", "'BEFORE'", "'BETWEEN'", 
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
			null, "ADD", "ALL", "ALTER", "ALWAYS", "ANALYZE", "AND", "ANY", "AS", 
			"ASC", "AUTO_INCREMENT", "BEFORE", "BETWEEN", "BOTH", "BTREE", "BY", 
			"CALL", "CASCADE", "CASE", "CAST", "CHANGE", "CHARACTER", "CHECK", "COLLATE", 
			"COLUMN", "CONDITION", "CONSTRAINT", "CONTINUE", "CONVERT", "CREATE", 
			"CROSS", "CURRENT_USER", "CURSOR", "DATABASE", "DATABASES", "DECLARE", 
			"DEFAULT", "DELAYED", "DELETE", "DESC", "DESCRIBE", "DETERMINISTIC", 
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
	public String getGrammarFileName() { return "DdlLangRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DdlLangRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DdlLangRuleParser.EOF, 0); }
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor) return ((DdlLangRuleVisitor<? extends T>)visitor).visitRoot(this);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE || _la==DROP || _la==TRUNCATE) {
				{
				setState(64);
				ddlStatement();
				}
			}

			setState(67);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ddlStatement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				createStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				dropStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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

	public static class CreateStatementContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(DdlLangRuleParser.L_BRACKET, 0); }
		public List<CreateContentContext> createContent() {
			return getRuleContexts(CreateContentContext.class);
		}
		public CreateContentContext createContent(int i) {
			return getRuleContext(CreateContentContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(DdlLangRuleParser.R_BRACKET, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DdlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlLangRuleParser.COMMA, i);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			createTable();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(75);
				ifNotExists();
				}
			}

			setState(78);
			tableName();
			setState(79);
			match(L_BRACKET);
			setState(80);
			createContent();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				createContent();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitCreateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContentContext createContent() throws RecognitionException {
		CreateContentContext _localctx = new CreateContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createContent);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_QUOTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				columnContent();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				primaryKeyContent();
				}
				break;
			case CONSTRAINT:
			case INDEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
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
		public TerminalNode CREATE() { return getToken(DdlLangRuleParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DdlLangRuleParser.TABLE, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(CREATE);
			setState(96);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitDropStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dropStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			dropTable();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(99);
				ifExists();
				}
			}

			setState(102);
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
		public TerminalNode DROP() { return getToken(DdlLangRuleParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(DdlLangRuleParser.TABLE, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DROP);
			setState(105);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitTruncateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStatementContext truncateStatement() throws RecognitionException {
		TruncateStatementContext _localctx = new TruncateStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			truncateTable();
			setState(108);
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
		public TerminalNode TRUNCATE() { return getToken(DdlLangRuleParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(DdlLangRuleParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(TRUNCATE);
			setState(111);
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
		public List<TerminalNode> COMMA() { return getTokens(DdlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlLangRuleParser.COMMA, i);
		}
		public ColumnContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitColumnContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContentContext columnContent() throws RecognitionException {
		ColumnContentContext _localctx = new ColumnContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			columnDefineStyle();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					columnDefineStyle();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitColumnDefineStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefineStyleContext columnDefineStyle() throws RecognitionException {
		ColumnDefineStyleContext _localctx = new ColumnDefineStyleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnDefineStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				columnName();
				setState(122);
				dataTypeContent();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AUTO_INCREMENT || _la==NOT || _la==PRIMARY) {
					{
					{
					setState(123);
					columnDefParameters();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(131); 
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
		public TerminalNode AUTO_INCREMENT() { return getToken(DdlLangRuleParser.AUTO_INCREMENT, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnDefParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitColumnDefParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefParametersContext columnDefParameters() throws RecognitionException {
		ColumnDefParametersContext _localctx = new ColumnDefParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnDefParameters);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				notNull();
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(AUTO_INCREMENT);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
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
		public TerminalNode L_BRACKET() { return getToken(DdlLangRuleParser.L_BRACKET, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DdlLangRuleParser.R_BRACKET, 0); }
		public DataTypeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitDataTypeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContentContext dataTypeContent() throws RecognitionException {
		DataTypeContentContext _localctx = new DataTypeContentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataTypeContent);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				dataType();
				setState(140);
				match(L_BRACKET);
				setState(141);
				number();
				setState(142);
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
		public TerminalNode PRIMARY() { return getToken(DdlLangRuleParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DdlLangRuleParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(PRIMARY);
			setState(147);
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
		public TerminalNode L_BRACKET() { return getToken(DdlLangRuleParser.L_BRACKET, 0); }
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DdlLangRuleParser.R_BRACKET, 0); }
		public PrimaryKeyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitPrimaryKeyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContentContext primaryKeyContent() throws RecognitionException {
		PrimaryKeyContentContext _localctx = new PrimaryKeyContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primaryKeyContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			primaryKey();
			setState(150);
			match(L_BRACKET);
			setState(151);
			keys();
			setState(152);
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
		public List<TerminalNode> COMMA() { return getTokens(DdlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlLangRuleParser.COMMA, i);
		}
		public KeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keys; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysContext keys() throws RecognitionException {
		KeysContext _localctx = new KeysContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			columnName();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				columnName();
				}
				}
				setState(161);
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
		public List<TerminalNode> COMMA() { return getTokens(DdlLangRuleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DdlLangRuleParser.COMMA, i);
		}
		public ForeignKeyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitForeignKeyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContentContext foreignKeyContent() throws RecognitionException {
		ForeignKeyContentContext _localctx = new ForeignKeyContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_foreignKeyContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			foreignKeys();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					foreignKeys();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode INDEX() { return getToken(DdlLangRuleParser.INDEX, 0); }
		public InnerNameContext innerName() {
			return getRuleContext(InnerNameContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(DdlLangRuleParser.L_BRACKET, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DdlLangRuleParser.R_BRACKET, 0); }
		public UsingBTreeContext usingBTree() {
			return getRuleContext(UsingBTreeContext.class,0);
		}
		public ForeignKeyIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitForeignKeyIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyIndexContext foreignKeyIndex() throws RecognitionException {
		ForeignKeyIndexContext _localctx = new ForeignKeyIndexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_foreignKeyIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(INDEX);
			setState(171);
			innerName();
			setState(172);
			match(L_BRACKET);
			setState(173);
			columnName();
			setState(174);
			match(R_BRACKET);
			setState(175);
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
		public TerminalNode CONSTRAINT() { return getToken(DdlLangRuleParser.CONSTRAINT, 0); }
		public InnerNameContext innerName() {
			return getRuleContext(InnerNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(DdlLangRuleParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(DdlLangRuleParser.KEY, 0); }
		public List<TerminalNode> L_BRACKET() { return getTokens(DdlLangRuleParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(DdlLangRuleParser.L_BRACKET, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(DdlLangRuleParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(DdlLangRuleParser.R_BRACKET, i);
		}
		public TerminalNode REFERENCES() { return getToken(DdlLangRuleParser.REFERENCES, 0); }
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitForeignKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeysContext foreignKeys() throws RecognitionException {
		ForeignKeysContext _localctx = new ForeignKeysContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_foreignKeys);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(CONSTRAINT);
				setState(178);
				innerName();
				setState(179);
				match(FOREIGN);
				setState(180);
				match(KEY);
				setState(181);
				match(L_BRACKET);
				setState(182);
				columnName();
				setState(183);
				match(R_BRACKET);
				setState(184);
				match(REFERENCES);
				setState(185);
				referenceTableName();
				setState(186);
				match(L_BRACKET);
				setState(187);
				foreignKeyName();
				setState(188);
				match(R_BRACKET);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(189);
					foreignOnOpChange();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
		public TerminalNode ON() { return getToken(DdlLangRuleParser.ON, 0); }
		public TerminalNode RESTRICT() { return getToken(DdlLangRuleParser.RESTRICT, 0); }
		public TerminalNode DELETE() { return getToken(DdlLangRuleParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(DdlLangRuleParser.UPDATE, 0); }
		public ForeignOnOpChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignOnOpChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitForeignOnOpChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignOnOpChangeContext foreignOnOpChange() throws RecognitionException {
		ForeignOnOpChangeContext _localctx = new ForeignOnOpChangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreignOnOpChange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ON);
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
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
		public TerminalNode TINYINT() { return getToken(DdlLangRuleParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(DdlLangRuleParser.SMALLINT, 0); }
		public TerminalNode MEDIUMINT() { return getToken(DdlLangRuleParser.MEDIUMINT, 0); }
		public TerminalNode INT() { return getToken(DdlLangRuleParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(DdlLangRuleParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(DdlLangRuleParser.BIGINT, 0); }
		public TerminalNode REAL() { return getToken(DdlLangRuleParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(DdlLangRuleParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(DdlLangRuleParser.PRECISION, 0); }
		public TerminalNode FLOAT() { return getToken(DdlLangRuleParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(DdlLangRuleParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(DdlLangRuleParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(DdlLangRuleParser.NUMERIC, 0); }
		public TerminalNode DATE() { return getToken(DdlLangRuleParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(DdlLangRuleParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DdlLangRuleParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(DdlLangRuleParser.DATETIME, 0); }
		public TerminalNode YEAR() { return getToken(DdlLangRuleParser.YEAR, 0); }
		public TerminalNode CHAR() { return getToken(DdlLangRuleParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(DdlLangRuleParser.VARCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(DdlLangRuleParser.NVARCHAR, 0); }
		public TerminalNode NATIONAL() { return getToken(DdlLangRuleParser.NATIONAL, 0); }
		public TerminalNode BINARY() { return getToken(DdlLangRuleParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(DdlLangRuleParser.VARBINARY, 0); }
		public TerminalNode TINYBLOB() { return getToken(DdlLangRuleParser.TINYBLOB, 0); }
		public TerminalNode BLOB() { return getToken(DdlLangRuleParser.BLOB, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(DdlLangRuleParser.MEDIUMBLOB, 0); }
		public TerminalNode LONGBLOB() { return getToken(DdlLangRuleParser.LONGBLOB, 0); }
		public TerminalNode TINYTEXT() { return getToken(DdlLangRuleParser.TINYTEXT, 0); }
		public TerminalNode TEXT() { return getToken(DdlLangRuleParser.TEXT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(DdlLangRuleParser.MEDIUMTEXT, 0); }
		public TerminalNode LONGTEXT() { return getToken(DdlLangRuleParser.LONGTEXT, 0); }
		public TerminalNode ENUM() { return getToken(DdlLangRuleParser.ENUM, 0); }
		public TerminalNode VARYING() { return getToken(DdlLangRuleParser.VARYING, 0); }
		public TerminalNode SERIAL() { return getToken(DdlLangRuleParser.SERIAL, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (TINYINT - 168)) | (1L << (SMALLINT - 168)) | (1L << (MEDIUMINT - 168)) | (1L << (INT - 168)) | (1L << (INTEGER - 168)) | (1L << (BIGINT - 168)) | (1L << (REAL - 168)) | (1L << (DOUBLE - 168)) | (1L << (PRECISION - 168)) | (1L << (FLOAT - 168)) | (1L << (DECIMAL - 168)) | (1L << (DEC - 168)) | (1L << (NUMERIC - 168)) | (1L << (DATE - 168)) | (1L << (TIME - 168)) | (1L << (TIMESTAMP - 168)) | (1L << (DATETIME - 168)) | (1L << (YEAR - 168)) | (1L << (CHAR - 168)) | (1L << (VARCHAR - 168)) | (1L << (NVARCHAR - 168)) | (1L << (NATIONAL - 168)) | (1L << (BINARY - 168)) | (1L << (VARBINARY - 168)) | (1L << (TINYBLOB - 168)) | (1L << (BLOB - 168)) | (1L << (MEDIUMBLOB - 168)) | (1L << (LONGBLOB - 168)) | (1L << (TINYTEXT - 168)) | (1L << (TEXT - 168)) | (1L << (MEDIUMTEXT - 168)) | (1L << (LONGTEXT - 168)) | (1L << (ENUM - 168)) | (1L << (VARYING - 168)) | (1L << (SERIAL - 168)))) != 0)) ) {
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
		public List<TerminalNode> NUMBER() { return getTokens(DdlLangRuleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DdlLangRuleParser.NUMBER, i);
		}
		public List<TerminalNode> S_QUOTE() { return getTokens(DdlLangRuleParser.S_QUOTE); }
		public TerminalNode S_QUOTE(int i) {
			return getToken(DdlLangRuleParser.S_QUOTE, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					match(NUMBER);
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case S_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					match(S_QUOTE);
					setState(210);
					match(NUMBER);
					setState(211);
					match(S_QUOTE);
					}
					}
					setState(214); 
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
		public TerminalNode IF() { return getToken(DdlLangRuleParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(DdlLangRuleParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IF);
			setState(219);
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
		public TerminalNode IF() { return getToken(DdlLangRuleParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DdlLangRuleParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DdlLangRuleParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IF);
			setState(222);
			match(NOT);
			setState(223);
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
		public TerminalNode NOT() { return getToken(DdlLangRuleParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(DdlLangRuleParser.NULL, 0); }
		public NotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitNotNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullContext notNull() throws RecognitionException {
		NotNullContext _localctx = new NotNullContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_notNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NOT);
			setState(226);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitForeignKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyNameContext foreignKeyName() throws RecognitionException {
		ForeignKeyNameContext _localctx = new ForeignKeyNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_foreignKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitReferenceTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTableNameContext referenceTableName() throws RecognitionException {
		ReferenceTableNameContext _localctx = new ReferenceTableNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_referenceTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitInnerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerNameContext innerName() throws RecognitionException {
		InnerNameContext _localctx = new InnerNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_innerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public TerminalNode USING() { return getToken(DdlLangRuleParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(DdlLangRuleParser.BTREE, 0); }
		public UsingBTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingBTree; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitUsingBTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingBTreeContext usingBTree() throws RecognitionException {
		UsingBTreeContext _localctx = new UsingBTreeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_usingBTree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(USING);
			setState(237);
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
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		public List<TerminalNode> R_QUOTE() { return getTokens(DdlLangRuleParser.R_QUOTE); }
		public TerminalNode R_QUOTE(int i) {
			return getToken(DdlLangRuleParser.R_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(DdlLangRuleParser.ID, 0); }
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DdlLangRuleVisitor ) return ((DdlLangRuleVisitor<? extends T>)visitor).visitVariableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableId);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(R_QUOTE);
				setState(242);
				match(ID);
				setState(243);
				match(R_QUOTE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00dc\u00fa\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\5\2D\n\2\3\2\3\2\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\5\4O\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\5\5`\n\5\3\6"+
		"\3\6\3\6\3\7\3\7\5\7g\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\7\13w\n\13\f\13\16\13z\13\13\3\f\3\f\3\f\7\f\177\n\f\f"+
		"\f\16\f\u0082\13\f\6\f\u0084\n\f\r\f\16\f\u0085\3\r\3\r\3\r\5\r\u008b"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0093\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00a0\n\21\f\21\16\21\u00a3\13"+
		"\21\3\22\3\22\3\22\7\22\u00a8\n\22\f\22\16\22\u00ab\13\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\24\5\24\u00c7"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\6\27\u00d0\n\27\r\27\16\27\u00d1"+
		"\3\27\3\27\3\27\6\27\u00d7\n\27\r\27\16\27\u00d8\5\27\u00db\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\5!\u00f8\n!\3!\2\2\""+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4"+
		"\4\2((\u0097\u0097\3\2\u00aa\u00cc\2\u00ef\2C\3\2\2\2\4J\3\2\2\2\6L\3"+
		"\2\2\2\b_\3\2\2\2\na\3\2\2\2\fd\3\2\2\2\16j\3\2\2\2\20m\3\2\2\2\22p\3"+
		"\2\2\2\24s\3\2\2\2\26\u0083\3\2\2\2\30\u008a\3\2\2\2\32\u0092\3\2\2\2"+
		"\34\u0094\3\2\2\2\36\u0097\3\2\2\2 \u009c\3\2\2\2\"\u00a4\3\2\2\2$\u00ac"+
		"\3\2\2\2&\u00c6\3\2\2\2(\u00c8\3\2\2\2*\u00cc\3\2\2\2,\u00da\3\2\2\2."+
		"\u00dc\3\2\2\2\60\u00df\3\2\2\2\62\u00e3\3\2\2\2\64\u00e6\3\2\2\2\66\u00e8"+
		"\3\2\2\28\u00ea\3\2\2\2:\u00ec\3\2\2\2<\u00ee\3\2\2\2>\u00f1\3\2\2\2@"+
		"\u00f7\3\2\2\2BD\5\4\3\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\2\2\3F\3\3"+
		"\2\2\2GK\5\6\4\2HK\5\f\7\2IK\5\20\t\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\5"+
		"\3\2\2\2LN\5\n\6\2MO\5\60\31\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5> \2Q"+
		"R\7\u00d7\2\2RW\5\b\5\2ST\7\u00d3\2\2TV\5\b\5\2US\3\2\2\2VY\3\2\2\2WU"+
		"\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\u00d8\2\2[\7\3\2\2\2\\`\5\24"+
		"\13\2]`\5\36\20\2^`\5\"\22\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2"+
		"ab\7\37\2\2bc\7\u008a\2\2c\13\3\2\2\2df\5\16\b\2eg\5.\30\2fe\3\2\2\2f"+
		"g\3\2\2\2gh\3\2\2\2hi\5> \2i\r\3\2\2\2jk\7.\2\2kl\7\u008a\2\2l\17\3\2"+
		"\2\2mn\5\22\n\2no\5> \2o\21\3\2\2\2pq\7\u0091\2\2qr\7\u008a\2\2r\23\3"+
		"\2\2\2sx\5\26\f\2tu\7\u00d3\2\2uw\5\26\f\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y\25\3\2\2\2zx\3\2\2\2{|\5\64\33\2|\u0080\5\32\16\2}\177\5"+
		"\30\r\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083{\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\27\3\2\2\2\u0087"+
		"\u008b\5\62\32\2\u0088\u008b\7\f\2\2\u0089\u008b\5\34\17\2\u008a\u0087"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\31\3\2\2\2\u008c"+
		"\u0093\5*\26\2\u008d\u008e\5*\26\2\u008e\u008f\7\u00d7\2\2\u008f\u0090"+
		"\5,\27\2\u0090\u0091\7\u00d8\2\2\u0091\u0093\3\2\2\2\u0092\u008c\3\2\2"+
		"\2\u0092\u008d\3\2\2\2\u0093\33\3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7P\2\2\u0096\35\3\2\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\u00d7\2\2"+
		"\u0099\u009a\5 \21\2\u009a\u009b\7\u00d8\2\2\u009b\37\3\2\2\2\u009c\u00a1"+
		"\5\64\33\2\u009d\u009e\7\u00d3\2\2\u009e\u00a0\5\64\33\2\u009f\u009d\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"!\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a9\5&\24\2\u00a5\u00a6\7\u00d3"+
		"\2\2\u00a6\u00a8\5&\24\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa#\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00ad\7F\2\2\u00ad\u00ae\5:\36\2\u00ae\u00af\7\u00d7\2\2\u00af"+
		"\u00b0\5\64\33\2\u00b0\u00b1\7\u00d8\2\2\u00b1\u00b2\5<\37\2\u00b2%\3"+
		"\2\2\2\u00b3\u00b4\7\34\2\2\u00b4\u00b5\5:\36\2\u00b5\u00b6\7;\2\2\u00b6"+
		"\u00b7\7P\2\2\u00b7\u00b8\7\u00d7\2\2\u00b8\u00b9\5\64\33\2\u00b9\u00ba"+
		"\7\u00d8\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\58\35\2\u00bc\u00bd\7\u00d7"+
		"\2\2\u00bd\u00be\5\66\34\2\u00be\u00c2\7\u00d8\2\2\u00bf\u00c1\5(\25\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5$\23\2\u00c6"+
		"\u00b3\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\7f\2\2"+
		"\u00c9\u00ca\t\2\2\2\u00ca\u00cb\7}\2\2\u00cb)\3\2\2\2\u00cc\u00cd\t\3"+
		"\2\2\u00cd+\3\2\2\2\u00ce\u00d0\7\u00da\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00db\3\2"+
		"\2\2\u00d3\u00d4\7\u00d4\2\2\u00d4\u00d5\7\u00da\2\2\u00d5\u00d7\7\u00d4"+
		"\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00cf\3\2\2\2\u00da\u00d6\3\2"+
		"\2\2\u00db-\3\2\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7\64\2\2\u00de/\3\2"+
		"\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7d\2\2\u00e1\u00e2\7\64\2\2\u00e2"+
		"\61\3\2\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7e\2\2\u00e5\63\3\2\2\2\u00e6"+
		"\u00e7\5@!\2\u00e7\65\3\2\2\2\u00e8\u00e9\5@!\2\u00e9\67\3\2\2\2\u00ea"+
		"\u00eb\5@!\2\u00eb9\3\2\2\2\u00ec\u00ed\5@!\2\u00ed;\3\2\2\2\u00ee\u00ef"+
		"\7\u009a\2\2\u00ef\u00f0\7\20\2\2\u00f0=\3\2\2\2\u00f1\u00f2\5@!\2\u00f2"+
		"?\3\2\2\2\u00f3\u00f4\7\u00d5\2\2\u00f4\u00f5\7\u00db\2\2\u00f5\u00f8"+
		"\7\u00d5\2\2\u00f6\u00f8\7\u00db\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f8A\3\2\2\2\25CJNW_fx\u0080\u0085\u008a\u0092\u00a1\u00a9\u00c2"+
		"\u00c6\u00d1\u00d8\u00da\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package io.lutra.antlr;

import io.lutra.antlr.handlers.GenerateCreateExecutorPlanHandler;
import io.lutra.antlr.handlers.ParseCreateHandler;
import io.lutra.antlr.handlers.VerifyCreateHandler;
import io.lutra.sql.SqlExecutePlan;
import io.lutra.sql.SqlPipeline;
import io.lutra.sql.SqlWrapper;
import io.lutra.sql.spi.SqlExecutorPlanGenerator;

public class SqlExecutorPlanGeneratorImpl implements SqlExecutorPlanGenerator {
    @Override
    public SqlExecutePlan genExecutorPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getLangType()){
            case DDL:
                return genDDlExecutorPlan(sqlWrapper);
            case DML:
                return genDMlExecutorPlan(sqlWrapper);
            case DCL:
                return genDClExecutorPlan(sqlWrapper);
            case TCL:
                return genTClExecutorPlan(sqlWrapper);
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutePlan genDDlExecutorPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getStatementType()){
            case CREATE:
                return genCreateExecutorPlan(sqlWrapper.getSourceSql());
            case DROP:
                return null;
            case ALTER:
                return null;
            case RENAME:
                return null;
            case TRUNCATE:
                return null;
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutePlan genDMlExecutorPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getStatementType()){
            case SELECT:
                return null;
            case INSERT:
                return null;
            case UPDATE:
                return null;
            case DELETE:
                return null;
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutePlan genDClExecutorPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getStatementType()){
            case GRANT:
                return null;
            case REVOKE:
                return null;
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutePlan genTClExecutorPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getStatementType()){
            case COMMIT:
                return null;
            case SAVEPOINT:
                return null;
            case ROLLBACK:
                return null;
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutePlan genCreateExecutorPlan(String sql){
        SqlPipeline<String,SqlExecutePlan> pipeline = new StatementProcessPipeline<>(new ParseCreateHandler())
                .addHandler(new GenerateCreateExecutorPlanHandler());
        return pipeline.execute(sql);
    }
}

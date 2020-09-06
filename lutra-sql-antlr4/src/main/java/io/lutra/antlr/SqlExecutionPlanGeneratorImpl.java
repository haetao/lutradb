package io.lutra.antlr;

import io.lutra.antlr.handlers.CreateParsingConverter;
import io.lutra.antlr.handlers.CreateVerifyConverter;
import io.lutra.common.LutraChain;
import io.lutra.common.converter.ConverterChain;
import io.lutra.sql.SqlExecutionPlan;
import io.lutra.sql.SqlWrapper;
import io.lutra.sql.spi.SqlExecutionPlanGenerator;

public class SqlExecutionPlanGeneratorImpl implements SqlExecutionPlanGenerator {
    @Override
    public SqlExecutionPlan genExecutionPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getLangType()){
            case DDL:
                return genDDlExecutionPlan(sqlWrapper);
            case DML:
                return genDMlExecutionPlan(sqlWrapper);
            case DCL:
                return genDClExecutionPlan(sqlWrapper);
            case TCL:
                return genTClExecutionPlan(sqlWrapper);
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutionPlan genDDlExecutionPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getStatementType()){
            case CREATE:
                return genCreateExecutionPlan(sqlWrapper.getSourceSql());
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

    private SqlExecutionPlan genDMlExecutionPlan(SqlWrapper sqlWrapper) throws Exception {
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

    private SqlExecutionPlan genDClExecutionPlan(SqlWrapper sqlWrapper) throws Exception {
        switch (sqlWrapper.getStatementType()){
            case GRANT:
                return null;
            case REVOKE:
                return null;
            default:
                throw new Exception();//抛找不到解析异常
        }
    }

    private SqlExecutionPlan genTClExecutionPlan(SqlWrapper sqlWrapper) throws Exception {
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

    private SqlExecutionPlan genCreateExecutionPlan(String sql){
        ConverterChain<String,SqlExecutionPlan> planConverterChain = LutraChain.newConverterChain(new CreateParsingConverter())
                .addConverter(new CreateVerifyConverter());

        return planConverterChain.submit(sql);
    }
}

package io.lutra.sql.spi;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.ServiceLoader;

public class PipelinesRegistry {

    private final static ServiceLoader<SqlExecutorPlanGenerator> serviceLoader = ServiceLoader.load(SqlExecutorPlanGenerator.class);

    private final static Map<String,SqlExecutorPlanGenerator> registeredPipelines = Maps.newConcurrentMap();

    static {
        for(SqlExecutorPlanGenerator each : serviceLoader){
            registeredPipelines.put(each.getClass().getName(),each);
        }
    }

}

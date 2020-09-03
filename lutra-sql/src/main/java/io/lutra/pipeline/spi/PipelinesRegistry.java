package io.lutra.pipeline.spi;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.ServiceLoader;

public class PipelinesRegistry {

    private final static ServiceLoader<SqlExecutionPlanGenerator> serviceLoader = ServiceLoader.load(SqlExecutionPlanGenerator.class);

    private final static Map<String,SqlExecutionPlanGenerator> registeredPipelines = Maps.newConcurrentMap();

    static {
        for(SqlExecutionPlanGenerator each : serviceLoader){
            registeredPipelines.put(each.getClass().getName(),each);
        }
    }

}

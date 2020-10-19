package io.lutra.common;


import io.lutra.common.filter.Filter;
import io.lutra.common.filter.FilterChain;
import io.lutra.common.pipeline.PipelineContext;
import io.lutra.common.pipeline.PipelineHandler;

public class App {
    public static void main(String[] args) {
        Pipeline<String> pipeline = new Pipeline<>(new MyHandler1())
                .addLast(new MyHandler2())
                .addLast(new MyHandler3());
        System.out.println(pipeline.doHandle("abcdef"));
        FilterChain<String> filterChain = LutraChain.newFilterChain((Filter<String>) obj -> null)
                .addFilterToLast(obj -> null)
                .addFilterToLast(obj -> null);

    }

    static class MyHandler1 implements PipelineHandler<String> {

        @Override
        public Object handle(PipelineContext pipelineContext, String obj) {
            System.out.println("MyHandler1 --> abc");
            if(obj.startsWith("abc")){
                return "abc";
            }
            return pipelineContext.transmit(obj);
        }
    }

    static class MyHandler2 implements PipelineHandler<String> {

        @Override
        public Object handle(PipelineContext pipelineContext, String obj) {
            System.out.println("MyHandler2 --> def");
            if(obj.startsWith("def")){
                return "def";
            }
            return pipelineContext.transmit(obj);
        }
    }

    static class MyHandler3 implements PipelineHandler<String> {

        @Override
        public Object handle(PipelineContext pipelineContext, String obj) {
            System.out.println("MyHandler3 --> ijk");
            if(obj.startsWith("ijk")){
                return "ijk";
            }
            return pipelineContext.transmit(obj);
        }
    }
}

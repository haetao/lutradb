package io.lutra.common.compiler;

public interface Compiler {
    Class<?> doCompile(String fullClassName, String sourceCode) throws Throwable;
}

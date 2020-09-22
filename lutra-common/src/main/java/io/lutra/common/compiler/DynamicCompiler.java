package io.lutra.common.compiler;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicCompiler implements Compiler {

    private JavaCompiler compiler;

    private DynamicClassLoader dynamicClassLoader;

    public DynamicCompiler() {
        compiler = ToolProvider.getSystemJavaCompiler();
        dynamicClassLoader = new DynamicClassLoader(Thread.currentThread().getContextClassLoader());
    }

    @Override
    public Class<?> doCompile(String fullClassName, String sourceCode) throws Throwable {
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
        ClassFileManager fileManager = new ClassFileManager(compiler.getStandardFileManager(diagnostics, null, null));
        List<JavaFileObject> javaObjectList = Collections.singletonList(new StringSourceJavaObject(fullClassName, sourceCode));
        List<String> options = new ArrayList<String>();
        options.add("-encoding");
        options.add("utf-8");
        options.add("-classpath");
        options.add(System.getProperty("java.class.path"));
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, options, null, javaObjectList);
        boolean symbol = task.call();
        if(symbol){
            JavaClassObject object = fileManager.getJavaClassObject();
            return dynamicClassLoader.loadClass(fullClassName,object);
        }else {
            String error = "";
            for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
                error += new ErrorPrintor().print(diagnostic);
            }
            throw new Exception(error);
        }
    }

    class StringSourceJavaObject extends SimpleJavaFileObject {
        private String content;
        protected StringSourceJavaObject(String name, String content) {
            super(URI.create("string:///" + name.replace('.', '/') + Kind.SOURCE.extension), Kind.SOURCE);
            this.content = content;
        }

        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return content;
        }
    }

    class ClassFileManager extends ForwardingJavaFileManager{

        private JavaClassObject javaClassObject;

        protected ClassFileManager(StandardJavaFileManager fileManager) {
            super(fileManager);
        }

        @Override
        public JavaFileObject getJavaFileForOutput(Location location, String className, JavaFileObject.Kind kind, FileObject sibling)
                throws IOException {
            if (javaClassObject == null)
                javaClassObject = new JavaClassObject(className, kind);
            return javaClassObject;
        }

        public JavaClassObject getJavaClassObject() {
            return javaClassObject;
        }
    }

    final class JavaClassObject extends SimpleJavaFileObject{

        protected final ByteArrayOutputStream bos = new ByteArrayOutputStream();

        public JavaClassObject(String name, Kind kind) {
            super(URI.create("string:///" + name.replace('.', '/') + kind.extension), kind);
        }

        public byte[] getBytes() {
            return bos.toByteArray();
        }

        @Override
        public OutputStream openOutputStream() throws IOException {
            return bos;
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            bos.close();
        }
    }

    final class DynamicClassLoader extends URLClassLoader {
        public DynamicClassLoader(ClassLoader parent) {
            super(new URL[0], parent);
        }

        public Class findClassByClassName(String className) throws ClassNotFoundException {
            return this.findClass(className);
        }

        public Class loadClass(String fullName, JavaClassObject jco) {
            byte[] classData = jco.getBytes();
            return this.defineClass(fullName, classData, 0, classData.length);
        }
    }

    final class ErrorPrintor{
        public String print(Diagnostic diagnostic){
            StringBuffer res = new StringBuffer();
            res.append("Code:[" + diagnostic.getCode() + "]\n");
            res.append("Kind:[" + diagnostic.getKind() + "]\n");
            res.append("Position:[" + diagnostic.getPosition() + "]\n");
            res.append("Start Position:[" + diagnostic.getStartPosition() + "]\n");
            res.append("End Position:[" + diagnostic.getEndPosition() + "]\n");
            res.append("Source:[" + diagnostic.getSource() + "]\n");
            res.append("Message:[" + diagnostic.getMessage(null) + "]\n");
            res.append("LineNumber:[" + diagnostic.getLineNumber() + "]\n");
            res.append("ColumnNumber:[" + diagnostic.getColumnNumber() + "]\n");
            return res.toString();
        }
    }
}

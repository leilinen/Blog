package com.java.compile;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/***
 * 代码动态变异
 */
public class DynamicCompiler {

    public static void compile(String code) {

        // ToolProvider 类似于一个工具箱
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> collector = new DiagnosticCollector<>();
        JavaFileManager javaFileManager = compiler.getStandardFileManager(collector,
                null,
                null);
        List<String> options = new ArrayList<>();
        String className = "";
        JavaFileObject javaFileObject = new MyJavaFileObject(className, code);

        boolean result = compiler.getTask(null,
                javaFileManager,
                collector,
                options,
                null,
                Arrays.asList(javaFileObject)).call();

    }

    public static void main(String[] args) {

    }
}


class MyJavaFileObject extends SimpleJavaFileObject {
    private String source;
    private ByteArrayOutputStream outputStream;

    public MyJavaFileObject(String name, String source) {
        super(URI.create("String:///" + name + Kind.SOURCE.extension), Kind.SOURCE);
        this.source = source;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        if (source == null) {
            throw  new IllegalArgumentException("source == null");
        }
        return source;
    }

    @Override
    public OutputStream openOutputStream() {
        outputStream = new ByteArrayOutputStream();
        return outputStream;
    }
}

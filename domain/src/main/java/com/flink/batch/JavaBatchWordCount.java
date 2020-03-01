package com.flink.batch;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.java.BatchTableEnvironment;
import org.apache.flink.table.descriptors.FileSystem;
import org.apache.flink.table.descriptors.OldCsv;
import org.apache.flink.table.descriptors.Schema;
import org.apache.flink.types.Row;



public class JavaBatchWordCount {

    public static void main(String[] args) throws Exception {

        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        BatchTableEnvironment tEnv = BatchTableEnvironment.create(env);

        String path = "/Users/lilin/Documents/code/BDS/data/Job_description";
        tEnv.connect(new FileSystem().path(path))
                .withFormat(new OldCsv().field("word", Types.STRING)
                .lineDelimiter("\n"))
                .withSchema(new Schema().field("word", Types.STRING))
                .registerTableSource("fileSource");
        Table result = tEnv.scan("fileSource")
                .groupBy("word").select("word, count(1) as count");
        tEnv.toDataSet(result, Row.class).print();

       // env.execute();
    }
}

/***
 * Error:(24, 28) java: 无法访问org.apache.flink.table.descriptors.Descriptor
 *   找不到org.apache.flink.table.descriptors.Descriptor的类文件
 *
 *   应该是依赖问题

 ***/
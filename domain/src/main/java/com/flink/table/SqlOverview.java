package com.flink.table;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.flink.table.sources.CsvTableSource;

import java.util.List;

public class SqlOverview {

    private static List<List<List<String>>> customer_data;
    private static List<List<List<List<String>>>> order_data;


    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);

        // register table

        // TableSource source = new CsvTableSource("/", );

        // create a table from a table api query

        // create a table from a sql query


    }
}



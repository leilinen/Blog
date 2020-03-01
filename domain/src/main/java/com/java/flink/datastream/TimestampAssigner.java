package com.java.flink.datastream;

import org.apache.flink.api.common.io.FilePathFilter;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.FileProcessingMode;

public class TimestampAssigner {

    public static void main(String[] args) {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
//
//        DataStream<MyEvent> stream = env.readFile(myFormat,
//                myFilePath,
//                FileProcessingMode.PROCESS_CONTINUOUSLY,
//                100, FilePathFilter.createDefaultFilter(), typeInfo);
//        DataStream<MyEvent> withTimestampsAndWatermarks = stream
//                .filter(event -> event.severity() == WARNING)
//                .assignTimestampsAndWatermarks(new)
    }
}

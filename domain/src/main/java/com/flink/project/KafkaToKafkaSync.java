package com.flink.project;

import com.flink.util.KafkaPropertiesUtil;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;

import java.util.Properties;

/***
 * 从kafka中消费数据，然后再写入到kafka中，查看现象
 */

public class KafkaToKafkaSync {

    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.enableCheckpointing(5000);
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);

        Properties pros = KafkaPropertiesUtil.getProperties();
        // 消费kafka
        DataStreamSource<String> source = env.addSource(new FlinkKafkaConsumer<>(pros));



    }
}

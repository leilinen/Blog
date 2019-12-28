package com.flink.util;

import com.alibaba.fastjson.JSON;
import com.bean.Student;

import java.util.Properties;

public class KafkaUtil {

    /*
    public static final String broker_list = "localhost:9092";
    public static final String topic = "student";

    public static void writeToKafka() throws InterruptedException {
        Properties props = new Properties();
        props.put("bootstrap.servers", broker_list);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer produer = new KafkaProducer<String, String>(props);

        for (int i=1; i<=100; i++) {
            Student student = new Student(1, "leiline" + i, "password" + i, 18 +i);
            ProducerRecord record = new ProducerRecord(topic, null, null, JSON.toJSONString(student));
            produer.send(record);
            System.out.println("发送数据： " + JSON.toJSONString(student));
        }

        // flush

     */
    //}
}

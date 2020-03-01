package com.flink.util;

import java.util.Properties;

public class KafkaPropertiesUtil {

    private static final String bootstrapServers = "localhost:9092";

    private static final String zookeeperConnection = "localhost:2181";

    private static final String groupId = "metric-group";

    private static final String keyDeserializer = "org.apache.kafka.common.serialization.StringDeserializer";

    private static final String valueDeserializer = "org.apache.kafka.common.serialization.StringDeserializer";

    private static final String reset = "latest";

    public static Properties getProperties() {
        Properties props = new Properties();
        props.put("bootstrap.servers", bootstrapServers);
        props.put("zookeeper.connect", zookeeperConnection);
        props.put("group.id", groupId);
        props.put("key.deserializer", keyDeserializer);
        props.put("value.deserializer", valueDeserializer);
        props.put("auto.offset.reset", reset);
        return props;
    }
}

package com.lixuemin.kafka;

import com.google.gson.Gson;
import java.util.Properties;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 **/
public class KafkaProducerAnalysis {
    private static final String brokerList = "localhost:9092";
    private static final String TOPIC = "quickstart-events";
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerAnalysis.class);

    private static Properties initConfig() {
        Properties props = new Properties();
        //props.put("bootstrap.servers", "127.0.0.1:9092");
        //props.put("acks", "all");
        //props.put("retries", 0);
        //props.put("linger.ms", 1);
        //props.put("key.serializer", StringSerializer.class.getName());
        //props.put("value.serializer", StringSerializer.class.getName());
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return props;
    }

    public static void main(String[] args) {
        Properties props = initConfig();
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
        try {
            producer.send(new ProducerRecord<String, String>(TOPIC, "send from idea"));
            producer.send(new ProducerRecord<String, String>(TOPIC, "send from idea with callback"), new Callback() {
                @Override
                public void onCompletion(RecordMetadata metadata, Exception exception) {
                    if(exception != null) {
                        exception.printStackTrace();
                    }else {
                        Gson gson = new Gson();
                        System.out.println(gson.toJson(metadata));
                    }
                }
            });
        } catch (Exception e) {
            LOGGER.error("send message error", e);
        } finally {
            producer.close();
        }
    }
}

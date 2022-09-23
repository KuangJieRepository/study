package example.producer;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.Test;

import java.util.Properties;

/**
 * @Author: kj
 * @Date: 2022/09/21/10:59
 */
public class Producer1 {

    @Test
    public void t1() {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "82.156.4.150:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
        kafkaProducer.send(new ProducerRecord<>("first", "hello t1"));
        kafkaProducer.close();
    }

    @Test
    public void t2() {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "82.156.4.150:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
        for (int i = 1; i <= 10; i++) {
            kafkaProducer.send(new ProducerRecord<>("first", "hello t2---" + i), new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    if (e == null) {
                        System.out.println(recordMetadata.topic());
                        System.out.println(recordMetadata.partition());
                    }
                }
            });
        }
        kafkaProducer.close();
    }

    @Test
    public void t3() {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "82.156.4.150:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
        for (int i = 1; i <= 5; i++) {
            kafkaProducer.send(new ProducerRecord<>("first", 1, "", "hello t2---" + i), new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    if (e == null) {
                        System.out.println(recordMetadata.topic());
                        System.out.println(recordMetadata.partition());
                    }
                }
            });
        }
        for (int i = 6; i <= 10; i++) {
            kafkaProducer.send(new ProducerRecord<>("first", 2, "", "hello t2---" + i), new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                    if (e == null) {
                        System.out.println(recordMetadata.topic());
                        System.out.println(recordMetadata.partition());
                    }
                }
            });
        }
        kafkaProducer.close();
    }
}

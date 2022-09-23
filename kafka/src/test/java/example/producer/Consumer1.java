package example.producer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.junit.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

/**
 * @Author: kj
 * @Date: 2022/09/21/15:43
 */
public class Consumer1 {

    // 订阅主题消费
    @Test
    public void c_topic() {

        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "82.156.4.150:9092");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "first");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
        KafkaConsumer<String, String> kafkaConsumer2 = new KafkaConsumer<>(properties);

//        ArrayList<String> topics = new ArrayList<>();
//        topics.add("first");
//        kafkaConsumer.subscribe(topics);

        ArrayList<TopicPartition> partitions = new ArrayList<>();
        partitions.add(new TopicPartition("first",1));
        kafkaConsumer.assign(partitions);
        ArrayList<TopicPartition> partitions2 = new ArrayList<>();
        partitions2.add(new TopicPartition("first",2));
        kafkaConsumer2.assign(partitions2);

        new Thread(() -> {
            while (true) {
                ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofSeconds(1));
                records.forEach(System.out::println);
                Thread.yield();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                ConsumerRecords<String, String> records2 = kafkaConsumer2.poll(Duration.ofSeconds(1));
                records2.forEach(System.out::println);
                Thread.yield();
            }
        }).start();

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

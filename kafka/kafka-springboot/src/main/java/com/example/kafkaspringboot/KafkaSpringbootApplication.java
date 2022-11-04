package com.example.kafkaspringboot;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class KafkaSpringbootApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringbootApplication.class, args);
    }

    //    @Bean
    public AdminClient adminClient() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "8.141.145.51:9092,82.156.4.150:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return AdminClient.create(properties);
    }

    @Bean
    public AdminClient kafkaAdminClient() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "8.141.145.51:9092,82.156.4.150:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return KafkaAdminClient.create(properties);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("spring boot 启动后，干的事情");
    }
}

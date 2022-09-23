package com.example.kafkaspringboot.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: kj
 * @Date: 2022/09/22/9:53
 */
@RestController
public class KafkaTest {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("send")
    public void send() {
        kafkaTemplate.send("first", 0, "", "partition 0");
    }

    //    需要设置ack mode
    @KafkaListener(topicPartitions = {@TopicPartition(topic = "first", partitions = "0")}, groupId = "first")
    public void listener(ConsumerRecord record, Acknowledgment ack) {
        /*
        如果想确保消息不重复消费，需要自己保存offset，确保唯一不重复，结合 mysql 介质的事务
         */
        System.out.println(record.offset());
        System.out.println(record.topic());
        System.out.println(record.partition());
        System.out.println(record.value());
        ack.acknowledge();
    }
}

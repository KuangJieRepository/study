package com.example.kafkaspringboot.controller;

import org.apache.kafka.clients.admin.*;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.internals.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: kj
 * @Date: 2022/09/22/9:53
 */
@RestController
public class KafkaTest {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;
    //    @Resource
    private AdminClient adminClient;
    @Resource
    KafkaAdminClient kafkaAdminClient;

    @RequestMapping("send")
    public void send() {
        kafkaTemplate.send("first", 0, "", "partition 11");
    }

    @RequestMapping("send2")
    public void send2() {
        kafkaTemplate.send("first", 0, "", "partition 22");
    }

    @RequestMapping("adminClient")
    public void adminClient() throws ExecutionException, InterruptedException {
        ListTopicsResult listTopics = adminClient.listTopics();
        for (String s : listTopics.names().get()) {
            System.out.println(s);
        }
    }

    @RequestMapping("kafkaAdmin")
    public void kafkaAdmin() throws ExecutionException, InterruptedException {
        ListTopicsResult listTopics = kafkaAdminClient.listTopics();
        for (String s : listTopics.names().get()) {
            System.out.println(s);
        }
    }

    @RequestMapping("kafkaAdminCreate")
    public void kafkaAdminCreate() {
        List<NewTopic> list = new ArrayList<>();
        list.add(new NewTopic("newTopic", 2, (short) 2));
        kafkaAdminClient.createTopics(list);
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


    @RequestMapping("sendErrorLog")
    public void sendErrorLog() {
        int i = 10 / 0;
//        try {
//            int i = 10 / 0;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            System.out.println(e.getLocalizedMessage());
//        }
    }

    @KafkaListener(topics = "newTopic", groupId = "listenerLog")
    public void listenerLog(String log) {
        System.out.println(log);
    }

    // 只要字符串
    @RequestMapping("regexTest")
    public void regexTest() {
        String str = "k9j4c38y3287y87";
        String regex = "\\D*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
//        String s = matcher.replaceAll("");
//        System.out.println(s);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("No match found");
        }
    }

}

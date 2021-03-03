package com.example.kafka_example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducer {

    private static final String TOPIC = "user";

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String message){
        log.info("Producer sending the message -> " + message);
        kafkaTemplate.send(TOPIC, message);
    }

}

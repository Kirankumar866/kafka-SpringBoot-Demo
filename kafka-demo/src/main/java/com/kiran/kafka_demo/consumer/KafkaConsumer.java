package com.kiran.kafka_demo.consumer;

import com.kiran.kafka_demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "firstTopic",groupId = "myGroup")
    public void consumeMessage(String msg){
        log.info(format("Consuming the message from firstTopic :: %s", msg));
    }

    @KafkaListener(topics = "firstTopic",groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info(format("Consuming the message from firstTopic :: %s", student.toString()));
    }
}


package com.example.kafka.handler;

import com.example.kafka.kafkaService.ServiceKafka;
import com.example.kafka.message.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import lombok.*;

import java.io.IOException;

//@Slf4j
@Component
@RequiredArgsConstructor
public class HandlerKafka {

    @Autowired
    private ServiceKafka serviceKafka;

    @KafkaListener(
            id = "consumer-java-1",
            topics = "consumer-java",
            groupId = "consumer-group-java",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void listen(Message payload) throws IOException, InterruptedException {
        serviceKafka.process(payload);
    }

}
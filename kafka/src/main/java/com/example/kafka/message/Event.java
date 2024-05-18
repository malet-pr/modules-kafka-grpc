package com.example.kafka.message;

import com.example.kafka.message.messageOrder.KafkaOrder;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event{
    private KafkaOrder kafkaOrder;
}
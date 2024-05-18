package com.example.kafka.message.messageOrder;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct{
    private String name;
    private String type;
    private String description;
}
package com.example.kafka.message.messageOrder;

import java.util.Date;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderNote{
    private String text;
    private Date date;
}
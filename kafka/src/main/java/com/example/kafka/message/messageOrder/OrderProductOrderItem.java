package com.example.kafka.message.messageOrder;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductOrderItem{
    private OrderProduct product;
    private Integer quantity;
    private String size;
    private String flavor;
}
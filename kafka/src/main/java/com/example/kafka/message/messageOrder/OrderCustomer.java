package com.example.kafka.message.messageOrder;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderCustomer{
    private String accountId;
    private String identification;
    private String identificationType;
}
package com.example.kafka.message.messageOrder;

import java.util.List;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KafkaOrder {

    private String priority;
    private Date creationDate;
    private Date lastUpdate;
    private String status;
    private OrderCustomer customer;
    private List<OrderProductOrderItem> productOrderItem;
    private List<OrderNote> notes;
    private DeliveryAddress deliveryAddress;
    private ContactPhoneNumber contactPhone;

}

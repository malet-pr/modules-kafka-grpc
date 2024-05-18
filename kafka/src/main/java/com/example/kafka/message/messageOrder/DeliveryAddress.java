package com.example.kafka.message.messageOrder;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAddress {
    private String postCode;
    private String country;
    private String stateOrProvince;
    private String city;
    private String streetName;
    private String streetNumber;
    private String floorNumber;
    private String doorNumber;
}
package com.example.kafka.message.messageOrder;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactPhoneNumber {

    private String countryCode;
    private String areaCode;
    private String number;
    private String ext;

}

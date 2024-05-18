package com.example.persistence.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="PhoneNumber")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    @Id
    @GeneratedValue
    private UUID phoneNumberId;
    private String countryCode;
    private String areaCode;
    private String number;
    private String ext;
}

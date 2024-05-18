package com.example.persistence.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="ADDRESS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private UUID addressId;
    private String postCode;
    private String country;
    private String stateOrProvince;
    private String city;
    private String streetName;
    private String streetNumber;
    private String floorNumber;
    private String doorNumber;
}
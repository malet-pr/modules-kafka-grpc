package com.example.persistence.model;

import java.util.ArrayList;
import java.util.UUID;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="CUSTOMER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer{

    @Id
    @GeneratedValue
    private UUID customerId;
    private String type;
    private String priority;
    private String identification;
    private String identificationType;
    private String lastName;
    private String firstName;
    private String accountId;
    private String emailAddress;
    @OneToMany
    @JoinTable(name="CUSTOMER_ADDRESS", 
            joinColumns=@JoinColumn(name="adddressId", referencedColumnName="customerId"),
            inverseJoinColumns=@JoinColumn(name="customerId"))
    private ArrayList<PhoneNumber> phones;
    @OneToMany
    @JoinTable(name="CUSTOMER_PHONE_NUMBER", 
            joinColumns=@JoinColumn(name="phoneNumberId", referencedColumnName="customerId"),
            inverseJoinColumns=@JoinColumn(name="customerId"))
    private ArrayList<Address> addresses;

}
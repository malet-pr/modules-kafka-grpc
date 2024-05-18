package com.example.persistence.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="CUSTOMER_ORDER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private UUID orderId;
    private String priority;
    private Date creationDate;
    private Date lastUpdate;
    private String status;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    @OneToMany
    @JoinTable(name="ORDER_PRODUCT_ORDER_ITEM", 
            joinColumns=@JoinColumn(name="productOrderItemId", referencedColumnName="orderId"),
            inverseJoinColumns=@JoinColumn(name="orderId"))
    private ArrayList<ProductOrderItem> productOrderItem;
    @OneToMany
    @JoinTable(name="ORDER_NOTE", 
            joinColumns=@JoinColumn(name="noteId", referencedColumnName="orderId"),
            inverseJoinColumns=@JoinColumn(name="orderId"))
    private ArrayList<Note> notes;
    @ManyToOne
    @JoinColumn(name = "addressId")
    private Address deliveryAddress;
    @ManyToOne
    @JoinColumn(name = "phoneNumberId")
    private PhoneNumber contactPhone;

}




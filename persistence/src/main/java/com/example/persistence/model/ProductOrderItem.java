package com.example.persistence.model;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="PRODUCT_ORDER_ITEM")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrderItem{
    
    @Id
    @GeneratedValue
    private UUID productOrderItemId;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Product product;
    private Integer quantity;
    private String size;
    private String flavor;

}
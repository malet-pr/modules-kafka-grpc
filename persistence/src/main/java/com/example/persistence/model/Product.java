package com.example.persistence.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="PRODUCT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product{
    
    @Id
    @GeneratedValue
    private UUID productId;
    private String name;
    private String type;
    private String description;

}
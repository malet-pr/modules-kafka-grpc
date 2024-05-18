package com.example.persistence.repository;

import java.util.UUID;

import com.example.persistence.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,UUID>{
    
}

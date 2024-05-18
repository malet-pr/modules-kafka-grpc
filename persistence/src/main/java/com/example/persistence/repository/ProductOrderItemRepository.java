package com.example.persistence.repository;

import java.util.UUID;
import com.example.persistence.model.ProductOrderItem;
import org.springframework.data.repository.CrudRepository;


public interface ProductOrderItemRepository extends CrudRepository<ProductOrderItem,UUID>{

}
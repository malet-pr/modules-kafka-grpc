package com.example.persistence.repository;

import java.util.UUID;
import com.example.persistence.model.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order,UUID>{

}

package com.example.persistence.repository;

import java.util.UUID;

import com.example.persistence.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer,UUID>  {

    //boolean findByAccountId(String string);

}

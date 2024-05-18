package com.example.persistence.repository;

import java.util.UUID;

import com.example.persistence.model.Address;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<Address,UUID>  {
}

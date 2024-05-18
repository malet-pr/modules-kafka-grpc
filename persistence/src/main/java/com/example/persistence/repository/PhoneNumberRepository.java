package com.example.persistence.repository;

import java.util.UUID;
import com.example.persistence.model.PhoneNumber;
import org.springframework.data.repository.CrudRepository;


public interface PhoneNumberRepository extends CrudRepository<PhoneNumber,UUID> {

}

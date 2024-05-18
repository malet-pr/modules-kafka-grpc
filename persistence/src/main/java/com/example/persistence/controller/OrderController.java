package com.example.persistence.controller;

import com.example.persistence.service.ProcessOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service")
public class OrderController {

    @Autowired
    private ProcessOrder processOrder;

    @PostMapping("/products")
    public void temp(@RequestBody String order) throws JsonProcessingException {
        processOrder.temp(order);
    }

}

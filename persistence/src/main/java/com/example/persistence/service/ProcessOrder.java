package com.example.persistence.service;

import com.example.persistence.model.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProcessOrder {

    public void temp(String jsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Order order = mapper.readValue(jsonString, Order.class);
        log.info(String.format("There are %d products in order for customer %s ", order.getProductOrderItem().size() , order.getCustomer().getAccountId()));
        order.getProductOrderItem().forEach(poi -> {
            log.info(poi.getProduct().getName());
        });
    }

}

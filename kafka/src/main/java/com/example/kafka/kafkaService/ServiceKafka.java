package com.example.kafka.kafkaService;


import com.example.kafka.message.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.*;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
public class ServiceKafka {

    Logger logger = Logger.getLogger(ServiceKafka.class.getName());
	
    public void process(Message payload) throws IOException, InterruptedException {
        String log = String.format("Received: %s - customer ID: %s", payload.getId(), payload.getEvent().getKafkaOrder().getCustomer().getAccountId());
        logger.info(log);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String data = ow.writeValueAsString(payload.getEvent().getKafkaOrder());
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8001/order-service/products"))
                .POST(HttpRequest.BodyPublishers.ofString(data))
                .build();
        HttpResponse<?> response = client.send(request, HttpResponse.BodyHandlers.discarding());
        logger.info("Status code: " + response.statusCode());

	}

}






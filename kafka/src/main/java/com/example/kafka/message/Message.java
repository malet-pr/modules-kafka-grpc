package com.example.kafka.message;

import java.util.Date;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	
	private Event event;
	private String id;
	private String eventId;
	private Date eventTime;
	private String eventType;

}


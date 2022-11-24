package com.antonio.amqp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class RabbitMQMessageProducer {
    private final AmqpTemplate amqpTemplate;

    //Allow us to publish the message to an exchange, using a exchange name, the routing key and the payload which is an object
    public void publish(Object payload, String exchange, String routingKey){
        log.info("Publishing to {} using routingKey{}. Payload: {}",exchange,routingKey,payload);
        amqpTemplate.convertAndSend(exchange,routingKey,payload);
        log.info("Publishing to {} using routingKey{}. Payload: {}",exchange,routingKey,payload);
    }
}

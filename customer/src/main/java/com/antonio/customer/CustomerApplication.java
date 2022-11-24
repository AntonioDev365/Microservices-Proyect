package com.antonio.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        //We do this in order to inject the RabbitMQMessageProducer for the message
        scanBasePackages = {
                "com.antonio.customer",
                "com.antonio.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.antonio.clients"
)
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}

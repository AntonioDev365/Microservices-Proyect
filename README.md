# Microservices-Proyect
This Microservices projects contains 3 microservices, clients, customers and notifications. The first two connect via rest api using feign client and check if a 
customer is fraud or not, customer connects to notification services with an async comunnication via RABBITMQ. The project uses eureka server as a service registry,
spring cloud gateway as a load balancer, postgres as a database, docker and tools for distribute tracing such as zipkin

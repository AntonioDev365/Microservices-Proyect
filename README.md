# Microservices-Proyect
This Microservices projects contains 3 microservices, customer, fraud and notification. The first two connect via rest api using feign client and check if a 
customer is fraudster or not, customer connects to notification microservice with an async comunnication using a message queue via RABBITMQ. The project uses eureka server as a service registry, spring cloud gateway as load balancer, postgres as database, docker and tools for distribute tracing such as zipkin.

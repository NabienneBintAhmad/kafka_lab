package com.car.kafka_lab;

@Service
public class KafkaService {
     // Annotation required to listen
    // the message from Kafka server
    @KafkaListener(topics = "JsonTopic",
                   groupId = "id", containerFactory
                                   = "cartListner")
    public void
    publish(Car car)
    {
        System.out.println("New Entry: "
                           + car);
    }
    
}

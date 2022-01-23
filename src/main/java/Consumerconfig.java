package com.car.kafka_lab;

@EnableKafka
@Configuration
public class Consumerconfig {
     
    // Function to establish a connection
    // between Spring application
    // and Kafka server
    @Bean
    public ConsumerFactory<String, Car>
    CarConsumer()
    {
  
        // HashMap to store the configurations
        Map<String, Object> map
            = new HashMap<>();
  
        // put the host IP in the map
        map.put(ConsumerConfig
                    .BOOTSTRAP_SERVERS_CONFIG,
                "127.0.0.1:9092");
  
        // put the group ID of consumer in the map
        map.put(ConsumerConfig
                    .GROUP_ID_CONFIG,
                "id");
        map.put(ConsumerConfig
                    .KEY_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class);
        map.put(ConsumerConfig
                    .VALUE_DESERIALIZER_CLASS_CONFIG,
                JsonDeserializer.class);
  
        // return message in JSON formate
        return new DefaultKafkaConsumerFactory<>(
            map, new StringDeserializer(),
            new JsonDeserializer<>(Car.class));
    }
  
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,
                                                   Car>
    carListner()
    {
        ConcurrentKafkaListenerContainerFactory<String,
                                                Car>
            factory
            = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(CarConsumer());
        return factory;
    }
    
}

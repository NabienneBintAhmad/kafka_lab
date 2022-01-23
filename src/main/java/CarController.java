package com.car.kafka_lab;
// Java program to implement a
// controller
  
@RestController
@RequestMapping("api")
public class CarController {
    @Autowired
    private KafkaTemplate<String, Car>
        kafkaTemplate;
  
    private static final String TOPIC
        = "ks.cars.input";
  
    @GetMapping("/publish/{id}/"
                + "{matricule}/{marque}/{vitesse}/{capture_info}/{vitesse_limite}")
  
    public String post(
        @PathVariable("id") final int id,
        @PathVariable("matricule") final
            String matricule,
        @PathVariable("marque") final
            String marque,
         @PathVariable("vitesse") final
            String vitesse,
        @PathVariable("capture_info") final
            Date capture_info,
        @PathVariable("capture_info") final
            String vitesse_limite,
            
    {
  
        kafkaTemplate.send(
            TOPIC,
            new Car(
                id, matricule,marque,vitesse,capture_info,
                capture_info));
  
        return "Published successfully";
    }
}

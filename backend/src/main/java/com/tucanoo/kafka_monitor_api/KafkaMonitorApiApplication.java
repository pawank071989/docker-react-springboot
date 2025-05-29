package com.tucanoo.kafka_monitor_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaMonitorApiApplication {
     //https://medium.com/@swaroop1232010/building-a-real-time-delivery-tracking-system-using-kafka-with-spring-boot-and-react-js-6aa2779081f6
    public static void main(String[] args) {
        SpringApplication.run(KafkaMonitorApiApplication.class, args);
    }

}

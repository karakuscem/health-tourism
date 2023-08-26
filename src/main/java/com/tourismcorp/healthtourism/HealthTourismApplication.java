package com.tourismcorp.healthtourism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HealthTourismApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthTourismApplication.class, args);

        // Null check for requestDTO mapper
        // Delete function for all child classes
    }

}

package com.kdt.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KdtJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KdtJpaApplication.class, args);
    }

}

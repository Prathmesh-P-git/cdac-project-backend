package com.prashant.milkcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.prashant.milkcenter", "milk_api"})
@EnableJpaRepositories(basePackages = "milk_api.repository")
@EntityScan(basePackages = "milk_api")
public class PrashantMilkCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrashantMilkCenterApplication.class, args);
    }
}
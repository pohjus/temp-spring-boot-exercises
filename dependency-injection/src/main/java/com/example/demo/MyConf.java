package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConf {
    @Bean
    @Primary
    public SellableItem createBean() {
        Car datsun = new Car("Ferrari");
        return datsun;
    }
}
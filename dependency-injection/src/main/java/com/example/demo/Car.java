package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car() {
        System.out.println("Car created");
    }


    public void drive () {
        System.out.println("Car drives");
    }
}
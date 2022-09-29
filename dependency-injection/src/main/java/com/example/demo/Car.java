package com.example.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements SellableItem {
    

//    private String brand;
//    public Car(String brand) {
//        this.brand = brand;
//    }
//


    public void drive () {
        System.out.println("Car drives");
    }

    public void sell() {
        System.out.println("Car sold");
    }
}
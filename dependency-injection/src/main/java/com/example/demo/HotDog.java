package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HotDog implements SellableItem {

    public HotDog() {
        System.out.println("Hot dog created");
    }

    public void sell() {
        System.out.println("Hotdog sold");
    }

}

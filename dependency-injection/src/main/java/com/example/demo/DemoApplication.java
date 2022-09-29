package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    SellableItem someSellableItem;

    public DemoApplication() {
        System.out.println("Demo app created");
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        String [] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name + ":\n      " + applicationContext.getBean(name).getClass().toString());
        }

    }
}

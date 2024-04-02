package com.skerdi.demospringbootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootAppApplication.class, args);
    }

    /**
     * CommandLineRunner is a functional interface that allows you to run a block of code after the application context is loaded.
     * This is useful for running code that needs to be executed after all beans are loaded.
     * In this example, we are using it to print a message to the console.
     */
    @Bean
    public CommandLineRunner commandLineRunner() {
        // This is a lambda expression that implements the CommandLineRunner interface.
        // runner is the parameter of the run method, it can be any name.
        return runner -> {
            System.out.println("Hello Spring Boot");
        };
    }

}

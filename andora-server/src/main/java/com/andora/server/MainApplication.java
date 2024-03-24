package com.andora.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * .
 *
 * @author: leven.chen
 * @date: 2024/3/24 18:45
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(MainApplication.class, args);

    }
}
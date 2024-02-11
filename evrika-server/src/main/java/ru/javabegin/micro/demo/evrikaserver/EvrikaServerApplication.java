package ru.javabegin.micro.demo.evrikaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EvrikaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvrikaServerApplication.class, args);
    }

}

package com.demo.project;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("SpringBootProcessesErrorApplication")
public class SpringBootProcessesErrorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProcessesErrorApplication.class, args);
    }
}

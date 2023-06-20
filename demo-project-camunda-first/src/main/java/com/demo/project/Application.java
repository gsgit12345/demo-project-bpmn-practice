package com.demo.project;

import org.camunda.bpm.spring.boot.starter.CamundaBpmAutoConfiguration;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableProcessApplication
@EnableTransactionManagement
//@ConditionalOnProperty(name = "camunda.bpm.enabled", havingValue = "true", matchIfMissing = true)
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

}

//http://localhost:8080/camunda/app/tasklist/default/#/?searchQuery=%5B%5D
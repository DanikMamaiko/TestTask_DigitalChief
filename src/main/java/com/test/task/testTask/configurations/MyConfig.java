package com.test.task.testTask.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.test.task.testTask")
public class MyConfig {

//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
//
//    @Bean("communication")
//    public Communication getCommunication(){
//        return new Communication();
//    }

}

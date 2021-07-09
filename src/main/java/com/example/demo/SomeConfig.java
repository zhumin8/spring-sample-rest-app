package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {
    @Bean
    public Topic someClassObjectFromConfig() {
        return new Topic("1", "object1", "from @Configuration");
    }
    @Bean
    public Topic someClassObjectFromConfig2() {
        return new Topic("2", "object2", " from @Configuration");
    }
}

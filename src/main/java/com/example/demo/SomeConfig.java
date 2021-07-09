package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {
    @Bean
    public SomeClass someClassObjectFromConfig() {
        return new SomeClass("object1 from @Configuration");
    }
    @Bean
    public SomeClass someClassObjectFromConfig2() {
        return new SomeClass("object2 from @Configuration");
    }
}

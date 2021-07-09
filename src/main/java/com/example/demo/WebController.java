package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class WebController {
    private List<SomeClass> allInstancesOfSomeClass;

    public WebController(List<SomeClass> allInstancesOfSomeClass) {
        this.allInstancesOfSomeClass = allInstancesOfSomeClass;
    }
    @GetMapping("/objs")
    public List<SomeClass> findAllInstancesOfSomeClassInJson(){
        return allInstancesOfSomeClass;
    }

    @Bean
    private static SomeClass someClassObjectFromWebController() {
        return new SomeClass("object1 from web controller");
    }
}

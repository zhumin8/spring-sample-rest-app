package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebController {
    private List<Topic> allInstancesOfTopics;

    public WebController(List<Topic> allInstancesOfTopics) {
        this.allInstancesOfTopics = allInstancesOfTopics;
    }
    @GetMapping("/beantest")
    public List<Topic> findAllInstancesOfSomeClassInJson(){
        return allInstancesOfTopics;
    }

    @GetMapping("/topics")
    public List<Topic> findAllTopics(){

        return Arrays.asList(
                new Topic("1", "object 1","this is description of obj1"),
                new Topic("2", "object 2","obj2 description"),
                new Topic("3", "object 3","a very looooong description for obj3.")
        );
    }

    @Bean
    private static Topic someClassObjectFromWebController() {
        return new Topic("3", "object 1","from web controller");
    }
}

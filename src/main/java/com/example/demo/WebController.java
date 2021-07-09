package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebController {
  private List<Topic> allInstancesOfTopics;
  @Autowired private TopicService topicService;

  public WebController(List<Topic> allInstancesOfTopics) {
    this.allInstancesOfTopics = allInstancesOfTopics;
  }

  @GetMapping("/beantest")
  public List<Topic> findAllInstancesOfSomeClassInJson() {
    return allInstancesOfTopics;
  }

  @GetMapping("/topics")
  public List<Topic> findAllTopics() {
    return topicService.getTopics();
  }

  @GetMapping("/topics/{id}") // {} tells it's a variable
  public Topic findTopic(@PathVariable String id) {
    // this annotation matches the variable by name (default). Specify variable name by
    // @PathVariable("foo")
    return topicService.getTopic(id);
  }

  @Bean
  private static Topic someClassObjectFromWebController() {
    return new Topic("3", "object 1", "from web controller");
  }
}

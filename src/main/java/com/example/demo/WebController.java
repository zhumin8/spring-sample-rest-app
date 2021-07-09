package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/add")
  public void addTopic(@RequestBody Topic topic) {
    // this annotation takes the request body to create the topic obj. json is default type taken.
    topicService.addTopic(topic);
  }

  @PutMapping("/topics/{id}")
  public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
    topicService.updateTopic(id, topic);
  }

  @DeleteMapping("/topics/{id}")
  public void deleteTopic(@PathVariable String id) {
    topicService.deleteTopic(id);
  }

  @Bean
  private static Topic someClassObjectFromWebController() {
    return new Topic("3", "object 1", "from web controller");
  }
}

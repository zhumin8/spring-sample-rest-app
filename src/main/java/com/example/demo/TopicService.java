package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service // spring will create this as singleton
public class TopicService {
  private List<Topic> topics =
      new ArrayList<>(
          Arrays.asList(
              new Topic("1", "object 1", "this is description of obj1"),
              new Topic("2", "object 2", "obj2 description"),
              new Topic("3", "object 3", "a very looooong description for obj3.")));

  public List<Topic> getTopics() {
    return topics;
  }

  public Topic getTopic(String id) {
    return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
  }

  public void addTopic(Topic topic) {
    topics.add(topic);
  }

  public void updateTopic(String id, Topic topic) {
    for (int i = 0; i < topics.size(); i++) {
      Topic currentTopic = topics.get(i);
      if (currentTopic.getId().equals(id)) {
        topics.set(i, topic);
        return;
      }
    }
  }

  public void deleteTopic(String id) {
    topics.removeIf(topic -> topic.getId().equals(id));
  }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // spring will create this as singleton
public class TopicService {
  @Autowired private TopicRepository topicRepository;

  public List<Topic> getTopics() {
    List<Topic> topics = new ArrayList<>();
    topicRepository.findAll().forEach(topics::add);
    return topics;
  }

  public Topic getTopic(String id) {
    return topicRepository.findById(id).get();
  }

  public void addTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void updateTopic(String id, Topic topic) {
    topicRepository.save(topic); // already knows the id, updates when exists
  }

  public void deleteTopic(String id) {
    topicRepository.deleteById(id);
  }
}

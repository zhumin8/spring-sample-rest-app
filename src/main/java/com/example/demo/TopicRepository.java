package com.example.demo;

import org.springframework.data.repository.CrudRepository;
// this is an interface because Spring is going to handle the class creation
// extending from CrudRepository<T,ID> gives the get, update, delete..out of box
public interface TopicRepository extends CrudRepository<Topic, String> {
}



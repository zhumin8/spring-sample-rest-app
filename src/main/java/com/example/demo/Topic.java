package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

// this is just a  sample class to get the application up
@Entity // JPA annotation
public class Topic {
  @Id
  private String id;
  private String name;
  private String description;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // this is needed, otherwise will fail on "No default constructor for entity"
  public Topic(){
  }

  public Topic(String id, String name, String description) {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public String toString() {
    return this.id + "; " + this.name;
  }
}

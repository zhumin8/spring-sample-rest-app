package com.example.demo;
// this is just a  sample class to get the application up
// TODO: replace this with topic class.
public class Topic {

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

  public Topic(String id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public String toString() {
    return this.id + "; " + this.name;
  }
}

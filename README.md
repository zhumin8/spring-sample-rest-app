This is a sample REST app created to get a taste of the basics of Spring Boot.

This code is build from Spring initializr code.
The starter code can be downloaded via:
`curl https://start.spring.io/starter.tgz -d dependencies=web,jpa,derby -d baseDir=testtest -d bootVersion=2.4.8.BUILD-SNAPSHOT  | tar -xzvf -`
---
This app supports:
- GET: 
  - get all topics: `http://localhost:8080/topics` OR `curl -X GET http://localhost:8080/topics`
  - get a topic: `http://localhost:8080/topics/{id}` OR `curl -X GET http://localhost:8080/topics/{id}`
- POST:
  - add topic: `curl -d '{"id":"4", "name":"new obj", "description":"blah blah blah"}' -H "Content-Type: application/json" -X POST http://localhost:8080/add `
- PUT:
  - update a topic: `curl -d '{"id":"4", "name":"new obj", "description":"blah blah blah updated"}' -H "Content-Type: application/json" -X PUT http://localhost:8080/topics/{id} `
- DELETE:
    - delete a topic: `curl -d "Content-Type: application/json" -X DELETE http://localhost:8080/topics/4 `
This is a sample REST app created to learn the basics of Spring Boot.

The app supports:
- GET: 
  - get all topics: `http://localhost:8080/topics`
  - get a topic: `http://localhost:8080/topics/2`
- POST:
  - add topic: `curl -d '{"id":"4", "name":"new obj", "description":"blah blah blah"}' -H "Content-Type: application/json" -X POST http://localhost:8080/add `
- PUT:
  - update a topic: `curl -d '{"id":"4", "name":"new obj", "description":"blah blah blah updated"}' -H "Content-Type: application/json" -X PUT http://localhost:8080/topics/4 `
- DELETE:
    - delete a topic: `curl -d "Content-Type: application/json" -X DELETE http://localhost:8080/topics/4 `
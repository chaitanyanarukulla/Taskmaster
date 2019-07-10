# taskmaster

# Task Master

## Description 
- Task Master is a task-tracking application with the same basic goal as Trello: allow users to keep 
track of tasks to be done and their status. While we’ll start today with a basic feature set,
 we will continue building out the capabilities of this application over time.
 
## API
- ```@GetMapping("/tasks")```
  - returns json data from the dynamodb
- ```@PostMapping("/tasks)```
  - should post tasks to the dynamodb
- ```@PutMapping("/tasks/{id}/state")```
  - should update task status
- ```@GetMapping("/users/{assignee}/tasks) ```
  - should show the tasks that are assigned to that assignee
- ```@PutMapping("/tasks/{id}/assign/{assignee}) ```
  - can assign tasks to an assignee
- ```@DeleteMapping("/tasks/{id}")```
  - can delete a task
-  ```PostMapping("/tasks/{id}/images")
  - can update a task with an image


## Directions
- from IntelliJ
  - open application
  - run the App.java
- from Command Line
  - test
    - ```./gradlew test```
  - Start Server
    - ```./gradlew bootRun```
    - proceeed in broswer to following routes
      - ```localhost:5000/tasks```
      - ```localhost:5000/tasks/<insert title, description, assignee>```
      - ```localhost:5000/tasks/{id}/state```
      - ```localhost:5000/users/{assignee}/tasks```
      - ```localhost:5000/tasks/{id}/assign/{assignee}```
      - ```localhost:5000/tasks/{id}```
      - ```localhost:5000/tasks/{id}/images```
        - delete route

 
## Deployed Site
### Backend
- http://taskmaster-dev-1.us-west-1.elasticbeanstalk.com/

### FrontEnd

- http://reacttaskapp.s3-website-us-west-1.amazonaws.com/
package com.chain.taskmaster;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
interface TaskRepository extends CrudRepository<Task, String>{
    Optional<Task> findById(String id);
    Iterable<Task> findByAssignee(String assignee);
}
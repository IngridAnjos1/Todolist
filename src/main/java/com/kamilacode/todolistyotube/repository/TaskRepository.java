package com.kamilacode.todolistyotube.repository;

import com.kamilacode.todolistyotube.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

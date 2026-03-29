package com.github.lucsfn.spring_architecture.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    boolean existsByDescription(String description);
}

package com.github.lucsfn.spring_architecture.todo;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validate(TodoEntity todo) {
        if (thereIsTodoWithDescription(todo.getDescription())) {
            throw new IllegalArgumentException("There is already a todo with the same description.");
        }
    }

    private boolean thereIsTodoWithDescription(String description) {
        return repository.existsByDescription(description);
    }
}

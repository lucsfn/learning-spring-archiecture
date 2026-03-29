package com.github.lucsfn.spring_architecture.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository repository;
    private final MailSender mailSender;
    private final TodoValidator validator;


    public TodoService(TodoRepository repository, MailSender mailSender, TodoValidator validator) {
        this.repository = repository;
        this.mailSender = mailSender;
        this.validator = validator;
    }

    public TodoEntity save(TodoEntity todo) {
        validator.validate(todo);
        return repository.save(todo);
    }

    public void updateStatus(TodoEntity todo) {
        repository.save(todo);
        var status = todo.getDone() == Boolean.TRUE ? "done" : "not done";
        mailSender.sendMail("Todo with id " + todo.getDescription() + " has been updated to status " + status);
    }

    public TodoEntity findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}

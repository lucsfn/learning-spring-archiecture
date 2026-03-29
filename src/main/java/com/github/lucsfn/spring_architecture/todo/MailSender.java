package com.github.lucsfn.spring_architecture.todo;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void sendMail(String message) {
        // Simulating sending an email
        System.out.println("Sending email: " + message);
    }
}

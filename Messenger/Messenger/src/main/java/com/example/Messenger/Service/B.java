package com.example.Messenger.Service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class B {

    @JmsListener(destination = "myQueue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

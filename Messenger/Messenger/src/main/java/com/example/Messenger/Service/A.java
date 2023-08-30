package com.example.Messenger.Service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class A {

    private final JmsTemplate jmsTemplate;

    public A(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend("myQueue", message);
    }
}

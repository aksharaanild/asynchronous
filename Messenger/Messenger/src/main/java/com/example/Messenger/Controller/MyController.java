package com.example.Messenger.Controller;

import com.example.Messenger.Service.A;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    private final A messageProducer;

    public MyController(A messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping("/send-message")
    public String sendMessage(@RequestParam String message) {
        messageProducer.sendMessage(message);
        return "Message sent to queue: " + message;
    }

}

package com.example.example_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.example_1.model.Message;

@RestController
public class ServerController {

    @GetMapping("/api/message")
    public Message getMessage() {
        return new Message("Hello from MyApplicationServer!");
    }
}

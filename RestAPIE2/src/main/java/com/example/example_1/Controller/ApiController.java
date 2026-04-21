package com.example.example_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from RestAPIE2!";
    }

    @PostMapping("/api/echo")
    public String echo(@RequestBody String input) {
        return "You sent: " + input;
    }
}

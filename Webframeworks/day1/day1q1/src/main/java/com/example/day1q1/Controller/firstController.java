package com.example.day1q1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class firstController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome Springing Boot";
    }
}
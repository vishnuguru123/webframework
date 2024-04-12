package com.example.day1q2.Controller2;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class SecondController {
    @GetMapping("/studentName")
    public String welcomeStudent(@RequestParam("studentName") String studentName) {
        return "Welcome " + studentName + "!";
    }
}




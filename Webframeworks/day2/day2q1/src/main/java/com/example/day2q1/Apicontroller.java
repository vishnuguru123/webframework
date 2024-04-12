package com.example.day2q1.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2q1.controller.model.AppConfig;
@RestController
public class ApiController {
    private final AppConfig ac;

    @Autowired
    public ApiController(AppConfig ac){
        this.ac=ac;
    }
    @GetMapping("/info")
    public String info(){
        return "App Name:"+ac.getAppName()+",Version:"+ac.getAppVersion();
    }

    
}


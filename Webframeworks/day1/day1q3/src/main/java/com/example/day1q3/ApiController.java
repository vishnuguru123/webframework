package com.example.day1q3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Apicontroller {


    @GetMapping("/favouriteColor")
    public String getColor(@RequestParam(name = "color") String color) {
        return "My favorite color is " + color + "!";
    }
}

    


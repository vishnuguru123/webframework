package com.example.day2q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ce4.model.Book;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    @GetMapping("/book")
    public Book getInfo() {
        return new Book("The Great Soldier", "G. Gyan");
    }
    
}

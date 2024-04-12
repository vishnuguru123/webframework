package com.example.day1q5.controller;
import com.example.day1q5.model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class studentcontroller{


    @GetMapping("/student")
    public List<student> getStudents() {
        List<student> students = new ArrayList<>();
        student obj = new student();
        obj.setStudentName("John");
        obj.setMessage("Welcome, John!");
        students.add(obj);
        return students;
    }
}



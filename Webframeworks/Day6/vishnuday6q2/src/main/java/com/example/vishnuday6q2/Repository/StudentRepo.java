package com.example.vishnuday6q2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vishnuday6q2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    
}


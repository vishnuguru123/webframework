package com.example.vishnuday4q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vishnuday4q1.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
    
}


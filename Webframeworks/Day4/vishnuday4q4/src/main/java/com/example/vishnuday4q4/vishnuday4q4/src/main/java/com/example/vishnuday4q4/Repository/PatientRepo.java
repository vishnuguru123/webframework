package com.example.vishnuday4q4.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vishnuday4q4.Model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{
    
}

package com.example.vishnuday4q2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vishnuday4q2.Model.JobModel;



@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{
    


}

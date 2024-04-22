package com.example.vishnuday5q2.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vishnuday5q2.Model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}

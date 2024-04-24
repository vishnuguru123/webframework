package com.example.vishnuday6q1.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vishnuday6q1.model.Children;


@Repository
public interface ChildrenRepo extends JpaRepository<Children,Integer>{
    
}


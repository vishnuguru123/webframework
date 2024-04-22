package com.example.vishnuday5q1.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vishnuday5q1.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}


package com.example.vishnuday6q3.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}


package com.example.vishnuday4q3.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.vishnuday4q3.Model.product.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    


    
}

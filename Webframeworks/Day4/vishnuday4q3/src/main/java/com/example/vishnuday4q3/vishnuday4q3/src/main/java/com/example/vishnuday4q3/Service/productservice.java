package com.example.vishnuday4q3.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.vishnuday4q3.Model.product.Product;
import com.example.vishnuday4q3.Repository.ProductRepo;

@Service

public class productservice {


    public class ProductService {
        public ProductRepo productRepo;
        public ProductService(ProductRepo productRepo)
        {
            this.productRepo=productRepo;
        }
        public boolean saveProduct(Product product)
        {
            try{
                productRepo.save(product);
    
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public List<Product> getProducts()
        {
            return productRepo.findAll();
        }
        public Product getProductById(int id)
        {
            Optional<Product> obj = productRepo.findById(id);
            return obj.orElse(new product());
        }
    }
        
}

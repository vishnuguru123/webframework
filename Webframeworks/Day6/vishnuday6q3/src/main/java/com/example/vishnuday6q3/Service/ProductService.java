package com.example.vishnuday6q3.Service;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.vishnuday6q3.model.Product;
import com.example.vishnuday6q3.Repository.ProductRepo;

@Service
public class ProductService {
    

    public ProductRepo productRepo;
    public ProductService(ProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(Product product)
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
    public List<Product> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<Product> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public Product getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}


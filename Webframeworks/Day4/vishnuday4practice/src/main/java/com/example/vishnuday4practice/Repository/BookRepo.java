package com.example.vishnuday4practice.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vishnuday4practice.Model.Book;
import com.example.vishnuday4practice.Repository.BookRepo;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{
    
}

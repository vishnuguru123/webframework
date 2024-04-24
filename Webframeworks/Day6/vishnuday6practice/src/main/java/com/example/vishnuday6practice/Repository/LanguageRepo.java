package com.example.vishnuday6practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6pah.model.Language;

@Repository
public interface LanguageRepo extends JpaRepository<Language,Integer>{
    
}


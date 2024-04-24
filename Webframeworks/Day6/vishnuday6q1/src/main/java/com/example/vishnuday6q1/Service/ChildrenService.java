package com.example.vishnuday6q1.Service;
import java.util.List;
    
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.vishnuday6q1.model.Children;
import com.example.vishnuday6q1.Repository.ChildrenRepo;

@Service
public class ChildrenService {
    

   
        public ChildrenRepo childrenRepo;
        public ChildrenService(ChildrenRepo childrenRepo)
        {
            this.childrenRepo = childrenRepo;
        }
        public boolean postChildren(Children children)
        {
            try{
    
                childrenRepo.save(children);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public List<Children> getSortedChildrens(String field)
        {
            return childrenRepo.findAll(Sort.by(field));
        }
        public List<Children> getPaginationChildrens(int offset,int size)
        {
            return childrenRepo.findAll(PageRequest.of(offset, size)).getContent();
            // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                            
        }
        public List<Children> getSortedPaginationChildrens(int offset,int size,String field)
        {
            return childrenRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
        }
    }
       


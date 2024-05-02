package com.example.vishnuday12q2.repository;

public class EmployeeRepo {
    package com.example.springapp.repository;

    import java.util.List;
    
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.stereotype.Repository;
    
    import com.example.springapp.model.DpakStudent;
    @Repository
    public interface DpakStudentRepository extends JpaRepository<DpakStudent,Integer>{
      
        @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
        List<DpakStudent>getStudentInner();
    
        @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
        List<DpakStudent> getStudentsLeftOuter();
    
        
    
        
    }
       
}

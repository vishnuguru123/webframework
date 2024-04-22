package com.example.vishnuday4q2.Services;
import java.util.List;
    import java.util.Optional;
    
    import org.springframework.stereotype.Service;
    
    import com.example.vishnuday4q2.Model.JobModel;
import com.example.vishnuday4q2.Model.JobModel.Job;
import com.example.vishnuday4q2.Repository.JobRepo;
    
    @Service
public class JobServices {
    

    
        public JobRepo jobRepo;
        public JobServices(JobRepo jobRepo)
        {
            this.jobRepo = jobRepo;
        }
        public boolean saveJob(Job job)
        {
            try{
                com.example.vishnuday4q2.JobRepo.save(job);
            } 
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public List<Job> getJobs()
        {
            return jobRepo.findAll();
        }
        public Job getJobById(int id)
        {
            Optional<Job> obj = jobRepo.findById(id);
            return obj.orElse(null);
        }
    }
       

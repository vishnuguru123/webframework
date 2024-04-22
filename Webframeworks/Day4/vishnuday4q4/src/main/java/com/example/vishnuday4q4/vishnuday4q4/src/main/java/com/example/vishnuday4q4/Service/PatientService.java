package com.example.vishnuday4q4.Service;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Parent;
import org.springframework.stereotype.Service;

import com.example.vishnuday4q4.Model.Patient;
import com.example.vishnuday4q4.Repository.PatientRepo;

@Service
public class PatientService {
    


    public PatientService patientRepo;
    public PatientService(PatientService patientRepo)
    {
        this.patientRepo = patientRepo;
    }
    public boolean savePatient(Patient patient)
    {
        try{
            patientRepo.save(patient);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    private void save(Patient patient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    public List<Parent> getPatients()
    {
        return patientRepo.findAll();
    }
    private List<Parent> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    public Parent getPatientById(int id)
    {
        Optional<Patient> obj = Optional.empty();
        return (Parent) obj.orElse(null);
    }
    private Optional<PatientService> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    public boolean savePatient(Patient patient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savePatient'");
    }

    
}

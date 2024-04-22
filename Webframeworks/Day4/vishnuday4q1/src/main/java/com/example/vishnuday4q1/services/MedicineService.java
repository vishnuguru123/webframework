package com.example.vishnuday4q1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.vishnuday4q1.model.Medicine;
import com.example.vishnuday4q1.repository.MedicineRepo;

@Service
public class MedicineService {
    public MedicineRepo medicineRepo;
    public MedicineService(MedicineRepo medicineRepo)
    {
        this.medicineRepo = medicineRepo;
    }
    public boolean saveMedicine(Medicine medicine)
    {
        try{
            medicineRepo.save(medicine);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Medicine> getMedicines()
    {
        return medicineRepo.findAll();
    }

    public Medicine MedicineById(int id)
    {
        Optional<Medicine> obj = medicineRepo.findById(id);
        return obj.orElse(new Medicine());
    }

}

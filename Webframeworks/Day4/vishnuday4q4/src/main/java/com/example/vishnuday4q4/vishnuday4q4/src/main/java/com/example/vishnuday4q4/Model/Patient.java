package com.example.vishnuday4q4.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
    

    @Id
    private int patientId;
    private String patientName;
    private String doctorName;
    private String disease;
    private String medication;
    public Patient() {
    }
    public Patient(int patientId, String patientName, String doctorName, String disease, String medication) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.disease = disease;
        this.medication = medication;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getMedication() {
        return medication;
    }
    public void setMedication(String medication) {
        this.medication = medication;
    }
    
}

    

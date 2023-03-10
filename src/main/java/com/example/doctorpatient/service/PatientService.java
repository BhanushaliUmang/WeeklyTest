package com.example.doctorpatient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorpatient.dao.PatientRepository;
import com.example.doctorpatient.model.PatientModel;



@Service
public class PatientService {
    @Autowired
    PatientRepository patRepo;

    public void savePat1(PatientModel patientDetails) {
        patRepo.save(patientDetails);
    }

    public void updatePat1(PatientModel patientupdate, String id) {
        if (patRepo.findById(Integer.valueOf(id)).isPresent()) {
            patRepo.findById(Integer.valueOf(id)).get();

            patRepo.save(patientupdate);
        }
    }

    public List<PatientModel> getPat(PatientModel patient) {
        return patRepo.findAll();
    }

    public PatientModel getpat1(int id) {
        return patRepo.findById(id).get();
    }

    public void deletebyid(int id) {
        PatientModel pat = patRepo.findById(id).get();
        patRepo.delete(pat);

    }

}

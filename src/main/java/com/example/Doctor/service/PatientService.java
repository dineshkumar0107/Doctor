package com.example.Doctor.service;

import com.example.Doctor.dto.PatientRepository;
import com.example.Doctor.model.Patient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public void savePatient(Patient patient){
       patientRepository.save(patient);
    }

    public JSONArray getPatient() {
        List<Patient> patientList = patientRepository.findAll();
        JSONArray patientArr = new JSONArray();

        for(Patient patient : patientList){
            JSONObject jsonObject =  new JSONObject();
            jsonObject.put("patientId",patient.getPatientId());
            jsonObject.put("patient_name",patient.getPatientName());
            jsonObject.put("age",patient.getAge());
            jsonObject.put("phone_number",patient.getPhoneNumber());
            jsonObject.put("Disease_type",patient.getDiseaseType());
            jsonObject.put("gender",patient.getGender());
            jsonObject.put("Admit_date",patient.getAdmitDate());
            jsonObject.put("doctorId",patient.getDoctorId().getDoctorId());
            patientArr.put(jsonObject);

        }
        return patientArr;
    }
}

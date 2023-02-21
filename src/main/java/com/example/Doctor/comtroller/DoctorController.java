package com.example.Doctor.comtroller;

import com.example.Doctor.model.Doctor;
import com.example.Doctor.service.DoctorService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping(value="/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
 return doctorService.saveDoctor(doctor);
    }
    @GetMapping("/doctors")
    public List<Doctor> getDoctor(@Nullable @RequestParam String doctorId ){
        return doctorService.getDoctor(doctorId);
    }
/*  @GetMapping("/doctor")
    public  Doctor getDoctorById(@RequestParam String doctorId){
        return doctorService.getDoctorById(doctorId);
    }*/
}

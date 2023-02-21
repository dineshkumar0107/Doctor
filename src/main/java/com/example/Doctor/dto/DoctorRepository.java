package com.example.Doctor.dto;

import com.example.Doctor.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}

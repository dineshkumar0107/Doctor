package com.example.Doctor.model;

import jakarta.persistence.*;
import org.hibernate.sql.results.graph.Fetch;

import java.sql.Timestamp;

@Entity
@Table(name = "tbl_Patient")
public class Patient {
    @Id
    @Column(name = "patient_Id")
    private Integer patientId;
    @Column(name = "patient_Name")
    private String patientName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "phone_Number")
    private String phoneNumber;
    @Column(name = "disease_Type")
    private String diseaseType;
    @Column(name = "gender")
    private String gender;

    @Column(name = "admit_Date")
    private Timestamp admitDate;
    @JoinColumn(name = "doctor_Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctorId;

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public Timestamp getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Timestamp admitDate) {
        this.admitDate = admitDate;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", diseaseType='" + diseaseType + '\'' +
                ", admitDate=" + admitDate +
                ", doctorId=" + doctorId +
                '}';
    }
}

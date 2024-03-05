package com.example.StudentManagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RollNumber;
    private String name;
    private String mobNumber;

    private String City;

    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Student(int rollNumber, String name, String mobNumber, String city) {
        RollNumber = rollNumber;
        this.name = name;
        this.mobNumber = mobNumber;
        City = city;
    }
}

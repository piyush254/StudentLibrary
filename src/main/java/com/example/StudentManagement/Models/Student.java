package com.example.StudentManagement.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RollNumber;
    private String name;
    private String mobNumber;
    private String email;
//    code checking
    private String City;
    // Name of variable in parent entity you have written in child class foreign key attribute
    @OneToOne(mappedBy = "studentVariableName", cascade = CascadeType.ALL)
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

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

    public Student(int rollNumber, String name, String mobNumber, String city, String email) {
        RollNumber = rollNumber;
        this.name = name;
        this.email = email;
        this.mobNumber = mobNumber;
        City = city;
    }
}

package com.example.StudentManagement.Models;

import com.example.StudentManagement.Enum.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "LibraryCard")
public class Card {
    //***** Before saving in db we have to set the attributes


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Its auto generated so no need to set it.
    @CreationTimestamp
    private Date creationdate; //Its auto generated so no need to set it.
    @UpdateTimestamp
    private Date updationDate; //Its auto generated so no need to set it.


    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;  // I already set this attribute
    @OneToOne
    @JoinColumn
    // This variable used in parent class where bidirectional connection is making
    private Student studentVariableName;

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

//    public Card(int id, Date creationdate, Date updationDate, CardStatus cardStatus) {
//        this.id = id;
//        this.creationdate = creationdate;
//        this.updationDate = updationDate;
//        this.cardStatus = cardStatus;
//    }

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}

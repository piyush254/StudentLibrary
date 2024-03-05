package com.example.StudentManagement.Models;

import com.example.StudentManagement.Enum.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "LibraryCard")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date creationdate;
    @UpdateTimestamp
    private Date updationDate;


    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public Card(int id, Date creationdate, Date updationDate, CardStatus cardStatus) {
        this.id = id;
        this.creationdate = creationdate;
        this.updationDate = updationDate;
        this.cardStatus = cardStatus;
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

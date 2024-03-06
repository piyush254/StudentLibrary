package com.example.StudentManagement.Services;

import com.example.StudentManagement.Enum.CardStatus;
import com.example.StudentManagement.Models.Card;
import com.example.StudentManagement.Models.Student;
import com.example.StudentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    // Before setting values set all od its attributes
    public String CreateStudent(Student student) {
        // Student from the postman is already the basic attribute set
        // Card should be also be generated when create Student function is called by the function
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);    // Here I set the card Attribute
        card.setStudentVariableName(student);

        // Let's go to the student
        // we see there card attribute is not set then we need to set that attribute here
        student.setCard(card);

        // If there was a unidirectional mapping then we have to save both of them.
        // But we are super advanced, and we are using bidirectional mapping child will automatically will saved


        // This is the saving of parent repository


        studentRepository.save(student);
        //By using "studentRepository.save(student);" child repository will automatically will saved

        return "Student and Card added";
    }
}

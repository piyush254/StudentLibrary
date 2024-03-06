package com.example.StudentManagement.Controllers;

import com.example.StudentManagement.Models.Student;
import com.example.StudentManagement.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String CreateStudent(@RequestBody Student student) {
        studentService.CreateStudent(student);
        return "Student added successfully";
    }
}

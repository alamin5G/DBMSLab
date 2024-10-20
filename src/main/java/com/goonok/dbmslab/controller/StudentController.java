package com.goonok.dbmslab.controller;

import com.goonok.dbmslab.model.Student;
import com.goonok.dbmslab.repository.StudentRepository;
import com.goonok.dbmslab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/add")
    public String addStudents(@RequestBody Student student) {
       int result =  studentService.addStudent(student);
       if(result == 1) {
           return "success";
       }
        return "there is error";
    }
}

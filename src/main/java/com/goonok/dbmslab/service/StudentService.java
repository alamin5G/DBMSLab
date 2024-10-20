package com.goonok.dbmslab.service;


import com.goonok.dbmslab.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addStudent(Student student) {
        String insertSql = "insert into student(name, email, age) values(?,?,?)";
        return jdbcTemplate.update(insertSql, student.getName(), student.getEmail(), student.getAge());
    }


}

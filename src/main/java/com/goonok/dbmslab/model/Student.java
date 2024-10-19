package com.goonok.dbmsconnection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Data

public class Student {/*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    private Long id;

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;

}

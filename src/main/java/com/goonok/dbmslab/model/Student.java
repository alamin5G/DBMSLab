package com.goonok.dbmslab.model;

import lombok.Data;

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

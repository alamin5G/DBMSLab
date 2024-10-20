package com.goonok.dbmslab.model;

import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class Student {

    private long id;
    private String name;
    private String email;
    private int age;

}

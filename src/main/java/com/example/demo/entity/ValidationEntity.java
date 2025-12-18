package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.constraints;

@Entity
public class ValidationEntity{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY);
    private Long id;
    @NotNull
    @Size(0,6)
    private String username;
    private String email;
    private String password;
    private int age;

}
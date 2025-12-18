package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity
public class ValidationEntity{
    @Id
    @GerneratedValue(strategy=GenerationType.IDENTITY);
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email(message="Email is valid")
    private String email;
    
    @Size(min=2,max=6)
    @NotNull(message="Password is mandatory")
    private String password;
    private int age;

}
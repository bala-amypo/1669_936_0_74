package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long person_id;

     @NotNull
     @Email
     @Column(unique=true)
    private String email;
        @NotNull
    private String person_name;

    @ManyToMany
    @JoinTable(
        name="Common_Table",
        joinColumns=@JoinColumn(name="person_id"), 
        inverseJoinColumns = @JoinColumn(name="course_id") 
        
    )             
    private List<Course> course;
    

}
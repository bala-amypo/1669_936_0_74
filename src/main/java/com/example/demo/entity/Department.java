package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

      private Long dep_id;
    private String dep_name;
    private String dep_head;

    @OneToMany(mappedBy = "")
 private List<Student> stu; 

}
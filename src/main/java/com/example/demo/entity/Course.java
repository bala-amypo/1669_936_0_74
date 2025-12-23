package com.example.demo1.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long course_id;

     @NotNull
    private String course_name;

    @NotNull
    private int credit;

    @ManyToMany(mappedBy="course") //Here course is the obj created in Person            
    private List<Person> person; //to tell where to search the second PK, say course_id;

    //to allocate mulitple courses to a single person
    public Course(Long course_id){
        this.course_id=course_id;
    }


    
}

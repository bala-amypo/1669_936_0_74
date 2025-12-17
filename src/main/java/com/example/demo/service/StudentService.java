package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
@Service
public interface StudentService{
    StudentEntity postData(StudentEntity student);
    StudentEntity getData();

}
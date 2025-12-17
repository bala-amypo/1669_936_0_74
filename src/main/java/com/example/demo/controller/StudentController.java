package com.example.demo.controller;

import org.springframework.beans.factory.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired StudentService serve;
    
    public StudentEntity postValue(@RequestBody StudentEntity stu){
        return serve.postData(stu);
    }
}
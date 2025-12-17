package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@RestController
public class StudentController{
    @Autowired StudentService serve;
    
    @postMapping("/post");                                                                                                  
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return serve.postData(stu);
    }
}
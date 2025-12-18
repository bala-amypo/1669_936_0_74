package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@RestController
public class StudentController{
    @Autowired StudentService serve;
    
    @PostMapping("/post")                                                                                                  
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return serve.postData(stu);
    }
    @GetMapping("/get")
    public List<StudentEntity> getAllData(){
        return serve.getData();
    }
}
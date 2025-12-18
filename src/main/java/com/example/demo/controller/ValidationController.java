package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@RestContoller
public class StudentController{
    @Autowired StudentService serve;
    
    @PostMapping("/postValid")                                                                                                  
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return serve.postData(stu);
    }
}
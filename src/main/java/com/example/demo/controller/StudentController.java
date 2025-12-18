package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
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
    @DeleteMapping("/delete/{id}")
    public String deleteVal(@PathVariable int id){
        return serve.DeleteData(id);
    }
    @GetMapping("/getid/{id}")
    public StudentEntity findData(@PathVariable int id){
        return serve.findData(id);
    }
    public StudentEntity
}
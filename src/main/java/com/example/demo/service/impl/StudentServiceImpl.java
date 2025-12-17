package com.example.demo.service.impl;


import org.springframework.beans.factory.annotations.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@Service
public class StudentServiceImpl implements StudentService{
        @Autowired StudentRepository repo;
        public StudentEntity postData(StudentEntity student){
            return repo.save(student);
        }
        
}
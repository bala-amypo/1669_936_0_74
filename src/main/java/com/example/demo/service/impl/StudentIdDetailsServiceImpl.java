package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.entity.StudentDetails;
import com.example.demo.repository.StudentDetailsRepository;
@Service
public class StudentDetailsServiceImpl implements StudentDetailsService{
        @Autowired StudentDetailsRepository repo;
        
        @Override
        public StudentDetails postData(StudentDetails student){
            return repo.save(student);
        }
        
}
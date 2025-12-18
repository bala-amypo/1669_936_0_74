package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepo repo;
    @Override
    public ValidationEntity postValid(ValidationEntity val){
        return repo.save(val);
    }
}
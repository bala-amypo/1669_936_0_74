package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.exception.ValidationException;

@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepo repo;
    @Override
    public ValidationEntity postValid(ValidationEntity val){
        return repo.save(val);
    }
    @Override
    public ValidationEntity findData(Long id){
        return repo.findById(id).orElseThrow(()->new ValidationException("Invalid id "+id));
    }
}
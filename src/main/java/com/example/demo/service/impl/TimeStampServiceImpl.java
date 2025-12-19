package com.example.demo.service.impl;

import com.example.demo.entity.TimeStampEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.Repository;
import java.util.List;
@Service
public interface TimeStampServiceImpl implements TimeStampService{

     @Autowired StudentRepository repo;
        
    @Override
    TimeStampEntity postStamp(TimeStampEntity time);
   
}
package com.example.demo.service.impl;

import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.TimeStampRepository;
import java.util.List;
@Service
public class TimeStampServiceImpl implements TimeStampService{

     @Autowired TimeStampRepository repo;
        
    @Override
    public TimeStampEntity postStamp(TimeStampEntity time){
        return repo.save(time);
    }
   
}
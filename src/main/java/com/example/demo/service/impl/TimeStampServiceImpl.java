package com.example.demo.service.impl;

import com.example.demo.entity.TimeStampEntity;
import java.util.List;
@Service
public interface TimeStampService{
    TimeStampEntity postStamp(TimeStampEntity time);
   
}
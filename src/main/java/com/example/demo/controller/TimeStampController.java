package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;
@RestController
public class TimeStampController{
    @Autowired TimeStampService serve;
    
    @PostMapping("/postTS")                                                                                                  
    public TimeStampEntity postSt(@RequestBody TimeStampEntity time){
        return serve.postStamp(time);
    }
}
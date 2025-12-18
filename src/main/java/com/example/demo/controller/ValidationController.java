package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import jakarta.validation.constraints.Positive;
@RestContoller
public class StudentController{
    @Autowired ValidationService serve;
    
    @PostMapping("/postValid")                                                                                                  
    public ValidationEntity ValidPost(@Valid @RequestBody ValidationEntity val){
        return serve.postValid(val);
    }
}
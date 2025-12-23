package com.example.demo.service.impl;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired CourseRepository repo;
    @Override
    public Course postdata(Course course){
    
        return repo.save(course);
    }
    
    @Override
    public Course getdata(Long course_id){
        return repo.findById(course_id).orElse(null);

    }
}
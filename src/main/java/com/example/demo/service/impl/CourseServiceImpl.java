package com.example.Spring.Service.impl;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.Entity.Course;
import com.example.Spring.Repository.CourseRepository;
import com.example.Spring.Service.CourseService;

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
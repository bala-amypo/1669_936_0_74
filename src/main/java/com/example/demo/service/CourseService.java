package com.example.demo.service;

import com.example.demo.entity.Course;

public interface CourseService {

    Course postdata(Course course);
    Course getdata(Long course_id);

}
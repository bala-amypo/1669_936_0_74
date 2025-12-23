package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;





@RestController
public class CourseController {
         @Autowired CourseService service4;

@PostMapping("/post_course")
public Course postcourse(@RequestBody Course course){

    return service4.postdata(course);
}

@GetMapping("/get_course/{id}")
public Course getcourse(@PathVariable Long id){

    return service4.getdata(id);
}
    

}
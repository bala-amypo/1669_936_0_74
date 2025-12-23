package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.Person;
import com.example.demo.entity.Course;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private CourseRepository courseRepo;

    public Person savePerson(Person person) {

        List<Course> courses = person.getCourse()
            .stream()
            .map(c -> courseRepo.findById(c.getCourse_id())
                .orElseThrow(() -> new RuntimeException("Course not found")))
            .toList();

        person.setCourse(courses);

        return personRepo.save(person);
    }
}

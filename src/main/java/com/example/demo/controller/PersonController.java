package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;



@RestController
public class PersonController {
    
    // @Autowired PersonService service1;

// @PostMapping("/post_person")
// public Person postperson(@RequestBody Person person){

//     return service1.postdata2(person);
// }

// @GetMapping("/get_person/{id}")
// public Person getperson(@PathVariable Long id){

//     return service1.getdata2(id);
// }


    @Autowired
    private PersonService service;

    @PostMapping
    public Person create(@RequestBody Person person) {
        return service.savePerson(person);
    }

}
package com.example.demo.service;

import com.example.demo.entity.Person;

public interface PersonService {
    
          Person postdata2(Person person);
         Person getdata2(Long person_id);
 Person savePerson(Person person);
}
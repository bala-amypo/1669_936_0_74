package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired PersonRepository repo2;
    @Override
    public Person postdata2(Person person){

        return repo2.save(person);

    }

    @Override
       public Person getdata2(Long person_id){

            return repo2.findById(person_id).orElse(null);

         }


}
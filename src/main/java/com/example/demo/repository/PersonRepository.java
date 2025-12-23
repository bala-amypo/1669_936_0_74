package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.Entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
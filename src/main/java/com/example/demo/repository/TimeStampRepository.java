package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ValidationEntity;

@Repository
public interface TimeStampRepository extends JpaRepostiory<TimeStampEntity,Long>{

}

package com.example.demo.service;

import com.example.demo.entity.TimeStampEntity;
import java.util.List;
public interface TimeStampService{
    TimeStampEntity postStamp(TimeStampEntity time);
   
}
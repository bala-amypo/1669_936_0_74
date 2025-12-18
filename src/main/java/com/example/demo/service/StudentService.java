package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService{

    StudentEntity postData(StudentEntity student);
    List<StudentEntity> getData();
    String DeleteData(int id);
    StudentEntity findData(int id);
    StudentEntinty updateData(int id,StudentEntity stu);
}
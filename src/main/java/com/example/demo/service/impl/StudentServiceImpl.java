// package com.example.demo.service.impl;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.example.demo.service.StudentService;
// import com.example.demo.entity.StudentEntity;
// import com.example.demo.repository.StudentRepository;
// @Service
// public class StudentServiceImpl implements StudentService{
//         @Autowired StudentRepository repo;
        
//         @Override
//         public List<StudentEntity> getData(){
//             return repo.findAll();
//         }

//         @Override
//         public StudentEntity postData(StudentEntity student){
//             return repo.save(student);
//         }
//         @Override
//         public String DeleteData(int id){
//             repo.deleteById(id);
//             return "Deleted Successfully!";
//         }
//         @Override
//         public StudentEntity findData(int id){
//             return repo.findById(id).orElse(null);
//         }
//         // @Override
//         // public StudentEntity updateData(int id,StudentEntity stu){
//         //     if(repo.existsById(id)){
//         //         stu.setId(id);
//         //         return repo.save(stu);
//         //     }else{
//         //         return null;
//         //     }
//         // }
// }

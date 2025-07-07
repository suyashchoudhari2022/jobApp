//package com.jobapp.service;
//
//
//import com.jobapp.model.Student;
//import com.jobapp.repo.StudentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepo strepo;
//
//    public Student addStudent(Student student){
//
//        strepo.save(student);
//
//        return student;
//    }
//
//    public List<Student> getAllStudent(){
//
//        return strepo.findAll();
//    }
//
//    public void deleteStudent(int stId){
//         strepo.deleteById(stId);
//    }
//}

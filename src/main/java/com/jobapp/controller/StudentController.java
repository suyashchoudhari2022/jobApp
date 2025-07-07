//package com.jobapp.controller;
//
//
//import com.jobapp.model.Student;
//import com.jobapp.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/std")
//public class StudentController {
//
//    @Autowired
//    private StudentService stService;
//
//    @GetMapping("/allStudents")
//    public ResponseEntity<List<Student>> getAllStudents(){
//
//        return new ResponseEntity<>(stService.getAllStudent(), HttpStatus.OK);
//    }
//
//    @PostMapping("/addstudent")
//    public ResponseEntity<Student> addStudent( @RequestBody Student student){
//        return new ResponseEntity<>( stService.addStudent(student), HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/deleteStudent/{stId}")
//    public String deleteStudent(@PathVariable int stId){
//
//        stService.deleteStudent(stId);
//
//        return "deleted";
//
//    }
//
//}

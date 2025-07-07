//package com.jobapp.controller;
//
//
////import com.jobapp.model.Courses;
//import com.jobapp.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class CourseController {
//
//
//    @Autowired
//    private CourseService courseService;
//
//
//    @GetMapping("/allCourses")
//    public ResponseEntity<List<Courses>> getAllCourse(){
//
//        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
//    }
//
//    @PostMapping("/addCourse")
//    public ResponseEntity<Courses> addCourse(Courses courses){
//        return new ResponseEntity<>(courseService.addCourse(courses),HttpStatus.CREATED);
//    }
//
//}

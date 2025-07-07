//package com.jobapp.service;
//
//
//import com.jobapp.model.Courses;
//import com.jobapp.repo.CourseRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CourseService {
//
//    @Autowired
//    private CourseRepo courseRepo;
//
//    public Courses addCourse(Courses courses){
//        courseRepo.save(courses);
//        return courses;
//    }
//
//
//    public List<Courses> getAllCourses(){
//        return courseRepo.findAll();
//    }
//}

package com.jobapp.controller;


import com.jobapp.model.Employee;
import com.jobapp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {


    @Autowired
    private EmpService empService;

    @GetMapping("/allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(empService.getAllEmployee(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){

        return empService.addEmp(employee);


    }
}

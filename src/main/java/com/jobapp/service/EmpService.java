package com.jobapp.service;


import com.jobapp.model.Employee;
import com.jobapp.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo emp;

    public Employee addEmp(Employee employee){
        emp.save(employee);
        return employee;
    }


    public List<Employee> getAllEmployee(){

        return emp.findAll();
    }



}

package com.jobapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {


    @Id
    private int id;

    private String name;

    private String designation;

    private double salary;

    private List<String> techSkill;
}

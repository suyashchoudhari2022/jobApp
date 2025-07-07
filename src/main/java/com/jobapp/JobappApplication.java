package com.jobapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jobapp")
public class JobappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobappApplication.class, args);
	}
}

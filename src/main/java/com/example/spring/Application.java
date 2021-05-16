package com.example.spring;

import com.example.spring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(
				id:11L,
				name:"fwef",
		emai:"ewfwefwef",
				LocalDate.of(year:2000, Month.JANUARY,dayOfMonth:5),
		age:21
		));
	}

}

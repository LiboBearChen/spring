package com.example.spring.student;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
      return args->{
            Student s1= new Student("ewfw","eewfewf", LocalDate.of(2000, Month.JANUARY,2),22);
          Student s2= new Student("ewfw222","eewfewf", LocalDate.of(2000, Month.JANUARY,2),22);
          studentRepository.saveAll(List.of(s1,s2));
      };
    }
}

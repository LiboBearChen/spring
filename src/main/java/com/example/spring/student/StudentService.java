package com.example.spring.student;

import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new

                Student(
                11L,
                "fwef",
                "ewfwefwef",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
        ));
    }
}

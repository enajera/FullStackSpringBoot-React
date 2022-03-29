package com.vinn.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static com.vinn.student.Gender.FEMALE;
import static com.vinn.student.Gender.MALE;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return Arrays.asList(
                new Student(1L, "Elvin Najera", "elvin@gmail.com", MALE),
                new Student(2L, "Sofia Najera", "sofia@gmail.com", FEMALE));

    }



}

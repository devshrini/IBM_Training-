package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String getStudents(Model model) {
        // 1. Simple string attribute
        model.addAttribute("title", "Student Portal");

        // 2. List of objects
        List students = List.of(
                new Student(1L, "Alice Johnson", "Computer Science"),
                new Student(2L, "Bob Smith", "Data Science"),
                new Student(3L, "Charlie Brown", "Cybersecurity")
        );
        model.addAttribute("studentsList", students);

        // 3. Returns the template name: templates/students.html
        return "students";
    }
}
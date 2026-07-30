package com.example.demo.model;

public class Student {
    private Long id;
    private String name;
    private String course;

    public Student(Long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}
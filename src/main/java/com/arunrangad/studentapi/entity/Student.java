package com.arunrangad.studentapi.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid Email")
    private String email;

    @NotBlank(message = "Course is required")
    private String course;

    @Min(value = 0)
    @Max(value = 100)
    private int marks;

    public Student(){}

    public Student(String name, String email, String course, int marks){
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }


}

package com.example.jenkins.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    int age;

    String name;

    String phoneNumber;

    @ManyToOne
    School school;

    public Student(int age, String name, String phoneNumber, School school) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.school = school;
        school.addStudent(this);
    }
}

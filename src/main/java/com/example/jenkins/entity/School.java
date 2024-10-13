package com.example.jenkins.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;

    String address;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Student> studentList = new ArrayList<>();

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}

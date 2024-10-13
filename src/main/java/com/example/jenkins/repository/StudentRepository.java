package com.example.jenkins.repository;

import com.example.jenkins.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void createStudent(Student student);
}

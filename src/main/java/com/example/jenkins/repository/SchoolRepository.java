package com.example.jenkins.repository;

import com.example.jenkins.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
    void createSchool(School school);
}

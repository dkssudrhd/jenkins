package com.example.jenkins;

import com.example.jenkins.entity.School;
import com.example.jenkins.entity.Student;
import com.example.jenkins.repository.StudentRepository;
import com.example.jenkins.test.TestService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@DataJpaTest
@Slf4j
public class EntityTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void repository(){}


    @Test
    @Transactional
    public void test() {
        log.info("test start");

        School school = new School("조선대", "광주");
        Student student = new Student(22, "홍길동", "010-1234-1234", school);

        studentRepository.save(student);

        log.info("test finish");

    }
}

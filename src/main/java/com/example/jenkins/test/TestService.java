package com.example.jenkins.test;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    @Transactional
    public void test(){
        log.info("test start");



        log.info("test finish");
    }
}

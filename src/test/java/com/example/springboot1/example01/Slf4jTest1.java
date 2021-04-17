package com.example.springboot1.example01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class Slf4jTest1 {
    @Test
    public void print(){
        log.debug("dsdsa");
    }
}

package com.example.springboot1.example01;


import org.junit.jupiter.api.Test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Slf4jTest {
     Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
    @Test
    public void slf4jTest(){
        logger.debug("dddadsa");
        logger.debug("ddd");
    }
}

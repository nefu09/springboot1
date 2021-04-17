package com.example.springboot1.example01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserTest {
    @Test
    public void userTest1(){
      User user = User.builder().id(1).name("ddd").build();
       log.debug(String.valueOf(user));
    }
}

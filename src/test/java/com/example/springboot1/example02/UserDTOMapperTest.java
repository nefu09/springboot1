package com.example.springboot1.example02;

import com.example.springboot1.example01.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

@SpringBootTest
@Slf4j
public class UserDTOMapperTest {
    @Autowired
    private UserDTOMapper userDTOMapper;
    @Test
    public void selectById(){
        UserDTO userDTO = userDTOMapper.selectById(1383595961365897217L);
        System.out.println(userDTO);
    }
}

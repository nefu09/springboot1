package com.example.springboot1.example02;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AddressDTO2MapperTest {
    @Autowired
    private AddressDTO2Mapper addressDTO2Mapper;
    @Test
    public void selectByDetail(){
        System.out.println(addressDTO2Mapper.selectByDetail("清华大学"));
    }
}

package com.example.springboot1.example02;

import com.example.springboot1.example01.AddressDTO;
import com.example.springboot1.example01.AddressDTO2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AddressDTOMapperTest {
    @Autowired
    private AddressDTOMapper addressDTOMapper;
    @Test
    public void selectById(){
        addressDTOMapper.selectByDetail("清华大学");
    }
}

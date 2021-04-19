package com.example.springboot1.example02;

import com.example.springboot1.example01.Address;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AddressMapperTest {
    @Autowired
    private AddressMapper addressMapper;
    @Test
    public void addAddress(){
        Address address = Address.builder().detail("复旦大学").userId(1383594927100874753L).build();
        addressMapper.insert(address);
    }
}

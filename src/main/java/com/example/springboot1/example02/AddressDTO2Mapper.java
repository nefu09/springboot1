package com.example.springboot1.example02;

import com.example.springboot1.example01.AddressDTO2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AddressDTO2Mapper {
    AddressDTO2 selectByDetail(String detail);
}

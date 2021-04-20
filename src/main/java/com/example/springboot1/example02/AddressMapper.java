package com.example.springboot1.example02;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot1.example01.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AddressMapper extends BaseMapper<Address> {
}
package com.example.springboot1.example02;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot1.example01.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
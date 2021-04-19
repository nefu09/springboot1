package com.example.springboot1.example02;

import com.example.springboot1.example01.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDTOMapper {
    UserDTO selectById(long id);
}

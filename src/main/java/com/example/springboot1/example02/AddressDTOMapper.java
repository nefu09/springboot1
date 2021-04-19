package com.example.springboot1.example02;


import com.example.springboot1.example01.AddressDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AddressDTOMapper {
    @Select("select name,company,detail,a.user_id userId,u.create_time userCreateTime,a.id id,\n" +
            "       a.create_time addressCreateTime\n" +
            "from address a join user u\n" +
            "                    on u.id = a.user_id\n" +
            "where a.detail=#{detail}")
    AddressDTO selectByDetail(@Param("detail") String detail);
}

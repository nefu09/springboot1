package com.example.springboot1.example02;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot1.example01.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Insert("insert into user(id, name, company) values(#{id}, #{name}, #{company})")
    void addUser(User user);

    @Select("select * from user")
    List<User> usersList();

    @Select("select * from user where id=#{id}")
    List<User> userById(@Param("id") long id);

   @Update("update user set name=#{name} where id=#{id}")
    void updateUser(@Param("name") String name,@Param("id") long id);

   @Delete("delete from user where id=#{id}")
    void deleteUser(@Param("id") long id);

    @Delete("delete from user")
    void deleteUsers();
}

package com.example.springboot1.example02;

import com.example.springboot1.example01.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
 @Test
    public void addUser(){
     User user = new User();
     user.setName("小张");
     user.setCompany("阿里");
     userMapper.addUser(user);
 }
    @Test
    public void usersList(){
        for (User user : userMapper.usersList()) {
            System.out.println(user);
        }
    }
    @Test
    public void userById(){
       System.out.println(userMapper.userById(5));
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(1383595961365897217L);
        user.setCompany("腾讯");
        userMapper.updateById(user);
    }

    @Test
    public void deleteUser(){
        userMapper.deleteUser(3);
    }
    @Test
    public void deleteUsers(){
        userMapper.deleteUsers();
    }
    @Test
    public void try2(){
        for (User user : userMapper.selectByMap(Map.of("name", "小刘","company","阿里"))) {
            System.out.println(user);
        }
    }
}

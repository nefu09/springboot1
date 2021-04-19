package com.example.springboot1.example02;

import com.example.springboot1.example01.GithubUser;
import com.example.springboot1.example01.QueryOptional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class GithubMapperTest {
    @Autowired
    private GithubUserMapper githubUserMapper;
    @Test
    public void githubUserTest01(){
        QueryOptional queryOptional = QueryOptional.builder().repos(100).stars(100).build();
        for (GithubUser githubUser : githubUserMapper.listByOptionals(queryOptional)) {
            System.out.println(githubUser);
        }
    }
    @Test
    public void githubUserTest02(){
        QueryOptional queryOptional = QueryOptional.builder().repos(100).stars(100).build();
        for (GithubUser githubUser : githubUserMapper.listByOptionals2(queryOptional)) {
            System.out.println(githubUser);
        }
    }
}

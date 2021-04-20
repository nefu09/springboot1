package com.example.springboot1.example01;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@TableName("member")
public class Member {
    private Integer id;

    private String name;

    private String phone;
}
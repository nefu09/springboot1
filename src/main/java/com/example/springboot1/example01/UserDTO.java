package com.example.springboot1.example01;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String company;
    private List<Address> address;
}

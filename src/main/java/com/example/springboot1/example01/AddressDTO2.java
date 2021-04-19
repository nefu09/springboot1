package com.example.springboot1.example01;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AddressDTO2 {
    private long id;
    private String detail;
    private LocalDateTime createTime;
    private User user;
}

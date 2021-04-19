package com.example.springboot1.example01;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AddressDTO {
    private String name;

    private String company;

    private LocalDateTime userCreateTime;

    private Long id;

    private String detail;

    private Long userId;

    private LocalDateTime addressCreateTime;
}

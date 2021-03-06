package com.example.springboot1.example01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryOptional {
    private String gender;
    private Integer followers;
    private Integer stars;
    private Integer repos;
    private LocalDateTime beforeCreateTime;
}

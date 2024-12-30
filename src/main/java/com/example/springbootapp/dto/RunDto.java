package com.example.springbootapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class RunDto {
    private Integer id;
    private String name;
    private LocalDateTime started;
    private LocalDateTime completed;
    private String location;
}

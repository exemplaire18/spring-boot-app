package com.example.springbootapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "run")
@Data
public class RunEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "started")
    private LocalDateTime started;

    @Column(name = "completed")
    private LocalDateTime completed;

    @Column(name = "location")
    private String location;

}

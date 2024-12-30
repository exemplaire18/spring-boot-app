package com.example.springbootapp.controller;

import com.example.springbootapp.service.RunService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RunControllerTest {
    @InjectMocks
    private RunController runController;
    @Mock
    private RunService runService;

    @Test
    void mustGetAllRuns(){

    }
}

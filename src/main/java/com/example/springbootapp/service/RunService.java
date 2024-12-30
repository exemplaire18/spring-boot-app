package com.example.springbootapp.service;

import com.example.springbootapp.dto.RunDto;

import java.util.List;

public interface RunService {
    List<RunDto> fetchAllRuns();
    RunDto fetchRunById(Integer id);

    void addRun(RunDto runDto);
}

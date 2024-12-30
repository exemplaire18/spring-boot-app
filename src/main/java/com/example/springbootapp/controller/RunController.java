package com.example.springbootapp.controller;

import com.example.springbootapp.dto.RunDto;
import com.example.springbootapp.service.RunService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/runs")
public class RunController {
    private final RunService runService;

    RunController(RunService runService){
        this.runService = runService;
    }

    @GetMapping
    public List<RunDto> getAllRuns(){
        return runService.fetchAllRuns();
    }

    @GetMapping("/{id}")
    public RunDto getRunById(@PathVariable Integer id){
        return runService.fetchRunById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void addRun(@RequestBody RunDto runDto){
        runService.addRun(runDto);
    }

}

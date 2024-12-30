package com.example.springbootapp.service;

import com.example.springbootapp.dao.RunRepository;
import com.example.springbootapp.dto.RunDto;
import com.example.springbootapp.entity.RunEntity;
import com.example.springbootapp.mapper.RunMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RunServiceImpl implements RunService{

    private final RunRepository runRepository;

    public RunServiceImpl(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @Override
    public List<RunDto> fetchAllRuns() {
        return runRepository.fetchAll();
    }

    @Override
    public RunDto fetchRunById(Integer id) {
        Optional<RunDto> optional = runRepository.fetchById(id);
        return optional.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
    }

    @Override
    public void addRun(RunDto runDto) {
        RunEntity runEntity = RunMapper.MAPPER.mapToEntity(runDto);
        runRepository.saveAndFlush(runEntity);
    }

}

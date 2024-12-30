package com.example.springbootapp.mapper;

import com.example.springbootapp.dto.RunDto;
import com.example.springbootapp.entity.RunEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RunMapper {
    RunMapper MAPPER = Mappers.getMapper(RunMapper.class);

    @Mappings({
            @Mapping(source = "dto.name", target = "name"),
            @Mapping(source = "dto.started", target = "started"),
            @Mapping(source = "dto.completed", target = "completed"),
            @Mapping(source = "dto.location", target = "location"),
    })
    RunEntity mapToEntity(RunDto dto);
}

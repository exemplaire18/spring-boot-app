package com.example.springbootapp.dao;

import com.example.springbootapp.dto.RunDto;
import com.example.springbootapp.entity.RunEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RunRepository extends JpaRepository<RunEntity,Integer>, CrudRepository<RunEntity, Integer> {

    @Query("""
        select new com.example.springbootapp.dto.RunDto(r.id, r.name, r.started, r.completed, r.location)
        from RunEntity r
    """)
    List<RunDto> fetchAll();

    @Query("""
        select new com.example.springbootapp.dto.RunDto(r.id, r.name, r.started, r.completed, r.location)
        from RunEntity r where r.id = :id
    """)
    Optional<RunDto> fetchById(Integer id);

}

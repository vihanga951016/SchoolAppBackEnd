package com.example.schoolRest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schoolRest.Models.Classes;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer>{

}

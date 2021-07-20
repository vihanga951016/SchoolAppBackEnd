package com.example.schoolRest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schoolRest.Models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}

package com.example.schoolRest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.schoolRest.Models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

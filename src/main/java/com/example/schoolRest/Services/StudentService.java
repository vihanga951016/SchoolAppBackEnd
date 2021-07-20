package com.example.schoolRest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.schoolRest.Models.Student;
import com.example.schoolRest.Repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
}

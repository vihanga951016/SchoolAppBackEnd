package com.example.schoolRest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.schoolRest.Models.Student;
import com.example.schoolRest.Services.StudentService;



@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studenService;
	
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return studenService.getStudent();
	}
	
	@PostMapping("/student/addnew")
	public void addStudent(@RequestBody Student student) {
		studenService.addStudent(student);
	}
	
	@PutMapping("/student/{id}/edit")
	public void updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
		studenService.updateStudent(student);
	}
	
	
	public void deleteStudent(@PathVariable("id") Integer id) {
		studenService.deleteStudent(id);
	} 
	
}

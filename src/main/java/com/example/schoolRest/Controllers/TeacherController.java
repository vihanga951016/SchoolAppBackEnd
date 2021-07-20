package com.example.schoolRest.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.schoolRest.Models.Teacher;
import com.example.schoolRest.Services.TeacherService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@CrossOrigin
@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/show")
	public List<Teacher> getTeachers()
	{
		return teacherService.getTeachers();
	}
	
	@GetMapping("/{teacherId}")
	public Optional<Teacher> getTeachersFromId(@PathVariable("teacherId")Integer teacherId){
		return teacherService.getTeachersId(teacherId);
	}
	
	@PostMapping("/addnew")
	public String addTeachers(@RequestBody Teacher teacher) 
	{
		teacherService.addTeacher(teacher);
		return "Success";
	}
	
	
	
	@PutMapping("/{teacherId}/update")
	public String updateTeachers(@PathVariable("teacherId") Integer teacherId, @RequestBody Teacher teacher ) 
	{
		teacherService.updateTeacher(teacher);
		return "Updated";
	}
		
}

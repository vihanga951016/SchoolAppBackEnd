package com.example.schoolRest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schoolRest.Models.Teacher;
import com.example.schoolRest.Repositories.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public List<Teacher> getTeachers()
	{
		return teacherRepository.findAll();
	}
	
	public Optional<Teacher> getTeachersId(Integer teacherId){
		return teacherRepository.findById(teacherId);
	}
	
	public void addTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
	}
	
	public void updateTeacher(Teacher teacher)
	{
		teacherRepository.save(teacher);
	}
	
	public void deleteTeacher(Integer teacherId) 
	{
		teacherRepository.deleteById(teacherId);
	}
}

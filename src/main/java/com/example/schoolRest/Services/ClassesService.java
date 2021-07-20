package com.example.schoolRest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schoolRest.Models.Classes;
import com.example.schoolRest.Repositories.ClassesRepository;

@Service
public class ClassesService {

	@Autowired
	private ClassesRepository classesRepository;
	
	public List<Classes> getClasses(){
		return classesRepository.findAll();
	}
	
	public void addClasses(Classes classes){
		classesRepository.save(classes);
	}
	
	public void updateClasses(Classes classes) {
		classesRepository.save(classes);
	}
	
	public void deleteClasses(Integer id) {
		classesRepository.deleteById(id);
	}
}

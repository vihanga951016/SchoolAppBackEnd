package com.example.schoolRest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.schoolRest.Models.Classes;
import com.example.schoolRest.Services.ClassesService;

import lombok.var;

@RestController
@CrossOrigin
public class ClassesController {

	@Autowired
	private ClassesService classesService;
	
	@GetMapping("/classes")
	public List<Classes> getClasses(){
		return classesService.getClasses();
	}
	
	@PostMapping("/classes/addnew")
	public void addClasses(@RequestBody Classes classes) {
		classesService.addClasses(classes);
	}
	
	@PutMapping("/classes/{classId}/update")
	public void updateClasses(@PathVariable("classId") Integer classId, @RequestBody Classes classes) {
		classesService.updateClasses(classes);
	}
	
	@DeleteMapping("classes/{classId}/delete")
	public void deleteClasses(@PathVariable("classId") Integer classId) {
		classesService.deleteClasses(classId);	
	}
}

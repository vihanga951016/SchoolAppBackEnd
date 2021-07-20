package com.example.schoolRest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	
	private String letter;
	private int grade;
	//	private int section;
	private String classTeacher;
	
	@ManyToOne
	@JoinColumn(name = "indexnumber",insertable = false, updatable = false)
	private Student student;
	private int indexnumber;
	
}

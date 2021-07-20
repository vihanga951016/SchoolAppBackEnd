package com.example.schoolRest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	
	@NotNull
	private String indexNo;
	private String gender;
	private int grade;
	private String classLetter;
	private String address;
	private long phone;
	private String bucketSubject1;
	private String bucketSubject2;
	private String bucketSubject3;
	
}

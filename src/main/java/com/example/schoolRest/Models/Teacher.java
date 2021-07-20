package com.example.schoolRest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private int TeacherIndex;
	private String name;
	private String nic;
	private long phone;
	private String address;
	private String type;
	private boolean priviladge;
	private String username;
	private String password;
	
	
}

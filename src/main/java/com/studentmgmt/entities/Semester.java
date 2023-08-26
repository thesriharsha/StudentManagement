package com.studentmgmt.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="semesters")
public class Semester {
	
	@Id
	private int semesterid;
	
	private String semestername;
	
	private LocalDate startdate;
	private LocalDate enddate;
	
	

}

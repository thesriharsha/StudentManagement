package com.studentmgmt.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subjects")
public class Subject {

	@Id
	private int subjectid;
	
	private String subjectname;
	
	@ManyToOne
	@JoinColumn(name="facultyid")
	@JsonIgnore
	private Faculty faculty;
	
}

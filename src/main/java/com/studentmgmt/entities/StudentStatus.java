package com.studentmgmt.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentstatus")
public class StudentStatus {
	
	@Id
	private int studentstatusid;
	
	private String passfailstatus;
	private LocalDateTime updatedat;
	
	@ManyToOne
	@JoinColumn(name="studentid")
	@JsonIgnore
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="semesterid")
	@JsonIgnore
	private Semester semester;
	
	@ManyToOne
	@JoinColumn(name="subjectid")
	@JsonIgnore
	private Subject subject;

}

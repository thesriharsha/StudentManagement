package com.studentmgmt.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Attendance {
	
	@Id
	private int attendanceid;
	
	private LocalDate date;
	private String status;
	private float condonationfee;
	private LocalDateTime createdat;
	private LocalDateTime updateat;

	
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

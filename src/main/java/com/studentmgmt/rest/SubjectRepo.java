package com.studentmgmt.rest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmgmt.entities.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer>{

	
}

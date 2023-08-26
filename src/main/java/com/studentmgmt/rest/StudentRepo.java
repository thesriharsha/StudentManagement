package com.studentmgmt.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmgmt.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select firstname from Student")
	public List<String> getNames();
	
}

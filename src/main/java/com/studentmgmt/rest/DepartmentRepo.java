package com.studentmgmt.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmgmt.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

//	@Query("select from Department")
//	public List<Department> getHOD();
}

package com.studentmgmt.rest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmgmt.entities.Faculty;

public interface FacultyRepo extends JpaRepository<Faculty, Integer>{

}

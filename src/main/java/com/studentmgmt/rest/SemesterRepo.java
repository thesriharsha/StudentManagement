package com.studentmgmt.rest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmgmt.entities.Semester;

public interface SemesterRepo extends JpaRepository<Semester, Integer>{

}

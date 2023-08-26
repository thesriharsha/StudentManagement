package com.studentmgmt.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private DepartmentRepo departmentRepo;
	@Autowired
	private FacultyRepo facultyRepo;
	@Autowired
	private SemesterRepo semesterRepo;
	@Autowired
	private SubjectRepo subjectRepo;
	
	@GetMapping("/all/students")
	public List<String> getStudents()
	{
		return studentRepo.getNames();
	}
	
	@GetMapping("/deptbyHOD")
	public List<String> getHOD()
	{
		List<String> names = new ArrayList<>();
		var depts = departmentRepo.findAll();
		for(var dept : depts)
		{
			names.add(dept.getDepartmentname() + " - "+dept.getFaculty().getFirstname()+ dept.getFaculty().getLastname());
		}
		return names;
	}
	
}

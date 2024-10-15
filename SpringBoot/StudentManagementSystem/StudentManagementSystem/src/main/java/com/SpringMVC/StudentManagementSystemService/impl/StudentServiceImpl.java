package com.SpringMVC.StudentManagementSystemService.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringMVC.StudentManagementSystem.Entity.Student;
import com.SpringMVC.StudentManagementSystem.Repository.StudentRepository;
import com.SpringMVC.StudentManagementSystemService.StudentService;

@Service 
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

}

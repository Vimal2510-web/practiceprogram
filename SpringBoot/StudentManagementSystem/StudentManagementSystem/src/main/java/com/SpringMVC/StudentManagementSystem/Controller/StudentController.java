package com.SpringMVC.StudentManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SpringMVC.StudentManagementSystemService.StudentService;

@Controller   // -- To make this class as Spring MVC class to handle the requests.
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/")
	public String listStudents(Model model) {
		
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
		
	}
}

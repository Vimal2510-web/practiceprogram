package com.example.SpringBootCRUD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootCRUD.Entity.Student;
import com.example.SpringBootCRUD.Repository.StudentRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/students/")
public class StudentController {
	
	@Autowired
	
	private StudentRepository studentRepository;
	
	@GetMapping("showForm")
	public String showStudentForm() {
		return "add- student";
	}
	
	@GetMapping("list")
	public String students (Model model) {
		model.addAttribute("students",this.studentRepository.findAll() );
		return "index";
	}
	
	@PostMapping("add")
	public String addStudent(@Valid Student student, BindingResult result, Model model) {
		return "add-student";
	}
	
	@GetMapping("edit/{id}")
	public String showUpdateForm (@PathVariable ("id") long id, Model model) {
		
		Student student = this.studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException ("invalid student id:" + id));
		
		model.addAttribute("student", student);
		return "update-student";
		
		}
	
	
		@GetMapping("update/{id}")
		public String updateStudent(@PathVariable ("id")long id,@Valid Student student, BindingResult result, Model model) {
			
			if (result.hasErrors()) { 
				student.setId(id);
				return "update-student";
			}
			
		// Update student
			studentRepository.save(student);
			
			// get all students from the database (with update)
			
			model.addAttribute("students",this.studentRepository.findAll() );
			return "index";
			
		}
		
		@DeleteMapping("delete/{id}")
		public String deleteStudent(@PathVariable ("id")long id, Model model ) {
			
			Student student = this.studentRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException ("invalid student id:" + id));
			this.studentRepository.delete(student);
			model.addAttribute("students", this.studentRepository.findAll());
			return "index";
			
			
		}
		
	

}

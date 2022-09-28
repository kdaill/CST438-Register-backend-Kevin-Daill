package com.cst438.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cst438.domain.Student;
import com.cst438.domain.StudentDTO;
import com.cst438.domain.StudentRepository;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://registerf-cst438.herokuapp.com/"})
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/student/{id}")
	public StudentDTO getStudent(@PathVariable("id") int id) {
		Student student = studentRepository.findById(id).get();
		if (student == null) {
			//do some error
		}
		StudentDTO s = new StudentDTO();
		//copy student data to studentDTO
		return s;
	}
	
	// add a new student and return student_id of new student.
	@PostMapping("/student")
	public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {
		Student student = studentRepository.findByEmail(studentDTO.email);
		if (student!=null) {
			//return some HTTP exception some student with same email already exists
		}
		student = new Student();
		student.setEmail(studentDTO.email);
		student.setName(studentDTO.name);
		student.setStatus(studentDTO.status);
		student.setStatusCode(studentDTO.statusCode);
		Student newStudent = studentRepository.save(student);
		studentDTO.student_id = newStudent.getStudent_id();
		return studentDTO;
	}
	
	@PutMapping("/student")
	public void updateStudent(@RequestBody StudentDTO studentDTO) {
		Student student = studentRepository.findById(studentDTO.student_id).get();
		if(student==null) {
			//return some HTTP exception student is not found
		}
		student.setEmail(studentDTO.email);
		student.setStatus(studentDTO.status);
		student.setStatusCode(studentDTO.statusCode);
		studentRepository.save(student);
	}
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

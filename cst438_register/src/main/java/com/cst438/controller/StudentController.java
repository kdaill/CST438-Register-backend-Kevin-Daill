package com.cst438.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cst438.domain.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	
//	@PostMapping("/schedule/{student_id}")
//	@Transactional
//	Public ScheduleDTO.StudentDTO addStudent( @RequestBody ScheduleDTO.StudentDTO studentDTO){
//		
//	}
//	
	
	
	
//	@PostMapping("/schedule")
//	@Transactional
//	public ScheduleDTO.CourseDTO addCourse( @RequestBody ScheduleDTO.CourseDTO courseDTO  ) { 
//
//		String student_email = "test@csumb.edu";   // student's email 
//		
//		Student student = studentRepository.findByEmail(student_email);
//		Course course  = courseRepository.findById(courseDTO.course_id).orElse(null);
//		
//		// student.status
//		// = 0  ok to register
//		// != 0 hold on registration.  student.status may have reason for hold.
//		
//		if (student!= null && course!=null && student.getStatusCode()==0) {
//			// TODO check that today's date is not past add deadline for the course.
//			Enrollment enrollment = new Enrollment();
//			enrollment.setStudent(student);
//			enrollment.setCourse(course);
//			enrollment.setYear(course.getYear());
//			enrollment.setSemester(course.getSemester());
//			Enrollment savedEnrollment = enrollmentRepository.save(enrollment);
//			
//			gradebookService.enrollStudent(student_email, student.getName(), course.getCourse_id());
//			
//			ScheduleDTO.CourseDTO result = createCourseDTO(savedEnrollment);
//			return result;
//		} else {
//			throw  new ResponseStatusException( HttpStatus.BAD_REQUEST, "Course_id invalid or student not allowed to register for the course.  "+courseDTO.course_id);
//		}
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.cst438.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cst438.domain.Student;
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
	
	
//	
//	private Student createStudent(Student e){
//		Student student = new Student();
//		Student s = e.getStudent();
//		student.student_id = s.getStudent_id();
//		student.name = s.getName();
//		student.email = s.getEmail();
//		student.status = s.getStatus();
//		student.status_code = s.getStatusCode();
//		return student;
//	}
	
	
	
	
//	private ScheduleDTO.CourseDTO createCourseDTO(Enrollment e) {
//	ScheduleDTO.CourseDTO courseDTO = new ScheduleDTO.CourseDTO();
//	Course c = e.getCourse();
//	courseDTO.id = e.getEnrollment_id();
//	courseDTO.building = c.getBuilding();
//	courseDTO.course_id = c.getCourse_id();
//	courseDTO.endDate = c.getEnd().toString();
//	courseDTO.instructor = c.getInstructor();
//	courseDTO.room = c.getRoom();
//	courseDTO.section = c.getSection();
//	courseDTO.startDate = c.getStart().toString();
//	courseDTO.times = c.getTimes();
//	courseDTO.title = c.getTitle();
//	courseDTO.grade = e.getCourseGrade();
//	return courseDTO;
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

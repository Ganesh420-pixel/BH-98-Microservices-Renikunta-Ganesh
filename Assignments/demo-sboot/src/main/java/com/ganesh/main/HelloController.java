package com.ganesh.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ganesh.main.Student;
@RestController
public class HelloController {
	
	@Autowired
    private	StudentSupp stdsupp;
	
	@Autowired
	private StudentRepository studentRpository;
	
	@PostMapping("/AddStudent")
	
	public Student save(@RequestBody Student student)
	{
		//std.gradeCal(student.getMarks());
		return stdsupp.totalStudent(student);
	}
	
	@GetMapping("/AllStudents")
	List<Student> allStudents()
	{
		return studentRpository.findAll();
	}
	
}

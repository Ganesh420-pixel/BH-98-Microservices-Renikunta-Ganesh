package com.ganesh.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/Student/{id}")
	Optional<Student> getUserById(@PathVariable Long id){
		return studentRpository.findById(id);
	}
	
	@GetMapping("/StudentGrade/{id}")
	String getGradeById(@PathVariable Long id)
	{
		return "Grade : "+stdsupp.queryGradeById(id);
	}
	
	@DeleteMapping("/Student/{id}")
	void deleteUserById(@PathVariable Long id){
		studentRpository.deleteById(id);
	}
	
}

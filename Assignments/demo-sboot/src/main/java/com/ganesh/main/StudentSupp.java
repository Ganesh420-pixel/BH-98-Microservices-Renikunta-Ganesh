package com.ganesh.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class StudentSupp {
	//@Autowired
		Student std = new Student();
		
	  private final StudentRepository studentRepository;
		
		StudentSupp(StudentRepository studentRepository)
		{
			this.studentRepository=studentRepository;
		}

public Student totalStudent(Student student) {
		String grade = std.gradeCal(student.getMarks());
		student.setGrade(grade);
		return  studentRepository.save(student);
	}
}
